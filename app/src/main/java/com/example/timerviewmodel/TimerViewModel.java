package com.example.timerviewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TimerViewModel extends ViewModel {
    //Esta clase contiene un dato que va a ser observable
    //Que contiene la logica de negocio
    //Esta vinculada al ciclo de vida de un componenete LifeCicleOwner

    LiveData<Long> elapsedTime = new MutableLiveData<>();
}
