package firsttest.test.fivegroupproject.ui;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import butterknife.BindView;
import butterknife.ButterKnife;
import firsttest.test.fivegroupproject.R;

public class AboutUsActivity extends AppCompatActivity {

    private TextView call_ourLt, clean_dataLt, feedbackLt, out_loginLt;
    private ImageView call_ourRt, clean_dataRt, feedbackRt, out_loginRt;
    @BindView(R.id.call_our)
    LinearLayout linearLayout_call_our;
    @BindView(R.id.clean_data)
    LinearLayout linearLayout_clean_data;
    @BindView(R.id.feedback)
    LinearLayout linearLayout_feedback;
    @BindView(R.id.out_login)
    LinearLayout linearLayout_out_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        ButterKnife.bind(this);
        call_ourLt = linearLayout_call_our.findViewById(R.id.about_us_lt);
        call_ourRt = linearLayout_call_our.findViewById(R.id.about_us_rt);

        clean_dataLt = linearLayout_clean_data.findViewById(R.id.about_us_lt);
        clean_dataRt = linearLayout_clean_data.findViewById(R.id.about_us_rt);

        feedbackLt = linearLayout_feedback.findViewById(R.id.about_us_lt);
        feedbackRt = linearLayout_feedback.findViewById(R.id.about_us_rt);

        out_loginLt = linearLayout_out_login.findViewById(R.id.about_us_lt);
        out_loginRt = linearLayout_out_login.findViewById(R.id.about_us_rt);
        call_ourLt.setText("联系我们");
        clean_dataLt.setText("清除缓存");
        feedbackLt.setText("意见反馈");
        out_loginLt.setText("退出登录");
    }
}