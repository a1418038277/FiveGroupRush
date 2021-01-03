package firsttest.test.fivegroupproject.ui.myorder;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.base.BaseAcitvity;
import firsttest.test.fivegroupproject.interfaces.IBasePresenter;
import firsttest.test.fivegroupproject.ui.myorder.fragment.AllOrderFragment;
import firsttest.test.fivegroupproject.ui.myorder.fragment.OrderpageAdapter;

public class MyorderActivity extends BaseAcitvity {


    @BindView(R.id.tab)
    TabLayout tab;
    @BindView(R.id.vp)
    ViewPager vp;
    private ArrayList<Fragment> fragments;

    @Override
    protected int getLayout() {
        return R.layout.activity_myorder;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        fragments = new ArrayList<>();
        fragments.add(new AllOrderFragment());
        fragments.add(new AllOrderFragment());
        OrderpageAdapter orderpageAdapter = new OrderpageAdapter(getSupportFragmentManager(), fragments);
        vp.setAdapter(orderpageAdapter);
        tab.setupWithViewPager(vp);
        tab.getTabAt(0).setText("全部");
        tab.getTabAt(1).setText("待付款");
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
    }
}