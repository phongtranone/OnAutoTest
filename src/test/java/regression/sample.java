package regression;

import org.testng.annotations.Test;

import java.util.*;

public class sample{
//    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();
//        Car vehicle1 = new Car();
//
//        vehicle.stopping();
//        vehicle1.stopping("Phong");
//    }

    //input : 1,2,3,5,4,1,3
    //output : 1+3 = 4

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,5,4,1,3);
        List<Integer> listTwo = getIntegerListDuplicateUsingSet(list);
        Set<Integer> setList = new HashSet<>(Arrays.asList(1,2,3,5,4,1,3));

        List<String> listStr = Arrays.asList("d", "c", "b", "a", "b", "b", "a");

        System.out.println("Sorted list: " + sortReverseOrderForASet(setList));

      //  System.out.println("Output: " + getDuplicatedStringList(listStr));

    }

    public static Set<Integer> sortReverseOrderForASet(Set<Integer> listOne){
        List<Integer> listTwo = new ArrayList<>(listOne);
        System.out.println("Debug111: " + listTwo);

        Collections.reverse(listTwo);
        System.out.println("Debug222: " + listTwo);

        Set<Integer> listThree = new LinkedHashSet<>();
        for(Integer i : listTwo){
            listThree.add(i);
        }
        System.out.println("Debug333: " + listThree);
        return listThree;
    }

    public static List<Integer> getIntegerListDuplicateUsingSet(List<Integer> list) {
        List<Integer> duplicates = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (Integer i : list) {
            if (set.contains(i)) {
                duplicates.add(i);
            } else {
                set.add(i);
            }
        }
        return duplicates;
    }

    public static Set<String> getStringListNotDuplicate(List<String> listStr){
        return new HashSet<>(listStr);
    }

    public static Set<Integer> removeAllDuplicatedNumbers(List<Integer> list){
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> listTwo = new HashSet<>();
        for(Integer i : list){
            if(listTwo.contains(i)){
                duplicates.add(i);
            }else{
                listTwo.add(i);
            }
        }
        listTwo.removeAll(duplicates);

        return listTwo;
    }

    public static Set<String> removeAllDuplicatedString(List<String> listStr){
        //get list of element that has duplication
        Set<String> listOne = new HashSet<>();
        Set<String> listTwo = new HashSet<>();
        for(String str : listStr){
            if(listOne.contains(str)){
                listTwo.add(str);
            }else{
                listOne.add(str);
            }
        }
        //Use removeALL of HashSet
        listOne.removeAll(listTwo);
        return listOne;
    }

    public static HashSet<String> getDuplicatedStringList(List<String> list){
        HashSet<String> listOne = new HashSet<>();
        HashSet<String> listTwo = new HashSet<>();
        for(String str : list){
            if(listOne.contains(str)){
                listTwo.add(str);
            }else{
                listOne.add(str);
            }
        }
        return listTwo;
    }

    public static int SumList(List<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++)
            sum += list.get(i);
        return sum;
    }

    public static int SumSetCollection(Set<Integer> list){
        int sum = 0;
        for (Integer i : list){
            sum = sum + i;
        }

        return sum;
    }
    @Test
    public void testMethodOne(){
        System.out.println("This is test method 1!!!");
    }

    @Test(priority = 2)
    public void testMethodTwo(){
        System.out.println("This is test method 2!!!");
    }
}
