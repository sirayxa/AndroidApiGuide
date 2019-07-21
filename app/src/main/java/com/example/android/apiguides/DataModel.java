package com.example.android.apiguides;

import android.content.Context;

import java.util.ArrayList;

public final class DataModel {

    private static final DataModel sDataModel = new DataModel();
    private TopicModel mTopicModel;

    private DataModel() {
    }

    public static DataModel getDataModel() {
        return sDataModel;
    }

    public void init(Context context) {
        mTopicModel = new TopicModel(context);
    }

    public ArrayList<String> getApiTopics() {
        return mTopicModel.getApiTopics();
    }


}
