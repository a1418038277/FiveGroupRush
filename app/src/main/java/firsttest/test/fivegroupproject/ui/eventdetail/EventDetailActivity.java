package firsttest.test.fivegroupproject.ui.eventdetail;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.base.BaseAcitvity;
import firsttest.test.fivegroupproject.interfaces.IBasePresenter;

public class EventDetailActivity extends BaseAcitvity {


    @BindView(R.id.txt4)
    TextView txt4;
    @BindView(R.id.btn_sign)
    Button btnSign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_event_detail;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        SpannableString spannableString = new SpannableString("直接点击或扫描下面的二维码");

        spannableString.setSpan(new ForegroundColorSpan(Color.RED),5,13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {

            }
        };
        spannableString.setSpan(new ForegroundColorSpan(Color.RED),0,4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(clickableSpan, 0, 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        txt4.setMovementMethod(LinkMovementMethod.getInstance());
        txt4.setText(spannableString);
    }

    @Override
    protected void initData() {

    }



    @OnClick(R.id.btn_sign)
    public void onClick() {

    }
}