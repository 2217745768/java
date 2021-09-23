package experiment02;

public class LinearEquation {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    public LinearEquation() {
    }

    public LinearEquation(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public int getE() {
        return e;
    }

    public int getF() {
        return f;
    }

   
    /* 如果不为 0 返回 true 的方法 */
    public boolean isSolvable() {
        boolean flag = false;
        try {
            /* ad-bc */
            flag = false;
            int re = (a * d) - (b * c);
            if (re != 0) {
                flag = true;
            } else {
                System.out.println("The equation has no solution");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return flag;
    }

    /* X 和 Y 返回方程的解 */
    public int getX(int a, int b, int c, int d, int e, int f) {
        int resultX = 0;
        try {
            resultX = ((e * d) - (b * f)) / ((a * d) - (b * c));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return resultX;
    }

    public int getY(int a, int b, int c, int d, int e, int f) {
        int resultY = 0;
        try {
            resultY = (((a * f) - (e * c)) / ((a * d) - (b * c)));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return resultY;
    }


}
