package firsttest.test.fivegroupproject.wyl;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.base.BaseAcitvity;
import firsttest.test.fivegroupproject.interfaces.IBasePresenter;

public class CalendarActivity extends BaseAcitvity {
    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.tab_layout)
    TableLayout tabLayout;
    @BindView(R.id.layout_top)
    LinearLayout layoutTop;
    @BindView(R.id.calendar_view)
    CalendarView calendarView;

    @Override
    protected int getLayout() {
        return R.layout.activity_calendar;
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
