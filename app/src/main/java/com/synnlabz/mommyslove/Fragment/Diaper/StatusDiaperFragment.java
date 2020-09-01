package com.synnlabz.mommyslove.Fragment.Diaper;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.synnlabz.mommyslove.R;

public class StatusDiaperFragment extends Fragment {


    public StatusDiaperFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_status_diaper, container, false);
    }

}
