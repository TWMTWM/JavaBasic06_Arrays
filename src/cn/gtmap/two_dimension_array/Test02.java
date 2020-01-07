package cn.gtmap.two_dimension_array;

/**
 * ��ϰ����ά����
 * @author Administrator
 * 	����һ��5X5�Ķ�ά���顣 Ȼ��ʹ����������ö�ά���顣
 * 	�ҳ������ά����������Ǹ�ֵ������ӡ�����ά����
 *
 */
public class Test02 {
    public static void main(String[] args) {
        int a[][] = new int[5][5];
        // ��ʼ���������
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 100);
            }
        }
        // ��ӡ�����������ݣ�
        for (int[] row : a) {
            for (int each : row) {
                System.out.print(each + "\t");
            }
            System.out.println();
        }
 
        int max = -1;// ���ֵ
        // ���ֵ������
        int target_i = -1;
        int target_j = -1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    target_i = i;
                    target_j = j;
                }
            }
        }
 
        System.out.println("�ҳ���������:" + max);
        System.out.println("��������[" + target_i + "][" + target_j + "]");
 
    }
}
