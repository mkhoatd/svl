<%--
  Created by IntelliJ IDEA.
  User: mkhoatd
  Date: 12/1/2022
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<h2 class="text-center">Tạo mới một loại Vacxin</h2>
<form class="align-items-center justify-content-center">
  <div class="form-row " >
    <label for="MaVacxin">Mã Vacxin</label>
    <input type="text" class="form-control" id="MaVacxin" placeholder="Mã Vacxin">
  </div>
  <div class="form-row " >
    <label for="TenVacxin">Tên Vacxin</label>
    <input type="text" class="form-control" id="TenVacxin" placeholder="Tên Vacxin">
  </div>
  <div class="form-row " >
    <label for="SoMui">Số mũi</label>
    <input type="text" class="form-control" id="SoMui" placeholder="Số mũi">
  </div>
  <div class="form-row " >
    <label for="MoTa">Mô tả</label>
    <input type="text" class="form-control" id="MoTa" placeholder="Mô tả">
  </div>
  <div class="form-row " >
    <label for="GiaVacxin">Giá vacxin</label>
    <input type="text" class="form-control" id="GiaVacxin" placeholder="Giá vacxin">
  </div>
  <div class="form-row " >
    <label for="TenHangSX">Tên hãng SX</label>
    <input type="text" class="form-control" id="TenHangSX" placeholder="Tên hãng SX">
  </div>
  <div class="form-row " >
    <button type="submit" class="btn btn-primary mb-2">Confirm identity</button>
  </div>
</form>
</body>
</html>