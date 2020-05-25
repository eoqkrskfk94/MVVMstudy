package com.mj.mvvmstudy.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.mj.mvvmstudy.R;
import com.mj.mvvmstudy.models.NicePlaces;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private List<NicePlaces> nicePlaces = new ArrayList<>();
    private Context context;

    public RecyclerAdapter(Context context, List<NicePlaces> nicePlaces){
        this.context = context;
        this.nicePlaces = nicePlaces;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_listitem, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Glide .with(context)
                .asBitmap()
                .load(nicePlaces.get(position).getImageUrl())
                .into(holder.image);

        holder.imageName.setText(nicePlaces.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return nicePlaces.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView imageName;
        RelativeLayout parentLay;

        public ViewHolder(View itemView){
            super(itemView);
            image = itemView.findViewById(R.id.image);
            imageName = itemView.findViewById(R.id.image_name);
            parentLay = itemView.findViewById(R.id.parent_layout);

        }
    }
}
