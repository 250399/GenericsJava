package com.bl.demo;

public class Generics {
    static public void main(String[] args) {
        int[] intArray =  {1,2,3,4,5,6,7,8};
        String[] stringArray = {"one","Tow","Three","Four","Five"};
        Double[] doubleArray = {1.2,33.1,44.2,55.4};
        toPrint(intArray);
        toPrint(stringArray);
        toPrint(doubleArray);
    }

    static void toPrint(String[] arr){
        System.out.println("String array elements:");
        for(String x : arr){
            System.out.println(x);
        }
    }

    static void toPrint(int[] arr){
        System.out.println("Int array elements:");
        for(Integer x : arr){
            System.out.println(x);
        }
    }

    static void toPrint(Double[] arr){
        System.out.println("Double array elements:");
        for(Double x : arr){
            System.out.println(x);
        }
    }
}
