package club.banyuan.demo.homework;

import java.io.*;
import java.util.Scanner;

public class Demo2 {
  /*
  在程序中创建一个Student类型的对象，并把对象信息保存到/io/student.txt文件中，
   然后再从文件中把Student对象的信息读出,并且把读出来的数据重新赛给一个对象,然后显示在控制台上
   */

  public static void main(String[] args) throws IOException {
    File file = new File("a.txt");
    Student  student=new Student("张三",12,"栖霞区");
    OutputStream os=new FileOutputStream(file);
    os.write(student.toString().getBytes());
    os.close();

  }
}
