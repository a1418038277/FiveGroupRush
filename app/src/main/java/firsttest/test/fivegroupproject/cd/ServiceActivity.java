package firsttest.test.fivegroupproject.cd;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import firsttest.test.fivegroupproject.R;

public class ServiceActivity extends AppCompatActivity {

    private ImageView mReturnHeead;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
        initView();
    }

    private void initView() {
        mReturnHeead = (ImageView) findViewById(R.id.heead_return);
        mReturnHeead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}