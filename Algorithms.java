import java.util.ArrayList;
public class Algorithms {
    public void removeDupConsecutive(ArrayList<Integer> nums){
        for (int i = 0;i < nums.size() - 1; i++){
            if (nums.get(i) == nums.get(i + 1)){
                nums.remove(i + 1);
                i--;
            }
        }
    }
    public void removeTarget(ArrayList<Integer> nums, int target){
        for (int i = 0;i < nums.size(); i++){
            if (nums.get(i) == target){
                nums.remove(i);
                i--;
            }
        }
    }
    public void addIntParam(ArrayList<Integer> nums, int num){
        int index = 0;
        for (int value:nums){
            if(num<=value) break;
            index++;
        }
        if (index >nums.size()-1) nums.add(num);
        else nums.add(index,num);
    }
    public boolean isReverse(ArrayList<Integer> first, ArrayList<Integer> second){
        for (int i = 0;i < first.size() - 1; i++){
            if (first.get(i) != second.get(second.size()-i -1)) return false;
        }
        return true;
    }
    public int returnMax(ArrayList<Integer> nums){
        int max = nums.get(0);
        for (int i = 1;i < nums.size();i++){
            if (nums.get(i) > max) max = nums.get(i);
        }
        return max;
    }
    public int returnMin(ArrayList<Integer> nums){
        int min = nums.get(0);
        for (int i = 1;i < nums.size();i++){
            if (nums.get(i) < min) min = nums.get(i);
        }
        return min;
    }
    public String returnShortest(ArrayList<String> words){
        String shortest = words.get(0);
        for (int i = 0; i < words.size(); i++){
            if (words.get(i).length() < shortest.length()) shortest = words.get(i);
        }
        return shortest;
    }
    public String returnLongest(ArrayList<String> words){
        String longest = words.get(0);
        for (int i = 0; i < words.size(); i++){
            if (words.get(i).length() > longest.length()) longest = words.get(i);
        }
        return longest;
    }
    public int largestAbsDiff(ArrayList<Integer> list1, ArrayList<Integer> list2){
        int largestAbsDiff = Math.abs(list1.get(0) - Math.abs(list2.get(0)));
        for (int i = 1; i < list1.size();i++){
            if (list1.get(i) - list2.get(i) > largestAbsDiff) largestAbsDiff = list1.get(i) - list2.get(i);
        }
        return largestAbsDiff;
    }
    public double mean(ArrayList<Double> nums){
        double sum = 0;
        for (double num:nums){
            sum += num;
        }
        return sum/ nums.size();
    }
    public void reverseArray(ArrayList<Integer> nums){
        for (int i = 0; i < nums.size()/2;i++){
            int temp = nums.get(i);
            nums.set(i, nums.get(nums.size() - i -1));
            nums.set(nums.size() - i - 1, temp);
        }
    }
    public boolean hasConsecutive(ArrayList<Integer> nums){
        for (int i = 0; i < nums.size() - 1;i++){
            if (nums.get(i) == nums.get(i+1)) return true;
        }
        return false;
    }
    public int indexOfFirstNegativeVal(ArrayList<Integer> nums){
        for (int i = 0; i < nums.size();i++){
            if (nums.get(i) < 0) return i;
        }
        return -1;
    }
    public boolean hasEqualValues(ArrayList<Integer> nums){
        for (int i=0;i<nums.size();i++){
            for (int n = i + 1; n<nums.size();n++) {
                if (nums.get(n).equals(nums.get(i))) return true;
            }
        }
        return false;
    }
    public ArrayList<Integer> createTestCase(int[] nums){
        ArrayList<Integer> newNum = new ArrayList<Integer>();
        for (int i: nums){
            newNum.add(i);
        }
        return newNum;
    }
    public ArrayList<String> createTestCase(String[] words) {
        ArrayList<String> newNum = new ArrayList<String>();
        for (String i : words) {
            newNum.add(i);
        }
        return newNum;
    }
    public ArrayList<Double> createTestCase(double[] numbers){
        ArrayList<Double> newNum = new ArrayList<Double>();
        for (double i: numbers){
            newNum.add(i);
        }
        return newNum;
    }
}



