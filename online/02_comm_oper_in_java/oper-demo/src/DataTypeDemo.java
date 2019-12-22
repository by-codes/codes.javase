/**
 * 数据类型的演示
 *
 * @author www.banyuan.club
 */
public class DataTypeDemo {

  /*
   * 本例传入到 System.out.println 都是直接常量，也叫字面量
   * 编译器会给字面量一个默认数据类型，如果你的意图不一致
   * 可以通过增加额外的标识指导编译器产生正确的数据类型
   */
  public static void main(String[] args) {
    System.out.println("字符串常量");
    // 字符常量
    System.out.println('c');
    // 整数常量，如果没有标识就表示int类型常量
    System.out.println(123);
    // 小数常量，默认是double类型的，因为float是e38，这里已经远超过38了，编译不报错
    System.out.println(12345678901234567890123456789012345678901234567890.1);
    // 也可使使用D或d表示 double类型常量
    System.out.println(12345678901234567890123456789012345678901234567890.1D);
    /*
    // 如果给了个F或f表示float就会编译报错
     System.out.println(12345678901234567890123456789012345678901234567890.1F);
     */
    // boolean常量
    System.out.println(true);
    System.out.println(false);

    // "\uD83D\uDE00" 表示一个emoji字符（码点 U+1F600），这个字符超出了char的存储范围，不能用char进行存储
    System.out.println("\uD83D\uDE00");
    // 浮点数存在舍入误差，将会输出0.8999999999999999
    System.out.println(2.0 - 1.1);
    // 十六进制表示255
    System.out.println(0xFF);
    // 八进制数表示63，不建议使用此方式表示数字，因为容易混淆
    System.out.println(077);
    // 表示 -1，数字常量实际上是int类型， 0xFFFFFFFF 是 -1的补码
    System.out.println(0xFFFFFFFF);
    // 表示4294967295，后面使用L或l 来标识是long类型的整数
    // 建议使用L方便阅读，因为l和1长得比较像
    System.out.println(0xFFFFFFFFL);
    // java7 之后 使用0b开头表示二进制
    // 这里表示9
    System.out.println(0b1001);
    // 可以使用下划线分割方便阅读，表示10011，十进制19
    System.out.println(0b1001_1);


  }
}
