package com.example.dma_todoapp.Splash;

import android.content.Intent;
import android.os.Bundle;

import com.example.dma_todoapp.R;
import com.example.dma_todoapp.Login.LoginActivity;
import com.example.dma_todoapp.Splash.SplashViewModel;
import com.example.dma_todoapp.Tasks.TaskListActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

public class SplashActivity extends AppCompatActivity {
    SplashViewModel splashViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashViewModel = ViewModelProviders.of(this).get(SplashViewModel.class);
        screenSelector();
    }

    public void screenSelector() {
        if (splashViewModel.isLoggedIn()) {
            Intent intent = new Intent(this, TaskListActivity.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }
        finish();
    }


}
