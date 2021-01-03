package firsttest.test.fivegroupproject.coursepay;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import firsttest.test.fivegroupproject.R;

public class PaylxActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioGroup group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paylx);
        initView();
    }

    private void initView() {
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        group = (RadioGroup) findViewById(R.id.group);
        rb1.setOnClickListener(this);
        rb2.setOnClickListener(this);
        rb3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rb1:
                rb1.setChecked(true);
                rb2.setChecked(false);
                rb3.setChecked(false);
                break;
            case R.id.rb2:
                rb2.setChecked(true);
                rb1.setChecked(false);
                rb3.setChecked(false);
                break;
            case R.id.rb3:
                rb3.setChecked(true);
                rb2.setChecked(false);
                rb1.setChecked(false);
                break;
        }
    }
}