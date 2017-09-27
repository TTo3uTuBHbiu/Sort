/**
 * Created by z on 25.09.2017.
 */

class Sort {


    public static int[] newDelta(int[] price) {
        int[] delta = new int[price.length];
        for (int i = 0; i < price.length - 1; i++) {
            delta[i] = price[i + 1] - price[i];
        }
        return delta;
    }


    public static int findMaxSubArraySum(int[] array) {
        int[] delt = newDelta(array);
        int maxSum = 0;
        int lastSum = 0;

        for (int i = 1; i < delt.length; i++) {
            lastSum += delt[i];
            if (lastSum < delt[i]) {
                lastSum = delt[i];
            }

            if (maxSum < lastSum) {
                maxSum = lastSum;
            }

        }

        return maxSum;
    }

}
