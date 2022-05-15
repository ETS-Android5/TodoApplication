package com.example.dma_todoapp.Tasks;

import android.app.Application;

import com.example.dma_todoapp.Session.SessionRepository;
import com.example.dma_todoapp.Task.TaskRepository;
import com.example.dma_todoapp.Task.TaskEntry;

import java.util.List;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

public class MainActivityViewModel extends AndroidViewModel {

    TaskRepository taskRepository;

    private final LiveData<List<TaskEntry>> tasks;


    public MainActivityViewModel(Application application) {
        super(application);
        taskRepository = TaskRepository.getInstance(application);
        SessionRepository sessionRepository = SessionRepository.getInstance(application);

        tasks = taskRepository.getTasks(sessionRepository.getEmail());
    }

    public LiveData<List<TaskEntry>> getTasks() {
        return tasks;
    }

    public void deleteTask(TaskEntry task) {
        taskRepository.deleteTask(task);
    }

    public void addTask(TaskEntry task){
        taskRepository.insertTask(task);
    }

}
