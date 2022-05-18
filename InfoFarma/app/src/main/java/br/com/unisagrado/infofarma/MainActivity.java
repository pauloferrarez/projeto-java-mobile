package br.com.unisagrado.infofarma;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.DialogFragment;

import br.com.unisagrado.infofarma.dialog.CreditosDialog;

public class MainActivity extends AppCompatActivity {

    CardView cardListaMeds, cardCreditos, cardInteracoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardListaMeds = findViewById(R.id.cardListaMeds);
        cardCreditos = findViewById(R.id.cardCreditos);
        cardInteracoes = findViewById(R.id.cardInteracoes);

        cardListaMeds.setOnClickListener(this::abrirListaMedicamentos);
        cardCreditos.setOnClickListener(this::mostrarCreditos);
        cardInteracoes.setOnClickListener(this::abrirListaInteracoes);
    }

    private void abrirListaInteracoes(View view) {
        Intent intent = new Intent(this, InteracoesActivity.class);
        startActivity(intent);
    }

    private void abrirListaMedicamentos(View view){
        Intent intent = new Intent(this, MedicamentosActivity.class);
        startActivity(intent);
    }

    private void mostrarCreditos(View view){
        DialogFragment dialog = new CreditosDialog();
        dialog.show(getSupportFragmentManager(), "creditos");
    }
}