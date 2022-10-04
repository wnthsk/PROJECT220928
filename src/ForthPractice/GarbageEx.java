package ForthPractice;

public class GarbageEx {
    public static void main(String[] args) {
        String a= new String("Good");
        String b= new String("Bad");
        String c= new String("Normal");
        String d, e;

        a = null;
        d = c;
        c = null;
    }
}

// a가 null로 선언되면서 a가 가리키고 있던 "Good"이라는 객체가 가비지가 된다.