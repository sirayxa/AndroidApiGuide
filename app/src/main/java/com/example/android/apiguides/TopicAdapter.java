package com.example.android.apiguides;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class TopicAdapter extends RecyclerView.Adapter<TopicAdapter.VH> {

    private ArrayList<String> topics = new ArrayList<>();

    @NonNull
    @Override
    public TopicAdapter.VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        return new VH(LayoutInflater.from(viewGroup.getContext()).inflate(
                R.layout.android_topic_adapter_item, viewGroup, false));

    }

    @Override
    public void onBindViewHolder(@NonNull TopicAdapter.VH viewHolder, final int position) {
        viewHolder.textView.setText(topics.get(position));
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                try {
                    context.startActivity(new Intent(context, Class.forName(topics.get(position).concat("Activity"))));
                } catch (ClassNotFoundException ex) {

                }


            }
        });
    }

    @Override
    public int getItemCount() {
        return topics == null ? 0 : topics.size();
    }


    public void setData() {
        topics.clear();
        topics.addAll(DataModel.getDataModel().getApiTopics());
        notifyDataSetChanged();
    }

    class VH extends RecyclerView.ViewHolder {
        TextView textView;

        VH(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.topic_text);
        }
    }


}
