package br.com.unisagrado.infofarma;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InfoMedicamentoActivity extends AppCompatActivity {

    private TextView txtNomeMedicamento, txtDescricaoCompleta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_medicamento);

        txtNomeMedicamento = findViewById(R.id.txtNomeMedicamento);
        txtDescricaoCompleta = findViewById(R.id.txtDescricaoCompleta);

        Intent intent = getIntent();

        txtNomeMedicamento.setText(intent.getStringExtra(MedicamentosActivity.EXTRA_NOME));
        txtDescricaoCompleta.setText(intent.getStringExtra(MedicamentosActivity.EXTRA_DESCRICAO_COMPLETA));

    }
}
