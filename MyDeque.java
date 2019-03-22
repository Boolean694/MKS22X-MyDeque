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
  }
  public void addLast(E e) throws NullPointerException {
    if(size + 1 >= data.length) {
      copyData();
    }
  }
  public E removeFirst() throws NoSuchElementException {
    return null;
  }
  public E removeLast() throws NoSuchElementException {
    return null;
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
}
