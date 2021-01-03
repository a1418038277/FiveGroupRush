package firsttest.test.fivegroupproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import firsttest.test.fivegroupproject.collection.CollectionActivity;
import firsttest.test.fivegroupproject.coursebooking.CourseActivity;
import firsttest.test.fivegroupproject.coursepay.PaylxActivity;
import firsttest.test.fivegroupproject.leave.LeaveActivity;
import firsttest.test.fivegroupproject.livecourses.LiveCoursesActivity;
import firsttest.test.fivegroupproject.logistics.LogisticsActivity;
import firsttest.test.fivegroupproject.onebyone.LiveStreamingActivity;
import firsttest.test.fivegroupproject.orderform.OrderFormActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_img1;
    private Button btn_img2;
    private Button btn_img3;
    private Button btn_img4;
    private Button btn_img5;
    private Button btn_img6;
    private Button btn_img7;
    private Button btn_img8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        System.out.println("lx");
    }

    private void initView() {
        btn_img1 = (Button) findViewById(R.id.btn_img1);
        btn_img2 = (Button) findViewById(R.id.btn_img2);
        btn_img3 = (Button) findViewById(R.id.btn_img3);
        btn_img4 = (Button) findViewById(R.id.btn_img4);
        btn_img5 = (Button) findViewById(R.id.btn_img5);
        btn_img6 = (Button) findViewById(R.id.btn_img6);
        btn_img7 = (Button) findViewById(R.id.btn_img7);
        btn_img8 = (Button) findViewById(R.id.btn_img8);

        btn_img1.setOnClickListener(this);
        btn_img2.setOnClickListener(this);
        btn_img3.setOnClickListener(this);
        btn_img4.setOnClickListener(this);
        btn_img5.setOnClickListener(this);
        btn_img6.setOnClickListener(this);
        btn_img7.setOnClickListener(this);
        btn_img8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_img1:
                startActivity(new Intent(MainActivity.this, OrderFormActivity.class));
                break;
            case R.id.btn_img2:
                startActivity(new Intent(MainActivity.this, PaylxActivity.class));
                break;
            case R.id.btn_img3:
                startActivity(new Intent(MainActivity.this, LogisticsActivity.class));
                break;
            case R.id.btn_img4:
                startActivity(new Intent(MainActivity.this, CollectionActivity.class));
                break;
            case R.id.btn_img5:
                startActivity(new Intent(MainActivity.this, LiveStreamingActivity.class));
                break;
            case R.id.btn_img6:
                startActivity(new Intent(MainActivity.this, CourseActivity.class));
                break;
            case R.id.btn_img7:
                startActivity(new Intent(MainActivity.this, LiveCoursesActivity.class));
                break;
            case R.id.btn_img8:
                startActivity(new Intent(MainActivity.this, LeaveActivity.class));
                break;
        }
    }
}