package ch06;

public class Ex6_14_Initialize {
    static {
        System.out.println("static{ }");
    }
    {
        System.out.println("{ }");
    }
    Ex6_14_Initialize() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        Ex6_14_Initialize e1 = new Ex6_14_Initialize();
        System.out.println(e1);

        Ex6_14_Initialize e2 = new Ex6_14_Initialize();
        System.out.println(e2);
    }
}
