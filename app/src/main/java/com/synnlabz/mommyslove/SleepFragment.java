package com.synnlabz.mommyslove;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class SleepFragment extends Fragment {


    public SleepFragment() {
        // Required empty public constructor
    }

    public static SleepFragment getInstance()    {
        return new SleepFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sleep, container, false);
    }

}
