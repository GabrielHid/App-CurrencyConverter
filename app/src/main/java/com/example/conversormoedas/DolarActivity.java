package com.example.conversormoedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DolarActivity extends AppCompatActivity implements View.OnClickListener{

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dolar);

        this.mViewHolder.editValueDolar       = findViewById(R.id.edit_Dolar);
        this.mViewHolder.textReal             = findViewById(R.id.text_Real);
        this.mViewHolder.textEuro             = findViewById(R.id.text_Euro2);
        this.mViewHolder.buttonCalculateDolar = findViewById(R.id.button_CalculateDolar);

        this.mViewHolder.buttonCalculateDolar.setOnClickListener(this);

        this.ClearValues();
    }

    @Override
    public void onClick(View v) {
        if (v.getId()== R.id.button_CalculateDolar) {
            String value = this.mViewHolder.editValueDolar.getText().toString();
            if ("".equals(value)){
                Toast.makeText(this, "Insira um valor", Toast.LENGTH_LONG).show();
            }   else{
                Double dolar = Double.valueOf(value);

                this.mViewHolder.textReal.setText("R$ " + (String.format("%.2f",  (dolar * 5.34))));
                this.mViewHolder.textEuro.setText("€ " + (String.format("%.2f", (dolar * 0.91))));
            }
        }
    }

    public void ClearValues() {
        this.mViewHolder.textReal.setText("");
        this.mViewHolder.textEuro.setText("");
    }


    private static class ViewHolder {
        EditText editValueDolar;
        TextView textReal;
        TextView textEuro;
        Button buttonCalculateDolar;
    }
}
