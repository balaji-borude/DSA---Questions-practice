import java.util.Arrays;

public class Assignment {
    // Q1.Count how many times lowercase vowels occured in a string entered by user.

    public static int CheckedVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a'
                    || str.charAt(i) == 'e'
                    || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }

        return count;
    };

    // Q2. What will be the output of the followingcode?
        // str.equals(str1) ==> Compares the actual content of the strings, character by character.return Boolean value
        // Eg. str1 == str2 --> This checks whether both variables point to the exact same object in memory.
        // Eg. str1.equals(str2) --> This checks whether the actual characters inside the strings are the same.
    public static void checkOutput() {
        String str = "ShradhaDidi";
        String str1 = "ApnaCollege";
        String str2 = "ShradhaDidi";
        System.out.println(str.equals(str1) + " " + str.equals(str2));
    }


    //Q3. What will be the output of the followingcode?
      // here .replace() ==> method is expalained --> eplace targeted letter with replacement 
    public static void checkOutput2(){
        String str="ApnaCollege".replace("l","");
        System.out.println(str);
    }

    // Q4. Determine if 2 Strings areanagramsof each other.
        // What are anagrams? ->If Two string contain same characters but in a different order , they can be said the anagrams,
        // eg. consider race and car , In this case race's characters can be formed  into the study, or care's characters can be formed into the race. 
        
        //##### point to be Noted #####
        //  Character.toLowerCase(char1) --> is used to convert each word to lowecase 
        //Converting an Entire String to lowercase use--> String originalString = "HeLlO WoRlD!"; String lowerCaseString = originalString.toLowerCase()

    public static void checkAnagram(String str1,String str2){
        // first convert strings to lowercase 
        str1=str1.toLowerCase();
        str2= str2.toLowerCase();

        // check length are same or not -> if not then show not a anagram 
        if(str1.length() == str2.length()){
            // if the length of str are equal then convert string into chararray 
            char[] str1CharArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            // now sort the array --> by uisng inbuilt method 
            Arrays.sort(str1CharArray);
            Arrays.sort(str2charArray);

            // if the sorted array is same or identical then given string are anagram 
            boolean result = Arrays.equals(str1CharArray, str2charArray);
            if(result){
                System.out.println("given String are anagram of each other  ");

            }else{
                System.out.println("Given strings are not anagram of each other ");
            }

        }else{
            System.out.println(str1 + "and " + str2 + " are not a anagram") ;
        }
        
    }

    
    public static void main(String[] args) {
        String str = "my name is balaji";
        String str3 = "my name is balaji";

        String str1 = new String("race");
        String str2 = new String("care");
        // System.out.println(CheckedVowels(str));
            // practice 
            // System.out.println(str3==str1);
            // System.out.println(str.equals(str1));

        // Q2. check output
        //checkOutput();
        
        //Q3. check output2
            //checkOutput2();

        //Q4. check String is anagram or not 
           // checkAnagram(str1,str2);
    }
}
