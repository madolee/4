package com.example.a4;

import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a4.R;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class MainActivity extends AppCompatActivity {

    EditText edittext; // 메세지 입력 뷰
    TextView textView; // 작성 글자타내는 뷰
    Button button1;    // 작성 버튼9
    Button button2;    // 끝남 버튼

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            edittext.addTextChangedListener(new TextWatcher() {
        // addTextChangedListener 텍스트가 입력에 따라 변경될 때마다 확인하는 기능
          // TextWatcher 텍스트가 변경될 때마다 발생하는 이벤트 처리하는 인터페이스
           public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

           public void onTextChanged(CharSequence s, int start, int before, int count) {
            InputFilter[] filter = new InputFilter[1];
               filter[0] = new InputFilter.LengthFilter(80);
                // 쓸 수 있는 글자 수 최대 80자로 제한
               edittext.setFilters(filter);

               int currentBytes = s.toString().getBytes().length;        // 텍스트 내용을 받아와서 바이트 수를 가져온다.
              String txt = String.valueOf(currentBytes) + " / 80 바이트";
               textView.setText(txt);                                           // 텍스트뷰에 현재 바이트수 표시
          }

         public void afterTextChanged(Editable s) {}
       });
 }

 public void onButton1Clicked(View v) {
       Toast.makeText(getApplicationContext(), (CharSequence) edittext.getText(), Toast.LENGTH_LONG).show();
    }   // 전송 버튼을 클릭하면 작성된 메시지를 토스트로 띄어준다.
   // editText.getText()의 반환형은 editable 이므로 CharSequence 타입으로 형변환 해준다.

    public void onButton2Clicked(View v) {
        finish();




******************
    //     URL url = null;
    //     URLConnection uc = null;

    //     try{
    //         url = new URL("http://daum.net");
    //     }catch(MalformedURLException me){}

    //     try{    uc = url.openConnection(); }catch(IOException io){}


    //             // 뷰 지정
    //     edittext = (EditText) findViewById(R.id.edittext);
    //     textView = (TextView) findViewById(R.id.textView);
    //     button1 = (Button) findViewById(R.id.button1);
    //     button2 = (Button) findViewById(R.id.button2);

    //     edittext.addTextChangedListener(new TextWatcher() {
    //         // addTextChangedListener 텍스트가 입력에 따라 변경될 때마다 확인하는 기능
    //         // TextWatcher 텍스트가 변경될 때마다 발생하는 이벤트 처리하는 인터페이스
    //         public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

    //         public void onTextChanged(CharSequence s, int start, int before, int count) {
    //             InputFilter[] filter = new InputFilter[1];
    //             filter[0] = new InputFilter.LengthFilter(80);
    //             // 쓸 수 있는 글자 수 최대 80자로 제한
    //             edittext.setFilters(filter);

    //             int currentBytes = s.toString().getBytes().length;        // 텍스트 내용을 받아와서 바이트 수를 가져온다.
    //             String txt = String.valueOf(currentBytes) + " / 80 바이트";
    //             textView.setText(txt);                                           // 텍스트뷰에 현재 바이트수 표시
    //         }

    //         public void afterTextChanged(Editable s) {}
    //     });
    // }

    // public void onButton1Clicked(View v) {
    //     Toast.makeText(getApplicationContext(), (CharSequence) edittext.getText(), Toast.LENGTH_LONG).show();
    // }   // 전송 버튼을 클릭하면 작성된 메시지를 토스트로 띄어준다.
    // // editText.getText()의 반환형은 editable 이므로 CharSequence 타입으로 형변환 해준다.

    // public void onButton2Clicked(View v) {
    //     finish();
*****************


 // 홈 체app영역 내컴과 동기화
//사컴에서 버튼 4개 바로 실행할 준비
//사컴 안스
//자트로 땡겨서 바로 실행
//지트 수정 필요
//파이썬 지트 연결
//보안대책 오페라로만 마티 연결하는데 오패러 퇴근시  로그아웃
//아마서버 운영 확인
//시간 배분 2시간동안 4 타이핑 복사
//7시간 남는데 그시간동안 4컴 - 4버튼 지트 변환. res까지 수정
// 금전으로부터의 완전한  off










