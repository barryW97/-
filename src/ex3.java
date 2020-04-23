/**
 * @Author: wx
 * @Date: 2020/4/15 0015 19:03
 */
public class ex3 {
    public static void main(String[] args) {
        Bike a=new Bike();
        a.start(null);
        a.stop(null);
        Bus b=new Bus();
        b.start(null);
        b.stop(null);
    }
}
interface Vehicle{
    void start(String car);
    void stop(String cars);
}
class Bike implements Vehicle{
    public void start(String car) {
// TODO 自动生成的方法存根
        System.out.println("自行车起步");

    }
    public void stop(String cars) {
        System.out.println("自行车停车");
// TODO 自动生成的方法存根
    }
}
class Bus implements Vehicle{
    public void start(String car) {
// TODO 自动生成的方法存根
        System.out.println("公交车起步");

    }
    public void stop(String cars) {
        System.out.println("公交车停车");
// TODO 自动生成的方法存根
    }
}
