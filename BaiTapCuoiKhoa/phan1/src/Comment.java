public class Comment{
    private long id;
    private String title;
    private Post post; //Bài viết mà comment gắn vào
    private User author; //Tác giả của comment
    //---- Bổ xung method vào đây. Nhiệm vụ của các bạn đó !

    public User getAuthor() {
        return author;
    }

    public long getId() {
        return id;
    }

    public Comment(long id, String title, Post post, User author) {
        this.id = id;
        this.title = title;
        this.post = post;
        this.author = author;
    }
}