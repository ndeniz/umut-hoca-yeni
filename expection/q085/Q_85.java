package expection.q085;// myExpection run time a thow ettigi icin compile de hata vermicek
	class MyException extends RuntimeException {}
	    public class Q_85 {
//Math.random  0.0 ve 1.0 arasinda tam bir rakqm random eder
	    	public static void main(String[] args) {
	            try {
	                method1();
	            }
	            catch (MyException ne) {
	                System.out.print("A");
	            }
	        }
	        public static void method1() {    // line n1
	            try {
	                throw Math.random() > 0.5 ? new MyException() : new RuntimeException();  //her iki durumdada catch teki runtimeExpectina atiyo
	            }
	            catch (RuntimeException re) {    //her druumfda runtime expection old icin bu prpnt olur
	                System.out.print("B");
	            }
	        }
	    }
	//What is the result?
	//A. A
	//B. B
	//C. Either A or B
	//D. A B
	//E. A compile time error occurs at line n1
	
	   //cevap B



