package Chap06;

public class MathEx {
    public static void main(String[] args) {
        double a = Math.PI;
        System.out.println(Math.PI);
        System.out.println(Math.ceil(a));// 올림
        System.out.println(Math.floor(a));// 내림
        System.out.println(Math.sqrt(9));// 루트
        System.out.println(Math.exp(2));// e의 2제곱
        System.out.println(Math.round(3.14));// 반올림

        // [1, 45] 사이의 정수형 난수 5개 발생
        System.out.print("이번주 행운의 번호는 ");
        for(int i = 0; i < 5; i++ )
            System.out.print((int)(Math.random()*45 + 1) + " ");
    }
}
