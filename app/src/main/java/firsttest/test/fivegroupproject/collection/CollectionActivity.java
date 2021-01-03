package firsttest.test.fivegroupproject.collection;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

import firsttest.test.fivegroupproject.R;

public class CollectionActivity extends AppCompatActivity {

    private TabLayout collect_tab;
    private ViewPager collection_vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection);
        initView();
    }

    private void initView() {
        collect_tab = (TabLayout) findViewById(R.id.collect_tab);
        collection_vp = (ViewPager) findViewById(R.id.collection_vp);

        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new AllFragment());
        fragments.add(new SubjectFragment());
        fragments.add(new ActFragment());
        fragments.add(new ShopFragment());
        FAdapter fAdapter = new FAdapter(getSupportFragmentManager(), fragments);

        collection_vp.setAdapter(fAdapter);
        collect_tab.setupWithViewPager(collection_vp);

        collect_tab.getTabAt(0).setText("全部");
        collect_tab.getTabAt(1).setText("课程");
        collect_tab.getTabAt(2).setText("活动");
        collect_tab.getTabAt(3).setText("商品");

    }


}