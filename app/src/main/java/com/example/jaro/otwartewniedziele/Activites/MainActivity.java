package com.example.jaro.otwartewniedziele.Activites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jaro.otwartewniedziele.R;

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

        final Button btn2 = findViewById(R.id.CloseApplication);
        btn2.setOnClickListener(new View.OnClickListener (){
            public void onClick(View v) {
                Intent i = new Intent ( getApplicationContext (), MainActivity.class );
                startActivity ( i );
                moveTaskToBack ( true );
                android.os.Process.killProcess ( android.os.Process.myPid () );
                System.exit ( 1 );
            }
        });

        final Button btn3 = findViewById(R.id.PortalSprzedawcy);
        btn3.setOnClickListener(new View.OnClickListener (){
            public void onClick(View v) {
                Intent i = new Intent ( getApplicationContext (), LoginActivity.class );
                startActivity (i);
            }
        });

        final Button btn4 = findViewById(R.id.SklepyWOkolicy);
        btn4.setOnClickListener(new View.OnClickListener (){
            public void onClick(View v) {
                Intent i = new Intent ( getApplicationContext (), MapActivity.class );
                startActivity (i);
            }
        });
    }
}

