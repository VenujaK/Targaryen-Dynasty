package com.venujak.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 TextView txtdis, txtlang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtdis= findViewById(R.id.dislbl);
        txtlang= findViewById(R.id.lbllang);
        animation();
        animation2();
    }
    private void animation(){
        txtdis.animate()
                .translationYBy(-950)
                .setDuration(3000)
                .start();
    }
    private void animation2() {
        txtlang.animate()
                .alpha(0.7f)
                .setDuration(3800)
                .start();
    }
    public void aboutSeries(View view){
        Intent Intent= new Intent(this,aboutUs.class);
        startActivity(Intent);
    }
}