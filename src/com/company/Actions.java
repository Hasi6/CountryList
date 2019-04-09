package com.company;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Actions {
    Scanner s4 = new Scanner(System.in);
    LinkedList<String> countries = new LinkedList<String>();

    String country;
    public void addCountry(){
        System.out.println("Enter Country name you want to visit");
        country = s4.next();
        countries.add(country);
    }
    public void print(){
        for (int i=0;i<countries.size();i++){
            System.out.println((i+1)+" Country is "+countries.get(i));
        }
    }
    public void remove(){
        System.out.println("Enter country Name you want to remove");
        country = s4.next();
        if(countries.contains(country)){
            System.out.println(country+" is removed from list");
            countries.remove(country);
        }
        else{
            System.out.println("There is No country like "+country+" in your List");
        }
    }

}
