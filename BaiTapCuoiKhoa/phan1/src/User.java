import java.util.ArrayList;

public class User {
    private long id;
    private String fullName;
    private ArrayList<Post> posts;  //Một người có thể viết nhiều Post
    private ArrayList<Comment> comments; //Một người có thể bình luận nhiều Comment

    public long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }
    //---- Bổ xung method vào đây. Nhiệm vụ của các bạn đó !

    void writePost(Post post) { //ví dụ mẫu một phương thức nhé
        //Bổ xung logic vào đây
        this.posts.add(post);
    }

    void deletePost(Post post) throws PostException {  //Nếu tác động lên dữ liệu nếu có lỗi thì hãy throw ra Exception

        if (null == this.posts) return;

        for(int i=0;i<this.posts.size();i++){
            try {
                if (this.posts.get(i).getId() == post.getId()){
                    this.posts.remove(i);
                }
            }catch (Exception e){
                throw new PostException("error while deleting post");
            }

        }
    }

    void writeComment(Comment comment){
        // phải định vị được comment định insert vào
        //this.comments.add(comment);
    }

    void deleteComment(Comment comment) throws CommentException{
        if(null == this.comments) return;
        if (comment.getAuthor().getId() != this.getId()) return;

        int numberOfComment = this.comments.size();

        for (int i=0;i<numberOfComment;i++){
            try {
                if (this.comments.get(i).getId() == comment.getId()){
                    this.comments.remove(i);
                }
            }catch(Exception e){
                throw new CommentException("error while deleting comment");
            }
        }
    }
}
