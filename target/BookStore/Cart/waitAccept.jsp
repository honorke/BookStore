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
			

			<c:forEach items="${requestScope.wait_accept_0 }" var="ucl">
           

				<c:forEach items="${requestScope.book_list_1}" var="row">
				
				
				
                 
                 

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
							onclick="location.href='delete_cart_money.action?uclid=${ucl.id}&username=${sessionScope.user}'">
							退款
						</button>
						
						
				</td>

						</tr>

					</c:if>


				</c:forEach>

			</c:forEach>
























		</tbody>




	</table>



	<table class="table table-bordered table-hover">
  
      <thead>
      <div>
    已发货
      </div>
                        
      </thead>
		<tbody>
			

			<c:forEach items="${requestScope.wait_accept_1 }" var="ucl">
           

				<c:forEach items="${requestScope.book_list_1}" var="row">
				
				
				
                 
                 

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
							onclick="location.href='delete_cart_money.action?uclid=${ucl.id}&username=${sessionScope.user}'">
							退款
						</button>
						
						
			<button class="btn btn-sm btn-success"
							onclick="showUpdate('${row.bookNo}' ,'${sessionScope.user}' 
							)">评价</button>
			
						
						
						
						
				</td>

						</tr>

					</c:if>


				</c:forEach>

			</c:forEach>
























		</tbody>




	</table>
	
	
	
	<!-- 修改对应模态框 -->
	<form action="give_remark.action" class="form-horizontal" method="post">
		<input type="hidden" name="remarkNo" id="remarkNo" />
		<input type="hidden" name="remarkAuthor" id="remarkAuthor" />
	
	
		<div class="modal" id="modal_update">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<h1>评价</h1>
					</div>
					<div class="modal-body">


						<div class="form-group">
							<label class="control-label col-sm-2">评价：</label>
							<div class="col-sm-6">
								<input type="textarea" class="form-control" id="remarkContex" name="remarkContex" />

							</div>
						</div>




						<div class="form-group">
							<label class="control-label col-sm-2">给几颗星：</label>
							<div class="col-sm-6">
								<input type="text" class="form-control" id="remarkStar" name="remarkStar" />

							</div>
						</div>
						

						


						
					</div>
					<div class="modal-footer">
						<button type="submit" class="btn btn-sm btn-danger">评价</button>
						<button type="button" class="btn btn-sm btn-default"
							data-dismiss="modal">取消</button>
					</div>
				</div>
			</div>
		</div>

	</form>
	





</body>
<script src="../libs/js/jquery-3.2.1.min.js" type="text/javascript"
	charset="utf-8"></script>
<script src="../libs/bootstrap/js/bootstrap.min.js"
	type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
	
	//onclick="showUpdate('${row.bookNo}' ,'${SessionScope.sessionScope.user}' 
	function showUpdate(no, name) {
		//在jquery中所有 表单控件 通过 val() 方法赋值和取值
		//在jquery中除了form表单控件以外的控件 一律 使用 html() 方法赋值和取值，
		//因为它们没有value属性 对应的是 innerHTML
		jQuery("#remarkNo").val(no);
		jQuery("#remarkAuthor").val(name);
		
		

		jQuery("#modal_update").modal();

	}
</script>
</html>
