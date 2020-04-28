package com.bl.demo;

public class Generics {
    static public void main(String[] args) {
        Integer[] intArray =  {1,2,3,4,5,6,7,8};
        String[] stringArray = {"one","Tow","Three","Four","Five"};
        Double[] doubleArray = {1.2,33.1,44.2,55.4};
        toPrint(intArray);
        toPrint(stringArray);
        toPrint(doubleArray);
        toPrint_UsingGenerics(stringArray);
        toPrint_UsingGenerics(intArray);
        toPrint_UsingGenerics(doubleArray);
    }

    static void toPrint(String[] arr){
        System.out.println("String array elements:");
        for(String x : arr){
            System.out.println(x);
        }
    }

    static void toPrint(Integer[] arr){
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

    static <T> void toPrint_UsingGenerics(T[] arr){
        System.out.println("Printing Using Generics");
        for(T x : arr){
            System.out.println(x);
        }
    }
}
