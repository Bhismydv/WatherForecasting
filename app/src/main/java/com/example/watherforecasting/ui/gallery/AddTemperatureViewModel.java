package com.example.watherforecasting.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AddTemperatureViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AddTemperatureViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Add Temperature");
    }

    public LiveData<String> getText() {
        return mText;
    }
}