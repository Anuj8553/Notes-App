package com.example.notesapp;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class service extends RemoteViewsService {

    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new ExampleWidgetItemFactory(getApplicationContext(), intent);
    }

    class ExampleWidgetItemFactory implements RemoteViewsFactory {
        private Context context;
        private int appWidgetId;
        private String[] exampleData = {"2.PG", "3.software Engineering", "4.Computer Networking","1. Computer Organization and Architecture"};


        ExampleWidgetItemFactory(Context context, Intent intent) {
            this.context = context;
            this.appWidgetId = intent.getIntExtra(AppWidgetManager.EXTRA_APPWIDGET_ID,
                    AppWidgetManager.INVALID_APPWIDGET_ID);
        }

        @Override
        public void onCreate() {
            //connect to data source
            SystemClock.sleep(3000);
        }

        @Override
        public void onDataSetChanged() {

        }

        @Override
        public void onDestroy() {
            //close data source
        }

        @Override
        public int getCount() {
            return exampleData.length;
        }

        @Override
        public RemoteViews getViewAt(int position) {


            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.example_item);
            views.setTextViewText(R.id.example_widget_item_text, exampleData[position]);
            SystemClock.sleep(500);

            return views;
        }

        @Override
        public RemoteViews getLoadingView() {
            return null;
        }

        @Override
        public int getViewTypeCount() {
            return 1;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }
    }

}
