package com.example.betsysanchez.juegopulsor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {
    TextView t;
    Button inicio;
    Button detener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t=findViewById(R.id.numAleat);
        inicio=findViewById(R.id.button);
        detener=findViewById(R.id.button2);

        float al=(float)(Math.random() * 2+0.1);
        t.setText(al+"");

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               // int numero = ThreadLocalRandom.current().nextFloat(0.00000001, 3.00000000 + 1);
                float al=(float)(Math.random() * 2+0.1);
                t.setText(al+"");
            }
        });

    }
}
