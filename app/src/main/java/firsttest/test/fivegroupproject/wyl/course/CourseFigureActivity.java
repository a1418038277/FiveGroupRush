package firsttest.test.fivegroupproject.wyl.course;


import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.base.BaseAcitvity;
import firsttest.test.fivegroupproject.interfaces.IBasePresenter;

/*
* 一对一课程
* */
public class CourseFigureActivity extends BaseAcitvity {
    @BindView(R.id.tv_look)
    TextView tvLook;

    @Override
    protected int getLayout() {
        return R.layout.activity_coursefigure;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        tvLook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initPop();
            }
        });
    }

    private void initPop() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.pop_item, null);
        ImageView ivpoppic = inflate.findViewById(R.id.iv_pop_pic);
        PopupWindow popupWindow = new PopupWindow(inflate, ViewGroup.LayoutParams.MATCH_PARENT,1650);
        //设置阴影
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.alpha = 1f;
                getWindow().setAttributes(attributes);
            }
        });

        ivpoppic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupWindow.dismiss();
            }
        });

        popupWindow.showAtLocation(inflate, Gravity.BOTTOM,0,0);

        //关闭阴影
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.alpha = 0.3f;
        getWindow().setAttributes(attributes);
    }

    @Override
    protected void initData() {

    }


}
