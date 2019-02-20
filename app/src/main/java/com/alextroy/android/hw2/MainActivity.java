package com.alextroy.android.hw2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonNext;
    private Button buttonPrev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        initListeners();
    }

    private void initViews() {
        buttonNext = findViewById(R.id.button_next);
        buttonPrev = findViewById(R.id.button_prev);
    }

    private void initListeners() {
        buttonNext.setOnClickListener(new ButtonNextClickListener());
        buttonPrev.setOnClickListener(new ButtonPrevClickListener());
    }

    private class ButtonNextClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            startActivity(DetailsActivity.newIntent(MainActivity.this));
        }
    }

    private class ButtonPrevClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            startActivity(SplashActivity.newIntent(MainActivity.this));
        }
    }

    public static Intent newIntent(Context context) {
        return new Intent(context, MainActivity.class);
    }
}
