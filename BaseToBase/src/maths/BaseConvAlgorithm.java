package maths;
import java.lang.Math; 
import java.lang.String;
public class BaseConvAlgorithm{
	
public static void main(String[] args) {
	String originalNum;
    String newNum;
    int originalBase;
    int newBase;
	}
    

private static String NumConvertBase( String originalNum, int originalBase, int newBase)
        {
        	double val = 0;
        	double decDigit = 0;
        	char chDigit;
        	
        	int L = originalNum.length();
        	for(int p = 0; p < L; p++) {
        		chDigit = Character.toUpperCase(originalNum.charAt(L-1-p));
        	
        		if(Character.isLetter(chDigit))
        		{
        			decDigit = chDigit - 'A' + 10;
        		}
        		else if(Character.isDigit(chDigit))
        		{
        			decDigit = chDigit - '0';
        		}
        		val += decDigit * Math.pow(originalBase, p);
        		}
        	int D = 1;
        	for( ; Math.pow(newBase, D) <= val; D++) {}
        	char[] newNum = new char[D];
        	double pwr;
        			
        			for(int p = D-1; p >= 0; p--)
        			{
        				pwr = Math.pow(newBase, p);
        				decDigit = Math.floor(val / pwr);
        				val -= decDigit*pwr;
        				
        				if(decDigit <= 9)
        					{
        					newNum[D-1-p] = (char) ('0' + (int)decDigit);
        					}
        				else 
        					{
        					newNum[D-1-p] = (char) ('A' + (int)decDigit - 10);
        					}
        				
        			}
        			
        			return new String(newNum);
        			}

}
