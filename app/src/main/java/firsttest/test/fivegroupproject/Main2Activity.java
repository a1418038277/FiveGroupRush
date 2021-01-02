package firsttest.test.fivegroupproject;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Main2Activity extends AppCompatActivity {

    private ConstraintLayout mConstraintLayout;
    private TextView mTextTv;
    private Button mDisagreeBtn;
    private Button mConsentBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    //重写方法进入页面直接弹出popwindows
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        initView();
    }

    private void initView() {
        View view = LayoutInflater.from(this).inflate(R.layout.privacy_item, null);
        PopupWindow popupWindow = new PopupWindow(view, 800, ViewGroup.LayoutParams.WRAP_CONTENT);
        popupWindow.setBackgroundDrawable(new ColorDrawable());
        popupWindow.setTouchable(true);

        mTextTv = view.findViewById(R.id.tv_text);
        //富文本
        SpannableString spannableString = new SpannableString("您可阅读《用户协议和隐私政策》了解详细信息。如您同意,请点击同意开始接受我们的服务。" );
        spannableString.setSpan(new ForegroundColorSpan(Color.BLUE),
                4, 15, Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        mTextTv.setText(spannableString);

        mDisagreeBtn = view.findViewById(R.id.btn_disagree);
        mDisagreeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupWindow.dismiss();
            }
        });
        mConsentBtn = view.findViewById(R.id.btn_consent);

        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);

    }


}