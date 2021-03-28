package com.example.tashafi_mobile_native;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.transition.Fade;

import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class TransitionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition);

        setTitle("Transition Activity");

        Fade fade = new Fade();
        View decor = getWindow().getDecorView();
        fade.excludeTarget(decor.findViewById(R.id.action_bar_container), true);
        fade.excludeTarget(android.R.id.statusBarBackground, true);
        fade.excludeTarget(android.R.id.navigationBarBackground, true);
        getWindow().setEnterTransition(fade);
        getWindow().setExitTransition(fade);
//        getWindow().setEnterTransition();
//        getWindow().setExitTransition();
    }
}