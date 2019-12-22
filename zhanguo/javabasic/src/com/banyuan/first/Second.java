package com.banyuan.first;

import java.util.Scanner;

public class Second {

    public static void main(String[] args) {

//
//        System.out.println("请输入一个数据：");
//        //int   number=sc.nextInt(); //java.util.InputMismatchException
//       // double  number=sc.nextDouble();
//     //   String   str=sc.next();
//       // String   str=sc.nextLine();
//       // System.out.println(str);
//   //     boolean   number=sc.hasNextInt();
////        if(sc.hasNextInt()){ //如果是合法整数那么久返回true
////            System.out.println(number);
////        }
//        double  number=sc.nextDouble();
//
//        System.out.printf("%8.2f",number);
//

        /*
         *数组
         */
        int   [] arr=new  int[5];
        arr[0]=1;
//        arr[5]=123;  //java.lang.ArrayIndexOutOfBoundsException: 5
      //  System.out.println(arr[5]);

        //静态数组
       // int [] arr2=new int[56]{12,123,4,56,51};  //错误

        int [] arr3={123,56,78,9,9};

        int [] [] arr4=new int[2][];
           arr4[0]=new  int[3];
           arr4[1]=new  int[5];

        System.out.println(arr4[0]); // 0



        arr4=null;  //arr4 数组名没有任何指向
        String   str=null; // 空
        String   s=""; // 空字符串

        int []  ar=arr3;
        ar[0]=14;

        System.out.println(arr3[0]);

        /*

            杨辉三角
            1
            11
            121
            1331
            14641
            15101051



         */
        Scanner   sc=new Scanner(System.in);

            for(int i=0;i<arr.length;i++){
                System.out.println("给"+(i+1)+"个数据进行赋值:");
                arr[i]=sc.nextInt();
            }



    }


}




