package com.omar;


import java.util.*;

public class Main {
    public static void main(String[] args) {
//        non-primitive: data types
//        values that are instances of classes
        String name = "Omar";


        int age = 40;

        ArrayList<Integer> ages = new ArrayList<>();

        var mainInstance = new Main();

        mainInstance.secondary();





        for(Integer val : ages){
            System.out.println(val);
        }

        int[] nums = {1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> lessThan5 = new ArrayList<>();

        for(int i =0; i<nums.length+1; i++){
            if(nums[i]<5){
                lessThan5.add(nums[i]);
            }
        }


        Map<Integer,String> students = new HashMap<>();

        students.put(3,"Maryam");
        students.put(2,"Mihai");
        students.put(1,"Sumayya");
        students.put(4,"Hasan");

        System.out.println(students);



        LinkedHashMap<Integer,String> studentsOrdered = new LinkedHashMap<>();


        studentsOrdered.put(3,"Maryam");
        studentsOrdered.put(2,"Mihai");
        studentsOrdered.put(1,"Sumayya");
        studentsOrdered.put(4,"Hasan");

        System.out.println(studentsOrdered);

        Set<String> values = new HashSet<>();




    }

    public void secondary(){
        System.out.println("Secondary method running...");
    }

    public int add(int num1,int num2){

        return num1 + num2;
    }

    public int subtract(){
        return 0;
    }
}