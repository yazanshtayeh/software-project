package codepro;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Library {
    Logger logger
            = Logger.getLogger(Book.class.getName());
    public  ArrayList<Book> Books =new ArrayList<>(1);
    public Library() {
    }

    public Library(ArrayList<Book> a) {
        Books.addAll(a);
    }

    public  void addbook(Book a, Admin admin){
        if(admin.logged)
        Books.add(a);
        else
            logger.log(Level.INFO,"you Should ba an admin");
    }
    public  void addbook(String title,String author,String isbn,String signature){
       Book n=new Book(title,author,isbn,signature);

       if(n.checkISBN(isbn)){
           n.setAuthor(author);
           n.setTitle(title);
           n.setISBN(isbn);
           n.setSignature(signature);
           Books.add(n);
       }
    }

    public ArrayList<Book> searchByAuthor(String author){
        ArrayList<Book> searched=new ArrayList<>();
        for(int i = 0; i< Books.size(); i++){
            if(Books.get(i).getAuthor().contains(author))
                searched.add(Books.get(i));
        }
        return searched;
    }
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> searched=new ArrayList<>();
        for(int i = 0; i< Books.size(); i++){
            if(Books.get(i).getTitle().contains(title)){
                searched.add(Books.get(i));
            }
        }
        return searched;
    }
    public ArrayList<Book> searchByISBN(String isbn){
        ArrayList<Book> searched=new ArrayList<>();
        for(int i = 0; i< Books.size(); i++){
            if(Books.get(i).getISBN().contains(isbn))
                searched.add(Books.get(i));

        }
        return searched;
    }

}
