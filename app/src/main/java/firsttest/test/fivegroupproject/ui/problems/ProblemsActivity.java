package firsttest.test.fivegroupproject.ui.problems;

import android.os.Bundle;
import android.widget.ExpandableListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import firsttest.test.fivegroupproject.R;

public class ProblemsActivity extends AppCompatActivity {

    private ExpandableListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problems);
        initView();
    }

    private void initView() {
        list = (ExpandableListView) findViewById(R.id.list);
        int width = getWindowManager().getDefaultDisplay().getWidth();
        list.setIndicatorBounds(width-40, width-10);
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<ArrayList<String>> subList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            strings.add("什么是土星？");
            ArrayList<String> objects = new ArrayList<>();

            objects.add("践行以STEP-C阶梯创新教育体系为核心的理念服务社会，坚持不懈地走科技与人文高度融合的中国素养教育创新之路，肩负培养中国青少年创新思维与创新能力的使命.土星文化的每一次创新与变革，只为给孩子带来更好的每一天深圳市致禾科技有限公司，只为给孩子带来更好的每一天。");
            subList.add(objects);
        }
        list.setAdapter(new MyAdapter(this,strings,subList));

    }
}