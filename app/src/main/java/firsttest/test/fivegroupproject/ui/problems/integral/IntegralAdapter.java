package firsttest.test.fivegroupproject.ui.problems.integral;

import android.content.Context;
import android.widget.TextView;

import java.util.List;

import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.base.BaseAdapter;

public class IntegralAdapter extends BaseAdapter {

    public IntegralAdapter(Context context, List<IntegralBean> data) {
        super( context, data );

    }

    @Override
    protected int getLayout(int type) {
        return R.layout.jf_adapter;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        IntegralBean jfBean = (IntegralBean) data;
        TextView daty = (TextView) vh.getViewById( R.id.tv_data );
        TextView time = (TextView) vh.getViewById( R.id.tv_time );
        TextView count = (TextView) vh.getViewById( R.id.tv_count );

        daty.setText( jfBean.getData() );
        time.setText( jfBean.getTime() );
        count.setText( jfBean.getCount()+"" );
    }
}