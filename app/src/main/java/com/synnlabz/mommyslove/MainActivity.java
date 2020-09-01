package com.synnlabz.mommyslove;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.synnlabz.mommyslove.Fragment.Diaper.DiaperFragment;
import com.synnlabz.mommyslove.Fragment.Feed.FeedFragment;
import com.synnlabz.mommyslove.Helper.BottomNavigationViewHelper;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment selectedFragment = null;

                switch (item.getItemId())   {
                    case R.id.action_home:
                        selectedFragment = HomeFragment.getInstance();
                        break;
                    case R.id.action_feed:
                        selectedFragment = FeedFragment.getInstance();
                        break;
                    case R.id.action_sleeping:
                        selectedFragment = SleepFragment.getInstance();
                        break;
                    case R.id.action_diaper:
                        selectedFragment = DiaperFragment.getInstance();
                        break;
                    case R.id.action_medic:
                        selectedFragment = MedicineFragment.getInstance();
                        break;
                }

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.main_frame,selectedFragment);
                transaction.commit();
                return true;
            }
        });
        setDefaultFragment();
    }

    private void setDefaultFragment() {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame, HomeFragment.getInstance());
        transaction.commit();
    }
}
