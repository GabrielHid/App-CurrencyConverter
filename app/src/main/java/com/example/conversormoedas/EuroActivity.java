package com.example.conversormoedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EuroActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_euro);

        this.mViewHolder.editValueEuro = findViewById(R.id.edit_Euro);
        this.mViewHolder.textDolar = findViewById(R.id.text_Dolar);
        this.mViewHolder.textReal = findViewById(R.id.text_Real);
        this.mViewHolder.buttonCalculateEuro = findViewById(R.id.button_CalculateEuro);

        this.mViewHolder.buttonCalculateEuro.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_CalculateEuro){
            String value = this.mViewHolder.editValueEuro.getText().toString();
            if ("".equals(value)){
                Toast.makeText(this, "Insira um valor", Toast.LENGTH_LONG).show();
            } else{
                Double euro = Double.valueOf(value);

                this.mViewHolder.textDolar.setText("$ " + (String.format("%.2f", (euro * 1.11))));
                this.mViewHolder.textReal.setText("R$ " + (String.format("%.2f", (euro * 5.93))));
            }
        }
    }


    private static class ViewHolder {
        EditText editValueEuro;
        TextView textDolar;
        TextView textReal;
        Button buttonCalculateEuro;
    }
}
