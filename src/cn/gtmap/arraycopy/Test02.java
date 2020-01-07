package cn.gtmap.arraycopy;

public class Test02 {
	/**
	 * ��ϰ���ϲ�����
	 * @param args
	 */
    public static void main(String[] args) {
        int a[] = new int[(int) (Math.random() * 5)+5];
        for (int i = 0; i < a.length; i++)
            a[i] = (int) (Math.random() * 100);
        int b[] = new int[(int) (Math.random() * 5)+5];
        for (int i = 0; i < b.length; i++)
            b[i] = (int) (Math.random() * 100);
         
        System.out.println("����a������:");
        for (int i : a) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("����b������:");
        for (int i : b) {
            System.out.print(i+" ");
        }
        System.out.println();
         
        int c[] = new int[a.length+b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
         
        System.out.println("����c������:");
        for (int i : c) {
            System.out.print(i+" ");
        }
         
    }
}
