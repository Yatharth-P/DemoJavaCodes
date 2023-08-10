package org.example.JavaCodes.Practice.StringCodes;

public class PalindromeCheck {

    public static void main(String[] args) {

        String str1 = "IxmxaI";
        String str2 = "IxmxsI";
        boolean flag = true;
        if(str1.length() == str2.length())
        {
            for(int i = 0; i <str1.length(); i++)
            {
                if(str1.charAt(i) == str2.charAt(str2.length()-1-i))
                {
                    continue;
                }
                else
                {
                    flag = false;
                    break;
                }
            }

            if(flag)
            {
                System.out.println("Palindrome");
            }
            else
            {
                System.out.println("Not palindrome");
            }
        }
    }
}
