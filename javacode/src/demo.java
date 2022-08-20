//这是java的快速入门，演示java的开发步骤
//对代码的相关说明
//1.public class Hello 表示Hello是一个类，是一个public公有类
//2.Hello{}表示一个类的开始和结束
//3.public static void main(String[] args)表示一个主方法，即我们程序的入口
//4.main(){}表示方法的开始和结束
//5.System.out.println("hello,world!");表示输出"hello,world"到屏幕
//6.；表示语句结束


public class demo {
	public static void main(String[] args) {
		System.out.println("Hello,World");
		//\t：一个制表位，实现对齐功能
		System.out.println("上海\t北京\t广东");
		//\n:换行符
		System.out.println("上海\n北京\n广东");
		System.out.println("书名\t\t作者\t\t价格\t\t销量\n三国\t\t罗贯中\t120\t\t1000");
		/**
		 * JVM:java虚拟机用来实现代码编译.class文件
		 * JRE=JVM+JAVA核心类库
		 * JDK=JVM+JAVA开发工具（java,javac,javap,javadoc）
		 * 相对路径：从当前目录开始定位形成的一个路径
		 * 绝对路径：从顶级目录d,开始定位形成的一个路径
		 * 需求：从abc\test200访问hello.txt
		 * 相对路径：..\..\abc2\test200\hello.txt
		 * 绝对路径：d:\abc2\test200\hello.txt
		 */
	}
}

//一个源文件中最多只能有一个public类，其他类的个数不限
//Dog是一个类
//编译后，每一个类都对应一个.class 
class Dog{
	public static void main(String[] args){
		System.out.println("Hello,小狗狗？");
	}

}

class Tiger{
	public static void main (String[] args){
		System.out.println("Hello,小老虎？");
	}

}