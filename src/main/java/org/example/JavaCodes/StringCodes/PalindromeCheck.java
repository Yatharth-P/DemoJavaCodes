package org.example.JavaCodes.StringCodes;

public class PalindromeCheck {
    public static void main(String args[])
    {
        String str1 = "IxmxI";
        String str2 = "IxmxI";

        if(str2.length() == str1.length())
        {
            int flag = 0;
            for(int i=0; i<str1.length(); i++)
            {
                if(str1.charAt(i) == str2.charAt(str2.length()-i-1))
                {
                    continue;
                }
                else
                {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
            {
                System.out.println("Strings are palindrome");
            }
            else
            {
                System.out.println("Strings not palindrome");
            }
        }
        else
        {
            System.out.println("Strings are not equal");
        }
    }
}
