package com.laura.fragment_bottom_recycle.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.laura.fragment_bottom_recycle.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileFragment extends Fragment {

    TextView txt_name, txt_mail, txt_age;

    public ProfileFragment() {
        // Required empty public constructor
    }

    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        String nombre = "Laura";
        String edad = "19";
        String correo = "laura@gmail.com";

        txt_name = view.findViewById(R.id.txt_name);
        txt_mail = view.findViewById(R.id.txt_mail);
        txt_age = view.findViewById(R.id.txt_age);

        txt_name.setText(nombre);
        txt_mail.setText(correo);
        txt_age.setText(edad);

        return view;
    }
}