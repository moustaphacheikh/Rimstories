package com.coolide.rimstories.fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;


public class TopTenPost extends PostListFragment {
    public TopTenPost() {
    }

    @Override
    public Query getQuery(DatabaseReference databaseReference) {

        Query TopTenPostQuery = databaseReference.child("posts")
               .orderByChild("starCount").limitToFirst(2);


        // [END my_top_posts_query]
        return TopTenPostQuery;
    }
}
