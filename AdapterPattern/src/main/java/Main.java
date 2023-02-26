import client.ClientInterface;
import client.adapter.JsonAdapter;
import client.adapter.XmlAdapter;
import entity.Car;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ClientInterface clientInterface;

        while(true) {
            System.out.println("Enter the car maker name:");
            String makerName = scanner.nextLine();
            System.out.println("Enter the car model name:");
            String modelName = scanner.nextLine();
            Car car = new Car(makerName, modelName);
            System.out.println("Which format to save the file in? (1 - XML | 2 - JSON | others - exit):");
            int formatNum = Integer.parseInt(scanner.nextLine());
            if(formatNum == 1){
                clientInterface = new XmlAdapter();
            } else if (formatNum == 2){
                clientInterface = new JsonAdapter();
            } else {
                break;
            }
            clientInterface.writeObjectToFile(car);
        }
    }
}
