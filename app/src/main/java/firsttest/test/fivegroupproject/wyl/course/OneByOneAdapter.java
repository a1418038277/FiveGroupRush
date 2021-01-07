package firsttest.test.fivegroupproject.wyl.course;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.base.BaseAdapter;

public class OneByOneAdapter extends BaseAdapter {
    public OneByOneAdapter(Context context, List data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.item_onebyone;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        OneByOneBean bean = (OneByOneBean) data;

        ImageView ivHead = (ImageView) vh.getViewById(R.id.iv_head);
        TextView tvName = (TextView) vh.getViewById(R.id.tv_name);
        TextView tvTitle = (TextView) vh.getViewById(R.id.tv_title);
        TextView tvLook = (TextView) vh.getViewById(R.id.tv_look);
        TextView tvAgreed = (TextView) vh.getViewById(R.id.tv_agreed);

        Glide.with(context).load(R.drawable.fd121).apply(new RequestOptions().circleCrop()).into(ivHead);
        tvName.setText(bean.getName());
        tvTitle.setText(bean.getTitle());


        if (bean.isAgreed()){
            tvAgreed.setVisibility(View.VISIBLE);
        }else {
            tvAgreed.setVisibility(View.GONE);
        }
    }
}
