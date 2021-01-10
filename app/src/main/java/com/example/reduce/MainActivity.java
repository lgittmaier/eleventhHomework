package com.example.reduce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText etZaehler = findViewById(R.id.zaehler);
        EditText etNenner = findViewById(R.id.nenner);
        String zaehler = etZaehler.getText().toString();
        String nenner = etNenner.getText().toString();
        int z = Integer.parseInt(zaehler);
        if(z<0){
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        int n = Integer.parseInt(nenner);
        if(z<0) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        int ggT = ggt(z,n);
        int kZaehler = z/ggT;
        int kNenner = n/ggT;
        String kurzZ = Integer.toString(kZaehler);
        String kurzN = Integer.toString(kNenner);
        etZaehler.setText(""+ kurzZ);
        etNenner.setText(""+ kurzN);
    }

    public int ggt(int a, int b) {
        if (a == 0)
            return b;
        while (b != 0) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }

        return a;
    }

}