class Num{
       String color;
       Num(String color){
              this.color=color;
       }
       public void print(){
              System.out.println("Color : "+color);
       }
}
public class Task6{

       public static void main(String[] args) {
              Num[] colored=new Num[3];
              colored[0]=new Num("Black");
              colored[1]=new Num("Blue");
              colored[2]=new Num("Brown");
              colored[0].print();

       }
}