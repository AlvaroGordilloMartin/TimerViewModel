package com.example.timerviewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

public class TimerActivity extends AppCompatActivity {

    TimerViewModel timerViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //En la siguiente linea establezco que el viewmodelque hemos creado depende del ciclo de vida de la activity
        timerViewModel = ViewModelProvider.of(this).get(TimerViewModel.class);

        Observer<Long> observer = new Observer<Long>() {
            @Override
            public void onChanged(Long aLong) {
                //Se intrpduce el codigo que quiero actualizar de la UI
            }
        };
        timerViewModel.getLiveData().observe(this,observer);
    }
}