<%@page language="java" pageEncoding="utf-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="../libs/bootstrap/css/bootstrap.min.css" />
</head>
<body style="color:#23B7E5;">

<div style="width:80% ;margin: 0 auto;">

	<table class="table table-bordered table-hover">
  
      <thead>
   			<div>
				<span style="color: #23B7E5; font-size: 25px;">个人信息</span>
			</div>
                        
      </thead>
		<tbody>
			
			<tr style="background-color: #D0D0D0; color:black;">
				<td>姓名</td>
				<td>密码</td>
				
				<td>收货地址</td>
				<td>联系方式</td>
				
			</tr>
			<tr>
			<td>${requestScope.user_list.name }</td>
			<td>${requestScope.user_list.password }</td>
			<td>${requestScope.user_list.address }</td>
			<td>${requestScope.user_list.phone }</td>
			<td>
			<button class="btn btn-sm btn-success"
									onclick="showUpdate('${requestScope.user_list.userid }' ,'${requestScope.user_list.name }' ,'${requestScope.user_list.password }' ,'${requestScope.user_list.address }'
									,'${requestScope.user_list.phone }'
							)">修改</button>
			
			</td>
			</tr>
		
























		</tbody>




	</table>

    

	




</div>


<!-- 修改对应模态框 -->
	<form action="user_edit.action" class="form-horizontal" method="post">
		<input type="hidden" name="userid" id="userid" />
				
	
	
		<div class="modal" id="modal_update">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<h1>编辑</h1>
					</div>
					<div class="modal-body">


						<div class="form-group">
							<label class="control-label col-sm-2">名称：</label>
							<div class="col-sm-6">
								<input type="text" class="form-control" id="name" name="name" />

							</div>
						</div>




						<div class="form-group">
							<label class="control-label col-sm-2">密码：</label>
							<div class="col-sm-6">
								<input type="text" class="form-control" id="password" name="password" />

							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-2">地址:</label>
							<div class="col-sm-6">
								<input type="text" class="form-control" id="address"
									name="address" />

							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-sm-2">联系方式:</label>
							<div class="col-sm-6">
								<input type="text" class="form-control" id="phone"
									name="phone" />

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

	
	
	
	function showUpdate(id, name, password, address, phone) {
		//在jquery中所有 表单控件 通过 val() 方法赋值和取值
		//在jquery中除了form表单控件以外的控件 一律 使用 html() 方法赋值和取值，
		//因为它们没有value属性 对应的是 innerHTML
		jQuery("#userid").val(id);
		jQuery("#name").val(name);
		jQuery("#password").val(password);

		jQuery("#address").val(address);
		jQuery("#phone").val(phone);
		
		

		jQuery("#modal_update").modal();

	}
</script>
</html>
