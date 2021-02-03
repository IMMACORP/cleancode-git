import java.util.ArrayList;

public class Post {
    private long id;
    private String title;
    private String content;
    private User author; //Tác giả của bài viết
    private ArrayList<Comment> comments; //Một post chứa nhiều Comment
    //---- Bổ xung method vào đây. Nhiệm vụ của các bạn đó !


    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public User getAuthor() {
        return author;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }
    public void insertPost(){
        this.author.getPosts().add(this);
    }
    public void deletePost(){
        for(int i=0;i<this.author.getPosts().size();i++){
                if (this.author.getPosts().get(i).getId() == this.getId()){
                    this.author.getPosts().remove(i);
                }


        }
    }
}
