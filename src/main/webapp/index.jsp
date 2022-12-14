<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css">
</head>
<body>
    <div class="list-group">
        <a href="/createVacxin.jsp" class="list-group-item list-group-item-action active">
            Tạo mới một loại Vacxin
        </a>
        <a href="#" class="list-group-item list-group-item-action">Sửa thông tin một loại vacxin</a>
        <a href="ListVacxinsServlet" class="list-group-item list-group-item-action">Tìm kiếm thông tin các loại vacxin</a>
        <a href="#" class="list-group-item list-group-item-action">Liệt kê lịch sử tiêm phòng của khác hàng</a>
        <a href="#" class="list-group-item list-group-item-action disabled">Thống kê tổng số tiền đã trả</a>
    </div>
</body>
</html>