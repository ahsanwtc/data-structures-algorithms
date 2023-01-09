package arrays;

public class ArrayDemo {

  public static void main() {
    Array numbers = new Array(3);
    numbers.insert(10);
    numbers.insert(20);
    numbers.insert(30);
    numbers.insert(40);
    // numbers.removeAt(3);
    // numbers.print();
    numbers.removeAt(3);
    numbers.print();
    // System.out.println(numbers.indexOf());
  }
}
