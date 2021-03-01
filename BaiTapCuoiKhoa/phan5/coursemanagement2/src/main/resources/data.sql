INSERT INTO users(id, name, email, password) VALUES
 (1, 'Tran Van B', 'b.tran@gmali.com', '123456'),
 (2, 'Nguyen Van A', 'a.nguyen@gmali.com', '123456');

INSERT INTO teachers(phone, experiences, id)
VALUES ('093xxxxx', 7, 1),
  ('093xxxxx', 3, 2);

INSERT INTO students(year, id)
VALUES (2, 1),
  (4, 2);

INSERT INTO courses(id, name, location, opened, teacher_id)
VALUES (1, 'Spring Boot Fundamental', 'Ha Noi', '20210301', 1),
(2, 'Spring Boot Microservice', 'Ha Noi', '20210226', 2);