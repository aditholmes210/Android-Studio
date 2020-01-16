package com.aditas.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class VolActivity extends AppCompatActivity {
    private EditText etLength, etWidth, etHeight;
    private TextView tvHsl;
    private Button btnHtg;
    private double length, width, height, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vol);

        init();
        btnHtg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getText();

                result = (length * width * height) / 2;
                tvHsl.setText(String.valueOf(result));

                resetText();
            }
        });
    }
    private void init(){
        etLength = findViewById(R.id.et_pjg);
        etWidth = findViewById(R.id.et_lbr);
        etHeight = findViewById(R.id.et_tgg);
        tvHsl = findViewById(R.id.tv_hsl);
        btnHtg = findViewById(R.id.btn_htg);
    }

    private void getText(){
        String stLength = etLength.getText().toString();
        String stWidth = etWidth.getText().toString();
        String stHeight = etHeight.getText().toString();

        if(stLength.equals("") || stHeight.equals("") || stWidth.equals("")){
            Toast.makeText(this, "Harus ada inputan", Toast.LENGTH_SHORT).show();
        }
        else{
            height = Double.valueOf(stHeight);
            width = Double.valueOf(stWidth);
            length = Double.valueOf(stLength);
        }
    }

    private void resetText(){
        etLength.setText("");
        etWidth.setText("");
        etHeight.setText("");
    }
}
