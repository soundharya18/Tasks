package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// 1declare and initialize String array with 7colors
        String[] ColorsArr=new String[]{"red","green","pink","blue","yellow", "black", "white"};
        //2create new Arraylist colors of type string

      ArrayList<String>  colors = new ArrayList<>();
      //3copying or adding all elements from string array
        //to Arraylist
        Collections.addAll(colors,ColorsArr);
        System.out.println(colors);

        //4Remove 3rd element from colors list
        colors.remove(2);
        System.out.println(colors);


        //5 add new color at the end of colors list
        colors.add("violet");
        System.out.println(colors);

        //6 new color at the beginning
        colors.add(0,"grey");
        System.out.println(colors);

        //7 loop through colors list
        for (String a: colors
             ) {
            System.out.println(a + " ");

        }
        //8 creation of sublist
        ArrayList<String> colorsSublist = (ArrayList<String>) colors.subList(2,5);
        System.out.println("Sublist ");
        System.out.println(colorsSublist);
        //9 for loop to iterate through sublist

        for (int a=0; a<colorsSublist.size();a++ ){
            System.out.println(colorsSublist.get(a) +" ");
        }

    }
}
