package cn.gtmap.two_dimension_array;

/**
 * 练习：二维数组
 * @author Administrator
 * 	定义一个5X5的二维数组。 然后使用随机数填充该二维数组。
 * 	找出这个二维数组里，最大的那个值，并打印出其二维坐标
 *
 */
public class Test02 {
    public static void main(String[] args) {
        int a[][] = new int[5][5];
        // 初始化这个数组
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 100);
            }
        }
        // 打印这个数组的内容：
        for (int[] row : a) {
            for (int each : row) {
                System.out.print(each + "\t");
            }
            System.out.println();
        }
 
        int max = -1;// 最大值
        // 最大值的坐标
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
 
        System.out.println("找出来最大的是:" + max);
        System.out.println("其坐标是[" + target_i + "][" + target_j + "]");
 
    }
}
