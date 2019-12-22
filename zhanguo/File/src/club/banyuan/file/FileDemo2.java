package club.banyuan.file;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {

    public static void main(String[] args) throws IOException {
        File file=new File("/Users/sanye/img/","b.txt"); //相对路径  相对于当前项目的路径

        System.out.println(file.exists());
        System.out.println(file.canWrite());

        System.out.println(file.delete());



    }


}
