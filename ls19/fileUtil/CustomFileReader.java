package fileUtil;
import java.io.*;
public class CustomFileReader {
    public static void main(String[] args) {
        objectInputStream("foo3.out");
    }
    public static String readFile(String fileName ){
        File file = new File(fileName);
        if (!file.exists()){
            System.out.println("Not found file");
        }
        else{
            try {
                Reader reader = new FileReader(file);
                int i = 0 ;
                while ((i = reader.read()) != -1) {
                    System.out.print((char) i);
                }
                reader.close();
            } catch (IOException e) {
                e.getStackTrace();
            }
        }
        return fileName;
    }


    public static String readFileByte(String fileName ) {
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("not found file ");
        } else {
            InputStream inputStream = null;
            try {
                inputStream = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            int i = 0 ;
            try {
            while ((i = inputStream.read()) != -1) {
                System.out.print((char) i);
            }
                inputStream.close();
            }catch (IOException e){
                System.out.println("Invalid ex");
            }
        }
        return fileName;
    }
    public static String objectInputStream(String fileName) {
        File file = new File(fileName);

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("dont file");
            }
        } else {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
                User user = (User) objectInputStream.readObject();
                System.out.print(user);
                objectInputStream.close();

            } catch (IOException | ClassNotFoundException e) {
                System.out.println("dont objectOutputStream");
            }
        }
        return fileName;
    }
}

