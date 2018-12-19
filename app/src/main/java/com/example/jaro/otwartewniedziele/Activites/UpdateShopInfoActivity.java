package com.example.jaro.otwartewniedziele.Activites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jaro.otwartewniedziele.R;

public class UpdateShopInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_update_shop_info );

        final Button btn = findViewById(R.id.enter11);
        btn.setOnClickListener(new View.OnClickListener (){
            public void onClick(View v) {
                Intent i = new Intent ( getApplicationContext (), YourShopsActivity.class );
                startActivity (i);
            }
        });
    }
}
