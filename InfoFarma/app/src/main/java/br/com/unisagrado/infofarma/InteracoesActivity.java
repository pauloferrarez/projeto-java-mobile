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

import br.com.unisagrado.infofarma.adapter.MedicamentoAdapter;
import br.com.unisagrado.infofarma.model.Medicamento;
import br.com.unisagrado.infofarma.service.MedicamentoService;

public class InteracoesActivity extends AppCompatActivity {

    RecyclerView recViewInteracoes;
    TextView txtPosicao;

    private List<Medicamento> interacoes = new ArrayList<>();
    private final MedicamentoService medicamentoService = new MedicamentoService();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        interacoes = medicamentoService.findInteracoes();

        MedicamentoAdapter medicamentoAdapter = new MedicamentoAdapter(this, interacoes);

        recViewInteracoes = findViewById(R.id.RecyclerView);
        recViewInteracoes.setAdapter(medicamentoAdapter);
        recViewInteracoes.setLayoutManager(new LinearLayoutManager(this));
    }

    public void abrirInfo(View view){
        txtPosicao = view.findViewById(R.id.txtPosicao);
        int posicao = Integer.parseInt(txtPosicao.getText().toString());

        Intent intent = new Intent(this, InfoMedicamentoActivity.class);

        intent.putExtra(MedicamentosActivity.EXTRA_MED, interacoes.get(posicao));
        startActivity(intent);
    }
}