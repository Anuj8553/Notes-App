package com.example.notesapp;
import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.Toast;

import com.google.firebase.Timestamp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.text.SimpleDateFormat;

public class Utility {
    static void showToast(Context context, String message){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }
    static CollectionReference getCollectionReferenceForNotes(){
        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        return FirebaseFirestore.getInstance().collection("Notes")
                .document(currentUser.getUid()).collection("my_notes");


    }

//    @SuppressLint("SimpleDateFormat")
    static String timestampToString(Timestamp timestamp){
//TODO SHOWS ERROR THUS NO TIME IN NOTEADAPTER
   return  new SimpleDateFormat("MM/dd/yyyy").format(timestamp.toDate());
    }




}
