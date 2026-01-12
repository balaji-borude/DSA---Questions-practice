package Bit_manipulation;

class Bit{
    
    // check number is even or odd using the Bit_Manipulation 
    public static void EvenOrOdd(int n){
        int bitMask = 1;

        if((n & bitMask) == 1){
            System.out.println("Number is odd");
        }
        else{
            System.out.println("Number is even");
        }
    }


    // OPERATION PERFORM ON BITssss

    // find the ith Positon on Bit 
    public static int getIthBit(int n, int i){

        int bitMask = 1 << i;   // here left shift operator is used --> to sift the bitmask to ith position 

        // n is (binary number) and use of & operator to tell which number is present 
        // 0 & 0 --> 0
        // 0 & 1 --> 0
        // 1 & 0 --> 0
        // 1 & 1 --> 1 
         // this conditon of & operator --> used to tell which no. is present  
         /*
             001
          &  101
          ----------
             001
         */

        if((n & bitMask)== 0 ){
            return 0;
        }else{
            return 1;
        }

    }

    // set ith bits
    public static int setIthBit(int n , int i){

        int bitMask = 1<<i;
        return n | bitMask;
    }


    public static void main(String[] args) {
        //Binary AND --> &
        // System.out.println(5&6);
        // Binary OR --> |
        // System.out.println(5|6);
        // Binary XOR -->  ^
        // System.out.println(5^6);
        // Binary LeftShift -->  <<
        // System.out.println(5<<2);
        // Binary Right Shift 
        //System.out.println(8>>2);

        // Ccheck no. is even or odd
        // EvenOrOdd(3);
        // EvenOrOdd(10);

        // Get the ith bits
        // System.out.println(getIthBit( 3 ,1));

        // set the Ith bits
        System.out.println(setIthBit(10,3));

    }
}