package text4;

public class Doctoral implements Students,Teacher{
    String name;
    char sex;
    int age;
    double semesterf;
    double monthf;
    Doctoral(String name,char sex,int age,double semesterf,double monthf){
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.semesterf=semesterf;
        this.monthf=monthf;
    }
    public String toString(){
        return "姓名是："+name+"   性别是："+sex+  "   年龄是："+age+"   每学期学费："+semesterf+"   每月薪水："+monthf;
    }
    public void payingf(){
        System.out.println("缴纳学费为："+semesterf*2);
    }
    public void inquiryf(){
        System.out.println("查学费为："+semesterf*2);
    }
    public void pay(){
        System.out.println("发放薪水为："+monthf*9);
    }
    public void inquirys(){
        System.out.println("查询薪水为："+monthf*9);
    }
}
