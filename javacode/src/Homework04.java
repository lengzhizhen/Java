import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Scanner;

public class Homework04 extends Application {



    @Override
    //单分支if的使用
    public void start(Stage primaryStage) {
        System.out.println("请输入你的年龄");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >= 18){
            System.out.println("你年龄大于18要对自己负责，送入监狱");
        }
        System.out.println("程序继续");


    }
}

class if_else01{
    public static void main(String[] args){
        System.out.println("请输入你的年龄");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >= 18){
            System.out.println("你年龄大于18要对自己负责，送入监狱");
        }else {
            System.out.println("你的年龄小于18这次先放过你");
        }
        System.out.println("程序继续");

    }
}

class if_else02{
    public static void main(String[] args){
        int x = 7;
        int y = 8;
        if(x < 8){
            if (y < 7){
                System.out.println("YES?");
            }
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

        double a1 = 12.0;
        double a2 = 13.0;
        double a3;
        if (a1 > 10.0 && a2 < 20.0){
            System.out.println(a3 = a1 + a2);
        }

        int b1 = 10;
        int b2 = 5;
        if ((b1+b2) % 3 == 0 && (b1+b2) % 5 == 0){
            System.out.println("可以整除");
        }else {
            System.out.println("不可以整除");
        }
        System.out.println("请输入一个年份：");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 4 ==0 && year % 100 != 0 || year % 100 == 0){
            System.out.println("是闰年");
        }else {
            System.out.println("不是闰年");
        }


    }

}

class if_else_else{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的芝麻信用积分（1-100）：");
        double a = scanner.nextDouble();
        if(a >= 1 && a <= 100) {
            if (a == 100) {
                System.out.println("信用极好");
            } else if (a > 80 && a <= 99) {
                System.out.println("信用优秀");
            } else if (a > 60 && a <= 80) {
                System.out.println("信用一般");
            } else if (a <= 60) {
                System.out.println("信用不及格95");
            }
        }else {
            System.out.println("输入有误，请重新输入");
        }
    }
}

class if_else_else02{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入分数：");
        double grade = scanner.nextDouble();
        if(grade > 8.0){
            System.out.println("请输入性别");
            char sex = scanner.next().charAt(0);
            if (sex == '男'){
                System.out.println("进入男子组");
            }else if (sex == '女'){
                System.out.println("进入女子组");
            }else{
                System.out.println("你输入的性别有误不能进入决赛");
            }
        }else {
            System.out.println("淘汰");
        }

    }
}

class if_else_else03{
    /**
     *
     * @param args
     * 输入月份判断是否为旺季：旺季为4-10月，其他为淡季，旺季成人（18-60）票价60，小孩（<18半价），老人（>60）票价：1/3
     * 淡季：成人40，其它20
     * 思路：
     *1.输入一个月份：判断是否满足1-12这个区间，不是就月份输入错误
     * 2.成功的话就判断是否为淡季旺季
     * 3.然后在判断年龄，这里年龄设置了一个大区间1-100岁，在这个区间在根据年龄判断出票价
     */

    public static void main(String[] args){
        System.out.println("请输入月份：");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        if(month >= 1 && month <= 12){
            System.out.println("请输入年龄");
            int age = scanner.nextInt();
            if (month >=4 && month <= 10){
                System.out.println("现在是旺季");
                if (age >= 0 && age <= 100){
                    if (age < 18){
                        System.out.println("票价为"+60/2);
                    }else if(age >= 18 && age <= 60) {
                        System.out.println("票价为60");
                    }else if(age > 60){
                        System.out.println("票价为"+60/3);
                    }
                }else{
                    System.out.println("年龄输入错误");
                }
            }else {
                System.out.println("现在是淡季");
                if (age >= 0 && age <= 100){
                    if(age >= 18 && age <= 60) {
                        System.out.println("票价为60");
                    }else{
                        System.out.println("票价为20");
                    }
                }else{
                    System.out.println("年龄输入错误");
                }
            }
        }else {
            System.out.println("月份输入错误");
        }
    }
}

class switch01{
    public static void main(String[] args){
        System.out.println("请输入一个小写字母：");
        Scanner scanner = new Scanner(System.in);
        char week = scanner.next().charAt(0);
        switch (week){
            case 'a':
                System.out.println("星期一");
                break;
            case 'b':
                System.out.println("星期二");
                break;
            case 'c':
                System.out.println("星期三");
                break;
            case 'd':
                System.out.println("星期四");
                break;
            case 'e':
                System.out.println("星期五");
                break;
            case 'f':
                System.out.println("星期六");
                break;
            case 'g':
                System.out.println("星期日");
                break;
            default:
                System.out.println("输入错误");
                break;

        }
    }
}

class switch02{
    public static void main(String[] args){
        //a,b,c,d,e转换成大写
        System.out.println("请输入一个小写字母");
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().charAt(0);
        switch (letter){
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
            default:
                System.out.println("转换失败");

        }
    }
}

class switch03{
    public static void main(String[] args){
        //对学生成绩大于60的输入合格，小于60的成绩输入不合格（这里成绩不能大于100）
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个分数：");
        double score = scanner.nextDouble();
        if (score >= 0 && score <= 100){
            switch ((int) score/60){
                case 0:
                    System.out.println("不合格");
                    break;
                case 1:
                    System.out.println("合格");
                    break;
                default:
                    System.out.println("输入有误");
                    break;
            }
        }else {
            System.out.println("分数输入错误");
        }
    }
}

class switch04 {
    public static void main(String[] args) {
        //输入一个月份判断春夏秋冬（使用穿透）
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个月份：");
        int month = scanner.nextInt();
        switch(month){
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("月份输入不对，应该输入1-12");
                break;
        }

    }
}