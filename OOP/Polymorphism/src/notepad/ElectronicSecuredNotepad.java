package notepad;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice{
    private boolean isStarted;

    public ElectronicSecuredNotepad(int numberOfPages) {
        super(numberOfPages);
    }

    @Override
    public void start() {
        if (correctPassword()) {
            System.out.println("Device started");
            this.isStarted = true;
        }
    }

    @Override
    public void stop() {
        if (correctPassword()) {
            System.out.println("Device stopped");
            this.isStarted = false;
        }
    }

    @Override
    public boolean isStarted() {
        return isStarted;
    }

    @Override
    public void addText(int pageNumber, String text) {
        if (isStarted) {
            super.addText(pageNumber, text);
        }else{
            System.out.println("Device is turned off!");
        }
    }

    @Override
    public void deleteText(int pageNumber) {
        if (isStarted) {
            super.deleteText(pageNumber);
        }else{
            System.out.println("Device is turned off!");
        }
    }

    @Override
    public void changeText(int pageNumber, String text) {
        if (isStarted) {
            super.changeText(pageNumber, text);
        }else{
            System.out.println("Device is turned off!");
        }
    }

    @Override
    public void printAllPages() {
        if (isStarted) {
            super.printAllPages();
        }else{
            System.out.println("Device is turned off!");
        }
    }

    @Override
    public boolean searchWord(String word) {
        if (isStarted) {
            return super.searchWord(word);
        }else{
            System.out.println("Device is turned off!");
        }
        return false;
    }

    @Override
    public void printAllPagesWithDigits() {
        if (isStarted) {
            super.printAllPagesWithDigits();
        }else{
            System.out.println("Device is turned off!");
        }
    }
}
