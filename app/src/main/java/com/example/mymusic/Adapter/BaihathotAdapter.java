package com.example.mymusic.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mymusic.Model.Baihat;
import com.example.mymusic.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class BaihathotAdapter extends RecyclerView.Adapter<BaihathotAdapter.ViewHodel>{
        Context context;
        ArrayList<Baihat> baihatArrayList;

    public BaihathotAdapter(Context context, ArrayList<Baihat> baihatArrayList) {
        this.context = context;
        this.baihatArrayList = baihatArrayList;
    }

    @NonNull
    @Override
    public ViewHodel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.dong_bai_hat_hot,parent,false);
        return new ViewHodel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHodel holder, int position) {
        Baihat baihat = baihatArrayList.get(position);
        holder.txtcasi.setText(baihat.getCasi());
        holder.txtten.setText(baihat.getTenbaihat());
        Picasso.with(context).load(baihat.getHinhbaihat()).into(holder.imghinh);

    }

    @Override
    public int getItemCount() {
        return baihatArrayList.size();
    }

    public class ViewHodel extends RecyclerView.ViewHolder {
        TextView txtten,txtcasi;
        ImageView imghinh,imgluotthich;

         public ViewHodel(@NonNull View itemView) {
             super(itemView);
             txtten = itemView.findViewById(R.id.textviewtenbaihathot);
             txtcasi = itemView.findViewById(R.id.textviewcasibaihathot);
             imghinh = itemView.findViewById(R.id.imageviewbaihathot);
             imgluotthich = itemView.findViewById(R.id.imageviewluotthich);
         }
     }
}
