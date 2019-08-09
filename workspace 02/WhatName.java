import java.util.Scanner; //jdk에 있음. jdk-java안의 util안의 scanner를 import(가져옴)
class WhatName {
    public static void main (String[] args) {
        System.out.println("이름이 뭐니?");
        String name = "";
        //값을 입력받는 지점
        Scanner scanner = new Scanner(System.in);
        // 스캐너를 쓸거다. 이름은 scanner
        // 새로운 스캐너이다. 키보드에서 입력받는 값
        name = scanner.next();
        //스케너에서 입력받는 값을 name에 받아준다.
        System.out.println("이름은 " + name + "입니다.");
        System.out.println("몇살이에요?");
        int age = 0;
        age = scanner.nextInt();
        System.out.print("나이는 " + age + "살 입니다.");
    }
}