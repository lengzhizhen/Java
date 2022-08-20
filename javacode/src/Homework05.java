import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Scanner;

public class Homework05 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    }
}
class for01{
    public static void main(String[] args){
        /**
         * for(1.循环变量的初始化;2.循环条件;4.循环变量的迭代){
         *      3.循环操作(可以是多条语句)
         * }
         */
        for(int i=1 ; i <= 10 ; i++){
            System.out.println("生如逆旅一苇以航");
        }
        /**死循环
        for(int j = 1 ; ;){
            System.out.println("OK?"+(j++));
        }
         **/
        int count = 3;
        for(int i = 0 , j = 0 ; i < count ; i++ , j+=2){
            System.out.println("i="+i+","+"j="+j);
        }

    }
}

class for02{
    public static void main(String[] args){
        /**
         *  打印1-100之间能被9整除的整数，并求出个数及总和
         *  思路分析：
         *  1.完成输出1-100的值
         *  2.在输出的过程中，进行过滤只输出9的倍数，i%9==0
         *  3.统计个数定义一个变量int count=0,当条件满足时,count++
         *  4.总和，定义一个变量int sum=0,当满足条件时，sum+=i
         *
         * 建立编程思想
         *  1.为了适应更好的需求，把范围开始的值和结束的值做成变量
         *  2.还可以更进一步，9的倍数也做成变量
         *
         */
        int count = 0;
        int sum = 0;
        int start = 1;
        int end = 100;
        int t = 9;
        for(int i = start ; i <= end ;i++){
            if (i % t == 0) {
                System.out.println("i=" + i);
                count ++;
                sum += i;
            }
        }
        System.out.println("一共有"+count);
        System.out.println("总和为"+sum);

    }
}

class for03{
    public static void main(String[] args){
        /**
         * 先输出0-5
         * 后面的+是5-i
         *
         * 编程思想
         * 5替换成变量n
         */
        int n = 10;
        for (int i=0 ; i <= n;i++){
            System.out.println(i + "+"+(n-i)+"="+n);
        }
    }
}

class while01{
    public static void main(String[] args){
        int i = 1;//循环变量初始化
        while(i<=10){//循环条件
            System.out.println("生如逆旅一苇以航"+i);//执行语句
            i++;//循环变量迭代
        }
    }
}

class while02{
    public static void main(String[] args){
        System.out.println("1-100之间所有能被三整除的数:");
        int i = 1;
        while (i <= 100){
            if(i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }
        System.out.println("40-200之间所有偶数:");
        int j = 40;
        while(j <= 200){
            if(j % 2 == 0){
                System.out.println(j);
            }
            j++;
        }
    }
}

class do_while01{
    public static void main(String[] args){
        //1.打印1-100
        System.out.println("打印1-100");
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while (i <= 100);
        System.out.println("计算1-100的和");
        int j = 1;
        int sum = 0;
        do{
            sum += j;
            j++;
        }while (j <= 100);
        System.out.println("1-100的和为"+sum);
        System.out.println("1-200能被5整除但不能被3整除的数");
        int k = 1;
        int count = 0;
        do {
            if(k % 5 == 0 && k % 3 != 0){
                System.out.println(k);
                count++;
            }
            k++;
        }while (k <= 200);
        System.out.println("有"+count+"个");

    }
}

class do_while02{
    public static void main(String[] args){
        //如果李三不还钱一只使出五连鞭，直到李三说y还钱为止
        Scanner scanner = new Scanner(System.in);
//        for (; ;){
//            System.out.println("老韩问还钱么?y/n");
//            char i = scanner.next().charAt(0);
//            if(i != 'y'){
//                System.out.println("五连鞭");
//            }else if(i == 'y'){
//                System.out.println("再见");
//                break;
//            }
//        }
        char answer = ' ';
        do {
            System.out.println("老韩使出五连鞭~");
            System.out.println("老韩问还钱么?y/n");
            answer = scanner.next().charAt(0);
            System.out.println("它的回答是"+answer);

        }while (answer != 'y');
    }
}

class for_for01{
    /**
     * 执行流程：
     * 强调：1.执行1,2,3,4，5，6之后，在内层循环进行执行直到不满足4的循环条件，开始跳到外层循环然后再重复第二轮，依次内推
     *      2.循环操作执行的次数等于外层循环的次数乘以内层循环的次数
     * for(1.循环变量的初始化;2.循环条件;7.循环变量的迭代){
     *      for(3.循环变量的初始化;4.循环条件;6.循环变量的迭代){
     *               5.循环操作(可以是多条语句)
     *         }
     *     }
     */
    public static void main(String[] args){
        for(int i = 0 ; i < 2 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                System.out.println("i="+i+"j="+j);
            }
        }
    }

}


