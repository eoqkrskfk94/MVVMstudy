package com.mj.mvvmstudy.viewmodels;

import com.mj.mvvmstudy.models.NicePlaces;
import com.mj.mvvmstudy.repositories.NicePlaceRepo;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    private MutableLiveData<List<NicePlaces>> nicePlaces;
    private NicePlaceRepo nicePlaceRepo;

    public void init(){
        if (nicePlaces != null){
            return;
        }
        nicePlaceRepo = NicePlaceRepo.getInstance();
        nicePlaces = nicePlaceRepo.getNicePlaces();

    }

    public LiveData<List<NicePlaces>> getNicePlaces(){
        return nicePlaces;
    }
}
