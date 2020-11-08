package text4;

import java.util.Scanner;

public class Text {
    public static void main(String[] ages) {
        Scanner input = new Scanner(System.in);
        System.out.println("学生的信息输入");
        System.out.println("姓名为:");
        String a = input.next();
        System.out.println("性别为：");
        String b = input.next();
        char c = b.charAt(0);
        int d1;
        while (true) {
            try {
                System.out.println("年龄为");
                Scanner input1 = new Scanner(System.in);
                d1=input1.nextInt();
                break ;
            }
            catch (Exception q){
                System.out.println("输入有误请重新输入！");
            }
        }
        int d = d1;
        System.out.println("每学期学费为：");
        double e = input.nextDouble();
        System.out.println("每月薪水为：");
        double f = input.nextDouble();
        Doctoral students1=new Doctoral(a,c,d,e,f);
        double y;
        y=f*9;
        double x;
        x=e*2;
        double z;
        z=y-x;
        double r=0;
        if (z<36000.0){
            r=z*0.03-0;
        }
        else if (z>=36000.0&&z<144000.0){
            r=z*0.1-2520;
        }
        else {
            r=z*0.2-16920;
        }

        System.out.println("   ");

        System.out.println("学生2的信息输入");
        System.out.println("姓名为:");
        String g = input.next();
        System.out.println("性别为：");
        String h = input.next();
        char i = h.charAt(0);
        int j1;
        while (true) {
            try {
                System.out.println("年龄为");
                Scanner input1 = new Scanner(System.in);
                j1=input1.nextInt();
                break ;
            }
            catch (Exception gg){
                System.out.println("输入有误请重新输入！");
            }
        }
        int j = j1;
        System.out.println("每学期学费为：");
        double k = input.nextDouble();
        System.out.println("每月薪水为：");
        double l = input.nextDouble();
        Doctoral students2=new Doctoral(g,i,j,k,l);
        double u;
        u=l*9;
        double o;
        o=k*2;
        double p;
        p=u-o;
        double v=0;
        if (p<36000.0){
            v=p*0.03-0;
        }
        else if (p>=36000.0&&p<144000.0){
            v=p*0.1-2520;
        }
        else {
            v=p*0.2-16920;
        }

        System.out.println("   ");

        System.out.println("学生1的输入信息为：");
        System.out.println(students1);
        students1.payingf();
        students1.inquiryf();
        students1.pay();
        students1.inquirys();
        System.out.println("年应纳税金额为："+r);
        System.out.println("   ");
        System.out.println("学生2的输入信息为：");
        System.out.println(students2);
        students2.payingf();
        students2.inquiryf();
        students2.pay();
        students2.inquirys();
        System.out.println("年应纳税金额为："+v);
    }
}
