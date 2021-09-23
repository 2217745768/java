package experiment01;

public class TestRegularPo1ygon {
    public static void main(String[] args) {

        RegularPo1ygon r1 = new RegularPo1ygon();
        System.out.println("r1的周长="+r1.getPerimeter()+"\nr1的面积="+r1.getArea());

        RegularPo1ygon r2 = new RegularPo1ygon(6,4);
        System.out.println("r2的周长="+r2.getPerimeter()+"\nr2的面积="+r2.getArea());

        RegularPo1ygon r3 = new RegularPo1ygon(10,4,5.6,7.8);
        System.out.println("r2的周长="+r3.getPerimeter()+"\nr3的面积="+r3.getArea());
    }
}
