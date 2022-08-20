import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Scanner;
/**
 * 值传递和引用传递
 * 1.值传递在swap方法里面交换了两个数的值，在主方法里面两个数的值不会交换，他们对应的是两个栈
 * 2.引用传递指向的是地址，数组在堆中存储，主方法和arr方法都指向arr数组当改变数组里面的值，主方法和arr方法数组的值都会改变
 */
public class Homework09 {
    public static void main(String[] args){
        int a = 10 ;
        int b = 20 ;
        MethodParameter01 methodParameter01 = new MethodParameter01();
        methodParameter01.swap(a,b);
        System.out.println("主方法里面a="+a+",b="+b);

        int arr[] = {1,2,3};
        methodParameter01.arr(arr);
        System.out.println("主方法里面的arr数组：");
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        test100 p = new test100();
        p.name = "lzz";
        p.age = 22;
        methodParameter01.test200(p);
        System.out.println(p.age);
    }
}

class test100{
    String name;
    int age;
}
class MethodParameter01{
    public void test200(test100 p){
       // p.age = 200;
        p = null;
    }
    public void swap(int a , int b){
        System.out.println("没有交换之前a="+a+",b="+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("交换之后a="+a+",b="+b);
    }

    public void arr(int arr[]){
        arr[0] = 100;
        System.out.println("MethodParameter01方法里面的数组：");
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

//对象的克隆
class MethodParameter02{
    public static void main(String[] args){
        Tig T = new Tig();
        T.name = "LZZ";
        T.age = 22;
        MyTools myTools = new MyTools();
        Tig T2 = myTools.copyTig(T);
        T2.name = "图图";
        System.out.println("T属性"+T.name+" "+T.age);
        System.out.println("T2属性"+T2.name+" "+T2.age);
    }
}


class Tig{
    String name;
    int age;
}

class MyTools{
    public Tig copyTig(Tig T){
        Tig T2 = new Tig();
        T2.name = T.name;
        T2.age = T.age;
        return T2;
    }
}

//递归
class Recursion01{
    public static void main(String[] args){

        T t = new T();
        t.test(4);
        Scanner scanner = new Scanner(System.in);
        System.out.println("求出第n位阶乘");
        int res = scanner.nextInt();
        System.out.println("res = " + t.factorial(res));
        System.out.println("请输入第n,得出对应的斐波那契");
        int n = scanner.nextInt();
        System.out.println("当n = "+n+"时，对应的斐波那契数列为："+t.fibonacci(n));
        System.out.println("猴子吃桃问题,请输入天数：");
        int day = scanner.nextInt();
        int peachNum = t.peach(day);
        if (peachNum != -1) {
            System.out.println(day + "天猴子吃了" + peachNum + "桃");
        }
    }
}

class T{
    public void test(int n){
        if (n > 2){
            test(n - 1);
        }
        System.out.println("n="+n);
    }

    //阶乘
    public int factorial(int n){
        if (n == 1){
            return 1;
        }else {
            return factorial(n-1) * n;
        }
    }
    //菲波那切数列
    public int fibonacci(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        } else {
            System.out.println("请重新输入");
            return -1;
        }
    }

    //猴子吃桃子问题
    public int peach(int day){
        if (day == 10){
            return 1;
        }if (day >= 1 && day <= 9){
            return   (peach(day+1)+1) * 2 ;
        }else {
            System.out.println("输入错误猴子没桃吃！！！");
            return -1;
        }
    }

}

class MiGong{
    public static void main(String[] args){
        int[][] map = new int[8][7];
        /**老鼠出迷宫问题，0表示可以走，1表示障碍物
         * 最上面和最下面，最左面和最右面都是障碍物
         * 第四行的第二列和第三列是障碍物
         */
        for (int i = 0 ; i < 7 ; i++){
            map[0][i] = 1;
            map[7][i] = 1;
        }
        for (int i = 0 ; i < 8 ; i++){
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        map[2][2] = 1;//测试回溯
        System.out.println("=================当前数组情况=================");
        for (int i = 0 ; i < map.length ; i++){
            for (int j = 0 ; j < map[i].length ; j++){
                System.out.print(map[i][j]+" ");

            }
            System.out.println();
        }
        //使用findWay给老鼠找路
        success s = new success();
        s.findWay(map,1,1);
        System.out.println("============找路情况==============");
        for (int i = 0 ; i < map.length ; i++){
            for (int j = 0 ; j < map[i].length ; j++){
                System.out.print(map[i][j]+" ");

            }
            System.out.println();
        }
    }
}

class success{
    /**
     *1.findWay方法就是专门找出迷宫的路径
     * 2.如果找到就返回true,否则返回false
     * 3.map表示二维数组也就是迷宫
     * 4.i,j表示老鼠的位置初始位置是（1,1）
     * 5.因为是递归找路，所有先规定map数组各个值的含义
     * 0：表示可以走  1：表示障碍物   2：表示可以走的路   3：表示走过，但是走不通是死路
     * 6.当map[6][5]=2就说明走通路了，就可以结束了否则继续找
     * 7.先确定老鼠找路策略  下->右->上->左
     */
    public boolean findWay(int[][] map , int i , int j){
        if (map[6][5] == 2){//说明已经找到
            return true;
        }else {
            if (map[i][j] == 0){//当前这个位置0，表示可以走
                //假定可以走通
                map[i][j] = 2;
                //我们使用找路策略，来确定是否真的可以走通
                //下->右->上->左
                if (findWay(map,i+1 ,j)){//先走下
                    return true;
                }else if (findWay(map , i , j+1)){//右
                    return true;
                }else if (findWay(map , i-1 , j)){//上
                    return true;
                }else if (findWay(map , i , j-1)){//左
                    return true;
                }else {
                    map[i][j] = 3;
                    return false;
                }
            }else {//map[i][j] = 1,2,3
                return false;
            }
        }

    }
}

class HanoiTower{
    public static void main(String[] args){
        Tower tower = new Tower();
        tower.move(5 , 'A' , 'B' ,'C');

    }
}

class Tower{
    //num表示移动个数，a,b,c表示三个塔
    public void move(int num , char a , char b , char c){
        //如果只有一个盘
        if (num == 1){
            System.out.println(a + "->" + c);
        }else {
            //如果有多个盘，可以看成两个，最下面的和上面的所有盘
            //1）先移动上面的所有盘到b，借助c
            move(num -1 , a , c ,b);
            //2)把最下面的盘子，移动到c
            System.out.println(a+"->"+c);
            //3）在把b塔所有盘移动到c,借助a
            move(num-1,b , a , c);
        }

    }

}