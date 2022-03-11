package FileClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    和IO无关  无法读取或写入文件
    文件：对文件路径的一个抽象(目录或文件)
    boolean exists()  判断文件是否存在
    boolean createNewFile()  创建文件
    boolean mkdir()  创建目录
    boolean mkdirs()  创建多重目录
 */

public class FileTest1 {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\my\\sjavaG\\src\\1IOFileTest\\Test5");

        System.out.println(f.exists());

        if (f.exists()) {
            f.createNewFile();   // 创建一个文件
        }
        if (f.exists()) {
            f.mkdir();
        }

        String par = f.getParent();  //获取父级目录 返回String
        File gpar = f.getParentFile();  // 获取父级目录 返回File
        String gpars = gpar.getAbsolutePath();  // 获取当前文件目录
        String gf = f.getAbsolutePath();
        System.out.println(gpars + "    " + gf);

        String name = f.getName();
        System.out.println(name);

        boolean isFile = f.isFile();
        System.out.println(isFile);
        boolean isDir = f.isDirectory();
        System.out.println(isDir);

        // 获取文件最后一次修改时间
        long lastmf = f.lastModified();   // 1970 到最后一次修改 的 毫秒数
        Date lastdate = new Date(lastmf);

        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm:ss SSS");
        String lasts = sdf.format(lastdate);
        System.out.println(lasts);

        long fl = f.length();   // 总字节数
        System.out.println(fl);

        File newF = new File("D:\\my\\sjavaG\\src\\1IOFileTest");

        File[] filelist = newF.listFiles();  // 获取当前目录下 所有 子文件

        for(File fls : filelist) {
            System.out.println(fls.getAbsolutePath() + "  " + fls.getName());
        }
    }
}
