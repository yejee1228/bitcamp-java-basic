import java.util.Scanner;
class WhereLive{
    public static void main(String[] args){
        System.out.println("어디삽니까?");
        Scanner scanner = new Scanner(System.in);
        String live = "";
        live=scanner.next();
        System.out.print(String.format("%s에 삽니다.", live));
    }
}