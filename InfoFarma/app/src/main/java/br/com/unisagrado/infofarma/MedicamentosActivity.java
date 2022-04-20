package br.com.unisagrado.infofarma;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.com.unisagrado.infofarma.adapter.MedicamentoAdapter;
import br.com.unisagrado.infofarma.model.Medicamento;
import br.com.unisagrado.infofarma.service.MedicamentoService;

public class MedicamentosActivity extends AppCompatActivity {

    public static final String EXTRA_NOME = "br.com.unisagrado.infofarma.EXTRA_NOME";
    public static final String EXTRA_DESCRICAO_COMPLETA = "br.com.unisagrado.infofarma.EXTRA_DESCRICAO_COMPLETA";

    RecyclerView recViewMeds;
    TextView txtPosicao;

    private List<Medicamento> medicamentos = new ArrayList<>();
    private final MedicamentoService medicamentoService = new MedicamentoService();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicamentos);

        medicamentos = medicamentoService.findAll();

        MedicamentoAdapter medicamentoAdapter = new MedicamentoAdapter(this, medicamentos);

        recViewMeds = findViewById(R.id.medRecyclerView);
        recViewMeds.setAdapter(medicamentoAdapter);
        recViewMeds.setLayoutManager(new LinearLayoutManager(this));
    }

    // abre a página de detalhes do medicamento passando nome e descrição
    public void abrirInfoMedicamento(@NonNull View view){
        txtPosicao = view.findViewById(R.id.txtPosicao);
        int posicao = Integer.parseInt(txtPosicao.getText().toString());

        Intent intent = new Intent(this, InfoMedicamentoActivity.class);

        intent.putExtra(EXTRA_NOME, medicamentos.get(posicao).getNome());
        intent.putExtra(EXTRA_DESCRICAO_COMPLETA, medicamentos.get(posicao).getDescricaoCompleta());
        startActivity(intent);
    }
}
