package firsttest.test.fivegroupproject.cd;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.base.BaseAcitvity;
import firsttest.test.fivegroupproject.interfaces.IBasePresenter;

public class WelcomeActivity extends BaseAcitvity {

    @BindView(R.id.viewpager)
    ViewPager viewpager;
    private ArrayList<Integer> integers;

    @Override
    protected int getLayout() {
        return R.layout.activity_welcome;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        integers = new ArrayList<>();
        integers.add(R.drawable.ic_vp_one);
        integers.add(R.drawable.ic_vp_two);
        integers.add(R.drawable.ic_vp_three);
        viewpager.setAdapter(new PagerAdapter() {
            @Override
            public int getCount() {
                return integers.size();
            }

            @NonNull
            @Override
            public Object instantiateItem(@NonNull ViewGroup container, int position) {
                View inflate = LayoutInflater.from(WelcomeActivity.this).inflate(R.layout.vp_item, null);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(integers.get(position));
                View btnJump = inflate.findViewById(R.id.btn_jump);
                if (position == integers.size() - 1) {
                    btnJump.setVisibility(View.VISIBLE);
                    btnJump.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(WelcomeActivity.this, Main2Activity.class);
                            startActivity(intent);
                        }
                    });

                }
                container.addView(inflate);
                return inflate;
            }

            @Override
            public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
                return view==object;
            }

            @Override
            public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
                container.removeView((View) object);
            }
        });
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}