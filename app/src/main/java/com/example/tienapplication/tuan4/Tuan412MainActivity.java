package com.example.tienapplication.tuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.tienapplication.R;

public class Tuan412MainActivity extends AppCompatActivity {
    Button btnGetData;
    TextView txt;
    Context context=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan412_main);
        tuanVolley volleyfn =new tuanVolley();
        txt = findViewById(R.id.textView);
        btnGetData=findViewById(R.id.button3);
        btnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                volleyfn.getJSONarrayOfObject(context,txt);
            }
        });
    }
}