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

    }
    public boolean isReverse(ArrayList<Integer> first, ArrayList<Integer> second){
        for (int i = 0;i < first.size() - 1; i++){
            if (first.get(i) != second.get(i)) return false;
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
            if (nums.get(i) > min) min = nums.get(i);
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
}
