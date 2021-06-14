class rect
{
double width,height;

void getdata(int width,int height)
  {
     this.width=width;
     this.height=height;
  }
void display()
 {
    System.out.println("WIDTH"+this.width+"height="+height);

 }
}


class pro30
{
  public static void main(String a[])
  {
     rect r=new rect();
     r.getdata(20,30);
     r.display();
  }
}
