package cn.gtmap.arrays;

import java.util.Arrays;

/**
 * sort��������Arrays�������ṩ��һ��sort����
 * @author Administrator
 *
 */
public class Test03 {
    public static void main(String[] args) {
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
        System.out.println("����֮ǰ :");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("����֮��:");
        System.out.println(Arrays.toString(a));
  
    }
}
