import javafx.application.Application;
import javafx.stage.Stage;

public class Homework02 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        System.out.println("String类型转换成int会报异常");
        /**
         *  String str1 = "Hello";
         *  int num1 = Integer.parseInt(str1);
         *  System.out.println(str1);
         */
        System.out.println("================本章练习01===============");
        int n1 = 13;
        int n2 = 17;
        int n3 = n1 + n2;
        System.out.println(n3);
        int n4 = 38;
        int n5 = n4 - n3;
        System.out.println(n5);
        System.out.println("==============本章练习02==============");
        char c1 = '\t';
        char c2 = '\r';
        char c3 = '\\';
        char c4 = 1;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println("=============本章练习03=================");
        String book1 = "Java程序设计";
        String book2 = "C#程序设计";
        System.out.println(book1+book2);
        char sex1 = '男';
        char sex2 = '女';
        System.out.println(sex1+sex2);
        double price1 = 128.6;
        double price2 = 114.5;
        System.out.println(price1+price2);
        System.out.println("=============本章练习04===================");
        String name = "冷志真";
        int age = 22;
        char sex3 = '男';
        double score = 98.5;
        String hobby = "散步";
        System.out.println("姓名\t\t年龄\t\t性别\t\t分数\t\t爱好\n"+name+"\t"+age+"\t\t"+sex3+"\t\t"+score+"\t"+hobby);




    }
}
//==========================================================算数运算符的使用===============================================
    class ArithmeticOperator{

        public static void main(String[] args) {
            System.out.println("============/的使用================");
            System.out.println(10/4);//2
            System.out.println(10.0/4);//2.5
            double num1 = 10/4;//2.0
            System.out.println(num1);
            System.out.println("=================%的使用================");
            //取余的计算遵循：a%b = a-a/b*b
            System.out.println(10%3);//1
            System.out.println(-10%3);//-1
            System.out.println(10%-3);//1
            System.out.println(-10%-3);//-1
            System.out.println("===========++的使用====================");
            int num2 = 10;
            //作为独立语句使用时，num2++和++num2一样等价于num2=num2+1
            num2++;
            ++num2;
            System.out.println(num2);
            //num3++先赋值后自增，等价于num4=num3,num3=num3+1
            int num3 = 12;
            int num4 = num3++;
            System.out.println("num3="+num3+"num4="+num4);//num4=12,num3=13
            //++num5先自增后赋值，等价于num5=num5+1,num6=num5
            int num5 = 12;
            int num6 = ++num5;
            System.out.println("num5="+num5+"num6="+num6);//num5=13,num3=13
            int i = 1;
            i = i++;//临时变量：temp=i;i=i+1;i=temp
            System.out.println(i);//1
            int i1 = 1;
            i = ++i;//i=i+1；temp=i;i=temp;
            System.out.println(i);//2
            int a1 = 10;
            int a2 = 20;
            int a = a1++;
            System.out.println("a="+a);
            System.out.println("a2="+a2);
            a = --a2;
            System.out.println("a="+a);
            System.out.println("a2="+a2);
            System.out.println("==========还有59天放寒假合多少星期多少天：==============");
            int days = 59;
            int weeks = days/7;
            int days1 = days%7;
            System.out.println("合"+weeks+"星期"+days1+"天");
            System.out.println("==========定义一个华氏温度转换成摄氏温度，公式为5/9*(华氏温度-100）=========");
            double huashi = 265.2;
            double sheshi = 5.0/9*(huashi-100);
            System.out.println("华氏温度"+huashi+"对应的摄氏温度为："+sheshi);



        }

    }
   //=========================================================关系运算符的使用================================================
    class relationOperator{
        public static void main(String[] args) {
           int a = 7;
           int b = 8;
           System.out.println(a > b);
           System.out.println(a < b);
           System.out.println(a >= b);
           System.out.println(a <= b);
           System.out.println(a == b);
           System.out.println(a != b);
           boolean flag = a < b;
           System.out.println(flag);
        }


    }
    //=========================================================逻辑运算符的使用=====================================================
    class LogicOperator{
        public static void main(String[] args){
            System.out.println("========短路&&使用=======");
            int score = 97;
            if(score < 100 && score > 90){
                System.out.println("OK");
            }
            System.out.println("========逻辑&使用=======");
            if(score < 100 & score > 90){
                System.out.println("OK2");
            }
            System.out.println("========区别演示=======");
            System.out.println("========短路&&第一个条件为false后第二个条件不会执行，逻辑&会执行=======");
            int a = 1;
            int b = 2;
            if(a > 2 && ++b < 2){
                System.out.println("OK3");
            }
            System.out.println("a="+a+"b="+b);
            int c = 1;
            int d = 2;
            if(c > 2 & ++d < 2){
                System.out.println("OK4");
            }
            System.out.println("c="+c+"d="+d);
            System.out.println("短路&&与逻辑&课后作业：猜结果");
            int x = 5;
            int y = 5;
            if(x++==6 & ++y==5){
                x = 11;
            }
            System.out.println("x="+x+"y="+y);//6,6
            int x1 = 5;
            int y1 = 5;
            if(x1++==6 && ++y1==5){
                x1 = 11;
            }
            System.out.println("x1="+x1+"y1="+y1);//6,5


        }

    }

