package firsttest.test.fivegroupproject.event;

import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.base.BaseAcitvity;
import firsttest.test.fivegroupproject.interfaces.IBasePresenter;

public class EventActivity extends BaseAcitvity {
    @Override
    protected int getLayout() {
        return R.layout.activity_event;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }
}
