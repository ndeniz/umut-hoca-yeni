package expection.Q215;
class LogFileException extends Exception{}
class AccessViolationException extends RuntimeException{}
public class App {
//    public static void main(String[] args) throws  LogFileException{
//         App obj=new App();
//         try {
//             obj.open();
//             obj.process();
//                  //insert code here
//         }catch (Exception e){
//             System.out.println("completed."); } }
//    public void  process()  {  //throws LogFileException bunu eklemek gerek
//        System.out.println("Processed");
//        throw new LogFileException();           //compiletime daki hata expection thow yapilmasi
//    }
//    public void open(){
//        System.out.println("Opened.");
//        throw new AccessViolationException();   //burdaki hata runtime aatildigi icin hata yok
//    }
}
//    Which action fixes the compiler error?
//        A. At line 17, add throws AccessViolationException
//        B. At line 13, add throws LogFileException
//        C. At line 2, replace throws LogFileException with throws AccessViolationException
//        D. At line 7, insert throw new LogFileException ();
//Answer: B
//print Opened Completed cijti
