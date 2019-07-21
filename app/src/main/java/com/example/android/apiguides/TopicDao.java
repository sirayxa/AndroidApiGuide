package com.example.android.apiguides;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;

import java.util.ArrayList;

final class TopicDao {

    private TopicDao() {
    }

    static ArrayList<String> getApiTopics(Context context) {
        final Resources resources = context.getResources();
        final TypedArray typedArray = resources.obtainTypedArray(R.array.android_api_topics);
        final int topicCount = typedArray.length();
        final ArrayList<String> topics = new ArrayList<>(topicCount);

        try {
            for (int i = 0; i < topicCount; i++) {
                final String topicString = typedArray.getString(i);
                topics.add(topicString);
            }
        } finally {
            typedArray.recycle();
        }

        return topics;
    }
}
