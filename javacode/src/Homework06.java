import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Scanner;

public class Homework06 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    }
}
class Array01{
    public static void main(String[] args){
        /**
         * 1.double[]表示是double类型的数组，数组名是hens
         * 2.{1,2,3,4,5,6}表示数组的值/元素，依次表示数组的第几个元素
         */
        double[] hens = {1,2,3,4,5,6};

        /**
         * 遍历数组得到所有数组的和，使用for
         * 1.我们可以通过hens[下标]来访问数组的元素
         * 下标从0开始编号的比如第一个元素就是hens[0]
         * 第二个元素就是hens[1],以此内推
         * 2.通过fou对数组的各个元素进行遍历
         * 3.数组的长度 = 数组名.length
         */
        double totalWeight = 0;
        for (int i = 0 ; i < hens.length ; i++){
            System.out.println("第"+(i+1)+"只鸡的体重为："+hens[i]);
            totalWeight += hens[i];
        }
        System.out.println("总体重为"+totalWeight+"\r"+"平均体重为:"+totalWeight/hens.length);

    }
}

//数组的定义
class Array02{
    public static void main(String[] args){
        /**
         * 数组的动态初始化：
         * 1.数组的定义：
         * 动态初始化：
         * 1-1: 数据类型 数组名[] = new 数据类型[大小];  []可以放在数据类型后面也可以放在数组名后面
         * int a[] = new int[5];
         *
         * 1-2: 先声明数组 数据类型 数组名[];也可以数据类型[] 数组名
         * int a[];int[] a;
         *
         *  创建数组：
         *  数组名 = new 数据类型[大小];
         *  a = new int[5];
         *
         *  静态初始化：
         *  数据类型 数组名[] = {元素值，元素值...};
         *  int a[] = {1,2,3,4}
         *  相当于 int a[] = new int a[4];
         *  a[0] = 1 ; a[1] = 2 ; a[2] = 3 ; a[3] = 4 ;
         *
         * 2.数组的引用：
         * 数组名[下标/索引/index]，比如使用数组a的第三个数a[2]
         * 下标从0开始
         */
        //循环输入五个成绩，保存到double数组，并输出
        double scores[] = new double[5];
        Scanner scanner = new Scanner(System.in);
        //使用fou循环输入值保存到数组
        for (int i = 0 ; i < scores.length ; i++){
            //double score = scanner.nextDouble();
            System.out.println("请输入"+(i+1)+"个分数：");
            //scores[i] = score;
            scores[i] = scanner.nextDouble();
        }
        //使用fou对数组进行遍历输出数组
        for (int i = 0 ; i < scores.length ; i++){
            System.out.println("第"+(i+1)+"个分数："+scores[i]);
        }
    }
}

//数组练习题
class Array03{
    //创建一个char类型数组，把A-Z存放进去在打印出来
    public static void main(String[] args){
        char a[] = new char[26];
        for (int i = 0 ; i < a.length ; i++){
            //a是a[]类型
            //a[i]是char类型
            a[i] = (char)('A'+i);//'A'+i是int类型，需要强制转换
        }
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(a[i]+" ");
        }
    }
}

class Array04{
    public static void main(String[] args){
        //输入十个数求出最大数以及它的下标
        int number[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0 ; i < number.length ; i++){
            //输入十个数保存到数组
            System.out.println("请输入"+(i+1)+"个数：");
            number[i] = scanner.nextInt();
        }
        int max = number[0];//最大数
        int maxIndex = 0;//最大数下标
        for (int i = 0 ; i < number.length ; i++){
            if(max < number[i]){//如果max < 当前元素
                max = number[i];//当前元素赋值给max
                maxIndex = i;
            }
        }
        System.out.println("最大数"+max+"\t"+"最大数下标"+maxIndex);
    }
}

//数据类型的值拷贝与数组的地址拷贝
class ArrayDetail{
    public static void main(String[] args){
        //基本数据类型赋值，赋值方式为值拷贝
        //n2的变化不会影响n1
        int n1 = 10;
        int n2 = n1;
        n2 = 20;
        System.out.println("n1="+n1);
        System.out.println("n2="+n2);

        //数组在默认情况下是引用传递，赋的值是地址，赋值方式是引用赋值
        //是一个地址arr2的变化会影响到arr1
        System.out.println("=================");
        int[] arr1 = {1,2,3};
        int[] arr2 = arr1;
        arr2[0] = 20;
        for (int i = 0 ; i < 3 ; i++){
            System.out.println(arr1[i]);
        }

    }
}

