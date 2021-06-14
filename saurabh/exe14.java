class p14
{
 static int a;
static int   b;
    static void read()
    { 
     b=a=10;
     System.out.println("values a: "+a+"b: "+b);
    }
}

class exe14
{
   public static void main(String a[])
  {
    p14 pp=new p14();
    pp.read();
  }
}
