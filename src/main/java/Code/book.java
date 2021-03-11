package Code;

public class book {
    public static String author;
    public static String title;
    public static String ISBN;
    public static String signature;

    public static String getAuthor() {
        return author;
    }

    public static String getTitle() {
        return title;
    }

    public static String getISBN() {
        return ISBN;
    }

    public static String getSignature() { return signature; }

    public static void setSignature(String signature) { book.signature = signature; }

    public static void setAuthor(String author) {
        book.author = author;
    }

    public static void setTitle(String title) {
        book.title = title;
    }

    public static void setISBN(String ISBN) {
        book.ISBN = ISBN;
    }



    public book() {
    }

    public book(String a,String t,String i,String s){
            setAuthor(a);
            setTitle(t);
            setISBN(i);
            setSignature(s);
    }

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
        int avg = sum % 11;
        return (avg==0);
    }
    public void print(){
        System.out.println(book.getTitle()+"\t"+book.getAuthor()+"\t"+book.getISBN()+"\t"+book.getSignature()+"\n");
    }
}