class for_for02{
    public static void main(String[] args){
        /**
         * 1.统计三个班的成绩情况，每个班有五名同学，求出各个班的平均分和所有班级的平均分（学生的成绩从键盘输入）
         * 2.统计三个班的及格人数每个班有五名同学
         *
         * 思路分析：
         * (1)先计算一个班，5个学生的成绩和平均分
         * 1.1创建一个Scanner对象，接收用户输入
         * 1.2得到该班级平均分，定义一个double sum把该班级五个学生的成绩累积起来
         *
         * (2)统计三个班的平均分
         *
         * (3)所有班级的平均分
         * 3.1定义一个变量，double totalScore累积所有学生的成绩
         * 3.2当多重循环结束后， totalScore/15
         *
         * (4)统计三个班的及格人数
         * 4.1定义一个变量int passNum = 0 ,当有一个学生的成绩大于等于60 passNum++
         */
        Scanner scanner = new Scanner(System.in);
        double totalScore = 0;//累积所有学生的成绩
        int passNum = 0;
        for(int i = 1 ; i <= 3 ; i++) {
            double sum = 0;//一个班级的总分
            for (int j = 1; j <= 5; j++) {
                System.out.println("请输入第"+i+"个班" + j + "个学生的成绩");
                double score = scanner.nextDouble();
                System.out.println("成绩是" + score);
                if(score >= 60){
                    passNum++;
                }
                sum += score;
            }
            System.out.println("sum="+sum+",平均分为"+sum/5);
            //把sum累积到totalScore
            totalScore += sum;
        }
        System.out.println("三个班总分"+totalScore+"的平均分为："+totalScore/15);
        System.out.println("三个班的及格人数为："+passNum);


    }
}

