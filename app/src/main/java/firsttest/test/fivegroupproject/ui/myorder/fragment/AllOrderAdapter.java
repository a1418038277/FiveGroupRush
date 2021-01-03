package firsttest.test.fivegroupproject.ui.myorder.fragment;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.base.BaseAdapter;

public class AllOrderAdapter extends BaseAdapter<AllOrderBean> {


    public AllOrderAdapter(Context context, List<AllOrderBean> data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.all_order_holder0;
    }

    @Override
    protected void bindData(AllOrderBean data, VH vh) {
        TextView txt_orderNum = (TextView) vh.getViewById(R.id.txt_orderNum);
        TextView txt_status = (TextView) vh.getViewById(R.id.txt_status);
        TextView txt_lessonName = (TextView) vh.getViewById(R.id.txt_lessonName);
        TextView txt_orderTime = (TextView) vh.getViewById(R.id.txt_orderTime);
        TextView txt_Orderprice = (TextView) vh.getViewById(R.id.txt_Orderprice);
        txt_orderNum.setText(data.getOrderNum());
        txt_status.setText(data.getStatus());
        txt_Orderprice.setText(data.getOrderprice());
        txt_lessonName.setText(data.getLessonName());
        txt_orderTime.setText(data.getOrderTime());
    }
}
