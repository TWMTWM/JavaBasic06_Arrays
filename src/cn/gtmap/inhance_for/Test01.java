package cn.gtmap.inhance_for;

public class Test01 {
	/**
	 * ��ǿ��forѭ��
	 * @param args
	 */
	public static void main(String[] args) {
		int values[] =new int[]{18,62,68,82,65,9};
		//�������
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		
		//��ǿ��forѭ������
		for (int i : values) {
			System.out.println();
		}
		
	}
}
