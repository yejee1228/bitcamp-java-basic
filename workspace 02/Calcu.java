import java.util.Scanner;
class Calcu{
    public static void main(String[] args){
        int first = 0;
        int twice = 0;
        int c = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력해 주세요");
        first= scanner.nextInt();
        System.out.println("두번째 숫자를 입력해 주세요");
        twice= scanner.nextInt();

        c = (first + twice);

        System.out.println(String.format("%d + %d = %d", first, twice, c) );
    }
}