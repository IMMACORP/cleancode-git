
# Cach dùng tool payroll
Đây là tool giúp đọc file csv data nhân viên trong công ty, rồi thực hiện tinh toán: tuổi, số năm kinh nghiêm, lương hiện tại.
  - Author: DungDV @ Dev7
## Input
file csv theo format
  - name: họtên
  - dob: ngày sinh
  - role: chức vụ[director,manager,sales,engineer,staff,worker]
  - startdate: ngày bắt đầu làm việc ở công ty
  - startsal: mức lương khởi điểm

## Output
1. In ra màn hình tính đến ngày hôm nay:
  - Tuổi hiện tại của nhân viên
  - Số năm và tháng làm việc. Làm tròn xuống, 3 năm, 2 tháng 15 ngày --> 3 năm, 2 tháng
2. Công thức tăng lương theo thâm niên phiên bản 1.0:
  - Bất kỳ nhân viên nào không quan tâm đến chức vụ, cứ làm đủ 12 tháng là tăng một bậc lương 6% so với mức lương cũ. Cách tính này không cần đến đầu năm mới điều chỉnh.
  - Hãy tính lương tại thời điểm hiện tại của nhân viên
