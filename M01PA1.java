public class M01PA1{//programming assignment 1
    public static double footToMeter(double foot) //multiplies foot by value to get meter
    {
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter) //multiplies meter by value to get foot
    {
        return 3.279 * meter;
    }

    public static void main(String[] args) 
    {

        System.out.printf("%-12s%-12s%-12s%-12s\n", "Feet", "Meters", "Meters", "Feet"); //header
        System.out.println("-----------------------------------------------------");


        for (int i = 1; i <= 10; i++) //loop for table
        {
            double foot = i;
            double meters = 20 + (i - 1) * 5; 


            System.out.printf("%-12.1f%-12.3f%-12.1f%-12.3f\n",foot, footToMeter(foot), meters, meterToFoot(meters)); //system output
        }    
    }
}

