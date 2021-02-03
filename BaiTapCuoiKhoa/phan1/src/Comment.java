public class Comment{
    private long id;
    private String title;
    private Post post; //Bài viết mà comment gắn vào
    private User author; //Tác giả của comment
    //---- Bổ xung method vào đây. Nhiệm vụ của các bạn đó !
    public void writeComment(){
        this.post.getComments().add(this);
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Post getPost() {
        return post;
    }

    public User getAuthor() {
        return author;
    }
}