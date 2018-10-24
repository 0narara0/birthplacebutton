package com.cmy.www.birthplacebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onclickwidget(View view){
        int id = view.getId();
        String text;
        TextView textView = (TextView)findViewById(R.id.textview2);

        switch(id){
            case  R.id.button1:
                text = ((Button)view).getText().toString();
                break;
            case  R.id.button2:
                text = ((Button)view).getText().toString();
                break;
            case  R.id.button3:
                text = ((Button)view).getText().toString();
                break;
            case  R.id.button4:
                text = ((Button)view).getText().toString();
                break;
            case  R.id.button5:
                text = ((Button)view).getText().toString();
                break;
            case  R.id.button6:
                text = ((Button)view).getText().toString();
                break;
                default:
                    text = "Nothing";

        }textView.setText("내가 태어난 곳은 " + text + "입니다.");

    }
}
