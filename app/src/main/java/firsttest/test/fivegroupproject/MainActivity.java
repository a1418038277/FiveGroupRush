package firsttest.test.fivegroupproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import firsttest.test.fivegroupproject.ui.AboutUsActivity;
import firsttest.test.fivegroupproject.ui.FourPageActivity;
import firsttest.test.fivegroupproject.ui.LoginActivity;
import firsttest.test.fivegroupproject.ui.PassWordActivity;
import firsttest.test.fivegroupproject.ui.VerificationCodeActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.btn_login_yzm)
    Button btnLoginYzm;
    @BindView(R.id.btn_login_pwd)
    Button btnLoginPwd;
    @BindView(R.id.btn_login_our)
    Button btnLoginOur;
    @BindView(R.id.btn_login_all)
    Button btnLoginAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        btnLogin.setOnClickListener(this);
        btnLoginYzm.setOnClickListener(this);
        btnLoginPwd.setOnClickListener(this);
        btnLoginOur.setOnClickListener(this);
        btnLoginAll.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                startActivity(new Intent(this, LoginActivity.class));
                break;
            case R.id.btn_login_yzm:
                startActivity(new Intent(this, VerificationCodeActivity.class));
                break;
            case R.id.btn_login_pwd:
                startActivity(new Intent(this, PassWordActivity.class));
                break;
            case R.id.btn_login_our:
                startActivity(new Intent(this, AboutUsActivity.class));
                break;
            case R.id.btn_login_all:
                startActivity(new Intent(this, FourPageActivity.class));
                break;
        }
    }
}