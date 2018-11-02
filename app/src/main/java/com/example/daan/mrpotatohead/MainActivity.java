package com.example.daan.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    public static String[] potatoParts = {"arms", "eyebrows", "mouth", "nose", "eyes", "glasses",
            "mustage", "ears", "shoes", "hat"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null){
            ImageView arms = (ImageView) findViewById(R.id.arms);
            boolean bool = savedInstanceState.getBoolean("arms");
            if (bool){
                arms.setVisibility(View.VISIBLE);
            } else{
                arms.setVisibility(View.INVISIBLE);
            }

            ImageView eyebrows = (ImageView) findViewById(R.id.eyebrows);
            bool = savedInstanceState.getBoolean("eyebrows");
            if (bool){
                eyebrows.setVisibility(View.VISIBLE);
            } else{
                eyebrows.setVisibility(View.INVISIBLE);
            }

            ImageView mouth = (ImageView) findViewById(R.id.mouth);
            bool = savedInstanceState.getBoolean("mouth");
            if (bool){
                mouth.setVisibility(View.VISIBLE);
            } else{
                mouth.setVisibility(View.INVISIBLE);
            }

            ImageView nose = (ImageView) findViewById(R.id.nose);
            bool = savedInstanceState.getBoolean("nose");
            if (bool){
                nose.setVisibility(View.VISIBLE);
            } else{
                nose.setVisibility(View.INVISIBLE);
            }

            ImageView eyes = (ImageView) findViewById(R.id.eyes);
            bool = savedInstanceState.getBoolean("eyes");
            if (bool){
                eyes.setVisibility(View.VISIBLE);
            } else{
                eyes.setVisibility(View.INVISIBLE);
            }

            ImageView glasses = (ImageView) findViewById(R.id.glasses);
            bool = savedInstanceState.getBoolean("glasses");
            if (bool){
                glasses.setVisibility(View.VISIBLE);
            } else{
                glasses.setVisibility(View.INVISIBLE);
            }

            ImageView mustage = (ImageView) findViewById(R.id.mustage);
            bool = savedInstanceState.getBoolean("mustage");
            if (bool){
                mustage.setVisibility(View.VISIBLE);
            } else{
                mustage.setVisibility(View.INVISIBLE);
            }

            ImageView ears = (ImageView) findViewById(R.id.ears);
            bool = savedInstanceState.getBoolean("ears");
            if (bool){
                ears.setVisibility(View.VISIBLE);
            } else{
                ears.setVisibility(View.INVISIBLE);
            }

            ImageView shoes = (ImageView) findViewById(R.id.shoes);
            bool = savedInstanceState.getBoolean("shoes");
            if (bool){
                shoes.setVisibility(View.VISIBLE);
            } else{
                shoes.setVisibility(View.INVISIBLE);
            }

            ImageView hat = (ImageView) findViewById(R.id.hat);
            bool = savedInstanceState.getBoolean("hat");
            if (bool){
                hat.setVisibility(View.VISIBLE);
            } else{
                hat.setVisibility(View.INVISIBLE);
            }
        }

    }

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        ImageView arms = (ImageView) findViewById(R.id.arms);
        boolean bool = arms.getVisibility() == View.VISIBLE;
        outState.putBoolean("arms", bool);

        ImageView eyebrows = (ImageView) findViewById(R.id.eyebrows);
        bool = eyebrows.getVisibility() == View.VISIBLE;
        outState.putBoolean("eyebrows", bool);

        ImageView mouth = (ImageView) findViewById(R.id.mouth);
        bool = mouth.getVisibility() == View.VISIBLE;
        outState.putBoolean("mouth", bool);

        ImageView nose = (ImageView) findViewById(R.id.nose);
        bool = nose.getVisibility() == View.VISIBLE;
        outState.putBoolean("nose", bool);

        ImageView eyes = (ImageView) findViewById(R.id.eyes);
        bool = eyes.getVisibility() == View.VISIBLE;
        outState.putBoolean("eyes", bool);

        ImageView glasses = (ImageView) findViewById(R.id.glasses);
        bool = glasses.getVisibility() == View.VISIBLE;
        outState.putBoolean("glasses", bool);

        ImageView mustage = (ImageView) findViewById(R.id.mustage);
        bool = mustage.getVisibility() == View.VISIBLE;
        outState.putBoolean("mustage", bool);

        ImageView ears = (ImageView) findViewById(R.id.ears);
        bool = ears.getVisibility() == View.VISIBLE;
        outState.putBoolean("ears", bool);

        ImageView shoes = (ImageView) findViewById(R.id.shoes);
        bool = shoes.getVisibility() == View.VISIBLE;
        outState.putBoolean("shoes", bool);

        ImageView hat = (ImageView) findViewById(R.id.hat);
        bool = hat.getVisibility() == View.VISIBLE;
        outState.putBoolean("hat", bool);
    }

        public void checkClicked(View v){
        Log.d("potato", "checkClicked: ");
        CheckBox checkbox = (CheckBox) v;
        String name = checkbox.getText().toString();
        ImageView image = (ImageView) findViewById(R.id.hat);;
        switch (name){
            case "Hat": image = (ImageView) findViewById(R.id.hat);
                        break;
            case "Eyebrows": image = (ImageView) findViewById(R.id.eyebrows);
                break;
            case "Nose": image = (ImageView) findViewById(R.id.nose);
                break;
            case "Mustage": image = (ImageView) findViewById(R.id.mustage);
                break;
            case "Arms": image = (ImageView) findViewById(R.id.arms);
                break;
            case "Eyes": image = (ImageView) findViewById(R.id.eyes);
                break;
            case "Glasses": image = (ImageView) findViewById(R.id.glasses);
                break;
            case "Mouth": image = (ImageView) findViewById(R.id.mouth);
                break;
            case "Ears": image = (ImageView) findViewById(R.id.ears);
                break;
            case "Shoes": image = (ImageView) findViewById(R.id.shoes);
                break;
        }

        if (checkbox.isChecked()){
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.INVISIBLE);
        }
    }
}
