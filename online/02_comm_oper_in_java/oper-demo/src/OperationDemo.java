/**
 * 数据运算演示
 *
 * @author www.banyuan.club
 */
public class OperationDemo {

  public static void main(String[] args) {

    // 除法两边操作数都是整型并且被除数为0
    // 则会出现异常 java.lang.ArithmeticException: / by zero
    // System.out.println(1 / 0);

    // 浮点数参与的除法，如果出现0作为被除数，则最后结果为Infinity
    System.out.println((1 * 1.0) / 0);

    // 因为float有效位数在6~7位
    int intOne = 123456789;
    float floatOne = intOne;
    // 1.23456792E8  赋值之后只能保证精度到7位有效
    System.out.println(floatOne);

/*
    // char 表示数字的范围和byte、short不一致，不允许和byte、 short相互赋值
    char charOne = 'a';
    byte byteOne = 12;
    charOne = byteOne;  // 编译不通过
    byteOne = charOne;  // 编译不通过

    short shortOne = 123;
    charOne = shortOne; // 编译不通过
    shortOne = charOne; // 编译不通过
*/
/*
    // 小于int类型存储空间的数字数据类型的算数运算，都将转换成int类型进行计算
    short shortTwo = 1;
    short shortThree = 1;
    shortTwo= (shortTwo + shortThree); // 编译报错，因为结果是int类型，不能再赋值给short
    // 运算赋值符号一起的时候，默认进行了强制类型转换
    // 相当于 shortTow = (short) (shortTwo + shortThree)
    shortTwo += shortThree; // 可以正常运算
*/
    double doubleOne = 9.9;
    // 小数转整数将把小数部分截断
    int intTwo = (int) doubleOne;
    // 输出9
    System.out.println(intTwo);

    // 关系运算符最后返回一个boolean类型
    System.out.println(1 == 2); // 输出 false
    System.out.println(3 != 4); // 输出 true
    System.out.println(5 >= 6); // 输出 false
    System.out.println(7 <= 8); // 输出 true

  }
}
