import java.util.*;

class hex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String output = s;
        while (sc.hasNext()) {
            s=sc.next();
            output+=(" "+s);            
        }
        output.replace("F", "G");
        System.out.println("START");
        System.out.println(output);
        sc.close();
    }
}