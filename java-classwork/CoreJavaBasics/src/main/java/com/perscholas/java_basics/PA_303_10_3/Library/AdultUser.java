package com.perscholas.java_basics.PA_303_10_3.Library;

/*
The methods in the AdultUser class should perform the following logic.
registerAccount : If age >= 12, a message displaying “You have successfully registered under an Adult Account.” should be displayed in the console.
If age <= 11, a message displaying, “Sorry, age must be greater than 12 to register as an adult.” should be displayed in the console.
requestBook : If bookType is “Fiction,” a message displaying “Book Issued successfully, please return the book within 7 days.” should be displayed in the console.
Else, a message displaying, “Oops, you are allowed to take only adult Fiction books.” should be displayed in the console.
 */
public class AdultUser implements LibraryUser {
    int age;
    String bookType;

    public String registerAccount(int age){
        if(age>=12){
            return "You have successfully registered under an Adult Account.";
        }
        else{
            return "Sorry, age must be greater than 12 to register as an adult.";
        }

    }

    public String requestBook(String bookType){
        if(bookType.equals("Fiction")){
            return "Book Issued successfully, please return the book within 7 days.";
        }
        else{
            return "Oops, you are allowed to take only adult Fiction books.";
        }

    }
}
