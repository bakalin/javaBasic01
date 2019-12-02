package com.company.bkl;


import java.math.BigInteger;
import java.util.Arrays;

public class Main
{
    //单行注释
    /*
    多行注释
     */

    /**
     * 文档注释
     * @author  bakalin
     */
    public static void main(String[] args)//main 函数是执行入口
    {
        System.out.println("not hello,java.");
        int sum=0;//变量使用之前定义即可,定义在第一次使用的地方较好
        for (int i=0;i<100;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum :"+sum);
        System.out.println("MATH.PI:"+Math.PI+"\nMATH.E:"+Math.E);//Math类提供的常量

        //基本类型
        /*整型
          int +-20亿，4byte
          long 8byte
          short 2byte
          byte 1byte
          数字前缀，16进制0x,8进制0，2进制0b

          浮点数
          float，后缀F，无后缀默认为double，double可以加后缀D

          字符char，尽量不使用，Unicode

          布尔boolean：true/false,与整型不能转换

          常量final int CONST_I=3.14159
         */

        BigInteger mybigint=BigInteger.valueOf(5);//大整数，用valueof初始化
        mybigint=mybigint.add(mybigint);//不能直接用+-*/
        System.out.println(mybigint);

        //数组
        int[] ints=new int[3];//默认初始化为全0
        //ints.length获取数组长度
        for (int anInt : ints) {
            System.out.println(anInt);
        }
        System.out.println(Arrays.toString(ints));//arrays.tostring 返回字符串
        System.out.println(ints.toString());//返回数组地址
        for(int i:ints)//foreach循环，记得int
        {
            System.out.println(i);
        }
        ints= new int[]{18, 2, 36, 40, 5};
        System.out.println(Arrays.toString(ints));
        Arrays.sort(ints);//数组排序
        System.out.println(Arrays.toString(ints));
        BigInteger[] bignums=new BigInteger[5];//对象默认初始化为null
        System.out.println(Arrays.toString(bignums));

        //多维数组,实现为数组的数组，支持不规则数组

        //下面生成一个三角形二维数组
        double[][] d2nums=new double[5][];
        for(int i=0;i<d2nums.length;i++)
        {
            d2nums[i]=new double[i+1];
        }
        for(double[] tmp:d2nums)
        {
            System.out.println(Arrays.toString(tmp));
        }
        System.out.println(Arrays.deepToString(d2nums));//deeptostring 多维数组转成字符串
    }
}
