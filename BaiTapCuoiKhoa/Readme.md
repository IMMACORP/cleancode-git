# Đỗ Văn Dũng
## Khoá học Clean Code - Luvina 2020


## Phần 1: Clean Code căn bản
1. 5 mục tiêu chính của Clean Code là
   - Mục tiêu 1
   - Mục tiêu 2
   - Mục tiêu 3
   - Mục tiêu 4
   - Mục tiêu 5
2. Đáp án của tôi là team C bởi vì:
   - Lý do 1: Team A thì quá ưu tiên tiến độ, mà không nghĩ việc phát sinh công số refactor sau này. Thay vị thế Team C quyết định áp dụng luôn những gì có thể áp dụng được.
   - Lý do 2: Team B thì quá ưu tiên về cleancode, hơn nữa lại tiến hành tìm hiểu trước khi làm rõ các vấn đề cần giải quyết trong dự án.
   Dẫn đến rủi ro tìm hiểu tràn làn, tốn công số mà mà không áp dụng được hiệu quả.
3. Hầu hết các dự án hiện nay đều có coding convention là những rule cần tuân thủ, nội dung cũng tương đồng với các quy tắc trong cleancode.
Nên cần được áp dụng bằng mọi cách.

4. Đề xuất của Vân phù hợp: tên hàm dễ hiểu, không duplicate source biến raise, số lượng parameter ít.
5. 
```Java
public class User {
   private long id;
   private String fullName;
   private ArrayList<Post> posts;  //Một người có thể viết nhiều Post
   private ArrayList<Comment> comments; //Một người có thể bình luận nhiều Comment
   //---- Bổ xung method vào đây. Nhiệm vụ của các bạn đó !

   void writePost(Post post) { //ví dụ mẫu một phương thức nhé
      //Bổ xung logic vào đây
   }

   void deletePost(Post post) throws PostException {  //Nếu tác động lên dữ liệu nếu có lỗi thì hãy throw ra Exception

   }
   
   void writeComment(Comment comment){
   
   
   }
   
   void deleteComment(Comment comment) throws PostException { 

   }
}

public class Post {
   private long id;
   private String title;
   private String content;
   private User author; //Tác giả của bài viết
   private ArrayList<Comment> comments; //Một post chứa nhiều Comment
   //---- Bổ xung method vào đây. Nhiệm vụ của các bạn đó ! 
}

private class Comment{
   private long id;
   private String title;
   private Post post; //Bài viết mà comment gắn vào
   private User author; //Tác giả của comment
   //---- Bổ xung method vào đây. Nhiệm vụ của các bạn đó !
}
```
## Phần 2: OOP và SOLID
### 1. Hãy lập trình Java để thực hiện thiết kế như hình vẽ
Gõ link đến mã nguồn bài này vào đây. Đừng comment code. Nếu thực sự CleanCode thì không cần comment vẫn hiểu được.

### 2. Composition over Inheritance và DI
Gõ link đến mã nguồn bài này vào đây


## Phần 3: Thiết kế CSDL Quan hệ theo đặc tả

## Phần 4: Thiết kế RESTful API

## Phần 5: Lập trình Restful API

## Trắc nghiệm

1. Điều nào không đúng khi nói về Design Pattern?
   ```
   C. Đã được thiết kế và cài đặt ở mức chi tiết.
   ```
---

2. Các OOP Design Pattern được chia làm mấy nhóm?
   ```
   B. 3
   ```
---

3. Các design pattern của nhóm Behavioral pattern có đặc điểm nào dưới đây?
   ```
   D. Quan tâm đến cách giao tiếp giữa các lớp và các đối tượng.
   ```
---

4. Trong trường hợp client muốn khởi tạo một đối tượng mà không cần quan tâm logic khởi tạo đối tượng hoặc không biết rõ lớp của đối tượng thì chúng ta nên áp dụng design pattern nào đã được học?
   ```
   C. Factory Method
   ```
---

5. Cách cài đặt Bill Pugh của Singleton pattern có đảm bảo thread-safe hay không?
   ```
   A. Có
   ```
---

6. Đối tượng được khởi tạo bằng Builder pattern có điểm gì khác biệt so với đối tượng được khởi tạo bằng cách thông thường (thông qua toán tử new, rồi sau đó set các giá trị thông qua setter method)?
   ```
   B. Immutable
   ```

