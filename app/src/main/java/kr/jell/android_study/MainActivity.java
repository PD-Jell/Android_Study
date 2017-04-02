package kr.jell.android_study;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import kr.jell.android_study.Gugudan.Gugudan;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     //   findViewById(R.id.startBtn).setOnClickListener(startBtnListener); // 따로 만들기
        Button button = (Button)findViewById(R.id.startBtn);
        button.setOnClickListener(new Button.OnClickListener(){ // 한번에 만들기
            @Override
            public void onClick(View v) {
                Log.d("TAG","onClick: Start Button Clicked.");
                //Intent intent = new Intent(this, Gugudan.class);
                Intent intent = new Intent(getApplicationContext(),Gugudan.class);
                startActivity(intent);
            }
        });
    }

    Button.OnClickListener startBtnListener = new View.OnClickListener() { // 따로 만들기
        @Override
        public void onClick(View v) {
            Log.d("TAG","onClick: Start Button Clicked.");
            Intent intent = new Intent(getApplicationContext(), Gugudan.class);
            startActivity(intent);
        }
    };
}
