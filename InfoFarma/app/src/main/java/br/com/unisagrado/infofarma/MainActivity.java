package br.com.unisagrado.infofarma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import br.com.unisagrado.infofarma.model.Medicamento;
import br.com.unisagrado.infofarma.service.MedicamentoService;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NOME = "br.com.unisagrado.infofarma.EXTRA_NOME";
    public static final String EXTRA_DESCRICAO_COMPLETA = "br.com.unisagrado.infofarma.EXTRA_DESCRICAO_COMPLETA";

    RecyclerView recyclerView;
    TextView txtPosicao;
    //String medicamentos[], descricaoMeds[], descricaoCompletaMeds[];

    List<Medicamento> medicamentos = new ArrayList<>();
    MedicamentoService medicamentoService = new MedicamentoService();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.medRecyclerView);

        /*
        medicamentos = getResources().getStringArray(R.array.medicamentos);
        descricaoMeds = getResources().getStringArray(R.array.descricao);
        descricaoCompletaMeds = getResources().getStringArray(R.array.descricao_completa);
        */

        medicamentos = medicamentoService.findAll();

        MyAdapter myAdapter = new MyAdapter(this, medicamentos);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    // abre a página de detalhes do medicamento passando nome e descrição
    public void abrirInfoMedicamento(View view){
        txtPosicao = view.findViewById(R.id.txtPosicao);
        int posicao = Integer.parseInt(txtPosicao.getText().toString());

        Intent intent = new Intent(this, InfoMedicamentoActivity.class);

        intent.putExtra(EXTRA_NOME, medicamentos.get(posicao).getNome());
        intent.putExtra(EXTRA_DESCRICAO_COMPLETA, medicamentos.get(posicao).getDescricaoCompleta());
        startActivity(intent);
    }

}