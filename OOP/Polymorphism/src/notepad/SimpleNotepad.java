package notepad;

public class SimpleNotepad implements INotepad{
    private Page [] pages;

    public SimpleNotepad(int numberOfPages) {
        if (numberOfPages>0) {
            this.pages = new Page[numberOfPages];
            for (int index = 0; index< numberOfPages; index++){
                pages[index] = new Page("Page number: " + (index+1));
            }
        }

    }

    @Override
    public void addText(int pageNumber, String text) {
        pages[pageNumber-1].addText(text);
    }

    @Override
    public void deleteText(int pageNumber) {
        pages[pageNumber-1].deleteText();
    }

    @Override
    public void changeText(int pageNumber, String text) {
        deleteText(pageNumber);
        addText(pageNumber,text);
    }

    @Override
    public void printAllPages() {
        for (Page page:pages){
            page.printPage();
        }
    }

    @Override
    public boolean searchWord(String word) {
        for (Page page:pages){
            if (page.searchWord(word)) {
                System.out.println("Found: " + word + " At  " + page.getTitle());
                return true;
            }
        }

        return false;
    }

    @Override
    public void printAllPagesWithDigits() {
        for (Page page:pages){
            if (page.containsDigits()) {
                page.printPage();
            }
        }
    }

}
