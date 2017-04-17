public class Question1{
  public static void main(String[] args) {

    SimpleCalc calc = new SimpleCalc();

    calc.add(20, 10);
    System.out.println(calc.getResult());

    calc.sub(20, 10);
    System.out.println(calc.getResult());

    calc.div(20, 10);
    System.out.println(calc.getResult());

    calc.multi(2, 1);
    System.out.println(calc.getResult());
  }
}
