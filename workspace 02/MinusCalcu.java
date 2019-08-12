import java.util.Scanner;
class MinusCalcu{
    public static void main(String[] args){
        System.out.println("뺄셈계산기");
        System.out.print("첫번째 숫자를 입력하세요:");
        Scanner scanner = new Scanner(System.in);
        int first=0;
        first=scanner.nextInt();
        System.out.print("두번째 숫자를 입력하세요:");
        int twice=0;
        twice=scanner.nextInt();

        System.out.println(first-twice);
        
    }
}