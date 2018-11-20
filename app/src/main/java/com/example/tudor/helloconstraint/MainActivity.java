package com.example.tudor.helloconstraint;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int m_count;
    private TextView m_show_count;
    private Button m_zero_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m_show_count = (TextView) findViewById(R.id.show_count);
        m_zero_button = (Button) findViewById(R.id.button_zero);
        m_count = 0;
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        m_count++;
            if(m_count % 2 == 0){
                view.setBackgroundColor(Color.RED);
            }
            else{
                view.setBackgroundColor(Color.BLUE);
        }


        if(m_zero_button != null) {
            if (m_count > 0) {
                m_zero_button.setBackgroundColor(Color.GREEN);
            }
        }


        if(m_show_count != null){
            m_show_count.setText(Integer.toString(m_count));
        }

    }

    public void resetZero(View view) {
        m_count = 0;
        if(m_show_count != null){
            m_show_count.setText(Integer.toString(m_count));
            view.setBackgroundColor(Color.GRAY);
        }
    }
}
