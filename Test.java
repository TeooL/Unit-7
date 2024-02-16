import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        Algorithms a = new Algorithms();
        //1) Remove Duplicates
        ArrayList<Integer> testCase1 = a.createTestCase(new int[]{1, 2, 2, 3, 3});
        ArrayList<Integer> testCase2 = a.createTestCase(new int[]{1, 2, 3, 4, 4});
        ArrayList<Integer> testCase3 = a.createTestCase(new int[]{2, 2, 2, 3, 1});
        a.removeDupConsecutive(testCase1);
        a.removeDupConsecutive(testCase2);
        a.removeDupConsecutive(testCase3);
        System.out.println(testCase1);
        System.out.println(testCase2);
        System.out.println(testCase3);
        //2) Remove Parameter from ArrayList
        ArrayList<Integer> testCase4 = a.createTestCase(new int[]{1,2,2,3,3});
        ArrayList<Integer> testCase5 = a.createTestCase(new int[]{1,4,2,4,1});
        ArrayList<Integer> testCase6 = a.createTestCase(new int[]{2,2,3,3,4,4,});
        a.removeTarget(testCase4,2);
        a.removeTarget(testCase5,4);
        a.removeTarget(testCase6,3);
        System.out.println(testCase4);
        System.out.println(testCase5);
        System.out.println(testCase6);
        //3) Adds Int Parameter in ascending order
        ArrayList<Integer> testCase7 = a.createTestCase(new int[]{1,2,2,3,3});
        ArrayList<Integer> testCase8 = a.createTestCase(new int[]{1,2,2,4,5});
        ArrayList<Integer> testCase9 = a.createTestCase(new int[]{1,1,3,4,5});
        a.addIntParam(testCase7, 4);
        a.addIntParam(testCase8, 3);
        a.addIntParam(testCase9, 2);
        System.out.println(testCase7);
        System.out.println(testCase8);
        System.out.println(testCase9);
        //4) checks if two Arraylists are reverse
        ArrayList<Integer> testCase10 = a.createTestCase(new int[]{1,2,3});
        ArrayList<Integer> testCase11 = a.createTestCase(new int[]{3,2,1});
        ArrayList<Integer> testCase12 = a.createTestCase(new int[]{1,1,3});
        ArrayList<Integer> testCase13 = a.createTestCase(new int[]{3,1,1});
        ArrayList<Integer> testCase14 = a.createTestCase(new int[]{2,4,5});
        ArrayList<Integer> testCase15 = a.createTestCase(new int[]{5,4,1});
        System.out.println(a.isReverse(testCase10,testCase11));
        System.out.println(a.isReverse(testCase12,testCase13));
        System.out.println(a.isReverse(testCase14,testCase15));
        //5) and 6) return min and max
        ArrayList<Integer> testCase16 = a.createTestCase(new int[]{3,2,1});
        ArrayList<Integer> testCase17 = a.createTestCase(new int[]{3,10,7});
        ArrayList<Integer> testCase18 = a.createTestCase(new int[]{6,8,9});
        System.out.println(a.returnMax(testCase16));
        System.out.println(a.returnMax(testCase17));
        System.out.println(a.returnMax(testCase18));
        System.out.println(a.returnMin(testCase16));
        System.out.println(a.returnMin(testCase17));
        System.out.println(a.returnMin(testCase18));
        //7) and 8) longest and shortest string
        ArrayList<String> testCase19 = a.createTestCase(new String[]{"Hello,","world","!"});
        ArrayList<String> testCase20 = a.createTestCase(new String[]{"Hi,","people","why"});
        ArrayList<String> testCase21 = a.createTestCase(new String[]{"Hello,","fighter","am"});
        System.out.println(a.returnShortest(testCase19));
        System.out.println(a.returnShortest(testCase20));
        System.out.println(a.returnShortest(testCase21));
        System.out.println(a.returnLongest(testCase19));
        System.out.println(a.returnLongest(testCase20));
        System.out.println(a.returnLongest(testCase21));
        //9) largest abs difference
        ArrayList<Integer> testCase22 = a.createTestCase(new int[]{2,3,4});
        ArrayList<Integer> testCase23 = a.createTestCase(new int[]{-1,-2,-3});
        ArrayList<Integer> testCase24 = a.createTestCase(new int[]{-2,8,9});
        ArrayList<Integer> testCase25 = a.createTestCase(new int[]{6,1,4});
        ArrayList<Integer> testCase26 = a.createTestCase(new int[]{-5,6,11});
        ArrayList<Integer> testCase27 = a.createTestCase(new int[]{4,8,9});
        System.out.println(a.largestAbsDiff(testCase22,testCase23));
        System.out.println(a.largestAbsDiff(testCase24,testCase25));
        System.out.println(a.largestAbsDiff(testCase26,testCase27));
        //10) mean average
        ArrayList<Double> testCase28 = a.createTestCase(new double[]{1.5,3.5,5.5});
        ArrayList<Double> testCase29 = a.createTestCase(new double[]{2.5,2.5,2.5});
        ArrayList<Double> testCase30 = a.createTestCase(new double[]{3.0,3.5,2.5});
        System.out.println(a.mean(testCase28));
        System.out.println(a.mean(testCase29));
        System.out.println(a.mean(testCase30));
        //11) reverses the elements
        ArrayList<Integer> testCase31 = a.createTestCase(new int[]{1,2,3});
        ArrayList<Integer> testCase32 = a.createTestCase(new int[]{3,2,1});
        ArrayList<Integer> testCase33 = a.createTestCase(new int[]{3,4,1,5});
        a.reverseArray(testCase31);
        a.reverseArray(testCase32);
        a.reverseArray(testCase33);
        System.out.println(testCase31);
        System.out.println(testCase32);
        System.out.println(testCase33);
        //12) contains two consecutive values
        ArrayList<Integer> testCase34 = a.createTestCase(new int[]{1,2,3,3,4});
        ArrayList<Integer> testCase35 = a.createTestCase(new int[]{3,2,2,1});
        ArrayList<Integer> testCase36 = a.createTestCase(new int[]{3,2,1,5});
        System.out.println(a.hasConsecutive(testCase34));
        System.out.println(a.hasConsecutive(testCase35));
        System.out.println(a.hasConsecutive(testCase36));
        //13) index of first negative
        ArrayList<Integer> testCase37 = a.createTestCase(new int[]{1,0,-1});
        ArrayList<Integer> testCase38 = a.createTestCase(new int[]{3,-2,2,1});
        ArrayList<Integer> testCase39 = a.createTestCase(new int[]{-4,2,1,5});
        System.out.println(a.indexOfFirstNegativeVal(testCase37));
        System.out.println(a.indexOfFirstNegativeVal(testCase38));
        System.out.println(a.indexOfFirstNegativeVal(testCase39));
        //14) has equal values
        ArrayList<Integer> testCase40 = a.createTestCase(new int[]{1,2,3,2});
        ArrayList<Integer> testCase41 = a.createTestCase(new int[]{1,4,2,1});
        ArrayList<Integer> testCase42 = a.createTestCase(new int[]{1,2,5});
        System.out.println(a.hasEqualValues(testCase40));
        System.out.println(a.hasEqualValues(testCase41));
        System.out.println(a.hasEqualValues(testCase42));
    }
}

