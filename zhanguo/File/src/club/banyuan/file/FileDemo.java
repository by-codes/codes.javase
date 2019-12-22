package club.banyuan.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) throws IOException {
        File file=new File("/Users/sanye/img/b.txt"); //相对路径  相对于当前项目的路径
        System.out.println(file.getAbsolutePath()); //绝对路径
       // System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.getParent());

        if(!file.exists()){
            file.createNewFile();
        }
        System.out.println(file.isFile()+"---"+file.isDirectory());






    }


}
