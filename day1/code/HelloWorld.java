package com.sun;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class HelloWorld {


    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World!");
        System.out.println('a');
        System.out.println('a'+1);
        System.out.println("hello"+'a'+1);
        System.out.println('a'+1+"hello");
        System.out.println("5+5="+5+5);
        System.out.println(5+5+"=5+5");
        System.out.println(2<<3);
        int a=15;
        int b=23;
        /**
         * 交换两个数
         */
        a=15^(15^23);
        b=23^(15^23);
        System.out.println(a);
        System.out.println(b);
        /**
         * 获取其中最大数
         */
        System.out.println(a>b?a:b);
        /**
         * 键盘录入
         */
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(x+y);
        /**
         * 选择结构
         */
        if(x>y){
            System.out.println(x);
        }else{
            System.out.println(y);
        }
        switch (x/10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格");
                break;
            case 6:
                System.out.println("及格了");
                break;
            case 7:
                System.out.println("中");
                break;
            case 8:
                System.out.println("良");
                break;
            case 9:
            case 10:
                System.out.println("优秀");
                break;
            default:
                System.out.println("成绩录入错误");
                break;
        }
            /**
             * 练习for循环,1-100偶数和
             */
            int sum=0;
            for(int i=1;i<=100;i++) {
                if(i%2==0) {
                    sum += i;
                }
            }
            System.out.println(sum);
        }
    }

