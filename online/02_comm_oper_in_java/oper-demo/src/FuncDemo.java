/**
 * 方法演示
 *
 * @author www.banyuan.club
 **/
public class FuncDemo {

  public static void main(String[] args) {
    int a = 5;
    int b = 10;
    System.out.println(a); // 5
    System.out.println(max(a, b)); // 10
    System.out.println(a); //  5

    int[] arr = {5, 10};
    System.out.println(arr[0]); // 5
    System.out.println(max(arr)); // 10
    System.out.println(arr[0]); //  10
  }

  // a的值不会被修改，因为max中使用的是a的值，这个值保存在新的内存区域中
  // 对参数a的值修改，并不是修改main方法里面的a的内存区域的值
  static int max(int a, int b) {
    if (a > b) {
      b = a;
      return a;
    } else {
      a = b;
      return b;
    }
  }

  // 对引用的变量进行修改，将会对外部产生影响
  // 参数列表发生变化，构成方法重载
  static int max(int[] arr) {
    if (arr[0] > arr[1]) {
      arr[1] = arr[0];
      return arr[0];
    } else {
      arr[0] = arr[1];
      return arr[1];
    }
  }
/*
  // 单纯修改参数名称不构成重载
  // 编译报错max方法已经被定义
  static int max(int[] test) {
    return 0;
  }
  */
}
