package arrays;

public class ArrayDemo {
  public static boolean exercise = true;

  public static void main() {
    if (exercise) {
      arrays.exercise.Array numbers = new arrays.exercise.Array(5);
      numbers.insert(10);
      numbers.insert(20);
      numbers.insert(30);
      numbers.insert(40);
      numbers.insert(50);
      numbers.print();
      System.out.println("----------------------------");
      System.out.println("max");
      System.out.println(numbers.max());
      System.out.println("----------------------------");
      System.out.println("intersection");
      arrays.exercise.Array numbers2 = new arrays.exercise.Array(3);
      numbers2.insert(50);
      numbers2.insert(30);
      numbers2.insert(10);
      arrays.exercise.Array intersected = numbers.intersect(numbers2);
      intersected.print();

      return;
    }

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
