public class Complex{
    float r,i;
    String sign=" + ";
    public Complex(float a,float b){
        this.r=a;
        this.i=b;
    }
    public void add(Complex cx){
        float im=this.i+cx.i;
        sign(im);
        System.out.println((this.r+cx.r)+""+sign+Math.abs(this.i+cx.i)+"i");
    }
    public void subtract(Complex cx){
        float im=this.i-cx.i;
        sign(im);
        System.out.println((this.r-cx.r)+""+sign+Math.abs(this.i-cx.i)+"i");
    }
    public void multiply(Complex cx){
        float im=this.r*cx.i+this.i*cx.r;
        sign(im);
        System.out.println((this.r*cx.r-this.i*cx.i)+""+sign+Math.abs(this.r*cx.i+this.i*cx.r)+"i");
    }
    public void sign(float im){
        if(im<0){
            this.sign=" - ";
        }else{
            this.sign=" + ";
        }
    }
    
}
class ComplexMain{
    public static void main(String[] args) {
        Complex cx1=new Complex(1,2);
        Complex cx2=new Complex(-3,-4);
        cx1.add(cx2);
        cx1.subtract(cx2);
        cx1.multiply(cx2);
    }
}