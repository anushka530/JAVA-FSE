public class MyInterface {
    public static void main(String[] args)
    {
        /*Calculate cal = new Calculate()
        {
            public int sum(int a, int b)
            {
                return a+b;
            }
        };
        int res = cal.sum(4,5);
        System.out.println(res);*/

        Calculate cal = (int a, int b)->a+b;
        int res = cal.sum(4,5);
        System.out.println(res);

       
    } 
    
}

@FunctionalInterface
interface Calculate{
    int sum(int i, int j);
}
/*class Cat implements Animal{
    public void run()
    {
        System.out.println("Cat is running");
    }
}*/
