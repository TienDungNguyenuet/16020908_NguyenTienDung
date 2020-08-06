package task2;

public class WEEK4 {
    /**
     *
     * @param a
     * @param b
     * @return max of $a and $b
     */
    public static int max2Int(int a, int b) {
        if(a >= b) return a;
        else return b;
    }

    /**
     *
     * @param arr
     * @return min of array $arr
     */
    public static int minArray(int[] arr) {
        if(arr.length == 0) return 0;
        int a = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]< a) a = arr[i];
        }
        return a;
    }

    /**
     *
     * @param weight: in kg
     * @param height: in m
     * @return BMI index
     */
    public static String calculateBMI(double weight, double height) {
        double BMI = weight / (height * height);
        if(BMI < 18.5) return "thieu can";
        else if(BMI >= 18.5 && BMI <= 22.9) return "binh thuong";
        else if(BMI >= 23 && BMI <= 24.9) return "thua can";
        else return "beo phi";
    }
}
