package firsttest.test.fivegroupproject.wyl.login;

import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.base.BaseAcitvity;
import firsttest.test.fivegroupproject.interfaces.IBasePresenter;

public class LoginActivity extends BaseAcitvity {
    @BindView(R.id.iv_icon)
    ImageView ivIcon;
    @BindView(R.id.tv_close)
    TextView tvClose;
    @BindView(R.id.tv_switch)
    TextView tvSwitch;
    @BindView(R.id.rl_people)
    RecyclerView rlPeople;
    @BindView(R.id.tv_explain)
    TextView tvExplain;
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.btn_back)
    Button btnBack;
    private List<LoginBean> loginList;
    private LoginAdapter loginAdapter;

    @Override
    protected int getLayout() {
        return R.layout.activity_login;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        TextPaint tp = tvExplain.getPaint();
        tp.setFakeBoldText(true);

        List<LoginBean> loginList = new ArrayList<>();
        loginList.add(new LoginBean("牛逼", null, false));
        loginList.add(new LoginBean("新建用户信息", null, false));

        rlPeople.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.HORIZONTAL));
        loginAdapter = new LoginAdapter(this, loginList);
        rlPeople.setLayoutManager(new LinearLayoutManager(this));
        rlPeople.setAdapter(loginAdapter);
    }


    @Override
    protected void initData() {

    }

    @OnClick({R.id.btn_login, R.id.btn_back})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                Toast.makeText(this, "未成年，登陆失败", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_back:
                Toast.makeText(this, "哦,就这?", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
