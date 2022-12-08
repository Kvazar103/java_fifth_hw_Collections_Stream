package tsk1;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> listString=new ArrayList<>();

        listString.add("vasya");
        listString.add("petya");
        listString.add("Marysya");
        listString.add("Rex");
        listString.add("Kapusta");
        listString.add("Andriy");
        listString.add("Pupkin");
        listString.add("YaponskiyBog");
        listString.add("Baran");
        listString.add("fsfsfsd");
        listString.add("qwerty");
        listString.add("bulba");
        listString.add("ccc");
        listString.add("opanas");
        listString.add("BOCKPEC");
        listString.add("rama");
        listString.add("entry");

        listString.sort((s1,s2)->s1.compareTo(s2));
        System.out.println(listString);

        Stream<String> max= listString.stream().filter(s -> s.length() < 4);
       System.out.println(max.toList());

        List<Integer> nums=Arrays.asList(11,22,544,32,123,24,25,26,12543,424324,999,53453,33,77,92,50,12,45,40,20);

        System.out.println(nums);
      Stream<Integer> integerStream=  nums.stream().sorted();
        System.out.println(integerStream.toList());

      Stream<Integer> integerToThree=nums.stream().filter(integer -> integer%3==0);
      System.out.println(integerToThree.toList());

      Stream<Integer> integerToTen=nums.stream().filter(integer -> integer%10==0);
      System.out.println(integerToTen.toList());

        for (Integer init:nums) {
            System.out.println(init);
        }
        Stream<Integer> integerThreeTime=nums.stream().map(integer -> integer*3);
        System.out.println(integerThreeTime.toList());
    }
}
