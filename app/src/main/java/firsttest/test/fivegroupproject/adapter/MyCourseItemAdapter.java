package firsttest.test.fivegroupproject.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.base.BaseAdapter;
import firsttest.test.fivegroupproject.bean.ItemLiveCourse;

/**
 * @Author: 王世凯
 * @Time: 2021/1/3 11:41
 * @Company：公司名称
 * @Description: 功能描述
 */
public class MyCourseItemAdapter extends BaseAdapter<ItemLiveCourse> {
    Context context;
    public MyCourseItemAdapter(Context context, List<ItemLiveCourse> data) {
        super(context, data);
        this.context = context;
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.item_course_live;
    }

    @Override
    protected void bindData(ItemLiveCourse data, VH vh) {
        ImageView img = (ImageView) vh.getViewById(R.id.img_live_course_item);
        TextView tv = (TextView) vh.getViewById(R.id.tv_live_course_item);
        Glide.with(context).load(data.getImg()).into(img);
        tv.setText(data.getTitle());
    }
}
