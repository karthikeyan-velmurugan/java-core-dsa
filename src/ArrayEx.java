package src;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayEx {

    public static void main(String[] args) {
        //int[] input=new int[5];
        int[] input = {10, 60, 3, 24, 5, 10};
        int length = input.length;
        //System.out.println("Input : " + Arrays.toString(input));

        //arrayStringPalindrome("abcba");
        //arrayFindingMissingNum(new int[]{2, 4, 6, 1, 5});
        //arrayResizing(input, length);
        //arrayMoveZeroAtLast(new int[]{11, 0, 2, 0, 43});
        //arraySecondMaxValue(input);
        //arrayMinimumValue(input);
        //arrayReverse(input);
        //arrayEvenNumRemoval(input);
        //arrayToMap(input);
    }

    private static void arrayStringPalindrome(String input) {
        char[] charInput = input.toCharArray();
        int start = 0, end = charInput.length - 1;
        while (start < end) {
            if (charInput[start] != charInput[end]) {
                System.out.println(false);
                return;
            } else {
                start++;
                end--;
            }
        }
        System.out.println(true);
    }

    private static void arrayFindingMissingNum(int[] input) {
        int n = input.length + 1;
        int sum = n * (n + 1) / 2;
        for (int i : input) {
            sum = sum - i;
        }
        System.out.println("Missing Number :" + sum);
    }

    private static void arrayResizing(int[] input, int length) {
        int[] newArray = new int[length * 2];
        int j = 0;
        for (int i : input) {
            newArray[j] = i;
            j++;
        }
        System.out.println("New array length : " + newArray.length);
        System.out.println("Old array length : " + input.length);
    }

    private static void arrayMoveZeroAtLast(int[] input) {
        int j = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] != 0 && input[j] == 0) {
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            }
            if (input[j] != 0) {
                j++;
            }
        }
        System.out.println("Zero Moved : " + Arrays.toString(input));
    }

    private static void arraySecondMaxValue(int[] input) {
        int maxValue = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i : input) {
            if (i > maxValue) {
                secondMax = maxValue;
                maxValue = i;
            } else if (i > secondMax && i != maxValue) {
                secondMax = i;
            }
        }
        System.out.println("Maximum value : " + maxValue);
        System.out.println("2nd Maximum value : " + secondMax);
    }

    private static void arrayMinimumValue(int[] input) {
        int minValue = input[0];
        for (int i : input) {
            if (i < minValue) {
                minValue = i;
            }
        }
        System.out.println("Minimum Value : " + minValue);
    }

    private static void arrayReverse(int[] input) {
        int startIdx = 0;
        int endIdx = input.length - 1;
        while (startIdx < endIdx) {
            int temp = input[startIdx];
            input[startIdx] = input[endIdx];
            input[endIdx] = input[temp];
            startIdx++;
            endIdx--;
        }
        System.out.println("Reverse Array : " + Arrays.toString(input));
    }

    private static void arrayEvenNumRemoval(int[] input) {

        //with lambda expression
        //int[ ] evenResult= Arrays.stream(input).filter(n->n%2!=0).toArray();

        //without lambda expression
        int oddCount = 0;
        for (int i : input) {
            if (i % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("oddCount : " + oddCount);

        int[] evenResult = new int[oddCount];
        int indexNum = 0;
        for (int j : input) {
            if (j % 2 != 0) {
                evenResult[indexNum] = j;
                indexNum++;
            }
        }
        System.out.println("Odd Numbers : " + Arrays.toString(evenResult));
    }

    private static void arrayToMap(int[] input) {
        Map<Integer, Integer> map_value = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            map_value.put(i, input[i]);
        }
        System.out.println("Array to Map : " + map_value);
    }
}
