package firsttest.test.fivegroupproject.ui.problems.rec;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import firsttest.test.fivegroupproject.R;

public class RecMainActivity extends AppCompatActivity {

    private RecyclerView rec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rec_main);
        initView();
    }

    private void initView() {
        rec = (RecyclerView) findViewById(R.id.rec);
        rec.setLayoutManager(new GridLayoutManager(this,2));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(R.drawable.pion);
        }
        rec.setAdapter(new MyRecAdapter(this,list));
    }
}