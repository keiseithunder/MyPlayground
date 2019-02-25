class test{
    public static void main(String[] args) {
        byte[] a = new byte[5];
        for (int i = 0; i < 5; i++) {
            a[i]=(byte)i;
        }
        for (byte var : a) {
            System.out.println(var);
        }
        byte x=125;
        byte y=1;
        System.out.println(x+y);
    }
}