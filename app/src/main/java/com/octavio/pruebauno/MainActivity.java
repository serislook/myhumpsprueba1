package com.octavio.pruebauno;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button almBtn = (Button) findViewById(R.id.almBtn1);
        almBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ContactActivity .class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "yeahhhhhhh", Toast.LENGTH_SHORT).show();
            }
        });
        Button button = (Button) findViewById(R.id.newhumpsBtr);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BdatosActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "disfruta tu viaje que tengas buen retorno", Toast.LENGTH_SHORT).show();

            }
        });






    }
}
