package firsttest.test.fivegroupproject.ui.problems.campaign;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.luck.picture.lib.PictureSelector;
import com.luck.picture.lib.config.PictureConfig;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.entity.LocalMedia;


import java.io.ByteArrayOutputStream;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.app.Constants;
import firsttest.test.fivegroupproject.base.BaseAcitvity;
import firsttest.test.fivegroupproject.interfaces.IBasePresenter;
import firsttest.test.fivegroupproject.utils.BitmapUtils;
import firsttest.test.fivegroupproject.utils.GlideEngine;
import io.reactivex.annotations.Nullable;

public class CampaignActivity extends BaseAcitvity {
    @BindView(R.id.li)
    LinearLayout li;

    @Override
    protected int getLayout() {
        return R.layout.activity_campaign;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPhoto();
            }
        });
    }
    private void openPhoto() {
        PictureSelector.create(this)
                .openGallery(PictureMimeType.ofImage())
                .loadImageEngine(GlideEngine.createGlideEngine())
                .maxSelectNum(1)
                .imageSpanCount(4)
                .selectionMode(PictureConfig.MULTIPLE)
                .forResult(PictureConfig.CHOOSE_REQUEST);
    }
    @Override
    protected void initData() {

    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case PictureConfig.CHOOSE_REQUEST:
                List<LocalMedia> selectList = PictureSelector.obtainMultipleResult(data);
                if (selectList.size() == 0) return;
                Bitmap scaleBitmp = BitmapUtils.getScaleBitmap(selectList.get(0).getPath(), Constants.HEAD_WIDTH, Constants.HEAD_HEIGHT);
                ImageView imageView = new ImageView(this);
                imageView.setImageBitmap(scaleBitmp);
                li.addView(imageView);
                break;
            default:
                break;
        }
    }
}
