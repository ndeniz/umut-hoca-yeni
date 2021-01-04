package AsozelSorular.q197;

public class Q197 {
   private Q197() {
       System.out.println("Private non parameter");
    }
    private Q197(int a) {
        System.out.println("private with parameter");
    }

    public static void main(String[] args) {
       int a;
       int b=10;
        Q197 obj=new Q197();
        Q197 obj1=new Q197(1);
    }
    /*
    *
197. Which three statements are true about the structure of a Java class? (Choose three.)
*                                              (yapisi ) java class in
A. A public class must have a main method. -
B. A class can have only one private constructors.
C. A method can have the same name as a field.
D. A class can have overloaded static methods.    //cant be override
E. The methods are mandatory components of a class.
* F. The fields need not be initialized before use.//variable  run timeda hata verir gibi com;ile de nor ondotary
*
* Answer:  C D F?
* */

}
