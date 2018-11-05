package maths;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class BaseConvAlgorithm {


		static BigInteger convertBase( int number, int radix ) {

	        List<Integer> remainder = new ArrayList<>();

	        int count = 0;
	        String result = "";
	        while( number != 0 ) {
	            remainder.add( count, number % radix != 0 ? number % radix : 0 );
	            number /= radix;
	            try {
	                result += remainder.get( count );
	            } catch( NumberFormatException e ) {
	                e.printStackTrace();
	            }
	        }
	        return new BigInteger( new StringBuffer( result ).reverse().toString() );
	    }

	    public static void main( String[] args ) {

	        System.out.println( convertBase( 69, 2 ) );

	    }
	
	}


