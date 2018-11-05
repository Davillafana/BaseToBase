import java.util.Scanner;
import java.lang.String;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
	// write your code here

            System.out.println("================================");
            System.out.println("========= Base converter =======");
            System.out.println("================================");





        Scanner sc = new Scanner(System.in);

       
        String originalNum;
        String newNum;
        int originalBase;
        int newBase;
        

        System.out.print("originalNum: ");
        originalNum = sc.nextLine();
        
        System.out.print("originalBase: ");
        originalBase = sc.nextInt();

        ValidateBase(originalBase);
        ValidateNumInBase(originalNum, originalBase);
        
        System.out.print("newBase: ");
        newBase = sc.nextInt();
        sc.close();

        newNum = NumConvertBase( originalNum, originalBase, newBase);
        System.out.println(newNum);
        /*Scanner op = new Scanner(System.in);

        System.out.println("is this what you want?");
        System.out.println(" 1 for yes or  2 for no");

        int yes = op.nextInt();
        
        switch(yes)
        {
            case(1):
                System.out.println("voila!");
            	//System.out.println(newNum);
                break;
            case(2):
                System.out.println("you chose no, back to the beginning!");
            	System.exit(1);
                break;
        }*/
        }
        private static void ValidateBase(int base)
        {
        	
        	if(base < 2 || base > 36) {
        		System.out.println("error: base must be greater than or equal to 2 and less than or equal to 36");
        		System.exit(1);
        	}
        }
        private static void ValidateNumInBase(String num, int base) {
        	
        	char chDigit;
        	for (int d = 0; d <num.length(); d++)
        	   { 
        		chDigit = num.toUpperCase().charAt(d);
        		if (Character.isDigit(chDigit) && (chDigit - '0') >= base) {
        			System.out.println("cannot have digit " +chDigit + " in base " + base);
        			System.exit(1);
        		} else if (Character.isLetter(chDigit) && (chDigit - 'A') + 10 >= base) {
            			System.out.println("cannot have digit " +chDigit + " in base " + base);
            			System.exit(1);
        		} //else if(!Character.isDigit(chDigit) &&
        			//	!Character.isLetter(chDigit)); {
        			//System.out.println("Invalid digit character " + chDigit);
        			//System.exit(1);}
        		}
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

        //operation = op.next();}