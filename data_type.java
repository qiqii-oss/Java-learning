//数据类型的练习：计算BMI
public class data_type {
    public static void main(String[] args) {
        double high = 1.68;
        double weight = 60;
        double BMI = weight / high /high;
        System.out.println(BMI);//21.25,正常。小于18.5是消瘦！
    }
}