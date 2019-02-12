
import java.awt.Desktop;
import java.util.*;
import java.io.*;
import java.lang.*;


public class pdfMake {

    private Formatter x;

    public void openfile() {
        try {
            x = new Formatter("aa.pdf");
        } catch (Exception e) {

        }
    }

    public void addRecord() throws IOException {
        
    }

    public void closeFile() {
        x.close();
    }

    public void makePdf() {

    }

    public void openthatFile() throws IOException {
        Desktop.getDesktop().open(new File("aa.txt"));
    }
}
