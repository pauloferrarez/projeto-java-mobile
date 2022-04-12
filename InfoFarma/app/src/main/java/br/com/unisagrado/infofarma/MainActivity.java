package br.com.unisagrado.infofarma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NOME = "br.com.unisagrado.infofarma.EXTRA_NOME";
    public static final String EXTRA_DESCRICAO_COMPLETA = "br.com.unisagrado.infofarma.EXTRA_DESCRICAO_COMPLETA";
    RecyclerView recyclerView;
    TextView txtPosicao;
    String medicamentos[], descricaoMeds[], descricaoCompletaMeds[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.medRecyclerView);

        medicamentos = getResources().getStringArray(R.array.medicamentos);
        descricaoMeds = getResources().getStringArray(R.array.descricao);
        descricaoCompletaMeds = getResources().getStringArray(R.array.descricao_completa);



        MyAdapter myAdapter = new MyAdapter(this, medicamentos, descricaoMeds);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void abrirInfoMedicamento(View view){
        txtPosicao = view.findViewById(R.id.txtPosicao);
        Intent intent = new Intent(this, InfoMedicamentoActivity.class);
        intent.putExtra(EXTRA_NOME, medicamentos[Integer.parseInt(txtPosicao.getText().toString())]);
        intent.putExtra(EXTRA_DESCRICAO_COMPLETA, descricaoCompletaMeds[Integer.parseInt(txtPosicao.getText().toString())]);
        startActivity(intent);
    }

}