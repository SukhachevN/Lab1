package com.example.lab3.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MutableLiveData<String> mText2;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("to first");
        mText2 = new MutableLiveData<>();
        mText2.setValue("to second");
    }

    public LiveData<String> getText() {
        return mText;

    }
}