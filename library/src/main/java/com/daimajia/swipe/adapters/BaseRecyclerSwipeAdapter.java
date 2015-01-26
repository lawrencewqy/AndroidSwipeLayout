package com.daimajia.swipe.adapters;

import android.support.v7.widget.RecyclerView;

import com.daimajia.swipe.SwipeLayout;
import com.daimajia.swipe.implments.SwipeItemMangerImpl;
import com.daimajia.swipe.interfaces.SwipeAdapterInterface;
import com.daimajia.swipe.interfaces.SwipeItemMangerInterface;

import java.util.List;

public abstract class BaseRecyclerSwipeAdapter extends RecyclerView.Adapter implements SwipeItemMangerInterface, SwipeAdapterInterface {

    protected SwipeItemMangerImpl mItemManger = new SwipeItemMangerImpl(this);

    /**
     * return the {@link com.daimajia.swipe.SwipeLayout} resource id, int the view item.
     * @param position
     * @return
     */
    public abstract int getSwipeLayoutResourceId(int position);

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        mItemManger.updateConvertView(viewHolder.itemView,position);
        doViewHolderBind(viewHolder,position);
    }

    public abstract void doViewHolderBind(RecyclerView.ViewHolder viewHolder, int position);

    @Override
    public void openItem(int position) {
        mItemManger.openItem(position);
    }

    @Override
    public void closeItem(int position) {
        mItemManger.closeItem(position);
    }

    @Override
    public void closeAllExcept(SwipeLayout layout) {
        mItemManger.closeAllExcept(layout);
    }

    @Override
    public List<Integer> getOpenItems() {
        return mItemManger.getOpenItems();
    }

    @Override
    public List<SwipeLayout> getOpenLayouts() {
        return mItemManger.getOpenLayouts();
    }

    @Override
    public void removeShownLayouts(SwipeLayout layout) {
        mItemManger.removeShownLayouts(layout);
    }

    @Override
    public boolean isOpen(int position) {
        return mItemManger.isOpen(position);
    }

    @Override
    public SwipeItemMangerImpl.Mode getMode() {
        return mItemManger.getMode();
    }

    @Override
    public void setMode(SwipeItemMangerImpl.Mode mode) {
        mItemManger.setMode(mode);
    }
}
