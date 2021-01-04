package durgaCalisma;

public class Test
{
    Test(Integer I)
    {
        System.out.print(0);
    }
    Test(int... i)
    {
        System.out.print(1);
    }
    Test(double d)
    {
        System.out.print(2);
    }
    Test(Object o)
    {
        System.out.print(3);
    }
    public static void main(String[] args)
    {
        new Test('a');
        new Test(10);
        new Test(10.5);
    }
}
/*
While resolving method calls, compiler will always gives the precedence in the following order.
1. Exact Match
2. Widening
3. Auto-Boxing
4. var-arg
new Test('a');==>Exact Match is not there and hence by widening double-arg constructor will get chance.
new Test(10);==>Exact Match is not there and hence by widening double-arg constructor will get chance.
new Test(10.5);===>Exact Match is available and hence by double-arg constructor will get chance.
 */