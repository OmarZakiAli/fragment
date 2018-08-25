package com.examble.omar.fragment.DataWork;

import android.content.Context;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.examble.omar.fragment.MainActivity;
import com.examble.omar.fragment.R;

import java.util.List;

/**
 * Created by omar on 8/15/18.
 */

public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.Playerholder> {


    List<Player> ls;
Context context;

    public PlayerAdapter(List<Player> list,Context context){

        this.ls=list;
this.context=context;

    }

    @Override
    public Playerholder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.player_item, parent, false);


        return new Playerholder(itemView);
    }

    @Override
    public void onBindViewHolder(Playerholder holder, int position) {

        Player player=ls.get(position);
        holder.playerName.setText(player.getName());
holder.imageView.setImageResource(player.getImage());


    }

    @Override
    public int getItemCount() {
        return ls!=null?ls.size():0;
    }



    //view holder


    class  Playerholder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView playerName;

        public Playerholder(View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageView);
            playerName=itemView.findViewById(R.id.player_name);
itemView.setOnClickListener(new View.OnClickListener() {


    @Override
    public void onClick(View v) {
        Player player=ls.get(getAdapterPosition());
        MainActivity mainActivity= (MainActivity) context;
        mainActivity.onF1update(player.getName(),player.getImage(),player.getDesc());
    }
});

        }


    }








}
