package notepad;

public interface INotepad {

    void addText(int pageNumber, String text);

    void deleteText(int pageNumber);

    void changeText(int pageNumber, String text);

    void printAllPages();
    boolean searchWord(String word);
    void printAllPagesWithDigits();
}
