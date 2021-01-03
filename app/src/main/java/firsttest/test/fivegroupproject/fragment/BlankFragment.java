package firsttest.test.fivegroupproject.fragment;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.adapter.MyCourseItemAdapter;
import firsttest.test.fivegroupproject.base.BaseFragment;
import firsttest.test.fivegroupproject.bean.ItemLiveCourse;
import firsttest.test.fivegroupproject.interfaces.IBasePresenter;

public class BlankFragment extends BaseFragment {

    @BindView(R.id.rcyView)
    RecyclerView rcyView;
    List<ItemLiveCourse> liveCourses;
    @Override
    protected int getLayout() {
        return R.layout.fragment_blank;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        liveCourses = new ArrayList<>();
        liveCourses.add(new ItemLiveCourse(R.mipmap.item_course,"基础乐理"));
        liveCourses.add(new ItemLiveCourse(R.mipmap.item_course,"视耳练唱"));
        liveCourses.add(new ItemLiveCourse(R.mipmap.item_course,"和声协奏"));
        liveCourses.add(new ItemLiveCourse(R.mipmap.item_course,"表现音乐"));
        liveCourses.add(new ItemLiveCourse(R.mipmap.item_course,"节奏"));
        liveCourses.add(new ItemLiveCourse(R.mipmap.item_course,"音乐欣赏"));
        rcyView.setLayoutManager(new GridLayoutManager(getContext(),2));
        MyCourseItemAdapter adapter = new MyCourseItemAdapter(getContext(), liveCourses);
        rcyView.setAdapter(adapter);
    }

    @Override
    protected void initData() {

    }

}