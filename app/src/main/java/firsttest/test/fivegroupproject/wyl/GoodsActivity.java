package firsttest.test.fivegroupproject.wyl;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.base.BaseAcitvity;
import firsttest.test.fivegroupproject.interfaces.IBasePresenter;
import firsttest.test.fivegroupproject.wyl.goods.GoodsBean;

public class GoodsActivity extends BaseAcitvity {

    @BindView(R.id.btn_buy)
    Button btnBuy;
    @BindView(R.id.iv_goods)
    ImageView ivGoods;
    @BindView(R.id.tv_praise)
    TextView tvPraise;
    @BindView(R.id.tv_price)
    TextView tvPrice;
    @BindView(R.id.tv_priceOld)
    TextView tvPriceOld;
    @BindView(R.id.tv_goodsName)
    TextView tvGoodsName;
    @BindView(R.id.iv_time)
    ImageView ivTime;
    @BindView(R.id.tv_curriculum)
    TextView tvCurriculum;
    @BindView(R.id.tv_volume)
    TextView tvVolume;
    private GoodsBean goodsBean;
    private PopupWindow popupWindow;
    private View view;

    @Override
    protected int getLayout() {
        return R.layout.activity_goods;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        goodsBean = new GoodsBean("声乐系统课", 299, 599, 97, 20, 123456789);
        initPopWindow();
    }

    private void initPopWindow() {
        view = LayoutInflater.from(this).inflate(R.layout.popu_goods,null);
        popupWindow = new PopupWindow(view, ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        popupWindow.setBackgroundDrawable(new ColorDrawable());
        popupWindow.setOutsideTouchable(true);
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                setBack(1.0f);
            }
        });
        TextView tvGoodsName = view.findViewById(R.id.tv_goodsName);
        TextView tvNumber = view.findViewById(R.id.tv_number);
        TextView tvPrice = view.findViewById(R.id.tv_price);
        TextView tvPriceOld = view.findViewById(R.id.tv_priceOld);
        TextView tvBuy = view.findViewById(R.id.tv_buy);

        tvGoodsName.setText(goodsBean.getGoodsName());
        tvNumber.setText(goodsBean.getNumber() + "");
        tvPrice.setText("￥"+goodsBean.getPrice());
        tvPriceOld.setText("￥"+goodsBean.getPriceOld());
        tvBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GoodsActivity.this, "钱", Toast.LENGTH_SHORT).show();
                popupWindow.dismiss();
            }
        });
    }

    private void setBack(float v) {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.alpha = v;
        getWindow().setAttributes(attributes);
    }

    @Override
    protected void initData() {
        tvCurriculum.setText(goodsBean.getCurriculum() + "人已购");
        tvGoodsName.setText(goodsBean.getGoodsName());

        String price = "￥" + goodsBean.getPrice();
        String priceOld = "￥" + goodsBean.getPriceOld();
        tvPrice.setText(price);
        tvPriceOld.setText(priceOld);
    }

    @OnClick(R.id.btn_buy)
    public void onViewClicked() {
        setBack(0.5f);
        popupWindow.showAtLocation(view,Gravity.BOTTOM,0,0);
    }
}
