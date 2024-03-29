package codepro;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Book {
    Logger logger
            = Logger.getLogger(Book.class.getName());
    private   String author;
    private  String title;
    private  String isbn;
    private String signature;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setISBN(String isbn) {
        this.isbn = isbn;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getAuthor() {
        return author;
    }

    public  String getTitle() {
        return title;
    }

    public String getISBN() {
        return isbn;
    }

    public String getSignature() { return signature; }





    public Book() {
    }

    public Book(String a, String t, String i, String s){
            setAuthor(a);
            setTitle(t);
            setISBN(i);
            setSignature(s);
    }

    public boolean checkISBN(String isbn){
        int sum = 0;
        char []ar = isbn.toCharArray();
        boolean lengthFlag = ar.length == 10;
        if(lengthFlag){
            for (int i = 0; i < 10; i++) {
                sum += Integer.parseInt(String.valueOf(ar[i])) * (10-i);

            }
            int avg = sum % 11;
            return (avg==0);
        }
        else {
            return false;
        }
    }
    public void print(){
        String n =String.format(this.getTitle(),"\t"+this.getAuthor(),"\t"+this.getISBN(),"\t"+this.getSignature(),"\n");
        logger.log(Level.INFO,n );
    }
}
