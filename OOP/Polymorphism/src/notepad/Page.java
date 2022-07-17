package notepad;

public class Page {
    private String title;
    private String text;

    public Page(String title) {
        this.title = title;
        this.text="";
    }

    void addText(String text){
        if (this.text.equals("")&& text!=null) {
            this.text = text;
        }else{
            System.out.println("Cannot add text");
        }
    }

    void deleteText(){
        this.text= "";
    }
    void printPage(){
        System.out.println(this.title);
        System.out.println(this.text);
    }

    boolean searchWord(String word){
        return this.text.contains(word);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    boolean containsDigits(){
        for (int digit =0; digit <=9;digit ++) {
            String temp = String.valueOf(digit);
            if (this.text.contains(temp))
            return true;
        }
        return false;
    }

    public String getTitle() {
        return title;
    }
}
