package com.example.jaro.otwartewniedziele.Activites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jaro.otwartewniedziele.R;

public class LoggedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_logged );

        final Button btn1 = findViewById(R.id.back6);
        btn1.setOnClickListener(new View.OnClickListener (){
            public void onClick(View v) {
                Intent i = new Intent (getApplicationContext (), InputEditShopownerDataActivity.class);
                startActivity ( i );
            }
        });

        final Button btn2 = findViewById(R.id.mainPage6);
        btn2.setOnClickListener(new View.OnClickListener (){
            public void onClick(View v) {
                Intent i = new Intent ( getApplicationContext (), MainActivity.class );
                startActivity (i);
            }
        });

        final Button btn3 = findViewById(R.id.AddShop);
        btn3.setOnClickListener(new View.OnClickListener (){
            public void onClick(View v) {
                Intent i = new Intent ( getApplicationContext (), InputShopDataActivity.class );
                startActivity (i);
            }
        });

        final Button btn4 = findViewById(R.id.YourShops);
        btn4.setOnClickListener(new View.OnClickListener (){
            public void onClick(View v) {
                Intent i = new Intent ( getApplicationContext (), YourShopsActivity.class );
                startActivity (i);
            }
        });
    }
}
