package com.example.tashafi_mobile_native;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

public class AppointmentListFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.appointment_list_fragment, null);

        ViewPager viewPager = rootView.findViewById(R.id.viewPager);
        ImageAdapter adapter = new ImageAdapter( rootView.getContext() );
        viewPager.setAdapter(adapter);
        return rootView;
    }
}
