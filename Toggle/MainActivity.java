package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.myapplication.R;


public class MainActivity extends AppCompatActivity {
    private ImageView i1, i2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i1 = (ImageView) findViewById(R.id.img9);
        i2 = (ImageView) findViewById(R.id.img20);

        i1.setOnClickListener(this::onClick);
        i2.setOnClickListener(this::onClick);


        i1.setVisibility(View.VISIBLE);
        i2.setVisibility(View.GONE);
    }

    private void onClick(View view) {
        if (view.getId() == R.id.img9) {
            i1.setVisibility(View.GONE);
            i2.setVisibility(View.VISIBLE);
        } else if (view.getId() == R.id.img20) {
            i2.setVisibility(View.GONE);
            i1.setVisibility(View.VISIBLE);
        }
    }
}