class for_for04{
    public static void main(String[] args){
        for (int i = 0 ; i <= 9 ; i++){
            for (int j = 1 ; j <= i ; j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println( );//换行
        }
    }
}

class Star{
    public static void main(String[] args){
        /**
         * 打印空心金字塔
         * 1.先打印一个矩形(5*5)
         *      *****
         *      *****
         *      *****
         *      *****
         * 2.打印半个金字塔(层数与每层个数对应)
         *          *       1层1个
         *          **      2层2个
         *          ***     3层3个
         *          ****    4层4个
         *          *****   5层5个
         *3.打印整个金字塔(每层个数=层数*2-1，空格个数=5-当前层数)
         *          *       1层1个   有4个空格
         *         ***      2层3个   有3个空格
         *        *****     3层5个   有2个空格
         *       *******    4层7个   有1个空格
         *      *********   5层9个   有0个空格
         *
         * 4.打印空心金字塔(当前行的第一位置为* ， 最后一个位置为*，最后一层全部为*，当第五层全部输出*)
         *        *        1层1个   有4个空格
         *       * *       2层2个   有3个空格
         *      *   *      3层2个   有2个空格
         *     *     *     4层2个   有1个空格
         *    *********    5层9个   有0个空格
         */
        System.out.println("实心矩形");
        for (int i = 1 ; i <= 5;i++){//i表示层数
            for (int j = 1 ; j <= 5 ; j++){//j表示每层的个数
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\t");
        System.out.println("半个实心金字塔");
        for (int i = 1 ; i <= 5;i++){//i表示层数
            for (int j = 1 ; j <= i ; j++){//j表示每层的个数
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("整个实心金字塔");
        System.out.println("\t");

        for (int i = 1 ; i <= 5;i++){//i表示层数
            for (int k = 1 ; k <= 5 - i ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {//j表示每层的个数
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println("空心金字塔");
        System.out.println("请输入空心金字塔的层数：");
        Scanner scanner = new Scanner(System.in);
        int totalLevel = scanner.nextInt();
        for (int i = 1 ; i <= totalLevel ; i++){
            for (int k = 1 ; k <= totalLevel - i ; k++){
                System.out.print(" ");
            }
            for (int j = 1 ; j <= 2 * i - 1 ; j++){
                if (j == 1 || j == 2 * i - 1 || i == totalLevel) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

class break01{
    public static void main(String[] args){
        int count = 0;
        for(;  ; ){
            System.out.println((int)(Math.random()*100+1));
            if ((int)(Math.random()*100+1) == 97){
                System.out.println("找到97啦");
                break;
            }else {
                count++;
            }
        }
        System.out.println("第"+count+"次找到97");
    }
}

class break02{
    public static void main(String[] args){
        for (int i = 0 ; i < 10 ; i++){
            if(i == 3){
                break;
            }
            System.out.println("i = "+i);
        }
        System.out.println("中止for循环，继续执行程序");
    }
}

class label{
    public static void main(String[] args){
        /**
         * 1.break语句中出现多层嵌套语句块时，可以通过标签指明中止哪一层语句块
         * 2.标签的基本使用
         * label1：{
         *     label2：{
         *        label3：{
         *              break label3;
         *              }
         *              }
         *           }
         * 1).break语句可以指定退出那层
         * 2).label1是标签，名字由程序员定
         * 3).break后指定到哪个label就退出到哪里
         * 4).在实际开发中尽量不要使用标签
         * 5).如果没有指定的break，默认退出最近的循环体就好
         */
        label1:
        for (int i = 0 ; i < 4 ; i++){
            label2:
            for (int j = 0 ; j < 10 ; j++){
                if(j == 2){
                    break label2;
                }
                System.out.println("j = "+j);
            }
        }
    }
}

class break03{
    public static void main(String[] args){
        /**
         * 1-100内的数求和，求出当求出的和第一次大于20的当前数
         *
         * 思路分析：
         * 1.循环1-100，求和sum
         * 2.当sum>20时记录下当前数
         * 3.也可以写在外面在外部定义一个变量满足条件时赋值
         */
        int n = 0;
        int sum = 0;
        for (int i = 1 ; i <= 100 ; i++){
            sum += i;
            if(sum > 20){
                System.out.println("和>20的时候当前数为："+i);
                n = i;
                break;
            }
        }
        System.out.println("和>20的时候当前数为："+n);
    }
}

class break04{
    public static void main(String[] args){
        /**
         * 实现登录验证，有三次机会，如果用户名为丁真，密码为666，提示登陆成功，否则提示还有几次机会
         *
         * 思路分析：
         * 1.创建Scanner对象接收用户输入
         * 2.定义String name;String password
         * 3.最多循环3次[登录三次]，如果满足条件就提前退出
         * 4.定义一个变量int chance记录还有几次登陆机会
         */

        Scanner scanner = new Scanner(System.in);
        String name = "";
        String passwd = "";
        int chance = 3;//登陆一次减少一次
        for (int i = 1 ; i <= 3 ; i++){
            System.out.println("请输入名字：");
            name = scanner.next();
            System.out.println("请输入密码：");
            passwd = scanner.next();
            //比较名字和密码与内容是否相等
            //字符串比较使用equal
            if ("丁真".equals(name) && "666".equals(passwd)){
                System.out.println("恭喜你登陆成功");
                break;
            }
            //登录机会减少
            chance--;
            System.out.println("你还有"+chance+"次机会");

        }
    }
}

class continue01{
    public static void main(String[] args){
        //break语句用于中止某个语句块的执行
        //continue语句：用于结束本次循环，继续执行下一次循环
        //当return用在方法，表示跳出方法，如果使用在main,表示退出程序
        int i = 1;
        while (i <= 4){
            i++;
            if(i == 2){
                continue;
            }
            System.out.println("i="+i);
        }
    }
}

class continue02{
    public static void main(String[] args){
        label1:
        for (int i = 0 ; i < 4 ; i++){
            label2:
            for (int j = 0 ; j < 10 ; j++){
                if (j == 2){
                    continue label1;
                }
                System.out.println("j = "+j);
            }
        }
    }
}

class Homework1{
    public static void main(String[] args){
        /**
         * 某人有100000元，每经过一次路口需要缴费，规则如下：
         *1.当现金>50000时，每次交5%
         * 2.当现金<=50000时，每次交1000
         * 编程算该人可以经过多少次路口，使用while,break解决
         *
         * 思路分析：
         * 1.定义一个double money保存100000
         * 2.根据题的要求分析出来三种情况 money > 50000 , money >=  1000 && money <= 50000 ,money < 1000
         * 3.使用多分支if_else if_else
         * 4.while+break(money < 1000],同时使用一个变量count来保存通过的路口
         */
        double money = 100000;//剩余的钱
        int count = 0;//累积过得路口
        while (true){
            if (money > 50000){
                //money = money - money * 0.05;
                money *= 0.95;//过了这个路口，还有这么多钱
                count ++;
            }else if (money >= 1000){
                money -= 1000;
                count ++;
            }else { //钱不够
                break;
            }
        }
            System.out.println("100000可以过"+count+"路口");
    }
}

class Homework2{
    public static void main(String[] args){
        //实现判断一个整数大于0，小于0，等于0
        System.out.println("请输入一个整数:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0){
            System.out.println("大于0");
        }else if (number == 0){
            System.out.println("等于0");
        }else {
            System.out.println("小于0");
        }
    }
}

class Homework3{
    public static void main(String[] args){
        /**
         * 判断一个整数是否为水仙花数，水仙花数是指一个三位数，其各个位上数字的立方等于其本身
         * 例如：153 = 1*1*1+3*3*3+5*5*5
         *
         * 思路分析：
         * 1.比如 int n = 153;
         * 2.先得到n的百位，十位，个位上的数
         * 3.n的百位 = n/100;
         * 4.n的十位 = n%100/10
         * 5.n的个位 = n%10
         * 6.判断即可
         */
//        int n = 153;
//        int n1 = n / 100;
//        int n2 = n % 100 / 10;
//        int n3 = n % 10;
//        if(n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3 == n){
//            System.out.println("是水仙花数");
//        }else {
//            System.out.println("不是水仙花数");
//        }
        for (int n = 100 ; n < 1000 ; n++){
            int n1 = n / 100;
            int n2 = n % 100 / 10;
            int n3 = n % 10;
            if(n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3 == n) {
                System.out.println(n);
            }
        }
    }
}

class Homework4{
    public static void main(String[] args){
        //输出1-100之间不能被5整除的数，每5个一行
        int count = 0;
        for (int i = 1 ; i <= 100 ; i++){
            if (i % 5 != 0){
                count++;
                System.out.print(i + "\t");
                if (count % 5 == 0){
                    System.out.println("\r");
                }
            }
        }
    }
}

class Homework5{
    public static void main(String[] args){
        //输出小写的a-z以及大写的Z-A
        for(char c1 = 'a' ; c1 <= 'z' ; c1++){
            System.out.print(c1+" ");
        }
        System.out.println("\r");
        for (char c2 = 'Z' ; c2 >= 'A' ; c2--){
            System.out.print(c2 + " ");
        }
    }
}

class Homework6{
    public static void main(String[] args){
        /**
         * 求出1-2/1+1/3-1/4...1/100的和
         *
         * 分析：
         * 1.一共有100个数，分子为1，分母为从1-100
         * 2.当分母为奇数时，前面是+，当分母为偶数时，前面是-
         * 3.把累计的结果放在double sum
         * 4.这里有一个隐藏的条件，把公式分子1写成1.0才能精确到小数，要不然除了第一个数是1后面的数相除全是0
         */
        double sum = 0;
        for (int i = 1 ; i <= 100 ; i++){
            //判断是奇数还是偶数，做不同的处理
            if (i % 2 != 0){//分母为奇数
                sum += 1.0/i;
            }else {//分母为偶数
                sum -= 1.0/i;
            }
        }
        System.out.println("sum="+sum);
    }
}

class Homework7{
    public static void main(String[] args){
        /**
         * 求1+(1+2)+(1+2+3)+(1+2+3+4)+...(1+2+3+...+100)
         *
         * 分析:
         * 1.一共有100项相加
         * 2.每一项数字逐渐相加
         */
        int sum = 0;
        for (int i = 1 ; i <= 100 ; i++) {//i可以表示是第几项，同时也是当前项的最后一个数字
            for (int j = 1; j <= i; j++) {//内层对1-i进行循环
                sum += j;
            }
        }
        System.out.println("sum="+sum);
        }

    }
