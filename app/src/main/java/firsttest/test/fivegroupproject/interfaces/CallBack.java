package firsttest.test.fivegroupproject.interfaces;


public interface CallBack<T> {
    void success(T data);
    void fail(String error);


}
