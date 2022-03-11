package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//finally
/*
    finally 必须和try联合使用  必须放在最后
    finally 中的语句一定执行 即使其他块中存在return

    注：System.exit(0)  退出JVM虚拟机后 不执行finally了
 */
public class FinallyTest {
    public static void main(String[] args) {
        try {
            new FileInputStream("D:\\dawd");
        } catch (FileNotFoundException | NullPointerException e) {

        } catch (Exception e){

        } finally {

        }
//        finally 一定执行
//        输出 try      finally
//        try {
//            System.out.println("try");
//            return;
//        } finally {
//            System.out.println("finally");
//        }

        try {
            System.out.println("try");
            System.exit(0);
        } finally {
            System.out.println("finally");  // 不执行
        }
    }
}
