package com.laura.fragment_bottom_recycle.fragment;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import com.laura.fragment_bottom_recycle.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SettingFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SettingFragment extends Fragment {

    Button btn_cambiar;
    FrameLayout fpfp, fsett, fnews;
    public SettingFragment() {
        // Required empty public constructor
    }

    public static SettingFragment newInstance(String param1, String param2) {
        SettingFragment fragment = new SettingFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View viewFragment = inflater.inflate(R.layout.fragment_setting, container, false);
        View pfp = inflater.inflate(R.layout.fragment_profile, container, false);
        View news = inflater.inflate(R.layout.fragment_news, container, false);

        btn_cambiar = viewFragment.findViewById(R.id.btn_cambiar);
        fnews = news.findViewById(R.id.frame_news);
        fpfp = pfp.findViewById(R.id.frame_pfp);
        fsett = viewFragment.findViewById(R.id.frame_sett);

        btn_cambiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fnews.setBackgroundColor(Color.parseColor("#D43302"));
                fpfp.setBackgroundColor(Color.parseColor("#D43302"));
                fsett.setBackgroundColor(Color.parseColor("#D43302"));
            }
        });
        return viewFragment;
    }
}