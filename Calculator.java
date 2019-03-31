public class Calculator {
  public static double eval(String inp) {
    String[] chli = inp.split(" ");
    MyDeque<Double> dq = new MyDeque<Double>(chli.length * 2);
    for(int q = 0; q < chli.length; q++) {
      if(chli[q].equals("+") || chli[q].equals("-") || chli[q].equals("*") || chli[q].equals("/")) {
        Double f = dq.removeLast();
        Double s = dq.removeLast();
        Double res;
        if(chli[q] == "+") {
          res = f + s;
          dq.addLast(res);
        }
        if(chli[q] == "-") {
          res = f - s;
          dq.addLast(res);
        }
        if(chli[q] == "*") {
          res = f * s;
          dq.addLast(res);
        }
        if(chli[q] == "/") {
          res = f / s;
          dq.addLast(res);
        }
        if(chli[q] == "%") {
          res = f % s;
          dq.addLast(res);
        }
      }
      else {
        dq.addLast(Double.parseDouble(chli[q]));
      }
      System.out.println(dq);
    }
    return dq.getLast();
  }
  public static void main(String[] afaf) {
    eval("4 8 - 6 2 + 7 1 * 5 3 /");
  }
}
