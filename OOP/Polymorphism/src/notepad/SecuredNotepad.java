package notepad;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad implements ISecuredNotepad {
    private final  String password;

    public SecuredNotepad(int numberOfPages) {
        super(numberOfPages);
        this.password = strongPassword();
    }

    private String strongPassword(){
        Scanner sc = new Scanner(System.in);

       while (true) {
           System.out.println("Input secured password");
           String password = sc.nextLine();
           boolean hasUpper=false,hasLower=false,hasDigit=false;
           if (password.length() >= 5) {
               for (int index = 0; index < password.length(); index++) {
                   if (password.charAt(index) >= 'A' && password.charAt(index) <= 'Z') hasUpper = true;
                   if (password.charAt(index) >= 'a' && password.charAt(index) <= 'z') hasLower = true;
                   if (password.charAt(index) >= '1' && password.charAt(index) <= '9') hasDigit = true;
                   if (hasDigit && hasLower && hasUpper) {
                       System.out.println("Password set!");
                       return password;
                   }
               }
               System.out.println("Invalid password!" +
                       "Please make sure that the password has at least:"
                       + '\n' +"One digit,one Uppercase letter and one Lowercase letter!");
           }else{
               System.out.println("Password is too short" +
                       '\n' + "Password must be more than 5 characters");
           }


       }

    }
    @Override
    public void addText(int pageNumber, String text) {
        System.out.println("For adding text please input password");
        if (correctPassword()) {
            super.addText(pageNumber, text);
        }
    }

    @Override
    public void deleteText(int pageNumber) {
        System.out.println("For deleting text please input password");
        if (correctPassword()) {
            super.deleteText(pageNumber);
        }
    }

    @Override
    public void changeText(int pageNumber, String text) {
        System.out.println("For changing text please input password");
        if (correctPassword()) {
            super.changeText(pageNumber, text);
        }
    }

    @Override
    public void printAllPages() {
        System.out.println("For printing all pages please input password");
        if (correctPassword()) {
            super.printAllPages();
        }
    }

    @Override
    public boolean searchWord(String word) {
        System.out.println("For searching of word please input password");
        if (correctPassword()) {
            return super.searchWord(word);
        }
        return false;
    }

    @Override
    public void printAllPagesWithDigits() {
        System.out.println("For printing all pages containing digits please input password");
        if (correctPassword()) {
            super.printAllPagesWithDigits();
        }
    }

    public boolean correctPassword(){
        while(true) {
            System.out.println("Please input password");
            String pass = new Scanner(System.in).nextLine();
            if (pass.equals(this.password)) {
                System.out.println("Correct password");
                return true;
            }
            System.out.println("Incorrect password");
            System.out.println("If you want to exit press 1");

            if (new Scanner(System.in).nextLine().equals("1")){
                return false;
            }
        }
    }



}
