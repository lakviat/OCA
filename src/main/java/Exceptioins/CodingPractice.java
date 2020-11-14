package Exceptioins;

import java.lang.module.FindException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.stream.Collectors;

public class CodingPractice {

    public static final String names = "Hello kotok";

    public static void main(String[] args) {
        CodingPractice.FinDuplicates();

    }

    public static void FinDuplicates(){
        int [] num = {10,20,30,40,50,60,50};

        List<Integer> nums = Arrays.asList(new Integer[] {10,20,30,40,50,50});
        nums.stream().filter(i -> Collections.frequency(nums, i) > 1)
                .collect(Collectors.toSet()).forEach(System.out::println);
    }
}
class Kotok {

    //
    public void Kotok(String kotok, int sigein){
        System.out.println("First one");
}
    public void Kotok(String punch){
        System.out.println("Second one ");
}

}