package com.perscholas.java_basics.PA_303_10_3.Library;
/*
The methods in the KidUser class should perform the following logic.
registerAccount: If age <= 11, a message displaying “You have successfully registered under a Kids Account” should be displayed in the console.
If (age > 11), a message displaying, “Sorry, age must be less than 12 to register as a kid.” should be displayed in the console.
requestBook: If bookType is “Kids,” a message displaying “Book issued successfully, please return the book within 10 days” should be displayed in the console.
Else, a message displaying, “Oops, you are allowed to take only kids books.” should be displayed in the console.

 */

public class KidUser implements LibraryUser{
    int age;
    String bookType;


    public String registerAccount(int age){
        if(age<=11){
            return "You have successfully registered under a Kids Account.";
        }
        else{
            return "Sorry, age must be less than 12 to register as a kid.";
        }


    }

    public String requestBook(String bookType){
        if(bookType.equals("Kids")){
            return "Book issued successfully, please return the book within 10 days.";
        }
        else{
            return "Oops, you are allowed to take only kids books.";
        }

    }
}
