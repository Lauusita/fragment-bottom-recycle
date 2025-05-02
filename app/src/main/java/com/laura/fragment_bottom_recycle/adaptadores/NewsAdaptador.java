package com.laura.fragment_bottom_recycle.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.laura.fragment_bottom_recycle.R;
import com.laura.fragment_bottom_recycle.clases.News;
import com.squareup.picasso.Picasso;

import java.util.List;

public class NewsAdaptador extends RecyclerView.Adapter<NewsAdaptador.ViewHolder> {
    List<News> datos;

    public NewsAdaptador(List<News> datos) {
        this.datos = datos;
    }

    @NonNull
    @Override
    public NewsAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_items, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsAdaptador.ViewHolder holder, int position) {
        News news = datos.get(position);
        holder.bind(news);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_new;
        TextView txt_title, txt_desc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_title = itemView.findViewById(R.id.txt_title);
            txt_desc = itemView.findViewById(R.id.txt_desc);
            img_new = itemView.findViewById(R.id.img_new);
        }

        public void bind(News news) {
            txt_desc.setText(news.getDesc());
            txt_title.setText(news.getTitle());
            Picasso.get().load(news.getImage()).into(img_new);
        }
    }

}


