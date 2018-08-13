<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <base href="<%=basePath %>"/>
<title>购物车-合众饰品专卖</title>
<meta name="keywords"  content="KEYWORDS..." />
<meta name="description" content="DESCRIPTION..." />
<meta name="author" content="HZIT" />
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name='apple-touch-fullscreen' content='yes'>
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="format-detection" content="telephone=no">
<meta name="format-detection" content="address=no">
<link rel="icon" href="../../images/icon/favicon.ico" type="image/x-icon">
<link rel="apple-touch-icon-precomposed" sizes="57x57" href="../../images/icon/apple-touch-icon-57x57-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="120x120" href="../../images/icon/apple-touch-icon-120x120-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="196x196" href="../../images/icon/apple-touch-icon-196x196-precomposed.png">
<meta name="viewport" content="initial-scale=1, width=device-width, maximum-scale=1, user-scalable=no">
<link rel="stylesheet" type="text/css" href="../../css/style.css" />
<script src="../../js/jquery.js"></script>
<script>
$(document).ready(function(){
  //minus
  $(".minus").click(function(){
	  var currNum=$(this).siblings(".number");  //先看class为number的文本框的值
    //如果值小于等于1
	  if(currNum.val()<=1){
       $.post("updateCart", {goodsid: $(this).attr("title"), flag: "del"}, function (data) {
        $(".cart_icon em").html(data.totalcount);
        $("#price").html("总价格:￥:"+data.totalprice);
       });
       //删除元素
       $(this).parents("dd").remove();
        //提示购物车为空
       nullTips();

      }else {
       currNum.val(parseInt(currNum.val()) - 1);
       $.post("updateCart", {goodsid: $(this).attr("title"), flag: "-"}, function (data) {
        $(".cart_icon em").html(data.totalcount);
        $("#price").html("总价格:￥:"+data.totalprice);
       });
      }
	  });
  //plus
  $(".plus").click(function(){
	  var currNum=$(this).siblings(".number");
	  currNum.val(parseInt(currNum.val())+1);
      $.post("updateCart", {goodsid: $(this).attr("title"), flag: "+"}, function (data) {
       $(".cart_icon em").html(data.totalcount);
       $("#price").html("总价格:￥:"+data.totalprice);
      });
	  });
  //delBtn
  $(".delBtn").click(function(){
	  $(this).parent().remove();
	  nullTips();
   $.post("updateCart", {goodsid: $(this).attr("title"), flag: "del"}, function (data) {
    $(".cart_icon em").html(data.totalcount);
    $("#price").html("总价格:￥:"+data.totalprice);
   });
	  });
  //isNull->tips
  function nullTips(){
	  if($(".cart dd").length==0){
		  var tipsCont="<mark style='display:block;background:none;text-align:center;color:grey;'>购物车为空！</mark>"
		  $(".cart").remove();
		  $("body").append(tipsCont);
		  }
	  }
});
</script>
</head>
<body>
<!--header-->
<header>
 <a href="javascript:history.go(-1);" class="iconfont backIcon">&#60;</a>
 <h1>购物车</h1>
</header>
<dl class="cart">
 <dt>
  <label><input type="checkbox"/>全选</label>
  <a class="edit">编辑</a>
 </dt>
 <dd>
  <input type="checkbox"/>
  <a href="product.jsp" class="goodsPic"><img src="../../upload/goods004.jpg"/></a>
  <div class="goodsInfor">
   <h2>
    <a href="product.jsp">聚财貔貅风水摆件</a>
    <span>1</span>
   </h2>
   <div class="priceArea">
    <strong>0.00</strong>
    <del>0.00</del>
   </div>
   <div class="numberWidget">
    <input type="button" value="-" class="minus"/>
    <input type="text" value="1" disabled  class="number"/>
    <input type="button" value="+"  class="plus"/>
   </div>
  </div>
  <a class="delBtn">删除</a>
 </dd>
 <dd>
  <input type="checkbox"/>
  <a href="product.jsp" class="goodsPic"><img src="../../upload/goods002.jpg"/></a>
  <div class="goodsInfor">
   <h2>
    <a href="product.jsp">烟灰缸 玻璃工艺品...</a>
    <span>1</span>
   </h2>
   <div class="priceArea">
    <strong>0.00</strong>
    <del>0.00</del>
   </div>
   <div class="numberWidget">
    <input type="button" value="-" class="minus"/>
    <input type="text" value="1" disabled class="number"/>
    <input type="button" value="+" class="plus"/>
   </div>
  </div>
  <a class="delBtn">删除</a>
 </dd>
 <dd>
  <input type="checkbox"/>
  <a href="product.jsp" class="goodsPic"><img src="../../upload/goods003.jpg"/></a>
  <div class="goodsInfor">
   <h2>
    <a href="product.jsp">迷你花杯 送底座</a>
    <span>1</span>
   </h2>
   <div class="priceArea">
    <strong>0.00</strong>
    <del>0.00</del>
   </div>
   <div class="numberWidget">
    <input type="button" value="-" class="minus"/>
    <input type="text" value="1" disabled  class="number"/>
    <input type="button" value="+" class="plus"/>
   </div>
  </div>
  <a class="delBtn">删除</a>
 </dd>
</dl>
<!--bottom nav-->
<div style="height:1rem;"></div>
<aside class="btmNav">
 <ul>
  <li><a class="cart_icon"><em>0</em></a></li>
  <li><a>合计：￥0.00</a></li>
  <li><a href="confirm_order.jsp">立即下单</a></li>
 </ul>
</aside>
</body>
</html>
