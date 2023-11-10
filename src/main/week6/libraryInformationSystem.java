import java.util.ArrayList;

public class Book{
    private String title;
    private String publisher;
    private int year;

    public Book(String title, String publisher, int year){
        this.title=title;
        this.publisher=publisher;
        this.year=year;
    }
    public String title(){
        return this.title;
    }
    public String publisher(){
        return this.publisher;
    }
    public int year(){
        return this.year;
    }

    public String toString(){
        return this.title + ". " + this.publisher + ". " + this.year;
    }
}

public class Library{
    private ArrayList<Book> books;

    public Library(){
        this.books = new ArrayList<Book>();
    }
    public void addBook(Book newBoook){
        this.books.add(newBook);
    }
    public void printBook(){
        for(Book book: this.books){
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTtile(String title){
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book book : this.book){
            if(StringUtils.included(book.title().toUpperCase(), title.toUpperCase())){
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book book : this.books){
            if(StringUtils.included(book.publisher().toUpperCase(), publisher.toUpperCase())){
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book book : this.books){
            if(book.year() == year){
                found.add(book);
            }
        }
        return found;
    }

    public static void main(String[] args){
        Library library = new Library();

        library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007.));
        library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992.));
        library.addBook(new Book("NHL Hoceky" , "Stanley Kupp", 1952.));
        library.addBook(new Book("Battle Axes" , "Tom A. Hawk", 1851.));

        for(Book book : library.searchByTtile("CHEESE")){
            System.out.println(books);
        }
        System.out.println("---");

        for(Book book:library.searchByPublisher("PENGUIN")){
            System.out.println(book);
        }
        System.out.println("---");

        for(Book book : library.searchByYear(1851)){
            System.out.println(book);
        }
    }
}
public class StringUtils{
    public static boolean included(String word, String searched){
        if(word == null || searched == null){
            return false;
        }
        return word.trim().toUpperCase().contains(searched.trim().toUpperCase());
    }
}