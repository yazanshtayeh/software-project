package codepro;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Library {
    Logger logger
            = Logger.getLogger(Library.class.getName());
    private List<Book> books =new ArrayList<>(1);
    public void getBooks(int i){
        books.get(i).print();
    }
    public boolean empty(){
       return books.isEmpty();
    }
    public Library() {
    }

    public Library(List<Book> a) {
        books.addAll(a);
    }

    public  void addbook(Book a, Admin admin){
        if(admin.logged)
        books.add(a);
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
           books.add(n);
       }
    }

    public List<Book> searchByAuthor(String author){
        List<Book> searched=new ArrayList<>();
        for(int i = 0; i< books.size(); i++){
            if(books.get(i).getAuthor().contains(author))
                searched.add(books.get(i));
        }
        return searched;
    }
    public List<Book> searchByTitle(String title){
        List<Book> searched=new ArrayList<>();
        for(int i = 0; i< books.size(); i++){
            if(books.get(i).getTitle().contains(title)){
                searched.add(books.get(i));
            }
        }
        return searched;
    }
    public List<Book> searchByISBN(String isbn){
        List<Book> searched=new ArrayList<>();
        for(int i = 0; i< books.size(); i++){
            if(books.get(i).getISBN().contains(isbn))
                searched.add(books.get(i));

        }
        return searched;
    }

}
