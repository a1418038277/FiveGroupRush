package firsttest.test.fivegroupproject.ui.myhomework;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.base.BaseAcitvity;
import firsttest.test.fivegroupproject.interfaces.IBasePresenter;

public class MyHomeWorkActivity extends BaseAcitvity {


    @BindView(R.id.rlv_homework)
    RecyclerView rlvHomework;
    private ArrayList<MyHomeWorkBean> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_my_home_work;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        rlvHomework.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();
        MyHomeWorkBean bean = new MyHomeWorkBean("111","222","333","444");
        list.add(bean);
        MyHomeWorkAdapter myHomeWorkAdapter = new MyHomeWorkAdapter(this, list);
        rlvHomework.setAdapter(myHomeWorkAdapter);
        myHomeWorkAdapter.notifyDataSetChanged();
    }

    @Override
    protected void initData() {

    }


}