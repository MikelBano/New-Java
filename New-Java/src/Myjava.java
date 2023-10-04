public class Myjava {

   int aINT= 4;
   int  bInt=6;
   short aShort;


   public static void main(String [] abc){
       //System.out.println("erere");
Myjava obj=new Myjava();
obj.sum(5,16);
obj.diff(6,8);
   }

   public void testOverFLow(){
     int baShort = aShort+1;

   }
    public void bodmas(){
        int a = 4;
        int b = 8;
        int c = 2;
        int bodmas = (a+b*c/c)*a+b-c+b/c;
        System.out.println("calculation result="+bodmas);
    }
public  void sum(int a,int b){
    System.out.println("sum="+(a+b));
}
    public  void diff(int a,int b){
        System.out.println("diff="+(a-b));
    }
}
