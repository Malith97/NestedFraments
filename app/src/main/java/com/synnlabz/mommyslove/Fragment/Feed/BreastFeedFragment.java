package com.synnlabz.mommyslove.Fragment.Feed;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.synnlabz.mommyslove.R;

public class BreastFeedFragment extends Fragment {


    public BreastFeedFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_breast_feed, container, false);
    }

}
