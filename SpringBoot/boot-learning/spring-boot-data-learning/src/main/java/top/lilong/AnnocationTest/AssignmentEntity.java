package top.lilong.AnnocationTest;

public class AssignmentEntity {


    @Assignment(2)
    private int a;

    @Assignment(3)
    private int b;

    @Assignment(4)
    private int c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int sum(){
        return this.a+this.b+this.c;
    }
}
