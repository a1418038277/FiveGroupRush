package firsttest.test.fivegroupproject.integral;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.base.BaseAcitvity;
import firsttest.test.fivegroupproject.interfaces.IBasePresenter;

public class IntegralActivity extends AppCompatActivity {

    @BindView(R.id.tb_tab)
    TabLayout tbTab;
    @BindView(R.id.rv_jf)
    RecyclerView rvJf;
    private IntegralAdapter integralAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_integra );
        ButterKnife.bind( this );


        tbTab.addTab( tbTab.newTab().setText( "全部" ) );
        tbTab.addTab( tbTab.newTab().setText( "获取" ) );
        tbTab.addTab( tbTab.newTab().setText( "使用" ) );

        ArrayList<IntegralBean> jfList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            IntegralBean integralBean = new IntegralBean( "2020-12-12", "12:12:12", 1 );
            jfList.add( integralBean );
        }

        rvJf.setLayoutManager( new LinearLayoutManager( this ) );
        integralAdapter = new IntegralAdapter(this,jfList);
        rvJf.setAdapter( integralAdapter );




    }
}
