package com.aditas.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;


public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnCalc, btnExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnCalc = findViewById(R.id.btn_calc);
        btnExit = findViewById(R.id.btn_exit);

        btnCalc.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn_calc:
                Intent calc = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(calc);
                break;
            case R.id.btn_exit:
                Snackbar.make(view, "Ketipuu", Snackbar.LENGTH_LONG).show();
                break;
        }
    }
}
