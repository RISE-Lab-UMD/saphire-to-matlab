import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class App {
    protected static ElementManager e1 = new ElementManager();
    public static void main(String[] args) throws Exception {
        
        readFile("resources\\faulttree.FTL");
        
        writeFile(e1.toString(), "output\\newScript.m");
        System.out.println(e1);
    }

    public static void readFile(String filePath){

        BufferedReader reader = null;
        try {
            // Provide the path to the file you want to read
            
            FileReader fileReader = new FileReader(filePath);
            reader = new BufferedReader(fileReader);

            String line;
            // Read each line from the file until reaching the end
            while ((line = reader.readLine()) != null) {
               e1.parseFaultTreeLine(line);
            }
        } catch (IOException e) {

            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {

                    reader.close();
                }
            } catch (IOException e) {

                e.printStackTrace();
            }
        }
    }

    public static void writeFile(String content, String filePath){
        BufferedWriter writer = null;
        try {
            // Provide the path to the file you want to write
            
            // Create FileWriter object with the given file path
            FileWriter fileWriter = new FileWriter(filePath);

            // Wrap FileWriter in BufferedWriter for efficient writing
            writer = new BufferedWriter(fileWriter);

            // Write the content to the file
            writer.write(content);

            // Flush the content to ensure it's written to the file immediately
            writer.flush();
            
            System.out.println("Content has been written to the file successfully.");
        } catch (IOException e) {
            // Handle any IO exceptions
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    // Close the BufferedWriter to release resources
                    writer.close();
                }
            } catch (IOException e) {
                // Handle any IO exceptions during closing
                e.printStackTrace();
            }
        }
    }
}
