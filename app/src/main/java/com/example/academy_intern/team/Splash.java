package com.example.academy_intern.team;

import android.app.Fragment;
import android.content.Intent;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Splash extends Fragment {

    View view;
    int SPLASH_TIME_OUT = 3000;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_splash, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        new Handler().postDelayed(new Runnable()
        {

            @Override
            public void run()
            {
                getFragmentManager().beginTransaction().add(R.id.main, new LoginFragment()).commit();
            }
        }, SPLASH_TIME_OUT);
    }
}
