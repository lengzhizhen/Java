import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Scanner;

public class Homework01 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    }
}


//this的学习,那个对象调用，this就代表那个对象，this隐藏属性指向当前对象
class This{
    public static void main(String[] args){
        Dog dog01 = new Dog("红红",12);
        System.out.println("Dog1的hashcode: "+dog01.hashCode());
        dog01.info();
        Dog dog02 = new Dog("明明", 15);
        System.out.println("Dog2的hashcode: "+dog02.hashCode());

    }

}
class Dog{
    String name;
    int age;
    public Dog(String name , int age){
        this.name = name;
        this.age = age;
        System.out.println("this的hashcode: "+this.hashCode());

    }
    public void info(){
        System.out.println("它的姓名为"+name+",年龄为："+age);
    }
}

//this的细节
class ThisDetail{
    public static void main(String[] args){
        System.out.println("=======访问成员方法的语法：this.方法名（参数列表）=========");
        Detail detail = new Detail();
        System.out.println(detail.age);
        detail.Text02();
        System.out.println("============访问构造器语法this(参数列表)================");
        Detail detail01 = new Detail();
        System.out.println("==============属性的访问===================");
        detail.Text03();



    }
}

class Detail{
    String name = "小明";
    int age = 22;
    public Detail(){
        /**
         * 细节：访问构造器语法this(参数列表)
         * 注意：只能在构造器中使用，即只能在构造器中访问另一个构造器
         * 注意：访问构造器语法this(参数列表),必须放置在第一条语句
         */
        this("小红",12);
        System.out.println("Detail()被调用~~");
    }
    public Detail(String pName , int pAge){
        System.out.println("Detail(String pName , int pAge)被调用~~");
    }
    public void Text01(){
        System.out.println("Text01()被调用~~");
    }
    public void Text02(){
        System.out.println("Text02()被调用~~");
        Text01();
        //细节：访问成员方法的语法：this.方法名（参数列表）
        this.Text01();
    }
    public void Text03(){
        String name = "小蓝";
        //传统：作用域就近原则,有局部变量，优先访问局部变量
        System.out.println("name = "+name+"  age="+age);
        //直接访问属性
        System.out.println("name="+this.name+"  age="+this.age);
    }
}

class thisExercise{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第1个人的姓名和年龄：");
        String name01 = scanner.next();
        int age01 = scanner.nextInt();
        System.out.println("请输入第2个人的姓名和年龄：");
        String name02 = scanner.next();
        int age02 = scanner.nextInt();
        Person p1 = new Person(name01,age01);
        Person p2 = new Person(name02,age02);
        //先把p1传入属性，p2作为参数传入
        System.out.println(p1.compareTo(p2));


    }
}

class Person{
    String name;
    int age;
    public Person(String name , int age){
        this.name = name;
        this.age = age;
    }
    //this指向当前对象的属性，p指向传入参数
    public boolean compareTo(Person p){
        return this.name.equals(p.name) && this.age == p.age;
    }
}
//本章练习
class MethodExercise{
    public static void main(String[] args){
        System.out.println("==========第一题：数组最大值==========");
        Scanner scanner = new Scanner(System.in);
        double[] arr = {1.2 , 2.3 , 3.5};
        A a = new A();
        Double max = a.max(arr);
        if (max != null){
            System.out.println("最大值为"+max);
        }else {
            System.out.println("arr输入错误，不能为null并且不能为{}");
        }
        System.out.println("=========第二题：数组元素查找返回下标==================");
        String[] arr02 = {"marry","lzz","Tom","jack"};
        System.out.println("请输入需要查找的内容：");
        String findString = scanner.next();
        Integer index = a.find(findString,arr02);
        if (index !=  null){
            System.out.println("下标为:"+index);
        }else {
            System.out.println("arr输入错误，不能为null并且不能为{}");
        }

        System.out.println("=============第三题：更改书的价格============");
        System.out.println("请输入书的价钱：");
        double bookPrice = scanner.nextDouble();
        System.out.println("请输入书的名字：");
        String bookName = scanner.next();
        Book book = new Book(bookName , bookPrice);
        book.info();//显示当前输入书的名字和价格
        book.updatePrice();//更新价格
        book.updateInfo();//显示更新后书的名字和价格



    }
}

