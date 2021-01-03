package firsttest.test.fivegroupproject.wyl.news;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.base.BaseAcitvity;
import firsttest.test.fivegroupproject.interfaces.IBasePresenter;

public class NewsActivity extends BaseAcitvity {
    @BindView(R.id.rl_news)
    RecyclerView rlNews;

    @Override
    protected int getLayout() {
        return R.layout.activity_news;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        rlNews.setLayoutManager(new LinearLayoutManager(this));
        List<NewsBean> newsList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            newsList.add(new NewsBean("11-23 06:11","睡觉拉省的快捷回复格式该快捷方式快捷方式刚好看见对方刚回到家更多空间分割的"));
        }
        NewAdapter newAdapter = new NewAdapter(this,newsList);
        rlNews.setAdapter(newAdapter);
    }

    @Override
    protected void initData() {

    }


}
