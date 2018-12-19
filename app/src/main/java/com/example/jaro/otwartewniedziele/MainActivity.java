package com.example.jaro.otwartewniedziele;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button = (Button)findViewById(R.id.SklepyPoAdresie);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        button.setOnClickListener(new View.OnClickListener (){
            public void onClick(View v) {
                Intent i = new Intent ( MainActivity.this, ByAdress.class );
                MainActivity.this.startActivity ( i );
            }
        });
    }
}

