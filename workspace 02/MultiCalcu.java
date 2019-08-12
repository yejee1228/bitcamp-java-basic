import java.util.Scanner;
class MultiCalcu{
    public static void main(String[] args){
        System.out.println("곱셈계산기");
        System.out.print("첫번째 숫자를 입력하세요: ");
        Scanner scan=new Scanner(System.in);
        int first=0;
        first=scan.nextInt();
        System.out.print("두번째 숫자를 입력하세요: ");
        int twice = 0;
        twice=scan.nextInt();
        System.out.println("곱한 값: " + (first*twice));
    }
}