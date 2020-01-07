package cn.gtmap.arrays;

import java.util.Arrays;

/**
 * sort进行排序：Arrays工具类提供了一个sort方法
 * @author Administrator
 *
 */
public class Test03 {
    public static void main(String[] args) {
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
        System.out.println("排序之前 :");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("排序之后:");
        System.out.println(Arrays.toString(a));
  
    }
}