//数组拷贝
class ArrayCopy{
    public static void main(String[] args){
        int[] arr1 = new int[4];
        //创建一个新的数组
        int[] arr2 = new int[arr1.length];
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入数组arr1");
        //输入十个数保存到数组1
        for (int i = 0 ; i < arr1.length ; i++){
            System.out.println("请输入"+(i+1)+"个数：");
            arr1[i] = scanner.nextInt();
        }
        System.out.println("arr1的数组输出");
        //对数组1进行遍历并且把数组1每个元素赋给数组2
        for (int i = 0 ; i < arr1.length ; i++){
            System.out.println("arr1["+i+"]="+arr1[i]);
            arr2[i] = arr1[i];
        }
        //更改数组2的第一个元素不会影响数组1
        arr2[0] = 100;
        System.out.println("arr2的数组输出");
        //对数组2进行遍历
        for (int i = 0 ; i < arr2.length ; i++){
            System.out.println("arr2["+i+"]="+arr2[i]);
        }
    }
}

//找规律法输出：数组的逆序输出
class ArrayReverse{
    public static void main(String[] args){
        int[] arr1 = new int[5];
        //创建一个新的数组
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入数组arr1");
        //输入十个数保存到数组1
        for (int i = 0 ; i < arr1.length ; i++){
            System.out.println("请输入"+(i+1)+"个数：");
            arr1[i] = scanner.nextInt();
        }
        //for循环遍历arr1数组输出
        System.out.println("arr1数组输出");
        for (int i = 0 ; i < arr1.length ; i++){
            System.out.print(arr1[i]+" ");
        }
        int temp = 0;//临时变量用于交换
        int len = arr1.length;
        //要实现转换数组长度除以2次
        for (int i = 0 ; i < len/2 ; i++){
            temp = arr1[len-1-i];//最后一个数先报错到临时变量
            arr1[len-1-i] = arr1[i];
            arr1[i] = temp;
        }
        System.out.println("\r");
        System.out.println("arr1数组逆序输出：");
        for (int i = 0 ; i < len ; i++){
            System.out.print(arr1[i]+" ");
        }

    }
}

//逆序赋值法输出：数组的逆序输出
class ArrayReverse02 {
    public static void main(String[] args) {

        int[] arr1 = new int[5];
        //创建一个新的数组
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入数组arr1");
        //输入十个数保存到数组1
        for (int i = 0 ; i < arr1.length ; i++){
            System.out.println("请输入"+(i+1)+"个数：");
            arr1[i] = scanner.nextInt();
        }
        //for循环遍历arr1数组输出
        System.out.println("arr1数组输出");
        for (int i = 0 ; i < arr1.length ; i++){
            System.out.print(arr1[i]+" ");
        }
        /**
         * 使用逆序赋值方式
         *
         * 思路分析：
         * 1.创建一个新的数组arr2,大小arr1.length
         * 2.逆序遍历arr1,将每个元素拷贝到arr2
         *3.建议增加一个循环变量k-->0-->5
         */
        System.out.println("\r");
        System.out.println("arr1逆序输出");
        int arr2[] = new int[arr1.length];
        for (int j = arr1.length-1 , k = 0 ;  j >= 0 ; j-- , k++){
            arr2[k] = arr1[j];
        }
        //4.当for循环结束，arr2是一个逆序数组
        //5.当arr1指向arr2数据空间，此时arr1原来的数据空间就没有变量引用，会被销毁
        arr1 = arr2;
        for (int i = 0 ; i < arr1.length ; i++){
            System.out.print(arr1[i]+" ");
        }
    }
}

