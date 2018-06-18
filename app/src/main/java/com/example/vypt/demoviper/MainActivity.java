package com.example.vypt.demoviper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.vypt.demoviper.control.ControlActivity;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button b_start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        b_start = (Button) findViewById(R.id.b_start);

        Picasso.with(this).load("https://r.hswstatic.com/w_907/gif/smilingdog-1.jpg")
                .into(imageView);

        b_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ControlActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
    }
}
