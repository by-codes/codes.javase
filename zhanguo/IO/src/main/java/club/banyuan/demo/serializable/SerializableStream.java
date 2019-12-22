package club.banyuan.demo.serializable;

import club.banyuan.demo.homework.Student;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SerializableStream {

  public static void main(String[] args) throws IOException, ClassNotFoundException {

    File file = new File("a.txt");
    OutputStream outputStream=new FileOutputStream(file,true);  //文件头 和 文件体
   if (file.length() < 1) {
      ObjectOutputStream objectOutputStream =
          new ObjectOutputStream(outputStream);
      objectOutputStream.writeObject(new Student("张三1", 12, "下棋1"));
      objectOutputStream.writeObject(new Student("张三2", 12, "下棋2"));
      objectOutputStream.writeObject(new Student("张三3", 12, "下棋3"));

      objectOutputStream.flush();

    } else {
        MyObjectOutputStream os =
            new MyObjectOutputStream(outputStream);
        os.writeObject(new Student("张三4", 13, "下棋4"));
        os.writeObject(new Student("张三5", 15, "下棋5"));
        os.flush();
    }

    FileInputStream fileInputStream = new FileInputStream(file);
    ObjectInputStream ois = new ObjectInputStream(fileInputStream);
    Student obj = (Student) ois.readObject();
    while (obj != null) {
      try {
        System.out.println(obj.toString() + "---" + obj.getAddress());
        obj = (Student) ois.readObject();
      } catch (EOFException e) {
        System.out.println("已经读取完了...");
        break;
      }
    }

    ois.close();

    //写多个对象到文件里面   并且读出

  }


}
