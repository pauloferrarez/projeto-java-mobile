package br.com.unisagrado.infofarma;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import br.com.unisagrado.infofarma.model.Medicamento;

public class InfoMedicamentoActivity extends AppCompatActivity {

    private TextView txtNomeMedicamento, txtDescricaoCompleta, txtDescricaoSimples;
    private Medicamento medicamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_medicamento);

        txtNomeMedicamento = findViewById(R.id.txtNomeMedicamento);
        txtDescricaoCompleta = findViewById(R.id.txtDescricaoCompleta);
        txtDescricaoSimples = findViewById(R.id.txtDescricaoSimples);

        Intent intent = getIntent();

        medicamento = (Medicamento) intent.getSerializableExtra(MedicamentosActivity.EXTRA_MED);

        txtNomeMedicamento.setText(medicamento.getNome());
        txtDescricaoSimples.setText(medicamento.getDescricao());
        txtDescricaoCompleta.setText(medicamento.getDescricaoCompleta());

    }
}
