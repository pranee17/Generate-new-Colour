import java.util.*;
public class Complex{
    int real;
    int imag;
    public Complex(int i,int r){
        real=r;
        imag=i;
    }
     public static Complex add(Complex a , Complex b)
    {
        return  new Complex((a.real+b.real),(a.imag+b.imag));
    }
    public void print()
    {
        System.out.println(real+"+i"+imag);
    }
     public static void main(String args[])
    {
      Complex c = new Complex(4,5);
      Complex d = new Complex(10,5);
      System.out.println("Addition is :");
      Complex e= Complex.add(c,d);
      e.print();
    }
    
}


   
   
