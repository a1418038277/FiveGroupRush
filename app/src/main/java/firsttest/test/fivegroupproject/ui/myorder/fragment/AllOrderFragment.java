package firsttest.test.fivegroupproject.ui.myorder.fragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.base.BaseFragment;
import firsttest.test.fivegroupproject.interfaces.IBasePresenter;

public class AllOrderFragment extends BaseFragment {
    @BindView(R.id.rlv_allorder)
    RecyclerView rlvAllorder;
    private ArrayList<AllOrderBean> list;

    @Override
    protected int getLayout() {
        return R.layout.fragment_all_order;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        rlvAllorder.setLayoutManager(new LinearLayoutManager(getContext()));
        list = new ArrayList<>();
        AllOrderBean bean = new AllOrderBean("订单号码:123456789","已完成","钢琴一对一陪练课程",
                "下单时间:2020.12.08 18:22:32","500");
        list.add(bean);
        AllOrderAdapter allOrderAdapter = new AllOrderAdapter(getContext(),list);
        rlvAllorder.setAdapter(allOrderAdapter);

    }

    @Override
    protected void initData() {

    }
}
