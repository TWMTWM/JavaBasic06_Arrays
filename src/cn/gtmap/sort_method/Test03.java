package cn.gtmap.sort_method;

/**
 * 练习：冒泡法进行正排序和倒排序
 * @author Administrator
 *
 */
public class Test03 {
    public static void main(String[] args) {
        int a[] = new int[5];
        // 使用随机数填充
        for (int i = 0; i < a.length; i++)
            a[i] = (int) (Math.random() * 100);
  
        // 排序前，先把内容打印出来
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
        // 选择法正排序
        for (int j = 0; j < a.length - 1; j++) {
            for (int i = j + 1; i < a.length; i++) {
                if (a[i] < a[j]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
  
        // 把内容打印出来
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
  
        // 冒泡法倒排序
  
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length - j - 1; i++) {
                if (a[i] < a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
        // 把内容打印出来
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
  
        System.out.println(" ");
    }
}
