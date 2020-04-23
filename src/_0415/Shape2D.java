package _0415;
import java.util.Scanner;
/**
 * @Author: wx
 * @Date: 2020/4/15 0015 21:30
 */
interface InterfaceShape2D{
    double PI = 3.14;
    public void grith();
    public void area();
}


//创建Cricle类实现接口Shape2D，重写其中的方法
class Cricle implements InterfaceShape2D{
    //圆的半径（成员变量，构造方法）
    double redius;
    public Cricle(double r){
        redius = r;
    }
    //计算圆的周长
    public void grith(){
        double l1 = 2*PI*redius;
        System.out.println("圆的周长为：" + l1);
    }
    //计算圆的面积
    public void area(){
        double s1 = redius*redius*PI;
        System.out.println("圆的面积为：" + s1);
    }
}
//创建Rectangle类实现接口Shape2D，重写其中的方法
class Rectangle implements InterfaceShape2D{
    //矩形的长宽（成员变量，构造方法）
    double height;
    double weight;
    public Rectangle(double a,double b){
        height = a;
        weight = b;
    }
    //计算矩形周长
    public void grith(){
        double l2 = (weight+height)*2;
        System.out.println("矩形的周长为：" + l2);
    }
    //计算矩形面积
    public void area(){
        double s2 = weight*height;
        System.out.println("矩形的面积为：" + s2);
    }
}



 class InterfaceDemo {
    public static void main(String[] args) {
//输入圆的半径
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入圆的半径：" );
        double r;
        r=scan.nextInt();
//输入矩形的长
        Scanner x= new Scanner(System.in);
        System.out.print("请输入矩形长：" );
        double a;
        a=x.nextInt();
//输入矩形的宽
        Scanner y = new Scanner(System.in);
        System.out.print("请输入矩形宽：" );
        double b;
        b=y.nextInt();

//实体化Cricle类和Rectangle类
        Cricle cricle1 = new Cricle(r);
        Rectangle rectangle1 = new Rectangle(a,b);

        cricle1.grith();
        cricle1.area();
        rectangle1.grith();
        rectangle1.area();
// TODO Auto-generated method stub

    }

}

