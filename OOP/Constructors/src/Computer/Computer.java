package Computer;

public class Computer {
    int year;
    double price;
    boolean isNotebook;
    double hardDiskMemory;
    double freeMemory;
    String operationSystem;


    Computer(){
        this.isNotebook = false;
        this.operationSystem = "Win XP";
    }

    public Computer(int year, double price, double hardDiskMemory, double freeMemory) {
        this();
        this.year = year;
        this.price = price;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
    }

    public Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem) {
        this.year = year;
        this.price = price;
        this.isNotebook = isNotebook;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
        this.operationSystem = operationSystem;
    }

    int comparePrice (Computer comp){
        if (this.price>comp.price){
            return -1;
        }
        if (this.price<comp.price) {
            return 1;
        }
        return 0;
    }

    void changeOperationSystem(String newOperationSystem){
       if (operationSystem!=null) {
           operationSystem = newOperationSystem;
       }else{
           System.out.println("Not initialised");
       }

   }

    void useMemory(int memory){
       if (freeMemory>memory){
           freeMemory-=memory;
       }else{
           System.out.println("Not enough free memory!"
           );
       }
    }
}