---

7. Khi sử dụng annotation @Builder của Lombok thì đối tượng được khởi tạo có đảm bảo immutable hay không?
   ```
   A. Không
   ```
---

8. Trong design pattern Flyweight, chúng ta lưu trữ loại dữ liệu nào trong bộ nhớ cache (flyweight factory)?
   ```
   A. Dữ liệu không thay đổi theo context
   ```
---

9. Nếu có nhiều class chứa các thuật toán gần như giống hệt nhau và chỉ có một số ít khác biệt, thì chúng ta sẽ áp dụng design pattern nào đã được học để tránh bị lặp lại code, cũng như tốn ít công sức sửa code nếu có yêu cầu phải thay đổi tất cả các thuật toán?
   ```
   B. Template Method
   ```
---

10. Một tác vụ có nhiều thuật toán để xử lý. Để dễ dàng chuyển đổi thuật toán tại thời điểm chạy chương trình tùy theo request từ phía client, chúng ta sẽ áp dụng design pattern nào đã được học?
   ```
      A. Strategy
   ```
---

11. REST là gì?
   ```
      B. Kiểu kiến trúc phần mềm
   ```

---

12. Đâu không phải là đặc điểm của một hệ thống RESTful?
   ```
      C. Server lưu trữ session và history của client.
   ```
---

13. Khi RESTful API có nhiệm vụ thêm mới một resource, chúng ta nên sử dụng HTTP method nào?
   ```
      B. POST
   ```
---

14. HTTP method nào không đảm bảo idempotent trong tất cả các trường hợp?
   ```
      B. POST
   ```
---

15. Chúng ta nên sử dụng query parameter cho những trường hợp nào?
   ```
      D. Cả 3 đáp án trên
   ```
---

16. Các interface/class có nhiệm vụ thao tác với cơ sở dữ liệu được đặt ở layer nào?
   ```
      B. Repository
   ```
---

17. Các bạn đã được tìm hiểu mấy phương pháp đánh version cho RESTful API trong khóa học?
   ```
      D. 4
   ```
---

18. Trong Spring Framework, phương pháp xử lý lỗi nào dưới đây cho phép chúng ta xử lý lỗi ở mức toàn ứng dụng (global)?
   ```
      Sử dụng @ControllerAdvice và HandlerExceptionResolver
   ```
---

19. Để thông báo cho người quản trị hệ thống biết một chức năng đã gặp lỗi, chúng ta nên sử dụng log level nào?
   ```
      C. ERROR
   ```
---

20. Để cảnh báo việc tiến trình có thể không chạy đúng với logic, nhưng ứng dụng vẫn có thể tiếp tục, chúng ta nên sử dụng log level nào?
   ```
      B. WARN
   ```
---

21. Có phải method được đánh dấu annotation @Cacheable luôn được thực thi mỗi khi RESTful API được gọi?
   ```
      B. Không
   ```

---

22. Anti-pattern Jaywalking phù hợp trong trường hợp nào?
   ```
      A. Cần thống kê dễ dàng.
      B. Cần lưu một danh sách các phần tử dưới dạng phân cách nhau bởi ký tự đặc biệt và không cần truy vấn từng phần tử.
      C. A và B.
      D. Không có đáp án nào chính xác.
   ```
---

23. Đâu không phải là giải pháp phù hợp để thay thế cho anti-pattern Multi-column Attributes? Giả sử tôi cần lưu các tag của một article.
   ```
      A. Tạo một bảng trung gian (join table) giữa tag và article.
      B. Lưu giá trị của các tag vào N cột trong bảng article.
      C. Tạo một bảng riêng để lưu các tag của article.
   ```
---

24. Nếu sử dụng anti-pattern Entity-Value-Attribute, giả sử đối tượng có 5 thuộc tính, vậy tôi cần thực hiện tất cả bao nhiêu phép JOIN để lấy đủ thông tin của 5 thuộc tính?
   ```
      A. 1
      B. 3
      C. 5
      D. 6
   ```
---

25. Tree model nào không dễ để query child node ngay dưới?
   ```
      A. Adjacency list
      B. Path enumeration
      C. Nested Set
      D. Closure table
   ```
