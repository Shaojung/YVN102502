package com.example.yvtc.yvn102502;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    CheckBox chk;
    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chk = (CheckBox) findViewById(R.id.checkBox);
        rg = (RadioGroup) findViewById(R.id.radioGroup);
        chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    Log.d("MYLOG", "有勾");
                }
                else
                {
                    Log.d("MYLOG", "沒勾");
                }
            }
        });
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButton4)
                {
                    Log.d("MYLOG", "第一個");
                }
                if (checkedId == R.id.radioButton5)
                {
                    Log.d("MYLOG", "第二個");
                }
            }
        });
    }

    public void click1(View v)
    {
        CheckBox chk1, chk2;
        chk1 = (CheckBox) findViewById(R.id.checkBox);
        chk2 = (CheckBox) findViewById(R.id.checkBox2);

        if (chk1.isChecked())
        {
            Log.d("MYLOG", "要用餐");
        }
        else
        {
            Log.d("MYLOG", "不用餐");
        }
        if (chk2.isChecked())
        {
            Log.d("MYLOG", "要搭車");
        }
        else
        {
            Log.d("MYLOG", "不要搭車");
        }

        switch (rg.getCheckedRadioButtonId())
        {
            case R.id.radioButton4:
                Log.d("MYLOG", "紅色紀念品");
                break;
            case R.id.radioButton5:
                Log.d("MYLOG", "黃色紀念品");
                break;
            case R.id.radioButton6:
                Log.d("MYLOG", "綠色紀念品");
                break;
        }
    }
}
