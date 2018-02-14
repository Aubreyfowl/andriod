package com.nsb.visions.varun.mynsb.Settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import com.nsb.visions.varun.mynsb.Common.ReminderColours;
import com.nsb.visions.varun.mynsb.R;

public class SettingsActivity extends AppCompatActivity {
    private SharedPreferences sharedPrefs;

    private void createReminder(String name, String colour) {
        ReminderColours rc = new ReminderColours(this.sharedPrefs);
        rc.createTag(name, colour);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        this.sharedPrefs = getSharedPreferences("MyNSB", Context.MODE_PRIVATE);

        // Various views for reminder creation
        Button reminderButton = (Button) findViewById(R.id.create_reminder_tag);
        EditText reminderName = (EditText) findViewById(R.id.reminder_name_edit);
        EditText reminderColour = (EditText) findViewById(R.id.reminder_colour_edit);

        reminderButton.setOnClickListener(view -> {
            createReminder(reminderName.getText().toString(), reminderColour.getText().toString());
            reminderName.setText("");
            reminderColour.setText("");
        });
    }
}
