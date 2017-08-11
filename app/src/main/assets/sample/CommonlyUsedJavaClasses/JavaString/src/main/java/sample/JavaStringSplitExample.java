package sample;
/*
Java String split example.
This Java String split example describes how Java String is split into multiple
Java String objects.
*/

public class JavaStringSplitExample {

  public static void main(String args[]) {
    /*
    Java String class defines following methods to split Java String object.
    String[] split( String regularExpression )
    Splits the string according to given regular expression.
    String[] split( String reularExpression, int limit )
    Splits the string according to given regular expression. The number of resultant
    substrings by splitting the string is controlled by limit argument.
    */

    /* String to split. */
    String str = "one-two-three";
    String[] temp;

    /* delimiter */
    String delimiter = "-";
    /* given string will be split by the argument delimiter provided. */
    temp = str.split(delimiter);
    /* print substrings */
    for (int i = 0; i < temp.length; i++) System.out.println(temp[i]);

    /*
    IMPORTANT : Some special characters need to be escaped while providing them as
    delimiters like "." and "|".
    */

    System.out.println("");
    str = "one.two.three";
    delimiter = "\\.";
    temp = str.split(delimiter);
    for (int i = 0; i < temp.length; i++) System.out.println(temp[i]);

    /*
    Using second argument in the String.split() method, we can control the maximum
    number of substrings generated by splitting a string.
    */

    System.out.println("");
    temp = str.split(delimiter, 2);
    for (int i = 0; i < temp.length; i++) System.out.println(temp[i]);
  }
}

/*
 OUTPUT of the above given Java String split Example would be :
 one
 two
 three
 one
 two
 three
 one
 two.three
 */
