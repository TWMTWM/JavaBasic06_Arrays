package cn.gtmap.inhance_for;

public class Test02 {
	/**
	 * ����ǿ��forѭ���ҳ������Ǹ���
	 * @param args
	 */
	public static void main(String[] args) {
		int values [] = new int[]{18,62,68,82,65,9};
		for (int i : values) {
			System.out.print(i + " ");
		}
		System.out.println();
		int max = -1;
		for (int i : values) {
			if(i > max)
				max = i;
		}
		System.out.println("����һ��ֵ�ǣ�" + max);
	}

}
