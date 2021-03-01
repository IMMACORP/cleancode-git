import java.util.ArrayList;

public class Post {
    private long id;
    private String title;
    private String content;
    private User author; //Tác giả của bài viết
    private ArrayList<Comment> comments; //Một post chứa nhiều Comment


    public long getId() {
        return id;
    }

    public User getAuthor() {
        return author;
    }

    public Post(long id, String title, String content, User author, ArrayList<Comment> comments) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.comments = comments;
    }
}
