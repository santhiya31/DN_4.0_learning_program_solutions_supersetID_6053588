package Week1_Algorithms_Data_Structure.Exercise7_Financial_Forecasting;

public class Financial {
    public static double futureValue(double presentValue,double growthRate,int years) {
        if (years==0) {
            return presentValue;
        }
        return futureValue(presentValue*(1+growthRate),growthRate,years-1);
    }
        public static void main(String[] args) {
        double presentValue=1000;     
        double growthRate=0.10;      
        int years=5;
        double result=futureValue(presentValue, growthRate, years);
        System.out.println("Future Value after "+years+" years: ₹"+result);
    }
}

