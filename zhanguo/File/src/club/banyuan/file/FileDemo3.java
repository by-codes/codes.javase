package club.banyuan.file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

public class FileDemo3 {

  public static void main(String[] args) throws IOException {
    File file = new File("/Users/sanye"); //相对路径  相对于当前项目的路径

    String[] str = file.list();
    for (String s : str) {
      System.out.println(s);
    }

    File[] files = file.listFiles();
    for (File f : files) {
      System.out.println(f);
    }
    //找出指定目录下(以及更是深层次)所有图片 jpg 或者png
//    File[] files = file.listFiles(new FilenameFilter() {
//      @Override
//      public boolean accept(File dir, String name) {
//        if (name.endsWith(".jpg") || name.endsWith(".png")) {
//          return true;
//        }
//        return false;
//      }
//    });
//    for (File f : files) {
//      System.out.println(f);
//    }
    geiFile(file);
  }

  public static void geiFile(File file) {
    File[] files = file.listFiles();
    for (File file1 : files) {
      if (file1.isDirectory()) {
        geiFile(file1);
      } else {
        boolean flag = file1.getName().endsWith(".java") || file1.getName().endsWith(".class");
        if (flag) {
          System.out.println(file1);
        }
      }
    }
  }
}
