import java.util.ArrayList;
public class Main {
    public static void main(String[]args){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        ArrayList<Double> doubles = new ArrayList<Double>();
        doubles.add(4.0);
        ArrayList<Boolean> bools = new ArrayList<Boolean>();
        bools.add(true);
        ArrayList<String> words = new ArrayList<String>();
        words.add("One");
        ArrayList<Notebook> backpack = new ArrayList<Notebook>();
        backpack.add(new Notebook());
        ArrayList list = new ArrayList();
        list.add(4);
        list.add(true);
        System.out.println(nums);
        System.out.println(doubles);
        System.out.println(bools);
        System.out.println(words);
        System.out.println(backpack);
        System.out.println(list);
    }
}
