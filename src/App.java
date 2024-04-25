import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

public class App {
    protected static ElementManager e1 = new ElementManager();
    public static void main(String[] args) throws Exception {
        StringBuffer res = new StringBuffer("net = smile.Network();\n");
        String xdsl = inputString("enter Genie file name");
        String bei = inputString("enter .BEI file name") + ".BEI";
        String ft = inputString("enter .FTL file name") + ".FTL";
        
        res.append("net.readFile(\""+xdsl+".xdsl\")\n");
        readFile(bei); // implement file picker later
        readFile(ft); // implement file picker later
        res.append(e1.toString());
        res.append("net.writeFile(\""+xdsl+".xdsl\")\n");

        String outputFile = inputString("Enter matlab script name")+".m";
        writeFile(res.toString(), outputFile);
       // System.out.println(e1);
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
                if(filePath.contains(".BEI")){
                    e1.parseBasicEvent(line);
                    }
                if(filePath.contains(".FTL")){
                    e1.parseFaultTreeLine(line);
               }
               

            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {

                    reader.close();
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    // Close the BufferedWriter to release resources
                    writer.close();
                }
            } catch (IOException e) {
                // Handle any IO exceptions during closing
                JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }

    public static String chooseFile(){
        JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        fileChooser.setDialogTitle("Browse");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        // Show the file chooser dialog
        int returnValue = fileChooser.showOpenDialog(null);

        // If a directory is selected
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            // Get the selected directory
            String selectedDirectory = fileChooser.getSelectedFile().getAbsolutePath();
            
            // Now you can use the selected directory to read files
            return selectedDirectory;
            
            // Example: Read files from the selected directory
            // Your code to read files can go here
        } else {
            // User canceled the operation
            System.out.println("Operation canceled by user.");
            return null;
        }
    }

    public static String inputString(String message){
        // Show an input dialog and store the user's input
        String userInput = JOptionPane.showInputDialog(null, message);

        // Check if the user clicked cancel or closed the dialog
        if (userInput == null) {
            return null;
        } else {
            // Display the user's input
            return userInput;
        }
    }
}
