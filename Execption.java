import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Execption {
    public static void main(String[] args) {
        String configFile = "config.txt"; 
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(configFile));
            String className = br.readLine();

            if (className == null || className.equals("")) {
                System.out.println(configFile + " is empty");
                return;
            }

            // If file contains full package name, extract simple class name
            if (className.contains(".")) {
                className = className.substring(className.lastIndexOf('.') + 1);
            }

            System.out.println("Class name read: " + className);

            try {
                Class<?> reportClass = Class.forName(className);
                System.out.println("Loaded class: " + reportClass.getName());
            } catch (ClassNotFoundException e) {
                System.out.println("Class not found: " + className);
                throw new RuntimeException(e);
            }

        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}
