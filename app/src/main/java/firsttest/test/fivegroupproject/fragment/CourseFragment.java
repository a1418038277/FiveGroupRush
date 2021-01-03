package firsttest.test.fivegroupproject.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.adapter.ViewPagerAdapter;
import firsttest.test.fivegroupproject.base.BaseFragment;
import firsttest.test.fivegroupproject.interfaces.IBasePresenter;

public class CourseFragment extends BaseFragment implements View.OnClickListener {


    @BindView(R.id.tv_live_course)
    TextView tvLiveCourse;
    @BindView(R.id.tv_series_course)
    TextView tvSeriesCourse;
    @BindView(R.id.tabLayout_live_course)
    TabLayout tabLayoutLiveCourse;
    @BindView(R.id.vp_live_course)
    ViewPager vpLiveCourse;
    @BindView(R.id.view_live_course)
    LinearLayout viewLiveCourse;
    @BindView(R.id.view_series_course)
    LinearLayout viewSeriesCourse;
    List<Fragment> fragments;
    List<String> tabName;

    @Override
    protected int getLayout() {
        return R.layout.fragment_course;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        tvLiveCourse.setOnClickListener(this::onClick);
        tvSeriesCourse.setOnClickListener(this::onClick);
        initLiveCourseTab();
    }

    @Override
    protected void initData() {

    }

    private void initLiveCourseTab() {
        tabName = new ArrayList<>();
        fragments = new ArrayList<>();
        tabName.add("音乐素养");
        tabName.add("声乐考级");
        tabName.add("成人学习");
        tabName.add("乐器");
        BlankFragment blankFragment1 = new BlankFragment();
        BlankFragment blankFragment2 = new BlankFragment();
        BlankFragment blankFragment3 = new BlankFragment();
        BlankFragment blankFragment4 = new BlankFragment();
        fragments.add(blankFragment1);
        fragments.add(blankFragment2);
        fragments.add(blankFragment3);
        fragments.add(blankFragment4);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager(), fragments, tabName);
        vpLiveCourse.setAdapter(viewPagerAdapter);
        tabLayoutLiveCourse.setupWithViewPager(vpLiveCourse);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_live_course:
                viewLiveCourse.setVisibility(View.VISIBLE);
                viewSeriesCourse.setVisibility(View.GONE);
                break;
            case R.id.tv_series_course:
                viewLiveCourse.setVisibility(View.GONE);
                viewSeriesCourse.setVisibility(View.VISIBLE);
                break;
        }
    }

}