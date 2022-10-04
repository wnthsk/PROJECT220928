package ForthPractice;

class Sample{
    public int a;
    private int b;
    int c;
}
public class AccessEx {
    public static void main(String[] args) {
        Sample aClass = new Sample();
        aClass.a =10;
        //aClass.b = 10;
        aClass.c = 10;
    }

}

// b는 private으로 선언되어있으므로, AccessEx 클래스에서 접근할 수 없다.