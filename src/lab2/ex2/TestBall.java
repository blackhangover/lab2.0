package lab2.ex2;

public class TestBall
{
    public TestBall()
    {
        Ball b1 = new Ball(0.2,0.6);
        System.out.println(b1.getX());
        System.out.println(b1.getY());
        b1.setX(1.0);
        b1.setY(2.0);
        System.out.println(b1.getX());
        System.out.println(b1.getY());
        b1.setXY(3.0,4.0);
        System.out.println(b1.getX());
        System.out.println(b1.getY());
        Ball b2 = new Ball();
        b2.move(12.0,19.0);
        System.out.println(b2.toString());
    }
}
