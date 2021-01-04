package AstringMethod.q013;

class Vehicle2{
    int x;
    Vehicle2(){
        this(10);			// line n1
    }
    Vehicle2(int x){
        this.x= x;
    }
}
class Car2 extends Vehicle2{
    int y;
    Car2(){
        super(10);		// line n2
    }
    Car2(int y){
        super(y);
        this.y =y;
    }
    public String toString() {
        return super.x + ":" + this.y;
    }
    public static void main(String[] args) {
        Vehicle2 y = new Car2();  // in another version 20 is deleted ==> 10:0
        System.out.println(y);
    }
}//cevap 10:0

// What is the result?
//		 A.	Compilation fails at line n2.
//		 B.	Compilation fails at line n1.
//		 C.	20:20
//		 D.	10:20

