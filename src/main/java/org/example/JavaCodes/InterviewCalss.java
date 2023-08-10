package org.example.JavaCodes;

public class InterviewCalss {

    public static void main(String[] args) {

        double[] cgpa = {3.68,3.85, 3.75, 3.75,3.76};
        String[] names = {"Rumpa","Ashis","Samitha","Samara","Fahim"};

        for(int i=0; i<cgpa.length; i++)
        {
            for(int j = i+1; j < cgpa.length; j++)
            {
                if(cgpa[i]>cgpa[j])
                {
                    double temp = cgpa[i];
                    cgpa[i] = cgpa[j];
                    cgpa[j] = temp;

                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }


        for(double cgpa1 : cgpa)
        {
            System.out.println(cgpa1);
        }

        for(String name:names)
        {
            System.out.println(name);
        }
    }
}
