package org.example.JavaCodes.SimpllrInterview;

import java.util.HashMap;

public class Interview3 {

    public static void main(String[] args) {

                /*
        Question : Get the count of duplicate character in the string
        Input {“ShivanshiSharma”,”ManviBhardwaj”,”SonaliGupta”,”PoojaPathak”}

        Output :ShivanshiSharma, 4
        ManviBhardwaj, 1
        SonaliGupta, 1
        PoojaPathak,3
         */


        String[] strings = {"ShivanshiSharma", "ManviBhardwaj","SonaliGupta", "PoojaPathak"};
        //String str = "ShivanshiSharma";
        //String[] ch = str.split("");

        //HashMap<String, Integer> chars = new HashMap<String, Integer>();

        for(int i=0; i<strings.length; i++)
        {
            HashMap<String,Integer> map = new HashMap<String,Integer>();
            for(int j=0; j<strings[i].length(); j++)
            {
                String[] s = strings[i].split("");

                for(int a=0; a<s.length; a++)
                {
                    if(map.containsKey(s[a]))
                    {
                        map.put(s[a],map.get(s[a]) + 1);
                    }
                    else
                    {
                        map.put(s[a],1);
                    }
                }
            }

            int count =0;
            for(Object d: map.keySet())
            {
                if(map.get(d)>1)
                {
                    count++;
                }
            }
            System.out.println(strings[i] + " " + count);
        }








        /*
        for(int i = 0; i < ch.length; i++)
        {
            if(chars.containsKey(ch[i]))
            {
                chars.put(ch[i],chars.get(ch[i]) + 1);
            }
            else
            {
                chars.put(ch[i],1);
            }
        }

        int count = 0;
        for(Object i : chars.keySet())
        {
            if(chars.get(i)>1)
            {
                count = count + 1;
            }
        }
        System.out.println(str + "," + count);
         */
    }
}
