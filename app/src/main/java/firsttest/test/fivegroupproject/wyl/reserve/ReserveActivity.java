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

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.base.BaseAcitvity;
import firsttest.test.fivegroupproject.interfaces.IBasePresenter;
import firsttest.test.fivegroupproject.wyl.GoodsActivity;

public class ReserveActivity extends BaseAcitvity {
    @BindView(R.id.btn_jump)
    Button btnJump;
    private View view;
    private PopupWindow popupWindow;
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
        initPopupWindow();
    }

    private void initPopupWindow() {
        view = LayoutInflater.from(this).inflate(R.layout.pop_item,null);
        popupWindow = new PopupWindow(view, ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        popupWindow.setBackgroundDrawable(new ColorDrawable());
        popupWindow.setOutsideTouchable(true);
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                setBack(1.0f);
            }
        });
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
