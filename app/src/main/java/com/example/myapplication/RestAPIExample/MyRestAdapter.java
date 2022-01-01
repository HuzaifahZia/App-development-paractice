package com.example.myapplication.RestAPIExample;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.List;

public class MyRestAdapter extends RecyclerView.Adapter<MyRestAdapter.viewHolder>{
    public List<MyRestAPIModel> list;
    public Context context;

    public MyRestAdapter(List<MyRestAPIModel> list, Context context){
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.myrestlayout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.Name.setText(list.get(position).getTitle());
        holder.Content.setText(list.get(position).getBody());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        TextView Name,Content;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            Name = itemView.findViewById(R.id.resttextname);
            Content = itemView.findViewById(R.id.resttxtcontent);
        }
    }
}
