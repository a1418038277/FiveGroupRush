package firsttest.test.fivegroupproject.wyl.curriculum;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.base.BaseAcitvity;
import firsttest.test.fivegroupproject.interfaces.IBasePresenter;

public class CurriculumActivity extends BaseAcitvity {
    @BindView(R.id.layout_top)
    LinearLayout layoutTop;
    @BindView(R.id.iv_arrow)
    ImageView ivArrow;
    @BindView(R.id.layout_evaluate)
    FrameLayout layoutEvaluate;
    @BindView(R.id.rl_curriculum)
    RecyclerView rlCurriculum;

    @Override
    protected int getLayout() {
        return R.layout.activity_curriculum;
    }
    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        List<CurriculumBean> list = new ArrayList<>();
        list.add(new CurriculumBean("时间","名字",12));

        CurriculumAdapter curriculumAdapter = new CurriculumAdapter(this, list);
        rlCurriculum.setAdapter(curriculumAdapter);
        rlCurriculum.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void initData() {

    }


}
