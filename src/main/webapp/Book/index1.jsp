<%@page language="java" pageEncoding="utf-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="../libs/bootstrap/css/bootstrap.min.css" />
</head>
<body>

	<table class="table table-bordered table-hover">


		<tbody>
			<!-- 
			<c:forEach items="${requestScope.BookTitle_list}" var="row" 
				>

				<tr>

					<td><img src="../BookPicture/${row.bookNo }.jpg">
					<button class="btn btn-sm btn-success"
							onclick="location.href='select_by_no.action?pro_no=${row.bookId}'">
							详情
						</button>
					</td>
					<td><img src="../BookPicture/${requestScope.BookTitle_list.get(2).bookNo }.jpg">
					<button class="btn btn-sm btn-success"
							onclick="location.href='select_by_no.action?pro_no=${row.bookId}'">
							详情
						</button>
					</td>
					<td><img src="../BookPicture/${requestScope.BookTitle_list.get(3).bookNo }.jpg">
					<button class="btn btn-sm btn-success"
							onclick="location.href='select_by_no.action?pro_no=${row.bookId}'">
							详情
						</button>
					</td>
					
					
					
					

					
                <td>
						<button class="btn btn-sm btn-success"
							onclick="location.href='select_by_no.action?pro_no=${row.bookId}'">
							详情
						</button>
				</td>
                 






				</tr>


			</c:forEach>
			-->
        <!-- 
        
			<c:forEach var="i" begin="0" end="3">
				<tr>
					<c:forEach var="j" begin="0" end="2">
						<td>
						<a href = "'selectBook_by_no.action?book_id=${row.bookId}'">
						<span>
							<div>
								<img
									src="../BookPicture/${requestScope.BookTitle_list.get(i*3+j).bookNo }.jpg">
							</div>
							<div>${requestScope.BookTitle_list.get(i*3+j).bookName }</div>
						</span>
						<span>
						<div>
						${requestScope.BookTitle_list.get(i*3+j).bookNowPrice }
						</div>
						</span>

                        </a>
						</td>
					</c:forEach>
				</tr>
			</c:forEach>
			 -->
			 
			 <tr>
			 <td>
			<div>
			
								<img
									src="../BookPicture/${requestScope.BookId_list.bookNo }.jpg">
							</div>
							</td>
			</tr>
							
				<tr>
			 <td>
			 <div>
			 <button type="button" class="layui-laypage-btn" 
			 onclick="location.href='addcart.action?bookid=${requestScope.BookId_list.bookId}&username=${sessionScope.user}'">加入购物车</button>
			 </div>			
			<div>
			
			${requestScope.BookId_list.bookName }
			</div>
			</td>
			</tr>
			
			<tr>
			 <td>
			<div>
			${requestScope.BookId_list.bookWriter }
			</div>
			</td>
			</tr>
			<tr>
			 <td>
			<div>
			现价：
			${requestScope.BookId_list.bookNowPrice }
			</div>
			</td>
			</tr>
			<tr>
			 <td>
			<div>
			原价：
			${requestScope.BookId_list.bookPrePrice }
			</div>
			</td>
			</tr>
			
			
			
			<c:forEach items="${requestScope.Book_Remark_list }"  var="rem">
			
			<tr>
			 <td>
			<div>
			${rem.remarkAuthor } 
			</div>
			
			<div>
			${rem.remarkStar }
			</div>
			
			<div>
			${rem.remarkContex }
			</div>
			</td>
			</tr>
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
