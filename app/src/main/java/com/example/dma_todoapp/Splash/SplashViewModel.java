package com.example.dma_todoapp.Splash;

import android.app.Application;

import com.example.dma_todoapp.Session.SessionRepository;

import androidx.lifecycle.AndroidViewModel;

public class SplashViewModel extends AndroidViewModel {
    SessionRepository sessionRepository;

    public SplashViewModel(Application application) {
        super(application);
        sessionRepository = SessionRepository.getInstance(application);
    }

    public boolean isLoggedIn() {
        return sessionRepository.isLoggedIn();
    }
}
