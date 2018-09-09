package com.innovanon.simon.Simon0;

import java.util.Arrays;

/**
 * Hello world!
 * 
 * @author seanrdev
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Simon lib = new Simon ();
        //lib.foo();
        int[] tmp = lib.instantiate(int[].class);
        System.out.println(Arrays.toString(tmp));
    }
}
