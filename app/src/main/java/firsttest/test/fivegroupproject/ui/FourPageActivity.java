package firsttest.test.fivegroupproject.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.fragment.ActivityFragment;
import firsttest.test.fivegroupproject.fragment.CourseFragment;
import firsttest.test.fivegroupproject.fragment.HomeFragment;
import firsttest.test.fivegroupproject.fragment.MineFragment;

public class FourPageActivity extends AppCompatActivity {

    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.tabLayout)
    TabLayout tabLayout;
    List<Fragment> fragments;
    List<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_page);
        ButterKnife.bind(this);
        fragments = new ArrayList<>();
        list = new ArrayList<>();
        initFragment();
    }

    private void initFragment() {
        fragments.add(new HomeFragment());
        fragments.add(new CourseFragment());
        fragments.add(new ActivityFragment());
        fragments.add(new MineFragment());
        list.add("首页");
        list.add("课程");
        list.add("活动");
        list.add("我的");
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), fragments, list);
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }
    class ViewPagerAdapter extends FragmentPagerAdapter{
        List<Fragment> fragments;
        List<String> list;

        public ViewPagerAdapter(@NonNull FragmentManager fm, List<Fragment> fragments, List<String> list) {
            super(fm);
            this.fragments = fragments;
            this.list = list;
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return list.get(position);
        }
    }
}