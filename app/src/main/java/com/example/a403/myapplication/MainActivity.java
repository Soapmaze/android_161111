package com.example.a403.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    TextView txt_v;
    CheckBox chk1;
    RatingBar rate_bar;
    CalendarView cal_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button2);
        b2 = (Button) findViewById(R.id.button3);
        chk1 = (CheckBox) findViewById(R.id.checkBox);
        txt_v = (TextView) findViewById(R.id.textView);
        rate_bar = (RatingBar)findViewById(R.id.ratingBar);
        cal_view = (CalendarView)findViewById(R.id.calendarView);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "ㅗ", Toast.LENGTH_SHORT).show();
                txt_v.setText("아니 버튼 1번을 눌렀엉");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "낄낄", Toast.LENGTH_SHORT).show();
                txt_v.setText("갸아악");
            }
        });
        chk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chk1.isChecked()) {
                    Toast.makeText(getApplicationContext(), "체크박스를 누르셨네여 ㅎㅎ", Toast.LENGTH_SHORT).show();
                    txt_v.setText("체크박스를 눌렀음");
                }
            }
        });
        rate_bar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener(){
            @Override
            public void onRatingChanged(RatingBar rate_bar, float rating, boolean fromUser){
                rate_bar.setRating(rating);
                Toast.makeText(getApplicationContext(), "당신은 " + String.valueOf(rating) + " 점을 줬습니당", Toast.LENGTH_LONG).show();
                txt_v.setText("레이팅 했음");
            }
        });

        cal_view.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView cal_view, int year, int month, int dayOfMonth){
                Toast.makeText(getApplicationContext(),""+ year + "/" + (month+1) +"/" + dayOfMonth, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
