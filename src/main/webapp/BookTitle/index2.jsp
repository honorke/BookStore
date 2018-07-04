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
			
			<c:forEach var="i" begin="0" end="${requestScope.BookTitle_list.size()/3 }">
				<tr>
					<c:forEach var="j" begin="0" end="2">
						<td>
						<c:if test="${(i*3+j)<requestScope.BookTitle_list.size() }">
						
						<a href = "selectBook_by_id.action?book_id=${requestScope.BookTitle_list.get(i*3+j).bookId}&book_no=${requestScope.BookTitle_list.get(i*3+j).bookNo}">
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
                        </c:if>
						
						
						</td>
					</c:forEach>
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
