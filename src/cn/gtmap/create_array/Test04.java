package cn.gtmap.create_array;

/**
 * 数组长度
 * @author Administrator
 *
 */
public class Test04 {
	public static void main(String[] args) {
		int[] a;
		a = new int[5];
		System.out.println(a.length);
		a[4] = 100;//下标4，实质上是“第5个”，即最后一个
		a[5] = 101;//下标5，实质上是“第6个”，超出范围 ,产生数组下标越界异常
	}

}
