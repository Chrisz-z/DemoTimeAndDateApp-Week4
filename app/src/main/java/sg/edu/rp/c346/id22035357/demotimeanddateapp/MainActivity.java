package sg.edu.rp.c346.id22035357.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    Button btnReset;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dp = findViewById(R.id.dp1);
        tp = findViewById(R.id.tp1);
        btnDisplayTime = findViewById(R.id.btn2);
        btnDisplayDate = findViewById((R.id.btn1));
        tvDisplay = findViewById(R.id.tvdisplay1);
        btnReset = findViewById(R.id.btnReset);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hour = tp.getCurrentHour();
                int minute = tp.getCurrentMinute();
                tvDisplay.setText("Time is "+hour+":"+minute);

            }
        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int year = dp.getYear();
                int month = dp.getMonth()+1;
                int date = dp.getDayOfMonth();
                tvDisplay.setText("Date is "+ date + "/"+month+"/"+year);


            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dp.updateDate(2020,1,1);
                tp.setCurrentHour(0);
                tp.setCurrentMinute(0);
            }
        });

    }



}