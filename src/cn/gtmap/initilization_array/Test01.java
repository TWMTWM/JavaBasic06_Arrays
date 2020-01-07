package cn.gtmap.initilization_array;

public class Test01 {
	/**
	 * 分配空间与赋值分步进行
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = new int[5];//分配了长度是5的数组，但是没有赋值
        //没有赋值，那么就会使用默认值
        //作为int类型的数组，默认值是0
		System.out.println(a[0]);
		
		//进行赋值
		a[0] = 100;
		a[1] = 101;
		a[2] = 102;
		a[3] = 103;
		a[4] = 104;
	}
}
