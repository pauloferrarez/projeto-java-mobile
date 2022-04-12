package br.com.unisagrado.infofarma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String medicamentos[], descricaoMeds[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.medRecyclerView);

        medicamentos = getResources().getStringArray(R.array.medicamentos);
        descricaoMeds = getResources().getStringArray(R.array.descricao);

        MyAdapter myAdapter = new MyAdapter(this, medicamentos, descricaoMeds);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void abrirInfoMedicamento(View view){

        Intent intent = new Intent(this, InfoMedicamento.class);
        startActivity(intent);
    }

}