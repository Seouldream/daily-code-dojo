public class AverageSolution {

  double average(int[] array) {

    double divider = array.length;
    double sum = 0;

    for (int i = 0; i < divider; i += 1) {
      sum += array[i];
    }

    return sum / divider;
  }
}

