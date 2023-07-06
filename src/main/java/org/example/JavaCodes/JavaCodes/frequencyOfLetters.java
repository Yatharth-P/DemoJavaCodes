package org.example.JavaCodes.JavaCodes;

public class frequencyOfLetters {
    public static void main(String args[])
    {
        String str1 = "Henil works in an MNC company.";
        int strlen = str1.length();

        str1 = str1.toLowerCase();
        System.out.println("Before len : " + strlen);

        for(char c='a'; c<= 'z'; c++)
        {
            int count = 0;
            for (int i=0; i<strlen; i++)
            {
                if(c == str1.charAt(i))
                    count++;
            }
            System.out.println("Character : " + c + " has count of : "+ count);
        }

        str1 = str1.replaceAll(" ", "");
        System.out.println("After len : " + str1.length());
    }
}
