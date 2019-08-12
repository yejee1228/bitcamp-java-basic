import java.util.Scanner;

/**
다음은 우리나라 주민번호 체계입니다.
9 : 1800 ~ 1899년에 태어난 남성
0 : 1800 ~ 1899년에 태어난 여성
1 : 1900 ~ 1999년에 태어난 남성
2 : 1900 ~ 1999년에 태어난 여성
3 : 2000 ~ 2099년에 태어난 남성
4 : 2000 ~ 2099년에 태어난 여성
5 : 1900 ~ 1999년에 태어난 외국인 남성
6 : 1900 ~ 1999년에 태어난 외국인 여성
7 : 2000 ~ 2099년에 태어난 외국인 남성
8 : 2000 ~ 2099년에 태어난 외국인 여성

입력받은 주민등록번호를 가지고 상기 결과값이 나오도록 프로그램을 작성하시오.
String ssn = 900101-123456 이라고 주민등록번호를 입력받으면
String num = ssn.substring(7,8) 이라고 하면
1이 나옵니다
 */

 class Ssn{
     public static void main(String[] args){
         Scanner scan=new Scanner(System.in);
         System.out.println("주민번호를 입력하세요. (-포함)");
         String ssn = "";
         ssn = scan.next();
         String num = "";
         num = ssn.substring(7,8);
         if(num.equals("9")){
             System.out.print("1800 ~ 1899년에 태어난 남성");
         }else if(num.equals("0")){
            System.out.print("1800 ~ 1899년에 태어난 여성");
         }else if(num.equals("1")){
            System.out.print("1900 ~ 1999년에 태어난 남성");
         }else if(num.equals("2")){
            System.out.print("1900 ~ 1999년에 태어난 여성");
         }else if(num.equals("3")){
            System.out.print("2000 ~ 2099년에 태어난 남성");
         }else if(num.equals("4")){
            System.out.print("2000 ~ 2099년에 태어난 여성");
         }else if(num.equals("5")){
            System.out.print("1900 ~ 1999년에 태어난 외국인 남성");
         }else if(num.equals("6")){
            System.out.print("1900 ~ 1999년에 태어난 외국인 여성");
         }else if(num.equals("7")){
            System.out.print("2000 ~ 2099년에 태어난 외국인 남성");
         }else{
            System.out.print("2000 ~ 2099년에 태어난 외국인 여성");
         }
     }
 }