class LogicOperator02{
    public static void main(String[] args){
        System.out.println("========短路||使用=======");
        int score = 97;
        if(score < 100 || score < 96){
            System.out.println("OK");
        }
        System.out.println("========逻辑|使用=======");
        if(score < 100 || score < 96){
            System.out.println("OK2");
        }
        System.out.println("========区别演示=======");
        System.out.println("========短路||第一个条件为true后第二个条件不会执行，逻辑|会执行=======");
        int a = 1;
        int b = 2;
        if(a < 2 || ++b < 2){
            System.out.println("OK3");
        }
        System.out.println("a="+a+"b="+b);
        int c = 1;
        int d = 2;
        if(c < 2 | ++d < 2){
            System.out.println("OK4");
        }
        System.out.println("c="+c+"d="+d);
        System.out.println("短路||与逻辑|课后作业:猜结果");
        int x = 5;
        int y = 5;
        if(x++==5 | ++y==5){
            x = 11;
        }
        System.out.println("x="+x+"y="+y);//11,6
        int x1 = 5;
        int y1 = 5;
        if(x1++==5 || ++y1==5){
            x1 = 11;
        }
        System.out.println("x1="+x1+"y1="+y1);//11,5
        System.out.println("===========混合==============");
        boolean x2 = true;
        boolean y2 = false;
        short z = 46;
        if((z ++ == 46) && (y2 = true)){
            z++;
        }
        if((x2 = false) || (++z == 49)){
            z++;
        }
        System.out.println("z="+z);



    }

}
//==========================================逻辑非与逻辑异或的使用=================================================
class InverseOperator{
    public static void main(String[] args){
        System.out.println("==========逻辑非!的使用:取反============");
        System.out.println(80<90);
        System.out.println(!(80<90));
        System.out.println("==========逻辑异或^的使用:两边结果不同时为True否则为False");
        boolean a = (10 > 20) ^ (10 < 20);
        boolean b = (20 > 30) ^ (10 > 20);
        boolean c = (10 < 20) ^ (20 < 30);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
//================================================赋值运算符的使用===========================================
    class AssignOperator{
        public static void main(String[] args){
            int a = 10;
            a += 2;
            System.out.println(a);
            a /= 3;
            System.out.println(a);
            //复合赋值运算符会进行类型转换
            byte b = 3;
            //b = b + 1；错误
            b += 1;//等价于b = (byte)b + 1
            b++;//等价于b = (byte)b + 1
            System.out.println(b);
        }


    }
    //=========================================================三元运算符的使用=================================================
    class  TernaryOperator{

        public static void main(String[] args){
            int a = 10;
            int b = 99;
            int result = a > b ? a++ : b--;
            System.out.println(result);
            System.out.println(a);
            System.out.println(b);
            System.out.println("============找到三个数最大值=============");
            int c = 80;
            int d = 90;
            int e = 40;
            int result2 = (c > d ? c:d) ;
            int  result3 = result2 > e ? result2 : e;
            System.out.println("最大数为："+result3);
            System.out.println("================一条语句实现=================");
            int result4 = (c > d ? c:d) > e ? (c > d ? c:d) : e;
            System.out.println("最大数为："+result4);

        }
    }