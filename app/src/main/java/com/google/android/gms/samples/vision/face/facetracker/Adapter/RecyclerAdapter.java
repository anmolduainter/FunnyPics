package com.google.android.gms.samples.vision.face.facetracker.Adapter;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.gms.samples.vision.face.facetracker.FaceTrackerActivity;
import com.google.android.gms.samples.vision.face.facetracker.MainActivity;
import com.google.android.gms.samples.vision.face.facetracker.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by anmol on 26/6/17.
 */

public class RecyclerAdapter  extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    Context ctx;

    int images[]={
         R.drawable.sunglas,
            R.drawable.two,
            R.drawable.three
    };

    public RecyclerAdapter(Context ctx) {

      this.ctx=ctx;

    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView image;

        public ViewHolder(View itemView) {
            super(itemView);
            image= (ImageView) itemView.findViewById(R.id.card_image);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int pos=getAdapterPosition();
                    Intent i=new Intent(ctx, FaceTrackerActivity.class);
                    i.putExtra("bitmap",images[pos]);
                    ctx.startActivity(i);

                }
            });

        }
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout,parent,false);
        RecyclerView.ViewHolder v=new ViewHolder(view);
        return (ViewHolder) v;
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.ViewHolder holder, int position) {


        Picasso.with(ctx).load(images[position]).into(holder.image);

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

}
