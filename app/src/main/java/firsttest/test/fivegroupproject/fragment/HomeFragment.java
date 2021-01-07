package firsttest.test.fivegroupproject.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.base.BaseAdapter;
import firsttest.test.fivegroupproject.bean.Teacher;

public class HomeFragment extends Fragment {

    private RecyclerView rcy_home_teacher_desc;
    private RecyclerView rcy_home_teacher_nv_desc;
    private RecyclerView rcy_home_girl_desc;
    private RecyclerView rcy_home_pk_desc;
    private List<Teacher> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        list = new ArrayList<>();
        rcy_home_teacher_desc = view.findViewById(R.id.rcy_home_teacher_desc);
        rcy_home_teacher_nv_desc = view.findViewById(R.id.rcy_home_teacher_nv_desc);
        rcy_home_girl_desc = view.findViewById(R.id.rcy_home_girl_desc);
        rcy_home_pk_desc = view.findViewById(R.id.rcy_home_pk_desc);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        rcy_home_teacher_desc.setLayoutManager(linearLayoutManager);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(getContext());
        linearLayoutManager2.setOrientation(LinearLayoutManager.HORIZONTAL);
        rcy_home_teacher_nv_desc.setLayoutManager(linearLayoutManager2);
        LinearLayoutManager linearLayoutManager3 = new LinearLayoutManager(getContext());
        linearLayoutManager3.setOrientation(LinearLayoutManager.HORIZONTAL);
        rcy_home_girl_desc.setLayoutManager(linearLayoutManager3);

        LinearLayoutManager linearLayoutManager4 = new LinearLayoutManager(getContext());
        linearLayoutManager4.setOrientation(LinearLayoutManager.HORIZONTAL);
        rcy_home_pk_desc.setLayoutManager(linearLayoutManager4);
        list.add(new Teacher("url","李明宇","声乐","钢琴"));
        list.add(new Teacher("url","李明宇","声乐","钢琴"));
        list.add(new Teacher("url","李明宇","声乐","钢琴"));
        list.add(new Teacher("url","李明宇","声乐","钢琴"));
        list.add(new Teacher("url","李明宇","声乐","钢琴"));
        TeacherAdapter teacherAdapter = new TeacherAdapter(getContext(), list);
        TeacherNvAdapter teacherNvAdapter = new TeacherNvAdapter(getContext(), list);
        TeacherGirlAdapter teacherGirlAdapter = new TeacherGirlAdapter(getContext(), list);
        TeacherPkAdapter pkAdapter = new TeacherPkAdapter(getContext(), list);
        rcy_home_teacher_desc.setAdapter(teacherAdapter);
        rcy_home_teacher_nv_desc.setAdapter(teacherNvAdapter);
        rcy_home_girl_desc.setAdapter(teacherGirlAdapter);
        rcy_home_pk_desc.setAdapter(pkAdapter);
    }
    class TeacherAdapter extends BaseAdapter<Teacher>{
        Context context;

        public TeacherAdapter(Context context, List<Teacher> data) {
            super(context, data);
            this.context = context;
        }

        @Override
        protected int getLayout(int type) {
            return R.layout.item_home_techer_desc;
        }

        @Override
        protected void bindData(Teacher data, VH vh) {
//            vh.getViewById(R.id.)
        }
    }
    class TeacherNvAdapter extends BaseAdapter<Teacher>{
        Context context;

        public TeacherNvAdapter(Context context, List<Teacher> data) {
            super(context, data);
            this.context = context;
        }

        @Override
        protected int getLayout(int type) {
            return R.layout.item_home_teacher_nv_desc;
        }

        @Override
        protected void bindData(Teacher data, VH vh) {
//            vh.getViewById(R.id.)
        }
    }
    class TeacherGirlAdapter extends BaseAdapter<Teacher>{
        Context context;

        public TeacherGirlAdapter(Context context, List<Teacher> data) {
            super(context, data);
            this.context = context;
        }

        @Override
        protected int getLayout(int type) {
            return R.layout.item_home_teacher_gril_desc;
        }

        @Override
        protected void bindData(Teacher data, VH vh) {
//            vh.getViewById(R.id.)
        }
    }
    class TeacherPkAdapter extends BaseAdapter<Teacher>{
        Context context;

        public TeacherPkAdapter(Context context, List<Teacher> data) {
            super(context, data);
            this.context = context;
        }

        @Override
        protected int getLayout(int type) {
            return R.layout.item_home_pk_desc;
        }

        @Override
        protected void bindData(Teacher data, VH vh) {
            ImageView pk_background = (ImageView) vh.getViewById(R.id.pk_background);

        }
    }
}