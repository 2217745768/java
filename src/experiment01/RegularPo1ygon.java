package experiment01;

public class RegularPo1ygon {
    //  定义私有变量边数
    private int n=3;
    //	定义私有变量边长
    private double side=1;
    //	定义私有变量x坐标
    private double x=0;
    //	定义私有变量y坐标
    private double y=0;

    RegularPo1ygon(){

    }

    RegularPo1ygon (int newN,int newS){
        n=newN;
        side=newS;
        x=0;
        y=0;
    }

    RegularPo1ygon (int newN,int newS,double newX,double newY){
        n=newN;
        side=newS;
        x=newX;
        y=newY;
    }


    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    //	计算周长
    public double getPerimeter(){
        return n*side;
    }
    //	计算面积
    public double getArea(){
        double p=3.1415926;
        return (n*side*side)/(4*Math.tan(p/n));
    }

}
