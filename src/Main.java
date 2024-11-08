

import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner console = new Scanner( System.in );
        System.out.println( "Enter your name:  " );
        
        String name = console.nextLine();
        System.out.println( "Enter your last name:  " );
        String lastName = console.nextLine();

        printNameCharacters( name );
        printNameLength( name );
        printName( name, lastName );
        console.close();
    }

    private static void printNameLength( String name )
    {
       System.out.println(name.length());
       
       
    }

    private static void printNameCharacters( String name )
    {
    	try {
	        for(int contador =0; contador <name.length(); contador ++) {
	        	System.out.println(name.charAt(contador));	
	        }      		
    	}catch(Exception e) {
    		System.out.println("errror");
    	}
  		

    }

    
    private static void printName(String name, String lastName) {
    	System.out.println(name + " " + lastName); 
    }

}