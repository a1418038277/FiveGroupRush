package firsttest.test.fivegroupproject.wyl.reserve;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.base.BaseAcitvity;
import firsttest.test.fivegroupproject.base.BaseAdapter;
import firsttest.test.fivegroupproject.interfaces.IBasePresenter;
import firsttest.test.fivegroupproject.wyl.GoodsActivity;

public class ReserveActivity extends BaseAcitvity {
    @BindView(R.id.btn_jump)
    Button btnJump;
    private View view;
    private PopupWindow popupWindow;
    private List<ReserveBean> list;

    @Override
    protected int getLayout() {
        return R.layout.activity_reserve;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        list = new ArrayList<>();
        list.add(new ReserveBean("12/7","今天","19:00"));
        list.add(new ReserveBean("12/7","今天","19:30"));
        list.add(new ReserveBean("12/7","今天","20:00"));
        list.add(new ReserveBean("12/7","今天","20:30"));
        list.add(new ReserveBean("12/7","今天","21:00"));
        list.add(new ReserveBean("12/7","今天","21:30"));
        list.add(new ReserveBean("12/7","今天","22:00"));
        list.add(new ReserveBean("12/7","今天","22:30"));
        list.add(new ReserveBean("12/7","今天","23:00"));
        initPopupWindow();
    }

    private void initPopupWindow() {
        view = LayoutInflater.from(this).inflate(R.layout.pop_item,null);
        popupWindow = new PopupWindow(view, ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);

        RecyclerView rlTime = view.findViewById(R.id.rl_today);
        RecyclerView rlTomorrow = view.findViewById(R.id.rl_tomorrow);
        RecyclerView rlWednesday = view.findViewById(R.id.rl_wednesday);
        RecyclerView rlThursday = view.findViewById(R.id.rl_thursday);
        Button btnSure = view.findViewById(R.id.btn_sure);


        initRecyclerView(rlTime);
        initRecyclerView(rlTomorrow);
        initRecyclerView(rlWednesday);
        initRecyclerView(rlThursday);

        popupWindow.setBackgroundDrawable(new ColorDrawable());
        popupWindow.setOutsideTouchable(true);
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                setBack(1.0f);
            }
        });
        btnSure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupWindow.dismiss();
            }
        });
    }

    private void initRecyclerView(RecyclerView rlTime) {
        rlTime.setLayoutManager(new LinearLayoutManager(this));
        TimeAdapter timeAdapter = new TimeAdapter(this, list);
        rlTime.setAdapter(timeAdapter);
    }

    private void setBack(float v) {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.alpha = v;
        getWindow().setAttributes(attributes);
    }

    @Override
    protected void initData() {

    }


    @OnClick(R.id.btn_jump)
    public void onViewClicked() {
        setBack(0.5f);
        popupWindow.showAtLocation(view, Gravity.BOTTOM,0,0);
    }
}
