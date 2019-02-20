package com.alextroy.android.hw2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class InfoActivity extends AppCompatActivity {

    private Button buttonNext;
    private Button buttonPrev;
    private Button buttonToFirst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        initViews();
        initListeners();
    }

    private void initViews() {
        buttonNext = findViewById(R.id.button_next);
        buttonPrev = findViewById(R.id.button_prev);
        buttonToFirst = findViewById(R.id.button_to_first);
    }

    private void initListeners() {
        buttonNext.setOnClickListener(new ButtonNextClickListener());
        buttonPrev.setOnClickListener(new ButtonPrevClickListener());
        buttonToFirst.setOnClickListener(new ButtonToFirstClickListener());
    }

    private class ButtonNextClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            startActivity(SplashActivity.newIntent(InfoActivity.this));
        }
    }

    private class ButtonPrevClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            startActivity(DetailsActivity.newIntent(InfoActivity.this));
        }
    }

    private class ButtonToFirstClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            startActivity(SplashActivity.newIntent(InfoActivity.this));
            finishAffinity();
        }
    }

    public static Intent newIntent(Context context) {
        return new Intent(context, InfoActivity.class);
    }
}
