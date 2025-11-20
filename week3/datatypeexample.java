package week3;
public class datatypeexample
{
 
    public static void main (String[]arg)
    {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.SIZE);
        System.out.println(Float.MAX_VALUE + "\n" + Float.MIN_VALUE + "\n");
        byte d = 12;
        byte b = 11;
        byte e =(byte)(d+b);
        float f=233.3f;
        long l=200l;
        int a=20;
        float g=2.33f;
        double h=2.334;
        int x=(int)(a+g+h);
        int c = 'A' + 'B';
        int length = 10;
        int breadth = 20;
        int area = length*breadth;
        int peri = 2*(length+breadth);
        System.out.println("area = " +area + "\n" +"perimeter ="+ peri );
        int principle = 500;
        int time = 2;
        float rate = 2.4f;
        float si = (float)((principle+time+rate)/100);
        float ci = (float)(si-principle);
        System.out.println("simple intrest ="+ si);
        System.out.println("compound intrest ="+ ci);
        
        
        
        
        
        
        
        
    
        
        
        
        
        
        
    }
    
}