public class Calculator {
  public static double eval(String inp) {
    String[] chli = inp.split(" ");
    MyDeque<Double> dq = new MyDeque<Double>(chli.length * 2);
    for(int q = 0; q < chli.length; q++) {
      if(chli[q].equals("+") || chli[q].equals("-") || chli[q].equals("*") || chli[q].equals("/") || chli.equals("%")) {
        double f = dq.removeLast();
        double s = dq.removeLast();
        double res;
        if(chli[q].equals("+")) {
          res = s + f;
          dq.addLast(res);
        }
        if(chli[q].equals("-")) {
          res = s - f;
          dq.addLast(res);
        }
        if(chli[q].equals("*")) {
          res = s * f;
          dq.addLast(res);
        }
        if(chli[q].equals("/")) {
          res = s / f;
          dq.addLast(res);
        }
        if(chli[q].equals("%")) {
          res = s % f;
          dq.addLast(res);
        }
      }
      else {
        dq.addLast(Double.parseDouble(chli[q]));
      }
    }
    System.out.println(dq.getLast());
    return dq.getLast();
  }
  public static void main(String[] afaf) {
    eval("3 4 + 2 * 7 /");
  }
}
