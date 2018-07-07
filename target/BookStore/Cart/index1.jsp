<%@page language="java" pageEncoding="utf-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="../libs/bootstrap/css/bootstrap.min.css" />
</head>
<body>



	<table class="table table-bordered table-hover">
  
      <thead>
      <div>
      【刘超购物车】
      </div>
                        
      </thead>
		<tbody>
			

			<c:forEach items="${requestScope.user_cart_list }" var="ucl">
           

				<c:forEach items="${requestScope.book_list}" var="row">
				
				
				
                 
                 

					<c:if test="${ucl.bookid == row.bookId }">

						<tr>
							<td>
							
							<a
								href="selectBook_by_id.action?book_id=${row.bookId}&book_no=${row.bookNo}">
									<span>
										<div>
											<img
												src="../BookPicture/${row.bookNo }.jpg">
										</div>
										

							</a>
							
							
							</td>
							
							<td>
							<div>${row.bookName }</div>
								</span> <span>
										<div>
											${row.bookNowPrice }</div>
								</span>
							</td>
							<td>
						<button class="btn btn-sm btn-success"
							onclick="location.href='delete_cart.action?uclid=${ucl.id}&username=${sessionScope.user}'">
							删除
						</button>
						
						<button class="btn btn-sm btn-success"
							onclick="location.href='pay_cart.action?bookId=${row.bookId}&username=${sessionScope.user}'">
							付款
						</button>
				</td>

						</tr>

					</c:if>


				</c:forEach>

			</c:forEach>
























		</tbody>




	</table>









</body>
<script src="../libs/js/jquery-3.2.1.min.js" type="text/javascript"
	charset="utf-8"></script>
<script src="../libs/bootstrap/js/bootstrap.min.js"
	type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
	
</script>
</html>
