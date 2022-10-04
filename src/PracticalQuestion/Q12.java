package PracticalQuestion;

import java.util.Scanner;


class Consert{
    String[] Sseat;
    String[] Aseat;
    String[] Bseat;
    Scanner sc = new Scanner(System.in);

    public Consert() {        //처음 만들떄 생성자.
        //처음 의자 초기화 각 10개씩
        Sseat = new String[10];
        Aseat = new String[10];
        Bseat = new String[10];
        String init = "---";
        for(int i=0; i<10; i++) {
            Sseat[i]=init;
            Aseat[i]=init;
            Bseat[i]=init;
        }
    }

    public void printSeat(String[] seat) {
        for(int i=0; i<seat.length; i++) {
            System.out.print(seat[i]+" ");
        }
    }

    public void book(int seatNum) {

        if(seatNum == 1) {
            printSeat(Sseat);
            System.out.print("\n이름>>");
            String name = sc.next();
            System.out.print("번호>>");
            int num = sc.nextInt();
            int realnum = num-1;

            if(Sseat[realnum].equals("---")) {
                Sseat[realnum]=name;
            }else {
                System.out.println("이미 있는 자리 입니다.");
            }
        }else if(seatNum ==2) {
            printSeat(Aseat);
            System.out.print("\n이름>>");
            String name = sc.next();
            System.out.print("번호>>");
            int num = sc.nextInt();
            int realnum = num-1;

            if(Aseat[realnum].equals("---")) {
                Aseat[realnum]=name;
            }else {
                System.out.println("이미 있는 자리 입니다.");
            }
        }else if(seatNum ==3) {
            printSeat(Bseat);
            System.out.print("\n이름>>");
            String name = sc.next();
            System.out.print("번호>>");
            int num = sc.nextInt();
            int realnum = num-1;

            if(Bseat[realnum].equals("---")) {
                Bseat[realnum]=name;
            }else {
                System.out.println("이미 있는 자리 입니다.");
            }
        }

    }

    public void showAll() {
        System.out.print("S>>");
        printSeat(Sseat);
        System.out.print("\nA>>");
        printSeat(Aseat);
        System.out.print("\nB>>");
        printSeat(Bseat);
        System.out.println("\n<<<조회를 완료하였습니다.>>>");
    }

    public void cancle(int seatNum) {
        switch(seatNum) {
            case 1:
                System.out.print("S>>");
                printSeat(Sseat);
                System.out.println();
                System.out.print("이름>>");
                String name = sc.next();

                for(int i=0; i<10; i++) {
                    if(Sseat[i].equals(name)){
                        Sseat[i]="---";
                        break;
                    }
                }
                break;
            case 2:
                System.out.print("A>>");

                printSeat(Aseat);
                System.out.println();
                System.out.print("이름>>");
                String name2 = sc.next();

                for(int i=0; i<10; i++) {
                    if(Aseat[i].equals(name2)){
                        Aseat[i]="---";
                        break;
                    }
                }
                break;
            case 3:
                System.out.print("B>>");
                printSeat(Bseat);
                System.out.println();
                System.out.print("이름>>");
                String name3 = sc.next();

                for(int i=0; i<10; i++) {
                    if(Bseat[i].equals(name3)){
                        Bseat[i]="---";
                        break;
                    }
                }
                break;
        }
    }
}


public class Q12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Consert consert = new Consert();
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        boolean flag = true;
        while(flag) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >>");
            int choose = sc.nextInt();

            switch(choose) {
                case 1:
                    System.out.print("좌석구분 S(1), A(2), B(3)>> ");
                    int seatNum = sc.nextInt();
                    consert.book(seatNum);
                    break;
                case 2:
                    consert.showAll();
                    System.out.println();
                    break;
                case 3:
                    System.out.print("좌석 S:1, A:2, B:3>>");
                    int seatNum2 = sc.nextInt();
                    consert.cancle(seatNum2);
                    break;
                case 4:
                    flag = false;
            }

        }
        sc.close();
    }
}
