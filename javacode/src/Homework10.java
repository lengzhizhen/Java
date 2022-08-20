import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args){
        System.out.println(100);
        System.out.println(100);
    }
}

class OverLoad{
    public static void main(String[] args){
        MyCalculator mc = new MyCalculator();
        System.out.println(mc.calculate(1 , 2));
        System.out.println(mc.calculate(1.2 , 2));
        System.out.println(mc.calculate(1 , 1.2));
        System.out.println(mc.calculate(1 , 2 , 3));
    }
}

/**
 * 重载的优点：减少起名和记名的麻烦
 * 注意事项：
 * 1.方法名必须相同
 * 2.形参列表必须不同（参数类型或个数或顺序，至少有一样不同，参数名无要求）
 * 3.返回类型，无要求
 */
class MyCalculator{
    public int calculate(int n1 , int n2){
        return n1 + n2;
    }
    /**参数名无要求无法构成重载
    public int calculate(int c1 , int c2){
        return c1 + c2;
    }
     */
    /**返回类型无要求无法构成重载
     public boolean calculate(int n1 , int n2){
     return c1 + c2;
     }
     */
    public double calculate(double n1 , int n2){
        return n1 + n2;
    }
    public double calculate(int n1 , double n2){
        return n1 + n2;
    }
    public int calculate(int n1 , int n2 , int n3){
        return n1 + n2 + n3;
    }
}

class OverLoadExercise{
    public static void main(String[] args){
        Method method = new Method();
        method.m(10);
        method.m(10 , 20);
        method.m("冷志真 ， 你好");
        System.out.println(method.max(12 , 1));
        System.out.println(method.max( 1.2 , 1.3));
        System.out.println(method.max(1.2 , 1.3 , 30));
    }
}

class Method{
    //使用方法重载计算一个数的平方，两个数乘积和输入一段字符串
    public void m(int n){
        System.out.println("平方 = "+ (n * n));
    }
    public void m(int n1 , int n2){
        System.out.println("乘积 = "+ (n1 * n2));
    }
    public void m(String str ){
        System.out.println("str = "+ str);
    }
    //使用方法的重载，比较两个整数的大小，两个小数大小，三个小数大小
    public int max(int n1 , int n2){
        return n1 > n2 ? n1 : n2 ;
    }
    public double max(double n1 , double n2){
        return n1 > n2 ? n1 : n2 ;
    }
    public double max(double n1 , double n2 , double n3){
        double max1 = n1 > n2 ? n1 : n2 ;
        return max1 > n3 ? max1 : n3 ;

    }

}

//可变参数的使用
class VarParameter{
    public static void main(String[] args){
        HspMethod hspMethod = new HspMethod();
        System.out.println(hspMethod.sum(1 ,2 ,3));
        //实参可以为数组
        int[] arr = {1,2,3};
        System.out.println(hspMethod.sum(arr));
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = scanner.next();
        System.out.println("请输入三门课的分数：");
        double score1 = scanner.nextDouble();
        double score2 = scanner.nextDouble();
        double score3 = scanner.nextDouble();
        System.out.println(hspMethod.showScore(name ,score1 ,score2 ,score3));
    }
}

class HspMethod{
    //当方法名相同，功能相同，参数不同的时候可以使用可变参数，可变参数实质就是数组
    //可变参数可以和其它形参放在一起，但是可变参数必须放在最后
    //一个形参列表中只能出现一个可变参数
    public int sum(int ... num){
        System.out.println("接收的长度为："+num.length);
        int res = 0 ;
        for (int i = 0 ; i < num.length ; i++){
            res += num[i];
        }
        return res;
    }

    public String showScore(String name , double... scores){
        double totalScore = 0;
        for (int i = 0 ; i < scores.length ; i++){
            totalScore += scores[i];
        }
        return name + scores.length + "门课的成绩为" + totalScore;

    }
}

//作用域
class Scope{
    public static void main(String[] args){
        Tig01 t1 = new Tig01();
        t1.cry();
        System.out.println("==========全局变量可以被本类使用或者其他类使用=========");
        Tig02 t2 = new Tig02();
        t2.Test01();//第一种跨类访问属性
        t2.Test02(t1);//第二种跨类访问属性

    }

}

class Tig01{
    //属性（全局变量）：作用在cat类
    //全局变量可以不用赋值使用有默认值,属性可以加修饰符
    public String name = "Jack";
    int age;
    public void cry(){
        //局部变量：作用在cry方法里
        double height = 1.1;//局部变量必须赋值才可以使用
        //double height = 1.1;同一作用域中局部变量不能重名
        //String name = "Tom";//属性变量和局部变量可以重名遵循就近原则
        System.out.println(height);
        System.out.println(name);
    }

}

class Tig02{
    public void Test01(){
        Tig01 t = new Tig01();
        System.out.println(t.name);
    }
    public void Test02(Tig01 T){
        System.out.println(T.name);
    }
}

//构造器的学习
class Constructor{
    public static void main(String[] args){
        //构造器1
        Dog01 dog01 = new Dog01("小明" , 12);
        //dog01.Dog01();构造器的调用由系统调用，不可以主动调用，错误示范，成员方法可以调用
        System.out.println("dog01对象的name = "+dog01.name);
        System.out.println("dog01对象的age = "+dog01.age);
        //构造器2，构造器的重载
        Dog01 dog02 = new Dog01("小可");
        System.out.println("dog02对象的name = "+dog02.name);
        System.out.println("dog02对象的age = "+dog02.age);
        Dog02 dog = new Dog02();//因为下面定义了无参构造器，若是没有定义会报错
    }
}
class Dog02{
    //有一个默认构造器
    /**
     * Dog02(){
     *
     * }
     */
    //一旦定义了自己的构造器就不能使用 Dog02 dog02 = new Dog02();若想使用应该定义显示一下
    public Dog02(String pName){

    }
    Dog02(){

    }


}
/**
 * 构造器解读：
 * 1.构造器没有返回值，void也不能写
 * 2.构造器的名称应和类的名称一样
 * 3.构造器参数列表的规则和成员方法的规则一样
 */
class Dog01{
    String name;
    int age;
    public Dog01(String dName , int dAge){
        System.out.println("构造器1被调用~~完成对象属性的初始化");
        name = dName;
        age = dAge;
        
    }
    //构造器的重载
    public Dog01(String dName){
        System.out.println("构造器2被调用~~完成对象属性的初始化");
        name = dName;
    }

}

class ConstructorExercise{
    public static void main(String[] args){
        Car01 c1 = new Car01();
        System.out.println("c1的信息为 name = "+c1.name+"  money = "+c1.money);
        Car01 c2 = new Car01("Jack",12.3);
        System.out.println("c2的信息为 name = "+c2.name+"  money = "+c2.money);

    }
}

class Car01{
    String name;
    double money;
    public Car01(){
        money = 120;
    }
    public Car01(String pName , double pMoney){
        name = pName;
        money = pMoney;
    }
}

/**
 * class Person{
 *     int age = 90;
 *     String name;
 *     Person(String n , int a){//构造器
 *         name = n;//给属性赋值
 *         age = a;
 *     }
 * }
 * Person p = new Person("小明“,12);
 *
 * //流程分析：
 * 1.在方法区加载Person类信息，只会加载一次
 * 2.在堆中分配空间
 * 3.完成对象初始化：
 * 3-1：默认初始化：age=0,name=null
 * 3-2:显示初始化：age=90,name=null
 * 3-3:构造器初始化：age=90,name=小明
 * 4.对象在堆中的地址返回给p(p是对象名也可以理解为对象的引用)
 */