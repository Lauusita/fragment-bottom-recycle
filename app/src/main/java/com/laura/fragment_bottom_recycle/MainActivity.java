package com.laura.fragment_bottom_recycle;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.laura.fragment_bottom_recycle.fragment.NewsFragment;
import com.laura.fragment_bottom_recycle.fragment.ProfileFragment;
import com.laura.fragment_bottom_recycle.fragment.SettingFragment;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView nav_options;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nav_options = findViewById(R.id.nav_options);
        loadFragment(new ProfileFragment());

        nav_options.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                int itemId = item.getItemId();
                boolean returnState = false;

                if ( itemId == R.id.btn_pfp ) {
                    selectedFragment = new ProfileFragment();
                } else if ( itemId == R.id.btn_news ) {
                    selectedFragment = new NewsFragment();
                } else if ( itemId == R.id.btn_sett ){
                    selectedFragment = new SettingFragment();
                }

                if (selectedFragment != null) {
                    loadFragment(selectedFragment);
                    returnState = true;
                }
                return returnState;
            }
        });
    }

    private void loadFragment(Fragment selectedFragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, selectedFragment)
                .commit();
    }
}