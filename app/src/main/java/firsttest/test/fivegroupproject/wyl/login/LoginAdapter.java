package firsttest.test.fivegroupproject.wyl.login;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.base.BaseAdapter;

public class LoginAdapter extends BaseAdapter {
    public LoginAdapter(Context context, List data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.item_login;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        LoginBean bean = (LoginBean) data;
        ImageView ivHead = (ImageView) vh.getViewById(R.id.iv_head);
        ImageView ivSelected = (ImageView) vh.getViewById(R.id.iv_selected);
        TextView tvUserName = (TextView) vh.getViewById(R.id.tv_userName);

        if (bean.getHeadUrl() != null){
            Glide.with(context).load(bean.getHeadUrl()).into(ivHead);
        }
        tvUserName.setText(bean.getUserName());
        vh.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivSelected.setVisibility(View.VISIBLE);
            }
        });
    }
}
