package Code;

public class book {
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public  String author;
    public  String title;
    public  String ISBN;
    public String signature;

    public String getAuthor() {
        return author;
    }

    public  String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getSignature() { return signature; }





    public book() {
    }

    public book(String a,String t,String i,String s){
            setAuthor(a);
            setTitle(t);
            setISBN(i);
            setSignature(s);
    }

    public boolean checkISBN(String ISBN){
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
        System.out.println(this.getTitle()+"\t"+this.getAuthor()+"\t"+this.getISBN()+"\t"+this.getSignature()+"\n");
    }
}
