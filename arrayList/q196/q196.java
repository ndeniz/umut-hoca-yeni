package arrayList.q196;
import java.util.ArrayList;
public class q196 {
    public static void main(String[] args) {
        ArrayList<Cycle>myList=new ArrayList<>();
        myList.add(new MoterCycle());         // childin obj si cyle da array list eekliyoz
    }
}
class Cycle{ }
class MoterCycle extends Cycle{ }
/*
Which two statements, if either were true, would make the code compile? (Choose two.)
A. MotorCycle is an interface that implements the Cycle class.
B. Cycle is an interface that is implemented by the MotorCycle class
C. Cycle is an abstract superclass of MotorCycle.
D. Cycle and MotorCycle both extend the Transportation superclass.
E. Cycle and MotorCycle both implement the Transportation interface.
F. MotorCycle is a superclass of Cycle.
 */
//cevap B Ve C