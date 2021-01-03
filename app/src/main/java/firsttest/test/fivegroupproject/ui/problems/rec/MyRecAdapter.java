package firsttest.test.fivegroupproject.ui.problems.rec;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.base.BaseAdapter;

public class MyRecAdapter extends BaseAdapter<Integer> {

    public MyRecAdapter(Context context, List<Integer> data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.item;
    }

    @Override
    protected void bindData(Integer data, VH vh) {
        TextView tv = vh.itemView.findViewById(R.id.tv);
        tv.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
    }
}
