package com.example.daan.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkClicked(View v){
        Log.d("potato", "checkClicked: ");
        CheckBox checkbox = (CheckBox) v;
        String name = checkbox.getText().toString();
        ImageView image = (ImageView) findViewById(R.id.arms);
        if (name.equals("Hat")){
            image = (ImageView) findViewById(R.id.hat);
        } else if (name.equals("Eyebrows")) {
            image = (ImageView) findViewById(R.id.eyebrows);
        } else if (name.equals("Nose")) {
            image = (ImageView) findViewById(R.id.nose);
        } else if (name.equals("Mustage")) {
            image = (ImageView) findViewById(R.id.mustage);
        } else if (name.equals("Arms")) {
            image = (ImageView) findViewById(R.id.arms);
        } else if (name.equals("Eyes")) {
            image = (ImageView) findViewById(R.id.eyes);
        } else if (name.equals("Glasses")) {
            image = (ImageView) findViewById(R.id.glasses);
        } else if (name.equals("Mouth")) {
            image = (ImageView) findViewById(R.id.mouth);
        } else if (name.equals("Ears")) {
            image = (ImageView) findViewById(R.id.ears);
        } else if (name.equals("Shoes")) {
            image = (ImageView) findViewById(R.id.shoes);
        }

        if (checkbox.isChecked()){
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.INVISIBLE);
        }
    }
}