class A{
    public Double max(double arr[]){
        //保证arr至少有一个元素
        if (arr != null && arr.length>0) {
            double max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }else {
            return null;
        }
    }
    public Integer find(String findString,String arr[]){

        if (arr != null && arr.length>0) {
            for (int i = 0; i < arr.length; i++) {
                if (findString.equals(arr[i])) {
                    return i;
                }
            }
            return -1;
        }else {
            return null;
        }
    }

}

class Book{
    double price;
    String name;
    public Book(String name , double price){
        this.price = price;
        this.name = name;
    }
    public void updatePrice(){
        if (this.price>150){
            this.price = 150;
        }else if (this.price > 100) {
            this.price = 100;
        }
    }
    public void info(){
        System.out.println("书名 = "+this.name+" 价格="+this.price);
    }
    public void updateInfo(){
        System.out.println("更新后书名 = "+this.name+" 价格="+this.price);
    }

}

class methodExercise{
    public static void main(String[] args){
        System.out.println("================第4题：数组复制===============");
        int[] oldArr = {1 , 2 ,3};
        A03 a03 = new A03();
        int[] newArr = a03.copyArr(oldArr);
        System.out.println("newArr数组的值为");
        for (int i = 0 ; i < newArr.length ; i++){
            System.out.print(newArr[i]+" ");
        }

    }
}


class A03{

    public int[] copyArr(int[] oldArr){
        int[] newArr = new int[oldArr.length];
        for (int i = 0 ; i < oldArr.length ; i++){
            newArr[i] = oldArr[i];
        }
        return newArr;
    }

}
class Circle{
    public static void main(String[] args){
        System.out.println("================第5题：圆的周长和面积===============");
        System.out.println("请输入圆的半径：");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        Circle02 circle02 = new Circle02(radius);
        System.out.println("面积为："+circle02.area());
        System.out.println("周长为："+circle02.Len());

    }
}
class Circle02{
    double radius;
    public Circle02(double radius){
        this.radius = radius;
    }
    public int area(){
        return (int)(Math.PI * radius * radius);
    }
    public int Len(){
        return (int)(2 * Math.PI * radius) ;
    }
}

class Cale01{
    public static void main(String[] args){
        System.out.println("==================6.计算加减乘除============");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个数为：");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        Cale cale = new Cale(num1 , num2);
        System.out.println("和为："+cale.sum());
        System.out.println("差为："+cale.minus());
        System.out.println("乘积为："+cale.mul());
        Double div = cale.div();
        if (div != null) {
            System.out.println("商为：" + cale.div());
        }

    }
}

class Cale{
    double num1;
    double num2;
    public Cale(double num1 , double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public double sum(){
        return num1 + num2;
    }
    public double minus(){
        return num1 - num2;
    }
    public double mul(){
        return num1 * num2;
    }
    public Double div(){
        if (num2 == 0) {
            System.out.println("num2不能为0");
            return null;
        }else {
            return num1 / num2;
        }

    }
}

class Tiger01{
    public static void main(String[] args){
        System.out.println("========7.输入小老虎的信息并且显示==========================");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入老虎的姓名：");
        String name = scanner.next();
        System.out.println("请输入小狗的年龄：");
        int age = scanner.nextInt();
        System.out.println("请输入小狗的体重：");
        double height = scanner.nextDouble();
        Tiger tiger = new Tiger(name , age ,height);
        tiger.info();


    }

}

class Tiger{
    String name;
    int age;
    double height;
    public Tiger(String name , int age , double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public void info(){
        System.out.println("这只老虎的姓名为"+name+",年龄为"+age+"，体重为"+height);
    }
}

class Music01{
    public static void main(String[] args){
        System.out.println("========7.音乐播放==========================");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入音乐的姓名：");
        String name = scanner.next();
        System.out.println("请输入音乐的时长：");
        double times = scanner.nextDouble();
        Music music = new Music(name , times);
        music.play();
        System.out.println(music.getInfo());

    }
}
class Music{
    String name;
    double times;
    public Music(String name , double times){
        this.name = name;
        this.times = times;
    }
    public void play(){
        System.out.println("音乐"+name+"正在播放中~~~时长"+times+"s");
    }
    public String getInfo(){
        return "音乐"+name+"， 时长"+times;
    }
}