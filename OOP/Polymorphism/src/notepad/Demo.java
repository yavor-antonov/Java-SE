package notepad;

public class Demo {
    public static void main(String[] args) {
//        SimpleNotepad notepad = new SimpleNotepad(20);
//        notepad.printAllPages();

        ElectronicSecuredNotepad el = new ElectronicSecuredNotepad(5);
        el.start();
        el.addText(3,"text");
        el.printAllPages();
        el.addText(3,"sss");
        el.searchWord("ss");
        el.printAllPagesWithDigits();
        el.changeText(3,"sss");
        el.searchWord("ss");
        el.changeText(4,"s3s");
        el.printAllPagesWithDigits();
    }
}
