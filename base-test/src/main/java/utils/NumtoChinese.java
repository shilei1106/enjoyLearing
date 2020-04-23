package utils;

import java.util.Scanner;

public class NumtoChinese {
    private static final int myclose=2;
    private static String toChinese(String str) {
        String[] s1 = { "零", "一", "二", "三", "四", "五", "六", "七", "八", "九" };
        String[] s2 = { "十", "百", "千", "万", "十", "百", "千", "亿", "十", "百", "千" ,"万"};
        String result = "";
        int n = str.length();
        for (int i = 0; i < n; i++) {
            int num = str.charAt(i) - '0';
            if (i != n - 1 && num != 0) {
                result += s1[num] + s2[n - myclose - i];
            } else {
                result += s1[num];
            }
            System.out.println("  "+result);
        }
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        Scanner sca =new Scanner(System.in);
        System.out.println("输入字符串：");
        String str = sca.next();
        // 将字符串数字转化为汉字
        toChinese(str);
    }
}
