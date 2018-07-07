<%@ page language="java" contentType="text/html; charset=utf-8" isELIgnored="false"
    pageEncoding="utf-8"%>
<%@ include file="model/header.jsp" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">

    <title> - 登录</title>
    
    <link href="libs/css/bootstrap.min.css" rel="stylesheet">
    <link href="libs/css/font-awesome.css?v=4.4.0" rel="stylesheet">
    <link href="libs/css/animate.css" rel="stylesheet">
    <link href="libs/css/style.css" rel="stylesheet">
    <link href="libs/css/login.css" rel="stylesheet">
    
    <script>
        if (window.top !== window.self) {
            window.top.location = window.location;
        }
    </script>
	<style type="text/css">
		#header{
				height: 60px;
				width: 100%;
				text-align: center;
				color: white;
				padding-top: 50px;
				color: #2B2B36;
			}
	</style>
</head>

<body class="signin">
	<div id="header">
			<h1 style="font-size:40px; "><strong><span style="letter-spacing:15px;">网上书店</span></strong></h1>
			<h5>Online Bookstore</h5>
	</div>
    <div class="signinpanel">
    	
        <div class="row">
            <div class="col-sm-12">
              
                <form id="login-form" method="post" action="BookTitle/login.action">
                   
                 
                    <input type="text" id="name" name="name" class="form-control uname" placeholder="用户名" />
                    <input type="password" id="password" name="password" class="form-control pword m-b" placeholder="密码" />
                    <input type="text" id="code"  name ="code"class="form-control pword m-b" placeholder="验证码" />
                    <img src="img" onclick="changed(this);"/>
                    <button type="submit" class="btn btn-success btn-block" >登录</button>
                    <br>
                    <div class="form-group">
						<div class="col-sm-6" ></div>
						<label class="control-label col-sm-6">
							<a href="regist.jsp">注册</a>
							<span style="color: white">|</span>
							<a href="admin.jsp">店主</a>
						</label>
					</div>
                   
                </form>
                
            </div>
        </div>
        <div class="signup-footer">
            <div class="pull-left">
                &copy; 网上书店
            </div>
        </div>
    </div>
    <script type="text/javascript">
    
    var a=0;
    function changed(o){
    o.src="img?a="+(a++);
    }
    	
    	
    </script>
</body>

</html>
