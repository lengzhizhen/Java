import javafx.application.Application;
import javafx.stage.Stage;

class TwoDimensionalArray01{
    public static void main(String[] args){
        /**
         * 请用二维数组输出如下：
         *
         * 0 0 0 0 0 0
         * 0 0 1 0 0 0
         * 0 2 0 3 0 0
         * 0 0 0 0 0 0
         */

        //1.定义形式 int[][]
        //2.可以这样理解一维数组的每个元素是一维数组
        int[][] arr = {{ 0 , 0 , 0 , 0 , 0 , 0 } , { 0 , 0 , 1 , 0 , 0 , 0} , { 0 , 2 , 0 , 3 , 0 , 0} , { 0 , 0 , 0 , 0 , 0 , 0}};
        //遍历二维数组每个元素
        for (int i = 0 ; i < arr.length ; i++){
            //1.arr[i]：表示二维数组里面i+1个元素，比如arr[0]表示二维数组第一个元素{ 0 , 0 , 0 , 0 , 0 , 0 }
            //2.arr[i].length:得到对应的每个一维数组的长度
            for (int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        /**
         * 总结：
         * 1.访问二维数组的元素个数arr.length
         * 2.二位数组的每个元素是一维数组，索引如果需要得到每个一维数组的值还需要再次遍历
         * 3.如果我们要访问第(i+1)个一维数组的第(j+1)的值arr[i][j]
         * 比如访问上面的3，它是第3个一维数组的第4个值  arr[2][3]
         */

    }
}


class TwoDimensionalArray02{
    public static void main(String[] args){
        /**
         * 二维数组的动态初始化：
         * 类型[][] 数组名 = new 类型[有多少个一维数组][一维数组内元素的个数];
         * int[][] arr = new int[2][3];
         */
        int[][] arr = new int[2][3];
        arr[1][1] = 8;
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr[i].length ; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

}

class TwoDimensionalArray03{
    public static void main(String[] args){
        int[][] arr = new int[3][];//创建二维数组，只确定一维数组的个数
        for (int i = 0 ; i < arr.length ; i++){ //遍历arr每个一维数组
            arr[i] = new int[i + 1];//给每个一维数组开空间，如果没有给一维数组开空间new，那么arr[i]=null
            for (int j = 0 ; j < arr[i].length ; j++){//遍历一维数组并给每个一维数组赋值
                arr[i][j] = i + 1;
            }
        }
        for (int i = 0 ; i < arr.length ; i++){//遍历arr输出
            for (int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

class YangHui{
    public static void main(String[] args){
        int[][] YangHui = new int[10][];
        for (int i = 0 ; i < YangHui.length ; i++){
            YangHui[i] = new int[i+1];
            for (int j = 0 ; j < YangHui[i].length ; j++){
                if (j == 0 || j == YangHui[i].length-1){
                    YangHui[i][j] = 1;
                }else {
                    YangHui[i][j] = YangHui[i-1][j] + YangHui[i-1][j-1];
                }
            }
        }
        for (int i = 0 ; i < YangHui.length ; i++){
            for (int j = 0 ; j < YangHui[i].length ; j++){
                System.out.print(YangHui[i][j]+" ");
            }
            System.out.println();
        }
    }
}