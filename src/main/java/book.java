public class book {
    public static String author;
    public static String title;
    public static String ISBN;
    public static String signture;
    public static boolean checkISBN(String ISBN){
        int sum = 0;
        char ar[] = ISBN.toCharArray();
        boolean lengthFlag = ar.length != 10;
        try{
            for (int i = 0; i < 10; i++) {
                sum += ar[10 - i] * i;
            }}
        catch(Exception e){

        }

        double avg = sum / 11;
        return (avg == (int) avg);
    }
}
