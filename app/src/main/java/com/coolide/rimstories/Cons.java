package com.coolide.rimstories;

import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by moustaphcheikh on 17/07/2016.
 */
public class Cons {
static int  limite;
    public static int getRecentLimite() {
       /* final int[] limite = new int[1];
        DatabaseReference mDatabase;
// ...
        mDatabase = FirebaseDatabase.getInstance().getReference().child("RecentLimit");
        mDatabase.addListenerForSingleValueEvent(
                new ValueEventListener() {
                    public static final String TAG = "fds";

                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // Get user value
                        String user = dataSnapshot.getValue(String.class);
                        limite[0] = Integer.parseInt(user.toString());

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        Log.w(TAG, "getUser:onCancelled", databaseError.toException());
                    }
                });*/
        testingLimite();


        return limite;
    }

    public static void testingLimite(){
        DatabaseReference mDatabase;
// ...
        mDatabase = FirebaseDatabase.getInstance().getReference().child("RecentLimite");
        mDatabase.addListenerForSingleValueEvent(
                new ValueEventListener() {
                    public static final String TAG = "fds";

                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // Get user value
                        String user = dataSnapshot.getValue(String.class);
                        limite= Integer.parseInt(user.toString());
                        // ...
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        Log.w(TAG, "getUser:onCancelled", databaseError.toException());
                    }
                });
    }
}
