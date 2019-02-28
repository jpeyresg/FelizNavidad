package com.example.juan.feliznavidad;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity implements Animation.AnimationListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        Typeface mifuente1 = Typeface.createFromAsset(getAssets(),"whitechristmas.ttf");
        TextView texto1 = (TextView) findViewById(R.id.cargando);
        texto1.setTypeface(mifuente1);

        ImageView santa2 = (ImageView) findViewById(R.id.santatrineo);
        Animation animacionsanta = AnimationUtils.loadAnimation(this, R.anim.animacionsplash);
        santa2.startAnimation(animacionsanta);

        animacionsanta.setAnimationListener(this);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Intent intent = new Intent(SplashActivity.this, FelicitacionActivity.class);
        startActivity(intent);
        finish();

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
