public class LinearEquation{

    private double a,b,c,d,e,f;

    LinearEquation(double a, double b, double c, double d, double e, double f){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
    }

    LinearEquation(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){

        //연립방정식을 통해 좌표를 a~f로 변환
        a = y1 - y2;
        b = -x1 + x2;
        c = y3 - y4;
        d = -x3 + x4;
        e = -x1 * y2 + x2 * y1;
        f = -x3 * y4 + x4 * y3;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public boolean isSolvable(){
        return (a*d-b*c) != 0;
    }

    public double getX(){
        return (e*d-b*f)/(a*d-b*c);
    }

    public double getY(){
        return (a*f-e*c)/(a*d-b*c);
    }

}
