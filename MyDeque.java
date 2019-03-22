public class MyDeque<E> {
  private E[] data;
  private int size, start, end;
  public MyDeque() {
    data = (E[])new Object[10];
    size = 0;
    start = 0;
    end = 0;
  }
  public MyDeque(int lalala) {
    data = (E[])new Object[lalala];
    size = 0;
    start = 0;
    end = 0;
  }
  public int size() {
    return size;
  }
  public String toString() {
    String s = "[";
    for(int q = 0; q < data.length; q++) {
      if(data[q] != null) {
        s += data[q] + ",";
      }
    }
    s += "]";
    return s;
  }
  public void addFirst(E e) {

  }
  public void addLast(E e) {

  }
}
