class box
{
  private int a;
  private int b;
  public void display()
   {
     a=b=20;
   System.out.println("a"+a+"b="+b);
   }
   
   box()
   {
    a=10;
System.out.println("a="+a);
   }
  public box(box bb)
  {  
    bb.a=230;
  
   System.out.println("b="+bb.a);
   
  }
}

class exe19
{
   public static void main(String[] a)
   {
     box bb=new box();
     box c=new box(bb);
     System.out.println(c);
          bb.display();
        
   }
}
