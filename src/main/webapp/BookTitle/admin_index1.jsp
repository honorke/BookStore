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
          
			
			
			
			<c:forEach  items = "${requestScope.book_list }" var = "row">
			<tr>
			<td>
			<div>
								<img
									src="../BookPicture/${row.bookNo }.jpg">
							</div>
			</td>
			<td>
			${row.bookName }
			</td>
			
			<td>
			${row.bookWriter }
			</td>
			
			<td>
			${row.bookPublishDate }
			</td>
			
			<td>${row.bookNowPrice }</td>
			<td>${row.bookPrePrice }</td>
			<td>
			<button class="btn btn-sm btn-success"
							onclick="showUpdate('${row.bookId}' ,'${row.bookNo}' ,'${row.bookName}' ,'${row.bookPicture}'  ,'${row.bookWriter}','${row.bookPublishDate}','${row.bookNowPrice}'
							,'${row.bookPrePrice}')">修改</button>
			</td>
	
	
	
			</tr>
			
			
			
			</c:forEach>
			
			
			
				

	

	 
	 
	 
	 	
			











		</tbody>




	</table>





	<!-- 修改对应模态框 -->
	<form action="admin_edit.action" class="form-horizontal" method="post">
		<input type="hidden" name="bookId" id="bookId" />
		<input type="hidden" name="bookNo" id="bookNo" />
		
		<input type="hidden" name="bookPicture" id="bookPicture" />
	
		<div class="modal" id="modal_update">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<h1>编辑</h1>
					</div>
					<div class="modal-body">


						<div class="form-group">
							<label class="control-label col-sm-2">书名：</label>
							<div class="col-sm-6">
								<input type="text" class="form-control" id="bookName" name="bookName" />

							</div>
						</div>




						<div class="form-group">
							<label class="control-label col-sm-2">作者：</label>
							<div class="col-sm-6">
								<input type="text" class="form-control" id="bookWriter" name="bookWriter" />

							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-2">出版时间:</label>
							<div class="col-sm-6">
								<input type="text" class="form-control" id="bookPublishDate"
									name="bookPublishDate" />

							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-sm-2">现价:</label>
							<div class="col-sm-6">
								<input type="text" class="form-control" id="bookNowPrice"
									name="bookNowPrice" />

							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-sm-2">原价:</label>
							<div class="col-sm-6">
								<input type="text" class="form-control" id="bookPrePrice" name="bookPrePrice" />

							</div>
						</div>

						


						
					</div>
					<div class="modal-footer">
						<button type="submit" class="btn btn-sm btn-danger">修改</button>
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

	
	
	
	function showUpdate(id, no, name, picture, writer, publishdate, now,
			pre) {
		//在jquery中所有 表单控件 通过 val() 方法赋值和取值
		//在jquery中除了form表单控件以外的控件 一律 使用 html() 方法赋值和取值，
		//因为它们没有value属性 对应的是 innerHTML
		jQuery("#bookId").val(id);
		jQuery("#bookNo").val(no);
		jQuery("#bookName").val(name);

		jQuery("#bookPicture").val(picture);
		jQuery("#bookWriter").val(writer);
		jQuery("#bookPublishDate").val(publishdate);
		jQuery("#bookNowPrice").val(now);
		jQuery("#bookPrePrice").val(pre);
		

		jQuery("#modal_update").modal();

	}
</script>
</html>
