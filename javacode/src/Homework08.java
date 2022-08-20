import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Scanner;

public class Homework08 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //对象的实例化
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        //给每个属性赋值
        cat1.name = "小花";
        cat1.age = 10;
        cat1.price = 1000;
        cat1.weight = 42.5;
        cat2.name = "小红";
        cat2.age = 5;
        cat2.price = 2000;
        cat2.weight = 45.2;
        System.out.println("第一只猫的信息：");
        System.out.println("姓名： "+cat1.age+"年龄： "+cat1.age+"价格： "+cat1.price+"体重： "+cat1.weight);
        System.out.println("第二只猫的信息：");
        System.out.println("姓名： "+cat2.age+"年龄： "+cat2.age+"价格： "+cat2.price+"体重： "+cat2.weight);
        Car car = new Car();
        System.out.println("车辆信息：");
        System.out.println("名字： "+car.name+"价格： "+car.price+"颜色："+car.color+"是否通过检查"+car.pass);
        //把car属性赋值给car1
        Car car1 = car;
        //改变car的属性
        car.name = "劳斯莱斯";
        car.price = 22;
        //car1的属性会发生变化
        System.out.println(car1.name);
        System.out.println(car1.price);

    }
}

class Cat{
    String name;
    int age;
    double price;
    double weight;
}

class Car{
    String name;
    double price;
    String color;
    boolean pass;
}

class Object01{
   public static void main(String[] args){
       Person person = new Person();
       person.name = "小明";
       person.age = 10;
       Person person01;
       person01 = person;
       System.out.println(person01.name);//把person.name赋值给person01是小明
       person01.age = 200;
       person01 = null;
       System.out.println(person.age);//输出200，person和person01同时指向age
       System.out.println(person01.age);//报异常
   }
}

class Person{
    String name;
    int age;
}

class Methods{
    public static void main(String[] args){
        Person01 person01 = new Person01();
        //方法的调用，不调用的话没有效果
        person01.speak();
        person01.Add();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字计算1加到n的结果：");
        int a = scanner.nextInt();
        person01.Add01(a);//调用方法同时给n赋值
        System.out.println("请输入两个数：");
        int sum1 = scanner.nextInt();
        int sum2 = scanner.nextInt();
        int returnSum = person01.Sum01(sum1 , sum2);//调用方法并赋值
        System.out.println("两个数相加的和为："+returnSum);

    }
}

class Person01{
    String name;
    int age;

    /**
     * 1.public：表示方法是公开的
     * 2.void：表示没有返回值
     * 3.speak():表示方法名
     * 4.{}里面表示方法体
     */
    public void speak(){
        System.out.println("学习java");
    }

    public void Add(){
        int sum = 0;
        for (int i = 1 ; i <= 1000 ; i++){
            sum += i;
        }
        System.out.println("1-1000相加的结果为"+sum);
    }

    //int n :表示形式参数，接收用户输入的一个值
    public void Add01(int n){
        int sum = 0;
        for (int i = 1 ; i <= n ; i++){
            sum += i;
        }
        System.out.println("1-1000相加的结果为"+sum);
    }
    //两个形式参数可以接收两个用户返回的值
    //return表示把sum的值返回
    public int Sum01(int num1 , int num2){
        int sum = num1 + num2;
        return  sum;
    }
}

//数组传参
class Method01{
    public static void main(String[] args){
        int[][] maps = {{1,2,3},{4,5,6},{7,8,9}};
        ArrGet arrGet = new ArrGet();
        arrGet.arr(maps);
    }
}

class ArrGet{
    //参数数组的时候
    public void arr(int[][] maps){
        for (int i = 0 ; i < maps.length ; i++){
            for (int j = 0 ; j < maps[i].length ; j++){
                System.out.print(maps[i][j]);
            }
            System.out.println();
        }
    }
}

class A{
    public void print(int n){
        System.out.println("print()方法被调用 n="+n);
    }
    public void B(){
        print(10);//同一个类中方法可以直接调用
        System.out.println("继续执行B()");
    }

}

class B{

    public static void main(String[] args){
        A a = new A();
        a.B();
        System.out.println("继续执行min");
    }
}

//判断一个数是奇数还是偶数
class isOdd{
    public static  void main(String[] args) {
        System.out.println("请输入一个数：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        AA a = new AA();
        if(a.Odd(num)){
            System.out.println("是奇数");
        }else {
            System.out.println("是偶数");
        }
    }
}

class print{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入打印的行：");
        int a = scanner.nextInt();
        System.out.println("请输入打印的列：");
        int b = scanner.nextInt();
        System.out.println("请输入打印的图形：");
        char c = scanner.next().charAt(0);
        System.out.println("打印效果为：");
        AA print = new AA();
        print.print(a,b,c);
    }
}

class AA{
    public boolean Odd(int num){
        return num % 2 != 0 ;
    }
    public void print(int a , int b , char c){
        for (int i = 0 ; i < a ; i++){
            for (int j = 0 ; j < b ; j++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}