<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- ============================================================== -->
<!-- Start Page Content -->
<!-- ============================================================== -->
<div class="row">
	<!-- column -->
	<div class="col-sm-12">
		<div class="card">
			<div class="card-body">
				<h4 class="card-title">Dnah sách phim hiện có trong dữ
					liệu</h4>
				<div class="table-responsive">
					<table class="table user-table no-wrap text-center align-middle" id="table-list-film">
						<thead>
							<tr>
								<th class="border-top-0 col-md-1">#</th>
								<th class="border-top-0 col-md-2">Tên phim</th>
								<th class="border-top-0 col-md-1">Diên viên</th>
								<th class="border-top-0 col-md-1">Nhà sản xuất</th>
								<th class="border-top-0 col-md-1">Thời lượng(đơn vị: giờ))</th>
								<th class="border-top-0 col-md-1">Danh mục</th>
								<th class="border-top-0 col-md-2">Poster</th>
								<th class="border-top-0 col-md-1">Thời gian tạo</th>
								<th class="border-top-0 col-md-1"><i class=" fas fa-cogs"></i></th>
								<th class="border-top-0 col-md-1"><i class="fas fa-trash"></i></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="film" items="${listFilm}">
								<tr>
									<td class = "col-md-1">${film.id }</td>
									<td class = "col-md-2">${film.name }</td>
									<td class = "col-md-1">${film.actors }</td>
									<td class = "col-md-1">${film.producer }</td>
									<td class = "col-md-1">${film.duration }</td>
									<td class = "col-md-1"><ul class="list-group ">
											<c:forEach var="category" items="${film.listCategory }">
												<li class=""
													style="list-style-type: none; display: inline-block;">${category.name },</li>
											</c:forEach>
										</ul></td>
									<td class = "col-md-2"><a class="my-image-links"
										href="${pageContext.request.contextPath}/upload/${film.imagepath}"><img
											src="${pageContext.request.contextPath}/upload/${film.imagepath}" class="img-thumbnail" alt="image alt" /></a>
									</td>
									<td class = "col-md-1">${film.created_at}</td>
									<td class = "col-md-1"><a class="btn btn-primary" href="${pageContext.request.contextPath}/admin/film/editfilm/${film.id}" role="button">Sửa</a></td>
									<td class = "col-md-1"><a class="btn btn-primary" href="${pageContext.request.contextPath}/admin/film/deletefilm/${film.id}" role="button">Xóa</a></td>
								</tr>
							</c:forEach>

						</tbody>
					</table>
					<a class="btn btn-primary btn-lg"
						href="${pageContext.request.contextPath}/admin/film/create">Thêm
						mới phim</a>
				</div>
			</div>
		</div>
	</div>
</div>

<!-- ============================================================== -->
<!-- End PAge Content -->
<!-- ============================================================== -->