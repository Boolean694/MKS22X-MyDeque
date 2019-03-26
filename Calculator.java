public class Calculator {
  public static double eval(String inp) {
    String[] chli = inp.split(" ");
    MyDeque<Double> dq = new MyDeque<Double>(chli.length * 2);
    for(int q = 0; q < chli.length; q++) {
      try{dq.addLast(Double.parseDouble(chli[q])); chli[q] = "";}
      catch(NumberFormatException bsdf) {}
    }
    System.out.println(dq);
    return 1;
  }
  public static void main(String[] afaf) {
    eval("4 8 - 6 2 + 7 1 * 5 3 /");
  }
}
