public class ASuperAndThis2{
    public static void main(String[] args) {
        A a = new A(100);

        while (true) {
            java.util.Scanner s = new java.util.Scanner(System.in);
//            System.exit(0);
            int i = s.nextInt();
            B.doSome(a, i);
        }

    }
}

class A {
    private int v;

    public A() {

    }

    public A(int v) {
        this.v = v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public int getV() {
        return this.v;
    }
}

class B {
    public static void doSome(A a, int i) {
        if (i > a.getV()) {
            System.out.println("big");
        } else if(i < a.getV()) {
            System.out.println("small");
        } else {
            System.out.println("yes");
        }
    }
}