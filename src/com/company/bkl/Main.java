package com.company.bkl;


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
        int sum=0;//变量使用之前定义即可
        for (int i=0;i<100;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum :"+sum);
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
         */
    }
}
