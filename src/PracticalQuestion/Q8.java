package PracticalQuestion;

import java.util.Scanner;

class Phone{
    private String name;
    private String tel;

    public Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }
    public String getTel() {
        return tel;
    }
}

public class Q8{
    public static void main(String[] args) {
        System.out.print("인원수>>");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Phone[] phones = new Phone[num];

        for (int i=0; i<num; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>>");
            String name = sc.next();
            String tel = sc.next();
            phones[i] = new Phone(name,tel);
        }
        System.out.println("저장되었습니다...");

        while(true) {
            System.out.print("검색할 이름>>");
            String search = sc.next();
            if(search.equals("그만")) {
                break;
            }

            for(int i = 0;i<num;i++) {
                if(search.equals(phones[i].getName())) {
                    System.out.println(phones[i].getName()+"의 번호는 "+phones[i].getTel()+" 입니다.");
                    break;
                }
                if(i==num-1) {
                    System.out.println(search+"이(가) 업습니다.");
                }
            }
        }

        sc.close();
    }
}
