package com.nsb.visions.varun.mynsb.Timetable.Extended;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.nsb.visions.varun.mynsb.ExpandedTimetables;

/**
 * Created by varun on 25/04/2018. Coz varun is awesome as hell :)
 */

public class ExtendTimetablesHandler {
    public static void handleExtendTimetablesButton(Context context) {
        Log.d("exception", "you clicked me :)");
        Intent move = new Intent(context, ExpandedTimetables.class);
        context.startActivity(move);
    }
}
