package com.example.jaro.otwartewniedziele;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        final Button btn1 = findViewById(R.id.SklepyPoAdresie);
        btn1.setOnClickListener(new View.OnClickListener (){
            public void onClick(View v) {
                Intent i = new Intent ( getApplicationContext (), ByAdress.class );
                startActivity (i);
            }
        });

        final Button btn2 = findViewById(R.id.Zamknij);
        btn1.setOnClickListener(new View.OnClickListener (){
            public void onClick(View v) {
                finish ();
                System.exit ( 0 );
            }
        });
    }
}

