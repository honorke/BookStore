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
     未发货
      </div>
                        
      </thead>
		<tbody>
			

			<c:forEach items="${requestScope.give_accept_0 }" var="ucl">
           

				<c:forEach items="${requestScope.give_book_list_1}" var="row">
				
				
				
                 
                 

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
							${ucl.username }
							</td>
							<td>
							${ucl.useraddress }
							</td>
							<td>
							${ucl.userphone }
							</td>
							<td>
						<button class="btn btn-sm btn-success"
							onclick="location.href='admin_delete_cart_money.action?uclid=${ucl.id}&username=${sessionScope.user}'">
							退款
						</button>
						
						
						<button class="btn btn-sm btn-success"
							onclick="location.href='admin_update_cart.action?uclid=${ucl.id}'">
							发货
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
