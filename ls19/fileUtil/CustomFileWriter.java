package fileUtil;


import java.io.*;

public class CustomFileWriter {
    public static void main(String[] args) {
        objectOutputStream("foo3.out",new User("Nihat",19));
    }

    public  static String  writeFile(String filName ,String data) {

        File file = new File(filName);

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("dont createNewFile");
            }
        } else {
            Writer writerFile = null;
            try {
                writerFile = new FileWriter(file);
                writerFile.write(data);

            } catch (IOException e) {
                System.out.println("Dont write info");
            } finally {
                try {
                    writerFile.close();
                } catch (IOException e) {
                    System.out.println("DONT CLOSE");
                }
            }
            System.out.println(data);
        }
        return filName;
    }

    public  static String  writeFileByte(String filName ,String data) {

        File file = new File(filName);

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("dont createNewFile");
            }
        } else {
            OutputStream writerFile = null;
            try {
                writerFile = new FileOutputStream(file);
                writerFile.write(data.getBytes());


            } catch (IOException e) {
                System.out.println("Dont write info");
            } finally {
                try {
                    writerFile.close();
                } catch (IOException e) {
                    System.out.println("DONT CLOSE");
                }
            }
        }
        return filName;
    }

    public static String objectOutputStream(String fileName,User data){
        File file = new File(fileName);

        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("dont file");
            }

            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
                objectOutputStream.writeObject(data);
                objectOutputStream.close();
            } catch (IOException e) {
                System.out.println("dont objectOutputStream");
            }
        }
        return fileName;
    }
}

