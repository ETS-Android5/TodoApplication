package com.example.dma_todoapp.Login;

import android.app.Application;

import com.example.dma_todoapp.Session.SessionRepository;

import androidx.lifecycle.AndroidViewModel;

public class LogoutViewModel extends AndroidViewModel {
    SessionRepository sessionRepository;
    public LogoutViewModel(Application application) {
        super(application);
        sessionRepository = SessionRepository.getInstance(application);
    }
    public boolean LogOutUser(){
        return sessionRepository.logout();
    }
}
