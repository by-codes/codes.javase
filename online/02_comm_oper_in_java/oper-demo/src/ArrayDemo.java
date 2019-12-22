/**
 * 数组操作demo
 *
 * @author www.banyuan.club
 **/
public class ArrayDemo {

  public static void main(String[] args) {
    // 和c语言不同，并不是在声明数组的时候就分配了内存空间
    int[] intArr1;
    intArr1 = new int[5];

    // 声明变量的时候创建数组并初始化
    // 等价于
    // int[] intArr2 = new int[]{1, 2, 3, 4, 5};
    int[] intArr2 = {1, 2, 3, 4, 5};

    // 可以先声明，然后在创建并赋值
    int[] intArr3;
    intArr3 = new int[]{1, 2, 3, 4, 5};

    // 可以创建出一个数组长度为0的数组
    int[] intEmptyArr = new int[0];
/*
    // 不允许访问不存在的数组元素，将出现异常
    System.out.println(intArr3[5]); // 运行将报错 ArrayIndexOutOfBoundsException
*/
    // 使用for each遍历数组
    int[] intArr4 = new int[2];
    for (int elem : intArr4) {
      // 分别输出两个0，数组在创建的时候默认进行了初始化
      System.out.println(elem);
    }

    // 数组变量的相互赋值，是赋值的引用，对其中一个内容进行修改，会被另一个数组变量获取到
    int[] intArr5 = new int[2];
    intArr5[0] = 10;
    intArr5[1] = 10;
    int[] intArr6 = intArr5;
    System.out.println(intArr5[1]); // 输出10
    intArr6[1] = 20;
    System.out.println(intArr5[1]); // 输出20

  }

}