//对数组进行扩容（添加）
class ArrayAdd{
    /**
     * 原始数组使用静态进行分配，增加一个元素放在数组最后
     * 用户可以继续添加，添加成功，是否继续？y/n
     *
     * 思路分析：
     * 1.定义初始数组：int[] arr = {1,2,3};  下标0-2
     * 2.定义一个新的数组 int[] arrayNew = new int[arr.length+1]
     * 3.遍历arr数组，依次将arr元素拷贝到arrNew数组
     * 4.将4赋给arrNew[arrNew.length-1]=4   把4赋给arrNew最后一个元素
     * 5.让arr指向arrNew   arr=arrNew
     */
    //原始数组使用静态进行分配，增加一个元素放在数组最后
    //用户可以继续添加，添加成功，是否继续？y/n
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arrNew = new int[arr.length+1];
        System.out.println("arr数组");
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\r");
        System.out.println("向arr数组末尾加入4：");
        for (int i = 0 ; i < arr.length ; i++){
            arrNew[i] = arr[i];
        }
        arrNew[arrNew.length-1] = 4;
        arr = arrNew;
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
//对数组进行扩容（动态添加）
class ArrayAdd02{
        public static void main(String[] args){
        /**
         * 原始数组使用静态进行分配，增加一个元素放在数组最后
         * 用户可以继续添加，添加成功，是否继续？y/n
         *
         * 思路分析：
         * 1.定义初始数组：int[] arr = {1,2,3};  下标0-2
         * 2.定义一个新的数组 int[] arrayNew = new int[arr.length+1]
         * 3.遍历arr数组，依次将arr元素拷贝到arrNew数组
         * 4.将4赋给arrNew[arrNew.length-1]=4   把4赋给arrNew最后一个元素
         * 5.让arr指向arrNew   arr=arrNew
         * 6.创建一个Scanner接收用户输入
         * 7.使用do-wile+break判断用户什么时候退出
         */
        //原始数组使用静态进行分配，增加一个元素放在数组最后
        //用户可以继续添加，添加成功，是否继续？y/n
            Scanner scanner = new Scanner(System.in);
            int[] arr = {1, 2, 3};
            System.out.println("arr数组");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            do {
                int[] arrNew = new int[arr.length + 1];
                for (int i = 0; i < arr.length; i++) {
                    arrNew[i] = arr[i];
                }
                System.out.println("\r");
                System.out.println("你是否添加：y/n");
                String key = scanner.next();
                if ("y".equals(key)) {
                    System.out.println("请输入数字：");
                    int addNum = scanner.nextInt();
                    arrNew[arrNew.length - 1] = addNum;
                    arr = arrNew;
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    //你是否还要继续添加
                }else   if ("n".equals(key)){
                    break;
                }else {
                    System.out.println("输入错误请重新输入");
                }
            }while (true);
    }
}


//数组的缩容
class ArrayReduce{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3};
        System.out.println("arr数组");
        //使用for循环对数组进行遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\r");
        do {
            System.out.println("是否删除，y/n");
            String key = scanner.next();
            if ("y".equals(key)) {
                if (arr.length-1 == 0){//判断arr数组的下标是不是0，等于0退出
                    break;
                }
                int[] arrNew = new int[arr.length - 1];
                for (int i = 0; i < arrNew.length; i++) { //对新数组的下标进行遍历
                    arrNew[i] = arr[i];//数组拷贝
                }
                arr = arrNew;
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
            }else  if ("n".equals(key)){
                break;
            }else {
                System.out.println("输入错误请重新输入");
            }
        }while (true);

    }
}

//冒泡排序---从小到大
class BubbleSort{
    public static void main(String[] args) {
        /**
         * 冒泡排序：
         * 思路分析：
         * 数组[24,69,80,57,13]
         *
         * 第一轮排序：目标把最大的数放在最后：
         * 第1次比较[24,69,80,57,13]
         * 第2次比较[24,69,80,57,13]
         * 第3次比较[24,69,57,80,13]
         * 第4次比较[24,69,57,13,80]
         *
         * 第二轮排序：目标把第二大的数放在倒数第二的位置：
         * 第1次比较[24,69,57,13,80]
         * 第2次比较[24,57,69,13,80]
         * 第3次比较[24,57,13,63,80]
         *
         * 第三轮排序：目标把第三大的数放在倒数第三的位置：
         * 第1次比较[24,57,13,63,80]
         * 第2次比较[24,13,57,63,80]
         *
         * 第四轮排序：目标把第四大的数放在倒数第四的位置：
         * 第1次比较[13,24,57,63,80]
         *
         * 以上冒泡排序特点：
         *1.一共有五个元素进行了四轮排序，可以当做外层循环
         * 2.每一轮排序可以确定一个数的位置，比如第一轮排序确定最大数
         * 3.比较时，如果前面的数大雨后面的数就交换
         * 4.每轮比较在减少4-->3-->2-->1
         */

        int[] arr1 = new int[5];
        int Len = arr1.length;
        //创建一个新的数组
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入数组arr1");
        //输入十个数保存到数组1
        for (int i = 0 ; i < Len ; i++){
            System.out.println("请输入"+(i+1)+"个数：");
            arr1[i] = scanner.nextInt();
        }
        int temp = 0;
        for (int i = 0 ; i < Len-1 ; i++){//外层控制多少轮
            for (int j = 0 ; j < Len-1-i ; j++) {//内层控制每轮多少次
                if (arr1[j] > arr1[j + 1]) {
                    temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
            System.out.println("\n===第"+(i+1)+"轮===");
            for (int j = 0 ; j < Len ; j++){
                System.out.print(arr1[j]+" ");
            }
        }




    }   
}

//顺序查找
class SeqSearch{
    public static void main(String[] args) {
        String[] arr1 = new String[5];
        //创建一个新的数组
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入数组arr1");
        //输入十个数保存到数组
        for (int i = 0 ; i < arr1.length ; i++){
            System.out.println("请输入"+(i+1)+"个数：");
            arr1[i] = scanner.next();
        }
        for (int i = 0 ; i < arr1.length ; i++){
            System.out.print(arr1[i]+"\t");

        }
        System.out.println("\n");
        System.out.println("请输入需要查找的内容");
        String findName = scanner.next();
        int index = -1;//定义一个索引，如果满足条件进入到for循环值会改变
        for (int i = 0 ; i < arr1.length ; i++){
            if (arr1[i].equals(findName)){
                System.out.println("恭喜你找到了");
                System.out.println("下标为："+i);
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("没有找到");
        }

    }
}