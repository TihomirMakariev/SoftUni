package Java_Fundamentals.Articles_02;

public class Article {
    //fields
    private String title;
    private String content;
    private String author;

    //constructor
    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    //methods
    public void edit(String newContent) {
        this.content = newContent;
    }


    public void changeAuthor (String newAuthor) {
        this.author = newAuthor;
    }

    public void rename (String newTitle) {
        this.title = newTitle;
    }


    @Override
    public String toString() {
        //обект -> текст
        //"{title} - {content}:{author}"
        return title + " - " + content + ": " + author;
    }
}
