package firsttest.test.fivegroupproject.ui.about;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.base.BaseAcitvity;
import firsttest.test.fivegroupproject.interfaces.IBasePresenter;

public class AboutActivity extends BaseAcitvity {


    @BindView(R.id.txt_regist)
    TextView txtRegist;
    @BindView(R.id.txt_yinsi)
    TextView txtYinsi;
    @BindView(R.id.txt_child)
    TextView txtChild;
    @BindView(R.id.txt_zizhi)
    TextView txtZizhi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
    }


    @Override
    protected int getLayout() {
        return R.layout.activity_about;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        SpannableString spannableString1 = new SpannableString("《用户注册协议》");
        spannableString1.setSpan(new ForegroundColorSpan(Color.BLUE),
                0, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        txtRegist.setText(spannableString1);


        SpannableString spannableString2 = new SpannableString("《用户隐私协议》");
        spannableString2.setSpan(new ForegroundColorSpan(Color.BLUE),
                0, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        txtYinsi.setText(spannableString2);


        SpannableString spannableString3 = new SpannableString("《儿童隐私协议》");
        spannableString3.setSpan(new ForegroundColorSpan(Color.BLUE),
                0, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        txtChild.setText(spannableString3);


        //设置Hello World前三个字符有下划线
        SpannableString textSpanned4 = new SpannableString("资质证照公示");
        textSpanned4.setSpan(new UnderlineSpan(),
                0, 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        txtZizhi.setText(textSpanned4);
    }

    @Override
    protected void initData() {

    }


}