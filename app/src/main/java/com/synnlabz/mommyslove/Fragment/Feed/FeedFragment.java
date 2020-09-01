package com.synnlabz.mommyslove.Fragment.Feed;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.synnlabz.mommyslove.Adapter.SectionPagerAdapter;
import com.synnlabz.mommyslove.R;

public class FeedFragment extends Fragment {

    View myFragment;

    ViewPager viewPager;
    TabLayout tabLayout;


    public FeedFragment() {
        // Required empty public constructor
    }

    public static FeedFragment getInstance()    {
        return new FeedFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myFragment = inflater.inflate(R.layout.fragment_feed, container, false);

        viewPager = myFragment.findViewById(R.id.viewPager);
        tabLayout = myFragment.findViewById(R.id.tabLayout);

        return myFragment;
    }

    //Call onActivity Create method


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setUpViewPager(ViewPager viewPager) {
        SectionPagerAdapter adapter = new SectionPagerAdapter(getChildFragmentManager());

        adapter.addFragment(new BreastFeedFragment(), "Breast");
        adapter.addFragment(new BottleFeedFragment(), "Bottle");
        adapter.addFragment(new SolidFeedFragment(),"Solid");

        viewPager.setAdapter(adapter);
    }
}
