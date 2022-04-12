package br.com.unisagrado.infofarma;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class CardItemActivity extends AppCompatActivity {

    TextView txtMedicamento, txtDescricao, txtPosicao;
    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_row);

        cardView = findViewById(R.id.cardView);
    }


}
