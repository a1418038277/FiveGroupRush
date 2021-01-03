package firsttest.test.fivegroupproject.problems;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import firsttest.test.fivegroupproject.R;
import retrofit2.http.POST;

public class MyAdapter extends BaseExpandableListAdapter {
    private Context context;
    private ArrayList<String> strings;
    private ArrayList<ArrayList<String>> subList;

    public MyAdapter(Context context, ArrayList<String> strings, ArrayList<ArrayList<String>> subList) {
        this.context = context;
        this.strings = strings;
        this.subList = subList;
    }

    @Override
    public int getGroupCount() {
        return strings.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return subList.get(groupPosition).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return strings.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return subList.get(groupPosition).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.item_group, null);
        TextView tv = inflate.findViewById(R.id.tv);
        tv.setText(strings.get(groupPosition));
        return inflate;
    }
    int num=0;
    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

            View inflate = LayoutInflater.from(context).inflate(R.layout.item_sub, null);






        return inflate;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
