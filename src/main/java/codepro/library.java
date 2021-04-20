package codepro;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class library {
    Logger logger
            = Logger.getLogger(book.class.getName());
    public  ArrayList<book> books=new ArrayList<>(1);
    public library() {
    }

    public library(ArrayList<book> a) {
        books.addAll(a);
    }

    public  void addbook(book a,Admin admin){
        if(admin.logged)
        books.add(a);
        else
            logger.log(Level.INFO,"you Should ba an admin");
    }
    public  void addbook(String title,String author,String isbn,String signature){
       book n=new book(title,author,isbn,signature);

       if(n.checkISBN(isbn)){
           n.setAuthor(author);
           n.setTitle(title);
           n.setISBN(isbn);
           n.setSignature(signature);
           books.add(n);
       }
    }

    public ArrayList<book> searchByAuthor(String author){
        ArrayList<book> searched=new ArrayList<>();
        for(int i=0;i<books.size();i++){
            if(books.get(i).getAuthor().contains(author))
                searched.add(books.get(i));
        }
        return searched;
    }
    public ArrayList<book> searchByTitle(String title){
        ArrayList<book> searched=new ArrayList<>();
        for(int i=0;i<books.size();i++){
            if(books.get(i).getTitle().contains(title)){
                searched.add(books.get(i));
            }
        }
        return searched;
    }
    public ArrayList<book> searchByISBN(String isbn){
        ArrayList<book> searched=new ArrayList<>();
        for(int i=0;i<books.size();i++){
            if(books.get(i).getISBN().contains(isbn))
                searched.add(books.get(i));

        }
        return searched;
    }

}
