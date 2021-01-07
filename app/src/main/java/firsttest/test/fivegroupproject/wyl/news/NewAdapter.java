package firsttest.test.fivegroupproject.wyl.news;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.base.BaseAdapter;

public class NewAdapter extends BaseAdapter {
    public NewAdapter(Context context, List data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.item_news;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        ImageView ivHead = (ImageView) vh.getViewById(R.id.iv_head);
        Glide.with(context).load(R.drawable.fd121).apply(new RequestOptions().circleCrop()).into(ivHead);
    }
}
