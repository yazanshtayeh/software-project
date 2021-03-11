package Code;

import java.util.ArrayList;


public class library {

    public library() {
    }

    public library(ArrayList<book> a) {
        for(int i=0;i<a.size();i++)
            books.add(a.get(i));
    }


    public static ArrayList<book> books=new ArrayList<>();


    public static void addbook(book a){
        books.add(a);
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
            if(books.get(i).getAuthor().equals(title))
                searched.add(books.get(i));
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
