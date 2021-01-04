package q177;
 class Bird {
	public void fly() {
		System.out.println("Fly.");
	}
}
	public class Peacock extends Bird {
		public void dance() {
			System.out.println("Dance.");
		}

		public static void main(String[] args) {
	/* insert code snippet here */

//   Bird p = new Peacock();  //A
 //  Bird b = new Bird();   Peacock p = (Peacock) b;  //B//casting expection  parent obj sini child da casting yapamiyoz
 //  Peacock b = new Peacock (); Bird p = (Bird) b;  //error
    Bird b = new Peacock (); Peacock p = (Peacock) b; //paren uzerinden olusturulan objler casting no prolem
	p.fly();
	p.dance();
//
	}
	//Which code snippet can be inserted to print Fly.Dance. ?
		
	}
	