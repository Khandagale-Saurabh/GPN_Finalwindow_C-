class p18
 {
    int a,b;
    p18()
     {
      a=b=20;
System.out.println(" first con a"+a);
      
  }
    p18(int a1)
   {
    
    this();
    a=a1;
   System.out.println("second con 2nd a"+a);
   }
   

  p18(int aa,int bb)
  {
   this();
  
  

      a=aa;
      b=bb;
      System.out.println("aa"+a+"bb="+bb);
 
   }

 }

class exe18
{
 public static void main(String a[])
  {
     p18  p1=new p18();
     p18  p2=new p18(111);
     p18  p3=new p18(222,333);
      
  }
}

