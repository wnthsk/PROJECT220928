package PracticalQuestion;

import java.util.Scanner;

class Dictionary {
    Scanner sc=new Scanner(System.in);
    private static String [] kor = { "사랑", "아기", "돈", "미래", "희망" };
    private static String [] eng = { "love", "baby", "money", "future", "hope" };

    public static String kor2Eng(String word) {
        for(int i=0;i<5;i++) {
            if(word.equals(kor[i])) {
                System.out.println(eng[i]);
                break;
            }if(i==4) {
                System.out.println(word+"는 사전에 없습니다.");
            }
        }
        return null;

    }

}


public class Q10 {

    public static void main(String[] args) {
        System.out.println("한영 단어 검색 프로그램 입니다.");
        Scanner sc = new Scanner(System.in);
        Dictionary dic = new Dictionary();

        while(true) {
            System.out.print("한글단어?");
            String word = sc.next();
            if(word.equals("그만"))
                break;
            dic.kor2Eng(word);

        }
        sc.close();

    }
}

