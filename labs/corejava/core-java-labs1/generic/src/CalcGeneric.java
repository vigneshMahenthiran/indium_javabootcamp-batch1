public class CalcGeneric {

    public static <N extends Number> Number add(N number1 ,N number2){
       return number1.doubleValue() + number2.doubleValue();
    }
}
