package com.example.conversormoedas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.util.ValueIterator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaInicialActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        this.mViewHolder.buttonDolar = findViewById(R.id.button_ConvertDolar);
        this.mViewHolder.buttonReal  = findViewById(R.id.button_ConvertReal);
        this.mViewHolder.buttonEuro  = findViewById(R.id.button_ConvertEuro);

        this.mViewHolder.buttonDolar.setOnClickListener(this);
        this.mViewHolder.buttonReal.setOnClickListener(this);
        this.mViewHolder.buttonEuro.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_ConvertDolar){
            Intent intent = new Intent(this, DolarActivity.class);
            startActivity(intent);
        }

        if (v.getId() == R.id.button_ConvertReal) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

        if (v.getId() == R.id.button_ConvertEuro) {
            Intent intent = new Intent(this, EuroActivity.class);
            startActivity(intent);
        }
    }

    private static class ViewHolder {
        Button buttonDolar;
        Button buttonReal;
        Button buttonEuro;
    }
}
