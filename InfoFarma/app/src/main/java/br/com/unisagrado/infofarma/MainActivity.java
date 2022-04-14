package br.com.unisagrado.infofarma;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import br.com.unisagrado.infofarma.dialog.CreditosDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirListaMedicamentos(View view){
        Intent intent = new Intent(this, MedicamentosActivity.class);
        startActivity(intent);
    }

    public void mostrarCreditos(View view){
        DialogFragment dialog = new CreditosDialog();
        dialog.show(getSupportFragmentManager(), "creditos");
    }
}