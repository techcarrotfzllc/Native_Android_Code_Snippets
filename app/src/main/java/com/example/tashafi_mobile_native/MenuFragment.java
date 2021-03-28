package com.example.tashafi_mobile_native;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import javax.inject.Inject;

public class MenuFragment extends Fragment {

    @Inject
    Car car;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.menu_fragment, null);

        CarComponent component = DaggerCarComponent.create();
//        car = component.getCar();
        component.inject(this);
        car.drive();

        return rootView;
    }
}
