package arrays.exercise;

public class Array extends arrays.Array {
  public Array(int length) {
    super(length);
  }

  public int max() {
    int max = this.getItem(0);
    for (int i = 0; i < this.length(); i++) {
      if (max < this.getItem(i)) {
        max = this.getItem(i);
      }
    }
    return max;
  }

  public Array intersect(Array items) {
    Array intersected = new Array(this.length());
    for (int i = 0; i < this.length(); i++) {
      for (int j = 0; j < items.length(); j++) {
        if (this.getItem(i) == items.getItem(j)) {
          intersected.insert(this.getItem(i));
        }
      }
    }
    return intersected;
  }

  public Array reverse() {
    Array reversed = new Array(this.length());
    for (int i = this.length() - 1; i > -1; i--) {
      reversed.insert(this.getItem(i));
    }
    return reversed;
  }

  public Array insertAt(int item, int index) {
    if (index < 0 || index >= this.length()) {
      throw new IllegalArgumentException();
    }

    Array newArray = new Array(this.length() + 1);
    for (int i = 0; i < this.length(); i++) {
      if (i == index) {
        newArray.insert(item);
      } else {
        newArray.insert(this.getItem(i));
      }
    }
    return newArray;
  }
}
