package com.example.myapplication;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;





public  class ActivityTransitionBroadcastReceiver extends BroadcastReceiver {

    public static final String INTENT_ACTION = "com.example.myapplication.ACTION_PROCESS_ACTIVITY_TRANSITIONS";

    @Override
    public  void onReceive(Context context, Intent intent) {
        Log.v("TransitionTest","onReceive() !!!!!!!!!!!!!");
    }


}


