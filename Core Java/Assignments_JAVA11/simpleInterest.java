import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter Principal Amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of Interest (in percentage): ");
        double rateOfInterest = scanner.nextDouble();

        System.out.print("Enter Time Period (in years): ");
        double timePeriod = scanner.nextDouble();

      /*   Calculator cal = new Calculator()
        {
            public void calculate(double principal,double rateOfInterest,double timePeriod)
            {
                return (principal*rateOfInterest*timePeriod)/100;
                
            }
        };
        double ans = cal.calculate(principal, rateOfInterest, timePeriod);*/
       Calculator simpleInterestCalculator = (p, r, t) -> (p * r * t) / 100;

       
        double simpleInterest = simpleInterestCalculator.calculate(principal, rateOfInterest, timePeriod);

        
        System.out.println("Simple Interest: " + simpleInterest);

        scanner.close();
    }
}

@FunctionalInterface
interface Calculator {
    double calculate(double principal, double rateOfInterest, double timePeriod);
}
