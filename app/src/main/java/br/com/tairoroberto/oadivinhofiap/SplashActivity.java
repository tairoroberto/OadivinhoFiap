package br.com.tairoroberto.oadivinhofiap;

import android.animation.Animator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.animation.Animation;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    private ImageView imageViewSplash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        imageViewSplash = (ImageView) findViewById(R.id.imageViewSplash);
    }
}
