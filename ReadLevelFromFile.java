import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadLevelFromFile {
    public String read(String nameFile){
        String line="";
        File fileName = new File(nameFile);
        try{
            FileInputStream in = new FileInputStream(fileName);
            int c;
            while ((c = in.read())!=-1){
                line = line +(char)c;
            }
            in.close();
        }catch (IOException ioe){
            System.out.println(ioe);
        }
        return line;
    }
}
