public class CalMain extends Calc {

    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println(calc.add(5,5));
        System.out.println(calc.sub(6,5));

        CalcGeneric calcGeneric = new CalcGeneric();
        System.out.println(calcGeneric.add(5,7));

    }
}
