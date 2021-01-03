package firsttest.test.fivegroupproject.wyl.news;

import android.content.Context;

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

    }
}
