package com.example.jaro.otwartewniedziele.Activites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jaro.otwartewniedziele.R;

public class ByAdress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_by_adress );

        final Button btn1 = findViewById(R.id.back);
        btn1.setOnClickListener(new View.OnClickListener (){
            public void onClick(View v) {
                Intent i = new Intent ( getApplicationContext (), MainActivity.class );
                startActivity (i);
            }
        });

        final Button btn2 = findViewById(R.id.Enter);
        btn2.setOnClickListener(new View.OnClickListener (){
            public void onClick(View v) {
                Intent i = new Intent ( getApplicationContext (), MapActivity.class );
                startActivity (i);
            }
        });
    }
}
