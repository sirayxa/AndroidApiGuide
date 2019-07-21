package com.example.android.apiguides;

import android.content.Context;

import java.util.ArrayList;

final class TopicModel {

    private final Context mContext;

    public TopicModel(Context context) {
        mContext = context;
    }

    ArrayList<String> getApiTopics() {
        return TopicDao.getApiTopics(mContext);
    }
}
