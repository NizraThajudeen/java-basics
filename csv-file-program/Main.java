import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String line = "";
        int total= 0;
        ArrayList<String> productList = new ArrayList<String>();


        try {
            //parsing CSV file into BufferedReader class to read line by line
            BufferedReader br = new BufferedReader(new FileReader("C:\\Learning\\Java\\products.csv"));
            while ((line = br.readLine()) != null)
            {
                String[] item = line.split(",");
                productList.add(item[0]);
                total += Integer.parseInt(item[1]);

            }

            FileWriter writer = new FileWriter("output.txt");
            for(String product: productList) {
                writer.write(product + System.lineSeparator());
            }
            writer.write("total = "+total);
            writer.close();

            System.out.println(total);
        }
        catch(IOException e) {
            e.printStackTrace();
        }


    }
}