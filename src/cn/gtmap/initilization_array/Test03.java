package cn.gtmap.initilization_array;

public class Test03 {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = (int) (Math.random() * 100);
        a[1] = (int) (Math.random() * 100);
        a[2] = (int) (Math.random() * 100);
        a[3] = (int) (Math.random() * 100);
        a[4] = (int) (Math.random() * 100);
 
        System.out.println("�����и���ֵ��:");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
         
        /*˼·һ�� ʹ����ʱ����*/
         
        System.out.println();
        //׼����ʱ����
        int[] temp = new int[a.length];
        //��ԭ��������ݸ��Ƹ���ʱ����
        for (int i = 0; i < temp.length; i++) {
            temp[i] = a[i];
        }
        System.out.println("��ʱ�����еĸ���ֵ��:");
        for (int i = 0; i < temp.length; i++)
            System.out.print(temp[i] + " ");
        System.out.println();
        //��ת�������ǰ���ʱ��������ݣ����� �� ���� ԭ������
        for (int i = 0; i < temp.length; i++) {
            a[i] = temp[temp.length-1-i];
        }
  
        System.out.println("��ת��������и���ֵ��:");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
         
        System.out.println();
         
        /*˼·���� ������β����*/      
        for (int i = 0; i < a.length/2; i++) {
            int middle = a[a.length-i-1];
            a[a.length-i-1] = a[i];
            a[i] = middle;
        }       
        System.out.println("�ٴη�ת��������и���ֵ��:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
         
    }
}
