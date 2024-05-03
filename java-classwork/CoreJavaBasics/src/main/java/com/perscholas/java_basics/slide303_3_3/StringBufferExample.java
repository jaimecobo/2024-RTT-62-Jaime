package com.perscholas.java_basics.slide303_3_3;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Filename.txt");
        sb.insert(0, "new_");
        System.out.println(sb);

        //replace is going to delete the items from [index indicated] to [index indicated] and then insert the string at position start
        sb.replace(0, 4,"old_");
        System.out.println(sb);

        sb.replace(0, 4,"very_old_");
        System.out.println(sb);

        sb.replace(4, 4,"#old#");
        System.out.println(sb);

        sb.delete(0,14);
        System.out.println(sb);


        StringBuffer strPal01 = new StringBuffer("Kayak");
        System.out.println("Does the word \""+ strPal01 + "\" is a palindrome {true/false} = " + strPal01.equals(strPal01.reverse()));

        StringBuffer strPal02 = new StringBuffer(strPal01.reverse());

        System.out.println("strPal01 is = " + strPal01);
        System.out.println("strPal02 is = " + strPal02);
        System.out.println("Is \"" + strPal01 + "\" equal to \"" + strPal02 + "\" {true/false} = " + strPal01.equals(strPal02));


        StringBuffer notPal = new StringBuffer("Kayaking");
        System.out.println("Does the word \""+ notPal + "\" is a palindrome {true/false} = " + notPal.equals(notPal.reverse()));



    }
}
