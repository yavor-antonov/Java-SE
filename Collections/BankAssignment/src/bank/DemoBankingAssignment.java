package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DemoBankingAssignment {
    public static void main(String[] args) {
        Bank kbc = new Bank("KBC Bank","Varna");
        List <Client> clients = new ArrayList<Client>();
        Random rand = new Random();
        for (int i=1; i<=20;i++){
            Client client = new Client("Client:"+i,"Varna", (rand.nextFloat()*10000)+4000, (rand.nextFloat()*1000)+500);
            int percentage = 80 + (rand.nextInt(20)+1);
            System.out.println(percentage);
            String type;
            if (rand.nextInt(2)==1){
                type="Short Deposit";
            }else{
                type="Long Deposit";
            }
            client.openDeposit((percentage*client.getMoney())/100,type,kbc);
            System.out.println(client);
            clients.add(client);
        }
        System.out.println(kbc);
        for (Client client : clients){
            if (rand.nextInt(2)==1){
                continue;
            }
            String type;
            if (rand.nextInt(2)==1){
                type="Consumer Credit";
            }else{
                type="Home Credit";
            }
            client.requestCredit(rand.nextInt(20_000),type,kbc,rand.nextInt(59)+2);
            System.out.println(client);
        }
        System.out.println(kbc);

    }
}
