package Code;

import java.util.ArrayList;


public class library {

    public  ArrayList<book> books=new ArrayList<>();
    public library() {
    }

    public library(ArrayList<book> a) {
        for(int i=0;i<a.size();i++)
            books.add(a.get(i));
    }

    public  void addbook(book a){
        books.add(a);
    }
    public  void addbook(String title,String author,String isbn,String signature){
       book n=new book();
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
            if(books.get(i).getAuthor().equals(author))
                searched.add(books.get(i));
        }
        return searched;
    }
    public ArrayList<book> searchByTitle(String title){
        ArrayList<book> searched=new ArrayList<>();
        for(int i=0;i<books.size();i++){
            if(books.get(i).getTitle().equals(title)){
                searched.add(books.get(i));
            }
        }
        return searched;
    }
    public ArrayList<book> searchByISBN(String isbn){
        ArrayList<book> searched=new ArrayList<>();
        for(int i=0;i<books.size();i++){
            if(books.get(i).getAuthor().equals(isbn))
                searched.add(books.get(i));

        }
        return searched;
    }

}
