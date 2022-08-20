import javafx.application.Application;
import javafx.stage.Stage;

public class Homework01 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //1.编写Hello,World的程序
        System.out.println("Hello,World!");
        //2.将个人基本信息（姓名，性别，籍贯，住址）打印到控制台上输出
        System.out.println("姓名\t性别\t籍贯\t住址\n图图\t男\t襄阳\t北京");
        //3.JDK,JVM和JRE的关系
            //1.JDK=JRE+开发工具集
            //2.JRE=JVM+Java核心类库
        //4.环境变量path配置及其作用
            //1.环境变量的作用是为了在dos任意目录下,可以去使用java和javac命令
            //2.先配置JAVA_HOME=指向JDK安装的主目录
            //3.配置path环境变量，增加%JAVA_HOME%\bin
    }


    }
    class Test {
        public static void main(String[] arges) {

            //变量的使用
            int a = 1;
            int b = 2;
            b = 520;
            System.out.println(a);
            System.out.println(b);
            //数据类型
            String name = "冷志真";

            int age = 22;
            double score = 99.5;
            char sex = '男';
            System.out.println("个人信息如下:");
            System.out.println("姓名:" + name);
            System.out.println("年龄:" + age);
            System.out.println("性别:" + sex);
            System.out.println("分数:" + score);

            /**
             * 基本数据类型：1.整数类型：byte(1),short(2),int(4),long(8)
             * 2.浮点型：单精度float(4),双精度double(8)
             * 3.布尔型：boolean(1),存放false,true
             * 引用数据类型：1.类（class）2.接口（interface）3.数组（[]）
             */
        }
    }

    class NumDetail{

    public static void main (String[] arges){
        System.out.println("===============整数类型案例演示===============");
        //整数类型
        byte num1 = 1;
        short num2 = 2;
        int num3 = 4;
        long num4 = 8;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        long num5 = 3L;
        //int num6 = 3L;不对，long字节大于int无法转换
        System.out.println(num5);
        System.out.println("===================浮点型案例演示=====================");
        //浮点型
        double num7 = 3.5;
        float num8 = 3.5F;
        System.out.println(num7);
        System.out.println(num8);
        double num9 = 0.5;
        double num10 = 1.5/3;
        if(Math.abs(num9-num10)<0.00001){
            System.out.println("成立");
        }
        double num11 = 3.5;
        double num12 = 3.5;
        if (num11 == num12){
            System.out.println("成立");
        }
        System.out.println("====================字符型案例演示=======================");
        //字符类型
        char a = 95;
        char b = '\t';
        char c = 'c';
        char d = '冷';
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println((int)d);
        System.out.println(a);
        System.out.println("============================布尔型案例演示===========================");
        //布尔类型
        boolean pass = true;
        if(pass){
            System.out.println("考试通过");
        }else {
            System.out.println("考试未通过");
        }
        System.out.println("============================类型转换案例演示======================================");
        int n1 = 10;
        System.out.println(n1);
        byte n2 = 10;
        System.out.println(n2);
        float d1 = n1 + 1.2F;
        System.out.println(d1);
        byte s1 = 1;
        short s2 = 2;
        int s3 = 3;
        float s4 = 4;
        double s5= s1 + s2 + s3 + s4;
        System.out.println(s5);
        System.out.println("==============强制类型转换===================");
        int w = (int)1.9;
        System.out.println(w);//精度缺失
        int w1 = 2000;
        byte w3 = (byte)w1;//数据溢出
        System.out.println(w3);
        int x = (int)(1.2*10+255+2.2);
        System.out.println(x);
        System.out.println("==============基本类型转换成String================");
        int k = 123;
        float k1 = 123f;
        boolean k2 = true;
        double k3 = 123;
        String Q = k + "";
        String Q1 = k1 + "";
        String Q2 = k2 + "";
        String Q3 = k3 + "";
        System.out.println(Q);
        System.out.println(Q1);
        System.out.println(Q2);
        System.out.println(Q3);
        System.out.println("==============String转换成基本类型================");
        String s7 = "123";
        int number1 = Integer.parseInt(s7);
        double number2 = Double.parseDouble(s7);
        float number3 = Float.parseFloat(s7);
        long number4 = Long.parseLong(s7);
        short number5 = Short.parseShort(s7);
        byte number6 = Byte.parseByte(s7);
        boolean number7 = Boolean.parseBoolean("true");
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(number5);
        System.out.println(number6);
        System.out.println(number7);
        System.out.println(s7.charAt(0));




    }
    }


