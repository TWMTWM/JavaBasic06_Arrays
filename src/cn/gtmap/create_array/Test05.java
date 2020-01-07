package cn.gtmap.create_array;

/**
 * 练习：找数组最小值
 * @author Administrator
 *
 */
public class Test05 {
	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] = (int) (Math.random() * 100);
		a[1] = (int) (Math.random() * 100);
		a[2] = (int) (Math.random() * 100);
		a[3] = (int) (Math.random() * 100);
		a[4] = (int) (Math.random() * 100);
		System.out.println("数组中各个随机数是：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		int min = 100;
		for (int i = 0; i < a.length; i++) {
			if(a[i] < min)
				min = a[i];
		}
		System.out.println("找出来的最小值是：" + min);
		
	}
}
