package com.example.watherforecasting.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ShowTemperatureViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ShowTemperatureViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Show Temperature");
    }

    public LiveData<String> getText() {
        return mText;
    }
}