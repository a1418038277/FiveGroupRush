package firsttest.test.fivegroupproject.wyl.curriculum;

import android.content.Context;

import java.util.List;

import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.base.BaseAdapter;

public class CurriculumAdapter extends BaseAdapter {
    public CurriculumAdapter(Context context, List data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.item_curriculum;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        CurriculumBean bean = (CurriculumBean) data;
    }
}
