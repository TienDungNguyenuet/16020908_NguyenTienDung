package task2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class week4test {
    private int a;
    private int b;
    private WEEK4 week4;
    private int arr1[];
    private double weight;
    private double height;

    @Test
    public void testMax2Int1(){
        a = 10;
        b = 5;
        week4 = new WEEK4();
        Assert.assertEquals("true", 10 , week4.max2Int(a,b));
    }
    @Test
    public void testMax2Int2(){
        a = 10;
        b = 5;
        week4 = new WEEK4();
        Assert.assertEquals("a > b", 10 , week4.max2Int(a,b));
    }

    @Test
    public void testMax2Int3(){
        a = 5;
        b = 10;
        week4 = new WEEK4();
        Assert.assertEquals("a < b", 10 , week4.max2Int(a,b));
    }

    @Test
    public void testMax2Int4(){
        a = -1;
        b = 0;
        week4 = new WEEK4();
        Assert.assertEquals("a < 0 < b", 0 , week4.max2Int(a,b));
    }

    @Test
    public void testMax2Int5(){
        a = -1;
        b = -5;
        week4 = new WEEK4();
        Assert.assertEquals("b < a < 0", -1, week4.max2Int(a,b));
    }

    @Test
    public void testMinArray1(){
        arr1 = new int[]{1,2,3,4,5,6,7,8,9,10};
        week4 = new WEEK4();
        Assert.assertEquals("Success", 1, week4.minArray(arr1));
    }

    @Test
    public void testMinArray2(){
        arr1 = new int[]{2};
        week4 = new WEEK4();
        Assert.assertEquals("Success", 2, week4.minArray(arr1));
    }

    @Test
    public void testMinArray3(){
        arr1 = new int[]{1,2,-10,100,5,-2,7,8,0,10};
        week4 = new WEEK4();
        Assert.assertEquals("Success", -10, week4.minArray(arr1));
    }

    @Test
    public void testMinArray4(){
        arr1 = new int[]{0, -1 , -2 , -3 , -10 , -5 , -20};
        week4 = new WEEK4();
        Assert.assertEquals("Success", -20, week4.minArray(arr1));
    }

    @Test
    public void testMinArray5(){
        arr1 = new int[]{};
        week4 = new WEEK4();
        Assert.assertEquals("khong co phan tu nao trong mang", 0, week4.minArray(arr1));
    }

    @Test
    public void testCalculateBMI1(){
        weight = 45.2;
        height  = 1.3;
        week4 = new WEEK4();
        Assert.assertEquals("TRUE","beo phi", week4.calculateBMI(weight,height));
    }

    @Test
    public void testCalculateBMI2(){
        weight = 45.2;
        height  = 1.3;
        week4 = new WEEK4();
        Assert.assertEquals("TRUE","beo phi", week4.calculateBMI(weight,height));
    }

    @Test
    public void testCalculateBMI3(){
        weight = 45.2;
        height  = 1.8;
        week4 = new WEEK4();
        Assert.assertEquals("TRUE","thieu can", week4.calculateBMI(weight,height));
    }

    @Test
    public void testCalculateBMI4(){
        weight = 68.;
        height  = 1.8;
        week4 = new WEEK4();
        Assert.assertEquals("TRUE","binh thuong", week4.calculateBMI(weight,height));
    }

    @Test
    public void testCalculateBMI5(){
        weight = 70;
        height  = 1.7;
        week4 = new WEEK4();
        Assert.assertEquals("TRUE","thua can", week4.calculateBMI(weight,height));
    }
}
