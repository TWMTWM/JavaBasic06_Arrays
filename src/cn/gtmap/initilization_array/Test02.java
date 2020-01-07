package cn.gtmap.initilization_array;

public class Test02 {
	/**
	 * 分配空间，同时赋值
	 * @param args
	 */
	public static void main(String[] args) {
		//写法一： 分配空间同时赋值
		int[] a = new int[]{101,102,103,104,105};
		//写法二： 省略了new int[],效果一样
		int[] b = {100,200,300,400,500};
        //写法三：同时分配空间，和指定内容
        //在这个例子里，长度是3，内容是5个，产生矛盾了
        //所以如果指定了数组的内容，就不能同时设置数组的长度
		//int[] c = new int[3]{100,200,300,400};
		//int[] d = new int[2]{100,200};
	}

}
