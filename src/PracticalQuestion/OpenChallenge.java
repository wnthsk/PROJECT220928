package PracticalQuestion;

import java.util.Scanner;

class Player {
    String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

public class OpenChallenge {
    public static void main(String[] args) {

        System.out.println("끝말잇기 게임을 시작합니다...");
        Scanner sc = new Scanner(System.in);


        System.out.print("게임에 참가하는 인원은 몇명입니까 >> " );
        int p_num = sc.nextInt();

        Player[] player = new Player[p_num];

        for (int i = 0; i < player.length; i++) {
            System.out.print("참가자의 이름을 입력하세요 >> ");
            String name = sc.next();
            player[i] = new Player();
            player[i].setName(name);
        }

        System.out.println("시작하는 단어는 아버지입니다.");
        String word = "아버지";
        boolean flag = true;

        while (flag){
            for(int i = 0; i < player.length; i++){
                System.out.print(player[i].getName() + " >> ");
                String word2 = sc.next();
                int lastIndex = word.length()-1;
                char lastChar = word.charAt(lastIndex);
                char firstChar = word2.charAt(0);

                if(firstChar == lastChar){
                    word = word2;
                }
                else {
                    System.out.println(player[i].getName() + "이(가) 졌습니다.");
                    flag = false;
                    break;
                }
            }
        }
    }
}

