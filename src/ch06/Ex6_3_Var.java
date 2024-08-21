package ch06;

public class Ex6_3_Var {
    public static void main(String[] args) {
        System.out.println("카드의 너비 = " + Card.getWidth());
        System.out.println("카드의 높이 = " + Card.getHeight());

        Card c1 = new Card();
        c1.setKind("Heart");
        c1.setNumber(7);

        Card c2 = new Card("Spade", 4);

        System.out.println("c1 = " + c1.toString() + "이며, 크기는 " + Card.getWidth() + "x" + Card.getHeight() + "입니다.");
        System.out.println("c2 = " + c2.toString() + "이며, 크기는 " + Card.getWidth() + "x" + Card.getHeight() + "입니다.");
    }
}
