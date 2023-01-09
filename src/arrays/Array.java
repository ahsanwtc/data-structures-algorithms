package arrays;

public class Array {
  int[] array;
  int index = 0;

  public Array(int length) {
    array = new int[length];
  }

  public void insert(int item) {
    if (index == array.length) {
      int[] newArray = new int[index * 2];
      for (int i = 0; i < array.length; i++) {
        newArray[i] = array[i];
      }
      array = newArray;
    }

    array[index++] = item;
  }

  public int indexOf(int item) {
    for (int i = 0; i < length(); i++) {
      if (array[i] == item) {
        return i;
      }
    }
    return -1;
  }

  public int length() {
    return index;
  }

  public void removeAt(int index) {
    if (index > 0 && index < this.index) {
      for (int i = index; i < this.index; i++) {
        array[i] = array[i + 1];
      }
      this.index--;
    } else {
      throw new IllegalArgumentException();
    }
  }

  public void print() {
    for (int i = 0; i < index; i++) {
      System.out.println(array[i]);
    }
  }
}
