package firsttest.test.fivegroupproject.wyl.login;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
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
        List<LoginBean> loginList = new ArrayList<>();
        loginList.add(new LoginBean("牛逼",null,false));
        rlPeople.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.HORIZONTAL));
        loginAdapter = new LoginAdapter(this, loginList);
        rlPeople.setLayoutManager(new LinearLayoutManager(this));
        rlPeople.setAdapter(loginAdapter);
    }


    @Override
    protected void initData() {

    }


}
