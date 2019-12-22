/**
 * 变量的演示
 *
 * @author www.banyuan.club
 */
public class VariableDemo {

  public static void main(String[] args) {

    // 可以使用部分unicode码作为变量名，建议还是使用英文字符和数字
    int 变量名可以是中文 = 123;
    System.out.println(变量名可以是中文);

    // 使用final修饰变量表示常变量，该变量不能被再次赋值
    final int a = 123;
    // a = 234; // 不能对final修饰的变量再次赋值，编译报错

    // 变量开头不能使用数字
    // int 2a; // 编译报错

    /*
    // 编译报错，变量未经初始化即使用
    char c;
    System.out.println(c);
    */

    /*
    // 编译器没有办法做出正确的判断，判断foo变量是否被初始化
    int foo;
    boolean condition = true;
    if (condition) {
      foo = 12;
    }
    System.out.println(foo); // 编译报错 Variable 'foo' might not have been initialized
    */
  }
}
