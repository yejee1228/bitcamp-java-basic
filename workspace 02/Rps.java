/**
 * 가위바위보에서 
 * Random(3)+1 을 사용하면 1 ~ 3까지 나옵니다.
 * 컴퓨터가 만든 값이 1이면 가위를 낸 것이고
 * 2이면 바위를 낸 것이고
 * 3이면 보를 낸 것으로 할 때,
 * 사용자측이 가위, 바위, 보를 냈을 때
 * 승패를 결정하는 프로그램을 작성하시오
 */

import java.util.Scanner;
import java.util.Random;

class Rps{
    public static void main(String[] args){
        System.out.println("가위바위보 게임!");
        Scanner scan=new Scanner(System.in);
        Random random = new Random();
        int ran = 0;
        ran = random.nextInt(3)+1;
        System.out.println("어떤 것을 내시겠어요?");
        String rps = "";
        rps = scan.next();
        if(ran == 1){
            System.out.println("컴퓨터는 가위");
            if(rps.equals("가위")){
                System.out.println("비겼습니다.");
            }else if(rps.equals("바위")){
                System.out.println("이겼습니다.");
            }else if(rps.equals("보")){
                System.out.println("졌습니다.");
            }else{
                System.out.println("잘못입력하셨습니다");
            }
        }else if(ran == 2){
            System.out.println("컴퓨터는 바위");
            if(rps.equals("가위")){
                System.out.println("졌습니다.");
            }else if(rps.equals("바위")){
                System.out.println("비겼습니다.");
            }else if(rps.equals("보")){
                System.out.println("이겼습니다.");
            }else{
                System.out.println("잘못입력하셨습니다");
            }
        }else{
            System.out.println("컴퓨터는 보");
            if(rps.equals("가위")){
                System.out.println("이겼습니다.");
            }else if(rps.equals("바위")){
                System.out.println("졌습니다.");
            }else if(rps.equals("보")){
                System.out.println("비겼습니다.");
            }else{
                System.out.println("잘못입력하셨습니다");
            }
        }
    }
}