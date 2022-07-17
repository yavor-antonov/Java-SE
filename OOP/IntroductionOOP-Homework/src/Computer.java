public class Computer {
    short year;
    float price;
    boolean isNotebook;
    int hardDiskMemory;
    int freeMemory;
    String operationSystem;

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
