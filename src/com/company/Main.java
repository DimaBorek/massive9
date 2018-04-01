package com.company;

public class Main {

    public static void main(String[] args) {
        int zerCount = 0,negCount = 0, plusCount = 0;
	int[] array = new int[11];
        for (int i = 0; i <array.length ; i++) {
            array[i]= (int)(Math.random()*3)-1;
            System.out.print(array[i] + " ");
            if(array[i]==-1)
                negCount++;
            else if (array[i]==0)
                zerCount++;
            else
                plusCount++;


        }
        System.out.println( );
        if (negCount<zerCount && zerCount>plusCount)
        System.out.println("zer max = "+zerCount);
        else if (negCount>zerCount && negCount>plusCount)
        System.out.println("neg max = "+negCount);
        else
        System.out.println("plus max = "+plusCount);


    }
}
