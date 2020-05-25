package com.mj.mvvmstudy.repositories;

import com.mj.mvvmstudy.models.NicePlaces;

import java.util.ArrayList;
import java.util.List;

import androidx.lifecycle.MutableLiveData;

/**
 * Singleton pattern
 */

public class NicePlaceRepo {

    private static NicePlaceRepo instance;
    private ArrayList<NicePlaces> dataSet = new ArrayList<>();

    public static NicePlaceRepo getInstance(){
        if(instance == null){
            instance = new NicePlaceRepo();
        }
        return instance;
    }

    //pretend to get data from a webservice or online source
    public MutableLiveData<List<NicePlaces>> getNicePlaces(){
        setNicePlaces();

        MutableLiveData<List<NicePlaces>> data = new MutableLiveData<>();
        data.setValue(dataSet);

        return data;
    }

    private void setNicePlaces(){
        dataSet.add(
                new NicePlaces("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg",
                        "Havasu Falls")
        );
        dataSet.add(
                new NicePlaces("https://i.redd.it/tpsnoz5bzo501.jpg",
                        "Trondheim")
        );
        dataSet.add(
                new NicePlaces("https://i.redd.it/qn7f9oqu7o501.jpg",
                        "Portugal")
        );
        dataSet.add(
                new NicePlaces("https://i.redd.it/j6myfqglup501.jpg",
                        "Rocky Mountain National Park")
        );
        dataSet.add(
                new NicePlaces("https://i.redd.it/0h2gm1ix6p501.jpg",
                        "Havasu Falls")
        );
        dataSet.add(
                new NicePlaces("https://i.redd.it/k98uzl68eh501.jpg",
                        "Mahahual")
        );
        dataSet.add(
                new NicePlaces("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg",
                        "Frozen Lake")
        );
        dataSet.add(
                new NicePlaces("https://i.redd.it/obx4zydshg601.jpg",
                        "Austrailia")
        );
    }
}
