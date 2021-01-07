package section3firststeps;

public class FloatDouble {
    public static void main(String[] args) {
        float myMinFloatValue = 1.4E-45F;
        float myMaxFloatValue = 3.4028235E38F;
        System.out.println("Float minimum value =" + myMinFloatValue);
        System.out.println("Float maximum value =" + myMaxFloatValue);
        double myMinDoubleValue = 4.9E-324D;
        double myMaxDoubleValue = 1.7976931348623157E308D;
        System.out.println("Double minimum value =" + myMinDoubleValue);
        System.out.println("Double maximum value =" + myMaxDoubleValue);
        int myIntValue = 1;
        float myFloatValue = 1.6666666F;
        double myDoubleValue = 1.6666666666666667D;
        System.out.println("MyIntValue =" + myIntValue);
        System.out.println("MyFloatValue =" + myFloatValue);
        System.out.println("MyDoubleValue =" + myDoubleValue);
        double pounds = 200.0D;
        double kilograms = pounds * 0.45359237D;
        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms");
        double pi = 3.1415927D;
        double anotherNumber = 3000000.456789D;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
