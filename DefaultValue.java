public class DefaultValue {

    byte b;
    short s;
    char c;
    int i;
    long l;
    float f;
    double d;
    boolean bb;

    static int abc;
    // default constructor
    // DefaultValue(){
    // bb=true;
    // s=10;
    // }

    void add() {
        int royal=90;
        System.out.println(royal);
    }

    DefaultValue(boolean ans) {
        bb = ans;
    }

    void display() {
        System.out.println(b);// 0
        System.out.println(s);// 0
        System.out.println(c);// null char '\u0000' '\0'
        System.out.println(i);// 0
        System.out.println(l);// 0
        System.out.println(f);// 0.0
        System.out.println(d);// 0.0
        System.out.println(bb);// false
    }

    public static void main(String[] args) {
        DefaultValue dd = new DefaultValue(true);

        dd.add();

    }
}
