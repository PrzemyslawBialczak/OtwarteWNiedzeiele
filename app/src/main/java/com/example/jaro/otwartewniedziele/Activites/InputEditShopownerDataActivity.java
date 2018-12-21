package com.example.jaro.otwartewniedziele.Activites;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.jaro.otwartewniedziele.R;

public class InputEditShopownerDataActivity extends AppCompatActivity {

    private int name5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_input_edit_shopowner_data );

        final Button btn1 = findViewById(R.id.back5);
        final EditText nameText = (EditText) findViewById ( R.id.name5 );

        btn1.setOnClickListener(new View.OnClickListener (){
            public void onClick(View v) {
                Intent i = new Intent ( getApplicationContext (), LoginActivity.class );
                startActivity (i);
            }
        });

        final Button btn2 = findViewById(R.id.enter5);
        btn2.setOnClickListener(new View.OnClickListener (){
            public void onClick(View v) {
                Intent i = new Intent ( getApplicationContext (), LoggedActivity.class );
                final String name = nameText.getText ().toString ();

                AlertDialog alert = new AlertDialog.Builder(InputEditShopownerDataActivity.this).create();
                alert.setTitle("aaa");
                alert.setMessage ( "blabla" );
                alert.setButton ( AlertDialog.BUTTON_NEGATIVE, "ok", new DialogInterface.OnClickListener () {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int witch) {
                        dialogInterface.dismiss ();
                    }
                } );
                if(name.isEmpty ()){
                    alert.show ();
                }
                else
                startActivity (i);
            }
        });
    }
}
