package com.laura.fragment_bottom_recycle.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.laura.fragment_bottom_recycle.R;
import com.laura.fragment_bottom_recycle.adaptadores.NewsAdaptador;
import com.laura.fragment_bottom_recycle.clases.News;

import java.util.Arrays;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NewsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NewsFragment extends Fragment {

    RecyclerView rcv_news;

    public NewsFragment() {
        // Required empty public constructor
    }

    public static NewsFragment newInstance(String param1, String param2) {
        NewsFragment fragment = new NewsFragment();
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
        View view = inflater.inflate(R.layout.fragment_news, container, false);

        rcv_news = view.findViewById(R.id.rcv_news);

        News new1 = new News(
                "Goku alcanza el Ultra Instinct",
                "https://dragonball-api.com/characters/goku_normal.webp",
                "En el Torneo del Poder, Goku logra alcanzar el Ultra Instinct, una técnica que ni los dioses dominan."
        );

        News new2 = new News(
                "Vegeta supera al Super Saiyan Blue",
                "https://dragonball-api.com/characters/vegeta_normal.webp",
                "Vegeta entrena en el planeta Yardrat y desarrolla una nueva transformación más allá del Blue."
        );

        News new3 = new News(
                "Gohan alcanza el Ultra Instinct",
                "https://dragonball-api.com/characters/gohan.webp",
                "En el Torneo del Poder, Goku logra alcanzar el Ultra Instinct, una técnica que ni los dioses dominan."
        );

        News new4 = new News(
                "Freezer se une temporalmente a los héroes",
                "https://dragonball-api.com/characters/Freezer.webp",
                "Durante el Torneo del Poder, Freezer es revivido y se alía con Goku y compañía para salvar su universo."
        );

        News new5 = new News(
                "Piccolo regresa en Dragon Ball Super",
                "https://dragonball-api.com/characters/picolo_normal.webp",
                "El legendario Super Saiyan Broly vuelve con una nueva historia canónica en Dragon Ball Super: Broly."
        );

        List<News> datos = Arrays.asList(new1, new2, new3, new4, new5);

        NewsAdaptador newsAdaptador = new NewsAdaptador(datos);

        rcv_news.setLayoutManager(new LinearLayoutManager(getContext()));
        rcv_news.setAdapter(newsAdaptador);

        return view;
    }
}