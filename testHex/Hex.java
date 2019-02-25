import java.util.*;
import java.io.*;
import javax.xml.bind.DatatypeConverter;

class Hex {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("file/Foldscope.mp4")); // to read
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
        String src = new String(); // to store the string obtained from buffered reader
        PrintWriter writer = new PrintWriter("[DE]file/"+"[DE]"+"Foldscope.mp4");
        src = br.readLine(); // read an input line from the file
        //boolean check=true;
        while (src != null) {
            // System.out.println(src);
            // src = src.replace(" ", ""); // Trim out the spaces
            //check = false;
            //System.out.println(src);
            byte[] byteArray = src.getBytes();// convert the String to hex integer

            for (int j = 0; j < byteArray.length; j++) { 
                byteArray[j] = (byte) (byteArray[j] + 1);

            }
            //String hex = DatatypeConverter.printHexBinary(byteArray);
            String s = new String(byteArray);
            //System.out.println(hex);
            //System.out.println(s);
            //System.out.println("End3");
            // System.out.println("HELLO"+i);
            writer.print(s); // convert hex to char and write into file
            //writer.print(s);
            src = br.readLine();
            // System.out.println("End");
        }
        // System.out.println("End");
        br.close();
        writer.flush();
        writer.close();
    }

    public static String stringToHex(String base) {
        StringBuffer buffer = new StringBuffer();
        int intValue;
        for (int x = 0; x < base.length(); x++) {
            int cursor = 0;
            intValue = base.charAt(x);
            String binaryChar = new String(Integer.toBinaryString(base.charAt(x)));
            for (int i = 0; i < binaryChar.length(); i++) {
                if (binaryChar.charAt(i) == '1') {
                    cursor += 1;
                }
            }
            if ((cursor % 2) > 0) {
                intValue += 128;
            }
            buffer.append(Integer.toHexString(intValue) + " ");
        }
        return buffer.toString();
    }
}
