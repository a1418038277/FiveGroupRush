package firsttest.test.fivegroupproject.wyl.course;


import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.PopupWindow;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.base.BaseAcitvity;
import firsttest.test.fivegroupproject.base.BaseAdapter;
import firsttest.test.fivegroupproject.interfaces.IBasePresenter;

/*
 * 预约一对一课程
 * */
public class CourseFigureActivity extends BaseAcitvity {

    @BindView(R.id.layout_search)
    ConstraintLayout layoutSearch;
    @BindView(R.id.tab_layout)
    TabLayout tabLayout;
    @BindView(R.id.vp_show)
    ViewPager vpShow;

    @Override
    protected int getLayout() {
        return R.layout.activity_coursefigure;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new OneByOneFragment());
        fragments.add(new OneByOneFragment());
        fragments.add(new OneByOneFragment());
        vpShow.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
                              @NonNull
                              @Override
                              public Fragment getItem(int position) {
                                  return fragments.get(position);
                              }

                              @Override
                              public int getCount() {
                                  return fragments.size();
                              }
                          });
        tabLayout.setupWithViewPager(vpShow);
        tabLayout.getTabAt(0).setText("综合排序");
        tabLayout.getTabAt(1).setText("级别排序");
        tabLayout.getTabAt(2).setText("收藏排序");
    }



    @Override
    protected void initData() {

    }

}
