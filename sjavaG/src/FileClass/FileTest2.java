package FileClass;

import java.io.File;
import java.io.IOException;

public class FileTest2 {
    public static void main(String[] args) {
        String s1 = "D:/zzzTestFile";
        String s2 = "D:/zTestFile";
        File fs1 = new File(s1);
        File fs2 = new File(s2);

        fs2.mkdir();
        Digui.doSome(fs1, s2);
    }
}

class Digui{
    public static void doSome(File f, String s) {
        File fl = new File(s);
        if (f.isFile()) {
            try {
                fl.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (f.isDirectory()) {
            File[] lfs = f.listFiles();
            for (File lfd : lfs) {
                String lfdgap = lfd.getAbsolutePath();
                String lfdgaprp = lfdgap.replace("D:\\zzzTestFile", "D:\\zTestFile");
                if (lfd.isDirectory()) {
                    (new File(lfdgaprp)).mkdir();
                }
                doSome(lfd, lfdgaprp);
//                doSome(lfd);
//                System.out.println(lfd.getAbsolutePath());
            }
        }
    }
}
