package com.example.recyclerviewexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {
    private DataModel[] listData;

    public MyRecyclerViewAdapter(DataModel[] listData) {
        this.listData = listData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final DataModel myListData = listData[position];
        holder.getTextView().setText(myListData.getTitle());
        holder.getImageView().setImageResource(myListData.getImage());

        //todo handle click events
    }

    @Override
    public int getItemCount() {
        return listData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView mImageView;
        TextView mTextView;

        public ViewHolder(View view) {
            super(view);
            mImageView = view.findViewById(R.id.imageView_recycler);
            mTextView = view.findViewById(R.id.textView_recycler);
        }

        public ImageView getImageView() {
            return mImageView;
        }

        public void setImageView(ImageView imageView) {
            mImageView = imageView;
        }

        public TextView getTextView() {
            return mTextView;
        }

        public void setTextView(TextView textView) {
            mTextView = textView;
        }
    }
}
