package club.banyuan.reflect.reflectDemo;

public class Person {

  private  String name="王老五";
  public  String  address="下水道";
  int age;
  protected  double  height;


  private  void show(String   username){
    System.out.println("我是私有化方法"+username);
  }

  public  void  show2(String  username,int  age){
    System.out.println("我是共有化方法..."+username+"--"+age);
  }

  void  show3(){
    System.out.println("我是默认的方法..."+name+"住在："+address);
  }


  protected  void  show4(){
    System.out.println("我是受保护的方法....");
  }



  public Person() {
  }

  public Person(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public Person(String name, String address, int age, double height) {
    this.name = name;
    this.address = address;
    this.age = age;
    this.height = height;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }






}
