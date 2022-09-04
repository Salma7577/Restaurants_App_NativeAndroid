package com.example.swe483restruntproject.adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.swe483restruntproject.R;
import com.example.swe483restruntproject.RestruntDescrption;
import com.example.swe483restruntproject.placeholder.restuntsHomePageListItemModel;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;
import java.util.Set;

public class restuntsHomePageListItemAdapter extends RecyclerView.Adapter<restuntsHomePageListItemAdapter.ViewHolder>{

    ArrayList<restuntsHomePageListItemModel> restuntsHomePageListItemModel;
    public restuntsHomePageListItemAdapter(ArrayList<restuntsHomePageListItemModel> restuntsHomePageListItemModel) {
    this.restuntsHomePageListItemModel = restuntsHomePageListItemModel;
    }

    @NonNull
    @Override
    public restuntsHomePageListItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new restuntsHomePageListItemAdapter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull restuntsHomePageListItemAdapter.ViewHolder holder, int position) {
        restuntsHomePageListItemModel s = restuntsHomePageListItemModel.get(position);
        holder.setData(s.getImage(),s.getName(),s.getRating(),s.getSpeiclty());
    }

    @Override
    public int getItemCount() {
        return restuntsHomePageListItemModel.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ShapeableImageView imageView;
        TextView restName,rating,specilty;
        ConstraintLayout rectangle;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.logoImageInHomeitem);
            restName = itemView.findViewById(R.id.restaurantTitle);
            rating = itemView.findViewById(R.id.rating);
            specilty = itemView.findViewById(R.id.specialty);
            rectangle = itemView.findViewById(R.id.itemRectangle);
            rectangle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext() ,RestruntDescrption.class);
                    intent.putExtra("restName",restName.getText().toString());
                    itemView.getContext().startActivity(intent);
                }
            });
        }


        public void setData(Uri image , String restName , double rating , String specilty){
            this.imageView.setImageURI(image);
            this.restName.setText( restName);
            this.rating.setText(rating+"");
            this.specilty.setText( specilty);

        }
    }
}
