package club.banyuan.annotation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @see
 * @since
 */

public class MyAnnotation {

  @Override   //
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  @Override
  public String toString() {
    return super.toString();
  }
  @SuppressWarnings({"unused"})  //压制未使用
  public static void main(String[] args) {
    int i=0;
    List<Integer>  list=new ArrayList<>();

  }


}
