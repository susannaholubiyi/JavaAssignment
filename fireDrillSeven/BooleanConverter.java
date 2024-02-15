package booleanConverter;

public class BooleanConverter {

    public boolean[] getBooleanEquivalentOf(int[] sample) {
        boolean[] outputArray = new boolean[sample.length];
        for (int index = 0; index < sample.length; index++){
            fillOutputArray(sample, outputArray, index);
        }
        return outputArray;
    }

    private static void fillOutputArray(int[] sample, boolean[] outputArray, int index) {
        boolean condition = sample[index] %2 == 0;
        if (condition) outputArray[index] = false;
        else outputArray[index] = true;
    }
}
