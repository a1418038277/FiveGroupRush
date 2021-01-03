package firsttest.test.fivegroupproject.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import firsttest.test.fivegroupproject.R;
import firsttest.test.fivegroupproject.base.BaseFragment;
import firsttest.test.fivegroupproject.interfaces.IBasePresenter;

public class ActivityFragment extends BaseFragment {

    @Override
    protected int getLayout() {
        return R.layout.fragment_activity;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }
}