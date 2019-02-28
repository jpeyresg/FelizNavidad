package com.example.juan.feliznavidad;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class FelicitacionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_felicitacion);

        Typeface mifuente1 = Typeface.createFromAsset(getAssets(),"whitechristmas.ttf");
        TextView texto1 = (TextView) findViewById(R.id.texto1);
        TextView texto2 = (TextView) findViewById(R.id.texto2);
        texto1.setTypeface(mifuente1);
        texto2.setTypeface(mifuente1);

        Animation animacion = AnimationUtils.loadAnimation(this, R.anim.animacion);
        texto1.startAnimation(animacion);
        Animation animacion2 = AnimationUtils.loadAnimation(this, R.anim.animacion2);
        texto2.startAnimation(animacion2);

        MediaPlayer reproductor = MediaPlayer.create(this,R.raw.jingle_bells);
        reproductor.start();
    }
}
