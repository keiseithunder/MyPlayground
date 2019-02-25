import java.util.*;
import java.io.*;
import javax.xml.bind.DatatypeConverter;

class decode {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("[DE]file/[DE]Foldscope.mp4")); // to read
                                                                                                              // 79 FF
                                                                                                              // FF FF
                                                                                                              // FF FF
                                                                                                              // FF FF
                                                                                                              // FF FF
                                                                                                              // FF FF
                                                                                                              // FF FF
                                                                                                              // FF FF
                                                                                                              // a
                                                                                                              // single
                                                                                                              // line
                                                                                                              // from
                                                                                                              // the
                                                                                                              // file
        //int read;
        String src = new String(); // to store the string obtained from buffered reader
        PrintWriter writer = new PrintWriter("[OUT]file/Foldscope.mp4");
        src = br.readLine(); // read an input line from the file
        //boolean check=true;
        while (src != null) {
            // System.out.println(src);
            // src = src.replace(" ", ""); // Trim out the spaces
            //check = false;
            //System.out.println(src);
            byte[] byteArray = src.getBytes();// convert the String to hex integer

            for (int j = 0; j < byteArray.length; j++) {
                byteArray[j] = (byte) (byteArray[j] - 1);
            }
            //String hex = DatatypeConverter.printHexBinary(byteArray);
            String s = new String(byteArray)+"\n";
            //System.out.println(hex);
            //System.out.println(s);
            //System.out.println("End3");
            // System.out.println("HELLO"+i);
            // writer.print((char) read); // convert hex to char and write into file
            writer.print(s);

            src = br.readLine();
            // System.out.println("End");
        }
        // System.out.println("End");
        br.close();
        writer.flush();
        writer.close();
    }
}