package firsttest.test.fivegroupproject.ui.myhomework;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.base.BaseAdapter;

public class MyHomeWorkAdapter extends BaseAdapter<MyHomeWorkBean> {


    public MyHomeWorkAdapter(Context context, List<MyHomeWorkBean> data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.myhomewrokd_holder0;
    }

    @Override
    protected void bindData(MyHomeWorkBean data, VH vh) {
        TextView txt_practice = (TextView) vh.getViewById(R.id.txt_practice);
        TextView txt_course = (TextView) vh.getViewById(R.id.txt_course);
        TextView txt_date = (TextView) vh.getViewById(R.id.txt_date);
      txt_practice.setText(data.getPractice());
        txt_course.setText(data.getCourse());
        txt_date.setText(data.getDate());

    }
}
