package com.daimajia.swipedemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.daimajia.swipe.adapters.BaseRecyclerSwipeAdapter;
import com.daimajia.swipedemo.R;

/**
 * Created by lawrence on 15/1/26.
 */
public class RecyclerAdapter extends BaseRecyclerSwipeAdapter {
    @Override
    public int getSwipeLayoutResourceId(int position) {
        return R.id.swipe;
    }

    @Override
    public void doViewHolderBind(RecyclerView.ViewHolder viewHolder, int position) {
        RecyclerHolder holder = (RecyclerHolder) viewHolder;
        holder.tv_position.setText(position + 1 + ".");
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.listview_item,viewGroup,false);
        RecyclerHolder holder = new RecyclerHolder(view);
        return holder;
    }

    @Override
    public int getItemCount() {
        return 50;
    }

    class RecyclerHolder extends RecyclerView.ViewHolder{
        TextView tv_position;
        public RecyclerHolder(View itemView) {
            super(itemView);
           tv_position = (TextView)itemView.findViewById(R.id.position);
        }
    }
}
