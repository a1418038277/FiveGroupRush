package firsttest.test.fivegroupproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
/**     
  * 
  * @ProjectName:    
  * @Package:        firsttest.test.fivegroupproject
  * @ClassName:      MainActivity
  * @Description:     java类作用描述 
  * @Author:         zfc
  * @CreateDate:     2020/12/31 11:42
  * @UpdateUser:     zfc
  * @UpdateDate:     2020/12/31 11:42
  * @UpdateRemark:   更新说明：
  * @Version:        1.0
 */
public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /**
         * @method  onCreate
         * @description 描述一下方法的作用
         * @date: 2020/12/31 11:43
         * @author: zfc
         * @param 
         * @return void
         */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("测试分支");
    }
}