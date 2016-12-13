package com.example.igx.problem1;

import android.location.GpsStatus;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity /* implements Something1, Something2 */ {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_getLocation = (Button) findViewById(R.id.btn_getLocation);
        Button btn_getSensors = (Button) findViewById(R.id.btn_getSensors);
        Button btn_sendMessage = (Button) findViewById(R.id.btn_sendMessage);

        final TextView text_selectedData = (TextView) findViewById(R.id.text_selectedData);
        final TextView text_selectedType = (TextView) findViewById(R.id.text_selectedType);
        final EditText edit_phoneNumber = (EditText) findViewById(R.id.edit_phoneNumber);

        btn_getLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 버튼 누르면 Selection이 LOCATION으로 바뀜
                text_selectedType.setText("Location");
                // Value값 변경 (위치정보를 받아온다)
                text_selectedData.

            }
        });





        btn_getSensors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //버튼 누르면 Selection이 Sensors 로 바뀜
                text_selectedType.setText("Sensors");
                //Value값 변경 (센서 정보를 받아온다)
                text_selectedData.

            }
        });

        // Phone Number를 입력받는다
        edit_phoneNumber.getText();


        btn_sendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 안드로이드 메시지 앱 실행 . 입력한 연락처로 보낸다
                startIntentSender(edit_phoneNumber);

                // 내용은 가장 마지막 갱신 위치or센서 정보를 메시지를 보낸다

            }
        });
    }
}
