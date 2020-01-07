package cn.gtmap.inhance_for;

public class Test01 {
	/**
	 * 增强型for循环
	 * @param args
	 */
	public static void main(String[] args) {
		int values[] =new int[]{18,62,68,82,65,9};
		//常规遍历
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		
		//增强型for循环遍历
		for (int i : values) {
			System.out.println();
		}
		
	}
}
