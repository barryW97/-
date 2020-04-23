package _0415;

/**
 * @Author: wx
 * @Date: 2020/4/15 0015 18:56
 */
 abstract class Vehicle{
    abstract String wheelsNum();
}
  class Car extends Vehicle{
    @Override
     String wheelsNum(){
        return "四轮车";
    }
}
  class Motorbike extends Vehicle{
     String wheelsNum(){
        return "双轮车";
    }
}
abstract class Test{
    public static void main(String[] args){
        Vehicle car =new Car();
        Vehicle motorbike=new Motorbike();
        System.out.println(car.wheelsNum());
        System.out.println(motorbike.wheelsNum());
    }
}
