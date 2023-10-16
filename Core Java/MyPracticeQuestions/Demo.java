public class Demo {
    public static void main(String[] args)
    {
        A obj = (int i, int j)-> i+j;
                
        
       int res =  obj.show(5,4);
       System.out.println(res);
    }
}

@FunctionalInterface
interface A{
    int show(int i, int j);
}

