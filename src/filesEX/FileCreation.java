package filesEX;

import java.io.File;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] args) throws IOException {
        //File newFile = new File("C:/Users/pooja/eclipse-workspace/JavaProject/src/fileex/one.txt"); 
        //File newFile=new File("C:/Users/pooja/eclipse-workspace/JavaProject/src/fileex/demo11982.txt");
        
        File newFile=new File("D:/demo11982.txt") ;
        if(newFile.createNewFile())    {
            System.out.println("File created.");
        } else {
        System.out.println("File exists.");
    }
    }
}
