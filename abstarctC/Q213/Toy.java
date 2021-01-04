package abstarctC.Q213;
abstract class Toy {
    int price;

    //line n1;

//which code fragments are valid at line n1?
//A.
 public static void insertToy(){
        /*  code goes here  */
    }
//B.  final Toy getToy(){      //final method ama return new toy olmuyo
//        return new Toy();
//    }
//C.  public void printToy();     //body olmayana astarct methodu olmasi lazim
//D.
 public int calculatePrice(){
        return price;
    }
//E.
  public abstract int computeDiscount();
//    A. Option A
//    B. Option B
//    C. Option C
//    D. Option D
//    E. Option E
//Answer: A D E
}