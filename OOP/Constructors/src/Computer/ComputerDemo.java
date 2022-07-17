package Computer;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer acer =  new Computer();
        acer.year = 2020;
        acer.price = 1500;
        acer.operationSystem = "Windows";
        acer.hardDiskMemory = 500;
        acer.isNotebook = true;
        acer.freeMemory = 256;

        Computer dell =  new Computer();
        dell.year = 2019;
        dell.price = 1200;
        dell.operationSystem = "Linux";
        dell.hardDiskMemory = 500;
        dell.isNotebook = false;
        dell.freeMemory = 128;

        acer.useMemory(128);
        dell.changeOperationSystem("Windows");

        System.out.println(acer.comparePrice(dell));

    }
}
