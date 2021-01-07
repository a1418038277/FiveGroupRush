package firsttest.test.fivegroupproject.wyl.reserve;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.base.BaseAdapter;

public class TimeAdapter extends BaseAdapter {
    private static final  int TITLE_ITEM = 0;
    private static final  int TIME_ITEM = 1;

    @Override
    public int getItemViewType(int position) {
        if (position == 0){
            return TITLE_ITEM;
        }
        return TIME_ITEM;
    }

    public TimeAdapter(Context context, List data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        if (type == TITLE_ITEM){
            return R.layout.item_title;
        }
        return R.layout.item_time;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        ReserveBean bean = (ReserveBean) data;
        int itemViewType = getItemViewType(vh.getPosition());
        if (itemViewType == TITLE_ITEM){
            TextView tvDate = (TextView) vh.getViewById(R.id.tv_date);
            TextView tvWeek = (TextView) vh.getViewById(R.id.tv_week);

            tvDate.setText(bean.getDate());
            tvWeek.setText(bean.getWeek());
        }else if (itemViewType == TIME_ITEM){
            TextView tvTime = (TextView) vh.getViewById(R.id.tv_time);
            tvTime.setText(bean.getTime());
            vh.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    tvTime.setTextColor(Color.parseColor("#000000"));
                }
            });
        }

    }
}
