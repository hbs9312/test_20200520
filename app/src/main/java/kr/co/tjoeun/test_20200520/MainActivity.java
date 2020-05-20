package kr.co.tjoeun.test_20200520;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import kr.co.tjoeun.test_20200520.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputId = binding.inputID.getText().toString();

                String inputPassword = binding.inputPassword.getText().toString();

                Log.d("아이디", inputId);
                Log.d("아이디", inputPassword);

                if(inputId.equals("admin") && inputPassword.equals("qwer")) {
                    Toast.makeText(MainActivity.this, "관리자입니다.", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "로그인에 실패했습니다.", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
