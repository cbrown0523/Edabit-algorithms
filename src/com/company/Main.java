
//get word count

public class Program {
    public static int countWords(String s){
        return s.split(" ").length;
    }
}

//pair management
public class Pairs {
    public static int[] makePair(int a, int b) {

        int[] pair = {a , b};

        return pair;

    }
}

//11/2 Return the Sum of Two Numbers
public class Challenge {
    public static boolean checkEnding(String str1, String str2) {
        if(str1.endsWith(str2)){
            return true;
        }
        else{
            return false;
        }
    }
}
//Intro to Java Day 1
//Convert Minutes into Seconds
public class Challenge {
    public static int convert(int minutes) {
        int sec = minutes *  60 ;
        return sec ;

    }
}
//Return Something to Me!
public class Program {
    public static String giveMeSomething(String a) {
        String something = "something";
        return something + " " + a ;
    }
}

//day2 Less Than 100?
public class Challenge {
    public static boolean lessThan100(int a, int b) {
        if( a + b < 100){
            return true;
        }
        else{
            return false;
        }
    }
}
//Get Word Count
public class Program {

    public static int countWords(String s) {
        String[] words = s.split(" ");
        return words.length;
    }
}

//CheCheck if String Ending Matches Second Stringck if String Ending Matches Second String
public class Challenge {
    public static boolean checkEnding(String str1, String str2) {
        if(str1.endsWith(str2)){
            return true;
        }
        else
        {
            return false;
        }
    }
}
//Day 3 Reverse the Order of a String
public class ReverseOrder {
    public static String reverse(final String str) {
        String result = "";
        for (int i=str.length()-1;i>=0;i--){
            result += str.charAt(i);
        }
        return result;
    }
}
//rock,paper,scissor
public class Challenge {
    public static String rps(String s1, String s2) {
        if(s1.equals(s2)){
            return "TIE";
        }
        else if(s1 == "rock" && s2 == "sissors" || s1 == "scissors" && s2 =="paper"
                || s1== "paper" && s2 == "rock"){
            return "Player 1 wins";
        }
        else{
            return"Player 2 wins";
        }

    }
}