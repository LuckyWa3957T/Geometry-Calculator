import java.util.*;
class Scan{
    static Scanner sc = new Scanner(System.in);
}
 class Circle{
     public static final double PI= 3.14;
     public   double R;

     Circle(){
         Scan s=new Scan();
         System.out.println("enter a Radius :");
         R= s.sc.nextDouble();
         while(true){
         System.out.print("1.Area\n2.Circumference\n3.Diameter\n4.exit\n");
             System.out.println("Enter your Choice :");
         int choice =s.sc.nextInt();
         switch (choice){
             case 1:
                 Area();
                 break;
             case 2:
                  Circumference();
                  break;
             case 3:
                 Diameter();
                 break;
             case 4:
                 System.out.println(" Thank you :");
                 return;

             default:
                 System.out.println(" Wrong Input :");
                 break;

         }
      }
     }
    void Area(){
        System.out.println("Area of Circle : "+(PI*(R*R)));
    }
    void Circumference(){
        System.out.println("Circumference of Circle : "+(2*PI*R));
    }
    void Diameter(){
        System.out.println("Diameter of Circle : "+(2*R));
    }
}
class Triangle {
     Scan s=new Scan();
     Triangle() {
         while (true){
         System.out.print("1.Area\n2.Perimeter\n3.exit\n");
             System.out.println("Enter your Choice :");
         int choice = s.sc.nextInt();
         switch (choice) {
             case 1:
                 Area();
                 break;
             case 2:
                 Perimeter();
                 break;
             case 3:
                 System.out.println(" Thank you :");
                 return;

             default:
                 System.out.println(" Wrong Input :");
                 break;

         }
     }
     }
     void Area(){
         System.out.println("Enter a base :");
         double base=s.sc.nextDouble();
         System.out.println("enter a height :");
         double height =s.sc.nextDouble();
         System.out.println("Area of Triangle : "+((0.5)*base*height));
     }
     void Perimeter(){
         System.out.println("Enter a Side 1 :");
         int a=s.sc.nextInt();
         System.out.println("Enter a Side 2 :");
         int b=s.sc.nextInt();
         System.out.println("Enter a side 3 :");
         int c=s.sc.nextInt();
         System.out.println("Perimeter of Triangle :"+(a+b+c));
     }
}
class Square{
    Scan s =new Scan();
     public  double side ;
     Square(){
         System.out.println("Enter a side :");
         side=s.sc.nextDouble();
         while (true) {
         System.out.print("1.Area\n2.Perimeter\n3.exit\n");
             System.out.println("Enter your Choice :");
         int choice =s.sc.nextInt();
             switch (choice) {
                 case 1:
                     Area();
                     break;
                 case 2:
                     Perimeter();
                     break;
                 case 3:
                     System.out.println(" Thank you :");
                    return;
                 default:
                     System.out.println(" Wrong Input :");
                     break;
             }
         }
     }
     void Area(){
         System.out.println("Area of Square :"+(side*side));
     }
     void Perimeter(){
         System.out.println("Perimeter of Square :"+(4*side));
     }
}
class Rectangle{
     Scan s =new  Scan();
     public double length;
     public  double width;
     Rectangle() {
         System.out.println("Enter a length :");
         length = s.sc.nextDouble();
         System.out.println("Enter a width :");
         width = s.sc.nextDouble();
         while (true){
         System.out.print("1.Area\n2.Perimeter\n3.exit\n");
             System.out.println("Enter your Choice :");
         int choice = s.sc.nextInt();
         switch (choice) {
             case 1:
                 Area();
                 break;
             case 2:
                 Perimeter();
                 break;
             case 3:
                 System.out.println("Thank you :");
                 return;
             default:
                 System.out.println("Wrong Input :");
                 break;
         }
     }

     }     void Area(){
         System.out.println("Area of Rectangle :"+(length*width));
     }
     void Perimeter(){
         System.out.println("Perimeter of Rectangle :"+(2*(length+width)));
     }
}
class Calculator{
   Scan s=new Scan();
   public int a;
   public int b;
    Calculator(){
       System.out.println("Enter a 1st number :");
        a=s.sc.nextInt();
       System.out.println("Enter a 2nd number :");
       b=s.sc.nextInt();
       while (true){
           System.out.print("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus\n6.Exit\n");
           System.out.println("Enter your Choice :");
           int choice = s.sc.nextInt();
           switch (choice) {
               case 1:
                   System.out.println("Addition :"+(a+b));
                   break;
               case 2:
                   System.out.println("Subtraction :"+(a-b));
                   break;
               case 3:
                   System.out.println("Multiplication :"+(a*b));
                   break;
               case 4:
                   Division();
                   break;
               case 5:
                   Modulus();
                   break;
               case 6:
                   System.out.println("Thank you");
                   return;
               default:
                   System.out.println("Wrong Input :");
                   break;
           }
           }
   }
   void  Division(){
       if(b==0){
           System.out.println("We can not divide is because B ="+b);
       }else {
           System.out.println("Division :" + (double)a / b);
       }
   }
   void Modulus(){
       if(b==0){
           System.out.println("We can not find the Modulus  is because B ="+b);
       }else {
           System.out.println("Modulus :" + (a %b));
       }
   }
}

 class Geometry_Calculator {
    public static  void main(String [] args) {
        Scan s=new Scan();
        while (true) {
        System.out.print("1.Circle\n2.Triangle\n3.Square\n4.Rectangle\n5.Calculater\n6.Exit\n");
        System.out.println("Enter your Choice :");
        int choice = s.sc.nextInt();
            switch (choice) {
                case 1:
                     new Circle();
                    break;
                case 2:
                      new Triangle();
                    break;
                case 3:
                     new Square();
                    break;
                case 4:
                     new Rectangle();
                    break;
                case 5:
                    new Calculator();
                    break;
                case 6:
                    System.out.println("Thank you ::::::");
                    System.exit(0);
                    break;
                default:
                    System.out.println("::::Wrong Input::::");
            }
        }
    }
    }



