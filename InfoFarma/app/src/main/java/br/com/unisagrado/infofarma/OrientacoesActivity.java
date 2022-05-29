package br.com.unisagrado.infofarma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import br.com.unisagrado.infofarma.adapter.OrientacaoAdapter;
import br.com.unisagrado.infofarma.model.Orientacao;
import br.com.unisagrado.infofarma.service.OrientacaoService;

public class OrientacoesActivity extends AppCompatActivity {

    RecyclerView recViewOrient;

    private final OrientacaoService orientacaoService = new OrientacaoService();
    private List<Orientacao> orientacoes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        orientacoes = orientacaoService.findOrientacoes();

        OrientacaoAdapter orientacaoAdapter = new OrientacaoAdapter(this, orientacoes);

        recViewOrient = findViewById(R.id.RecyclerView);
        recViewOrient.setAdapter(orientacaoAdapter);
        recViewOrient.setLayoutManager(new LinearLayoutManager(this));
    }
}