import java.util.*;
public class MyDeque<E> {
  private E[] data;
  private int size, start, end;
  @SuppressWarnings("unchecked")
  public MyDeque() {
    data = (E[])new Object[10];
    size = 0;
    start = 0;
    end = 0;
  }
  @SuppressWarnings("unchecked")
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
    String s = "{";
    for(int q = 0; q < data.length; q++) {
      if(data[q] != null) {
        s += data[q] + " ";
      }
    }
    s += "}";
    return s;
  }
  public void addFirst(E e) throws NullPointerException {
    if(size + 1 >= data.length) {
      copyData();
    }
    if(data[0] == null) {
      data[0] = e;
      size++;
      return;
    }
    int qi = 0;
    while(qi < data.length && data[qi] != null) {
      qi++;
    }
    for(int qw = qi; qw > 0; qw--) {
      data[qw] = data[qw - 1];
    }
    data[0] = e;
    size++;
  }
  public void addLast(E e) throws NullPointerException {
    if(size + 1 >= data.length) {
      copyData();
    }
    if(data[data.length - 1] == null) {
      data[data.length - 1] = e;
      size++;
      return;
    }
    int qi = data.length - 1;
    while(qi >= 0 && data[qi] != null) {
      qi--;
    }
    for(int qw = qi; qw < data.length - 1; qw++) {
      data[qw] = data[qw + 1];
    }
    size++;
    data[data.length - 1] = e;
  }
  public E removeFirst() throws NoSuchElementException {
    E ret = data[0];
    data[0] = null;
    size--;
    return ret;
  }
  public E removeLast() throws NoSuchElementException {
    E ret = null;
    for(int q = data.length - 1; q >= 0; q--) {
      if(data[q] != null) {
        ret = data[q];
        data[q] = null;
        break;
      }
    }
    size--;
    return ret;
  }
  public E getFirst() throws NoSuchElementException {
    int q = 0;
    while(q < data.length && data[q] == null) {
      q++;
    }
    return data[q];
  }
  public E getLast() throws NoSuchElementException {
    int q = data.length - 1;
    while(q >= 0 && data[q] == null) {
      q--;
    }
    return data[q];
  }
  private void copyData() {
    @SuppressWarnings("unchecked")
    E[] teli = (E[])new Object[data.length * 2];
    for(int q = 0; q < data.length; q++) {
      teli[q] = data[q];
    }
    data = teli;
  }
  public static void main(String[] cvf) {
    MyDeque<Integer> fhfh = new MyDeque<Integer>();
    fhfh.addFirst(1);
    System.out.println(fhfh);
    fhfh.addFirst(0);
    System.out.println(fhfh);
    fhfh.addFirst(2);
    System.out.println(fhfh);
    System.out.println("removed: " + fhfh.removeFirst());
    System.out.println(fhfh);
    System.out.println("removed: " + fhfh.removeLast());
    System.out.println(fhfh);
    fhfh.addLast(3);
    System.out.println(fhfh);
    System.out.println("size: " + fhfh.size());
  }
}
