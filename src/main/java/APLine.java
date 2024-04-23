public class APLine
{
  private int a;
   private int b;
   private int c;
 public APLine(int a, int b, int c){
   this.a = a;
 this.b = b;
 this.c = c;
 }
 public double getSlope(){
   return (-(this.a/(double)this.b));
  }

 public boolean isOnline(int x, int y){
   return (0 == (this.a * x) + (this.b * y) + this.c);
  }

  
  
}
