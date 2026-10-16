
import java.io.*;

class Profile {
    public static void main(String[] args) throws Exception {
        String data = "Name: Keerthiga, Age: 20";

        FileOutputStream fos = new FileOutputStream("profile.txt");
        fos.write(data.getBytes());
        fos.close();

        FileInputStream fis = new FileInputStream("profile.txt");
        int ch;

        while ((ch = fis.read()) != -1) {
            System.out.print((char) ch);
        }

        fis.close();
    }
}
