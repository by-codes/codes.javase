package com.banyuan.first;


/**
 * @author   sanye
 * @date     2019-11-29 11:26:00
 * @since   1.0
 * @deprecated   xxxx
 *
 */

public class First {

    /**
     *
     * @param args 表示从控制台传递的默认值
     */



    // main   程序入口
    public static void main(String[] args) {
        //  System.out.println("nihao  banyuan");

       /* int a12 = 12;
        System.out.println(a12);

        */

//        System.out.println(12);
//
//        System.out.println(12.5);
//
//        System.out.println('a');
//
//        System.out.println(true);


//        System.out.println(101010101);
//        System.out.println(0b101010101);
//        System.out.println(72);
//        System.out.println(072);


        byte   i=12;
        System.out.println(i);  //int

        long   lo=12312321L;  //12312321  ---> long

        float  f=123.0F;
        double d=124.9;


        char   x='a'+1;  //    a--->97+1  98   ----> b

        System.out.println(x);//ASCII 码   a 97   A 65  char


         f=12.345F;

         int  number=(int)f; //一般情况下  不建议使用   精度丢失

        System.out.println("-----"+number);


        f=(float) d;

        System.out.println(f+".....");

        boolean   flag=true;

        byte    b=(byte)130;  //~128-127

        System.out.println("========"+b);


        short   s=12;
        short  st=34;
        short tw=(short)(s+st);   //自动类型转换


        short   sho=34;
        sho+=34;  //   sho  =(short)(sho+34);

//        short   sho=34;
//        sho=sho+34;

        System.out.println(sho);


        String  str="12"; //数字字符串


        System.out.println('a'+1+"=5+5");  // 98=5+5
        System.out.println("5+5="+'a'+1);  // 5+5=a1
        System.out.println("5+5="+('a'+1)); // 5+5=98
        System.out.println('a'+"5+5="+1);  // a5+5=1

        str="";//空字符串    被String  定义的字符串的数据不能变


        int   a=12;
        int   c=45;

//        int   temp=a;
//        a=c;
//        c=temp;
//
//        a=a+c;  //57
//        c=a-c;
//        a=a-c;

        a=a^c;   //   0  1   --->0
        c=a^c;           // 0000 1100        a
        a=a^c;           // 0010 1101        c

                        //  0010 0001       a
                        //  0010 1101  ---  c
                        //   0000 1100; --->c   ==12


        System.out.println("a="+a+",c="+c);





    }


}
