package firsttest.test.fivegroupproject.base;



import java.lang.ref.WeakReference;

import firsttest.test.fivegroupproject.interfaces.IBasePresenter;
import firsttest.test.fivegroupproject.interfaces.IBaseView;


public abstract class BasePresenter<V extends IBaseView> implements IBasePresenter<V> {

    WeakReference<V> weakReference;
    protected V mView;
    @Override
    public void attachView(V view) {
        weakReference = new WeakReference<V>(view);
        mView = weakReference.get();
    }

    @Override
    public void unAttachView() {
        weakReference.clear();
        mView = null;
    }
}
