package firsttest.test.fivegroupproject.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import firsttest.test.fivegroupproject.MainActivity;
import firsttest.test.fivegroupproject.R;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.tv_welcome_join)
    TextView tvWelcomeJoin;
    @BindView(R.id.tv_phone)
    TextView tvPhone;
    @BindView(R.id.tv_chain_mobile)
    TextView tvChainMobile;
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.cb_check)
    CheckBox cbCheck;
    @BindView(R.id.tv_chain_mobile_service)
    TextView tvChainMobileService;
    @BindView(R.id.ll)
    LinearLayout ll;
    @BindView(R.id.login_mode)
    LinearLayout loginMode;
    @BindView(R.id.wechat)
    ImageView wechat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        String text = tvChainMobileService.getText().toString().trim();
        mySpanAbleString(tvChainMobileService,text);
    }
    /**
     * 使用SpannableStringBuilder设置点击事件
     */
    private void clickAbleSpan(TextView textView, String content) {
        SpannableStringBuilder spannableString = new SpannableStringBuilder();
        spannableString.append(content);
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LoginActivity.this, "HAHAHA", Toast.LENGTH_SHORT).show();

            }
        };
        spannableString.setSpan(clickableSpan, 9, 13, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void mySpanAbleString(TextView textView, String content) {
        SpannableString spannable = new SpannableString(content);
//        int startIndex = content.indexOf("#");
//        int endIndex = content.lastIndexOf("#")+1;
        spannable.setSpan(new ForegroundColorSpan(Color.BLUE), 9, 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Toast.makeText(LoginActivity.this, "" + widget, Toast.LENGTH_SHORT).show();
            }
        };
        textView.setText(spannable);

    }
}