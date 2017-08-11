package com.octavio.pruebauno;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BdatosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bdatos);

        Button button = (Button) findViewById(R.id.contactBtn1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BdatosActivity.this,MainActivity.class);
                startActivity(intent);
                Toast.makeText(BdatosActivity.this, "seguro probaras algo mejor", Toast.LENGTH_SHORT).show();

            }
        });
        button = (Button) findViewById(R.id.contactBtn2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BdatosActivity.this,MainActivity.class);
                startActivity(intent);
                Toast.makeText(BdatosActivity.this, "seguro probaras algo mejor", Toast.LENGTH_SHORT).show();

            }
        });
        button = (Button) findViewById(R.id.contactBtn3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BdatosActivity.this,MainActivity.class);
                startActivity(intent);
                Toast.makeText(BdatosActivity.this, "seguro probaras algo mejor", Toast.LENGTH_SHORT).show();

            }
        });
        button = (Button) findViewById(R.id.contactBtn4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BdatosActivity.this,MainActivity.class);
                startActivity(intent);
                Toast.makeText(BdatosActivity.this, "es una muy buena cepa deberias almacenarla como favorita", Toast.LENGTH_SHORT).show();
            }
        });
        button = (Button) findViewById(R.id.contactBtn5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BdatosActivity.this,MainActivity.class);
                startActivity(intent);
                Toast.makeText(BdatosActivity.this, "es una muy buena cepa deberias almacenarla como favorita", Toast.LENGTH_SHORT).show();
            }
        });


    }
}



