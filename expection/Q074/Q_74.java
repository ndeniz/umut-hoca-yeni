package expection.Q074;

public class Q_74 {
}

class Test74{
void readCard(int cardNo) throws Exception{ //buraya runtimeexception yazinca error vermiyr
    System.out.println("Reading Card");
}

void checkCard(int cardNo) throws RuntimeException{  // line n1
    System.out.println("Checking Card");
}

public static void main(String[] args) {
    Test74 ex = new Test74();
    int cardNo = 12344;
  //ex.readCard(cardNo);   // line n2
    ex.checkCard(cardNo);  // line n3
}
}

/*
compilation fails at line n2
*/
