package firsttest.test.fivegroupproject.fragment;

import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import firsttest.test.fivegroupproject.R;

public class MineFragment extends Fragment {

    private ConstraintLayout re1;
    private ConstraintLayout re2;
    private ConstraintLayout re3;
    private ConstraintLayout re4;
    private ConstraintLayout re5;
    private ConstraintLayout re6;
    private ImageView img1,img2,img3,img4,img5,img6;
    private TextView tv1,tv2,tv3,tv4,tv5,tv6;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mine, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        re1 = view.findViewById(R.id.mine1);
        re2 = view.findViewById(R.id.mine2);
        re3 = view.findViewById(R.id.mine3);
        re4 = view.findViewById(R.id.mine4);
        re5 = view.findViewById(R.id.mine5);
        re6 = view.findViewById(R.id.mine6);
        img1 = re1.findViewById(R.id.img_icon);
        tv1 = re1.findViewById(R.id.mine_title);

        img2 = re2.findViewById(R.id.img_icon);
        tv2 = re2.findViewById(R.id.mine_title);

        img3 = re3.findViewById(R.id.img_icon);
        tv3 = re3.findViewById(R.id.mine_title);

        img4 = re4.findViewById(R.id.img_icon);
        tv4 = re4.findViewById(R.id.mine_title);

        img5 = re5.findViewById(R.id.img_icon);
        tv5 = re5.findViewById(R.id.mine_title);

        img6 = re6.findViewById(R.id.img_icon);
        tv6 = re6.findViewById(R.id.mine_title);

        img1.setImageResource(R.mipmap.mine1);
        img2.setImageResource(R.mipmap.mine2);
        img3.setImageResource(R.mipmap.mine3);
        img4.setImageResource(R.mipmap.mine4);
        img5.setImageResource(R.mipmap.mine5);
        img6.setImageResource(R.mipmap.set);
        tv1.setText("我的作业");
        tv2.setText("我的活动");
        tv3.setText("我的优惠券");
        tv4.setText("家长专区");
        tv5.setText("在线服务");
        tv6.setText("设置");


    }
}