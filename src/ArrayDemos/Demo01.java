package ArrayDemos;

import java.util.Scanner;

class Student{
    public int rollNo;
    public String name;
}

public class Demo01 {

    public static void main(String[] args) {
          //intialization of array
//        int[] nums = {20,45,55,56};
//        Student[] stud_list = new Student[5];


        // declaration of array
        int[] nums = new int[10];
        Scanner sc = new Scanner(System.in);


        // filling array by accepting values
        for(int i=0;i<nums.length;i++){
            System.out.println("enter a number");
            nums[i] = sc.nextInt();
        }


        // print an array
        System.out.println("All elements of array");
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }


        System.out.println("Filtered array");
        for(int i=0;i<nums.length;i++){
           if(nums[i]%2 == 0){
               System.out.println(nums[i]);
           }
        }





    }


}
