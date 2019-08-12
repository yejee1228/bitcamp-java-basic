import java.util.Scanner;
import java.util.Random;
class Dice{
    /**
     * 주사위를 던져서 홀수인지 짝수인지 맞추는 게임입니다.
     * 일단 컴퓨터가 던져서 얻은 값은 3입니다.
     * 사용자는 입력을 홀수인 것 같으면 홀, 짝수라면 짝을 선택.
     * 한다고 할 때, 결과를 출력.
     */
    public static void main(String[] args){
        System.out.println("주사위 게임!");
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        int dice = 0;
        dice = ran.nextInt(6)+1;

        String dap = "";
        
        if(dice ==1){
            dap="홀";
        }else if(dice ==3){
            dap="홀";
        }else if(dice ==5){
            dap="홀";
        }else if(dice ==2){
            dap="짝";
        }else if(dice ==4){
            dap="짝";
        }else if(dice ==6){
            dap="짝";
        }else {
            System.out.println("잘못입력하셨습니다.");
        }
        System.out.println("주사위 게임! 홀 or 짝?");

        String ans="";
        ans = scan.next();
        if(ans.equals(dap)){
            System.out.println(String.format("올! 정답! 주사위는 %d임", dice));
        }else if(!ans.equals(dap)){
            System.out.println(String.format("땡! 틀림! 주사위는 %d임", dice));
        }else{
            System.out.println("잘못썼음. 홀, 짝 중에 선택해서 써주세요.");
        }
    }
}