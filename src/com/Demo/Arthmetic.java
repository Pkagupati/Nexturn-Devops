package com.Demo;

public class Arthmetic {
    public int add(int a, int b){
        return a+b;
    }
    public int substract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int division(int a,int b){
        return a%b;
    }

    public static void main(String args[]){
        Arthmetic arthmetic = new Arthmetic();
        System.out.println("addiing two numbers: "+ arthmetic.add(2,5));
        System.out.println("substracting two numbers: "+ arthmetic.substract(2,5));
        System.out.println("multiplying two numbers: "+ arthmetic.multiply(2,5));
        System.out.println("division of two numbers: "+ arthmetic.division(2,5));
    }

}
