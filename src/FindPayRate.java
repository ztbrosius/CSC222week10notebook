import java.util.*;
public class FindPayRate
{
    public static void main(String[] args)
    {
        double[][] rates = {
                {12.12, 13.41, 14.25},  // dept 1
                {13.35, 14.67, 16.75},  // dept 2
                {15.67, 17.88, 19.45},  // dept 3
                {17.83, 19.94, 21.35},  // dept 4
                {19.97, 21.18, 24.47}   // my created dept 5
        };


        String header1 = "Dept      Years of experience";
        String header2 = "        0      1 - 2    3 or more";
        int dept;
        int years;
        System.out.println("This program determines pay based on");
        System.out.println("department and years of experience");
        System.out.println("based on this table:\n");
        System.out.println(header1);
        System.out.println(header2);

        for(dept = 0; dept < rates.length; ++ dept)
        {
            System.out.print("  " + (dept + 1) + "   ");
            for(years = 0; years < rates[0].length; ++years)
                System.out.print(rates[dept][years] + "    ");
            System.out.println();
        }
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter worker's department: ");
        dept = in.nextInt();
        --dept;
        System.out.print("Enter years on the job: ");
        years = in.nextInt();
        if(years == 2)
            years = 1;
        if(years >= 3)
            years = 2;
        System.out.println("Pay rate is " + rates[dept][years]);
    }
}