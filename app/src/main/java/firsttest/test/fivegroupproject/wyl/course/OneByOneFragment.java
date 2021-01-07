package firsttest.test.fivegroupproject.wyl.course;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.PopupWindow;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.base.BaseAdapter;
import firsttest.test.fivegroupproject.base.BaseFragment;
import firsttest.test.fivegroupproject.interfaces.IBasePresenter;

public class OneByOneFragment extends BaseFragment {
    @BindView(R.id.rl_onebyone)
    RecyclerView rlOnebyone;

    @Override
    protected int getLayout() {
        return R.layout.fragment_onebyone;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        List<OneByOneBean> list = new ArrayList<>();
        list.add(new OneByOneBean(null, "吉娜·什么什么", "大咖", true, 5));
        list.add(new OneByOneBean(null, "吉娜·什么什么", "口碑", false, 3));
        list.add(new OneByOneBean(null, "吉娜·什么什么", "大咖", true, 5));
        list.add(new OneByOneBean(null, "吉娜·什么什么", "口碑", false, 3));
        list.add(new OneByOneBean(null, "吉娜·什么什么", "大咖", true, 5));
        list.add(new OneByOneBean(null, "吉娜·什么什么", "口碑", false, 3));
        rlOnebyone.setLayoutManager(new LinearLayoutManager(getActivity()));
        OneByOneAdapter oneByOneAdapter = new OneByOneAdapter(getActivity(), list);
        rlOnebyone.setAdapter(oneByOneAdapter);
        oneByOneAdapter.addListClick(new BaseAdapter.IListClick() {
            @Override
            public void itemClick(int pos) {
                initPop();
            }
        });
    }

    @Override
    protected void initData() {

    }

    private void initPop() {
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.pop_item, null);
        ImageView ivpoppic = inflate.findViewById(R.id.iv_pop_pic);
        PopupWindow popupWindow = new PopupWindow(inflate, ViewGroup.LayoutParams.MATCH_PARENT, 1650);
        //设置阴影
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                WindowManager.LayoutParams attributes = getActivity().getWindow().getAttributes();
                attributes.alpha = 1f;
                getActivity().getWindow().setAttributes(attributes);
            }
        });

        ivpoppic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupWindow.dismiss();
            }
        });

        popupWindow.showAtLocation(inflate, Gravity.BOTTOM, 0, 0);

        //关闭阴影
        WindowManager.LayoutParams attributes = getActivity().getWindow().getAttributes();
        attributes.alpha = 0.3f;
        getActivity().getWindow().setAttributes(attributes);
    }
}
