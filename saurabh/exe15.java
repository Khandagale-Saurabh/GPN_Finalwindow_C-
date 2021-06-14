class p15
{
 static int a;
 static int b;
    static void read()
    { 
     b=a=10;
     System.out.println("values a: "+a+"b: "+b);
    }
 void display()
   {
  System.out.println("values a: "+p15.a+"b: "+p15.b);
   
   }

}

class exe15
{
   public static void main(String a[])
  {
       p15 pp=new p15();
       pp.read();
       pp.display();
  }
}
