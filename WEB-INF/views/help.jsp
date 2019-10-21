<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Help</title>
<%@ include file="header.jsp"%> 
</head>
<style>
.header{
    color:cadetblue;
}
</style>
<body background="resources/images/whites.jpg">
<div>

 

<center><h3 class="header"><p style="font-size:50px;">Welcome....I'm there to help You</p></h3></center>
<br>
<br>

 

<center style="font-size:20px;"><p id="q1_ans" style="display:none;">You can check the status of your order by clicking "Track Order" and give your email id and password...</p>
<button id="q1" onclick=showAnswer(this.id)  style="font-size:20px;">How can I check my order status</button></center>
<br>
<br>
<center style="font-size:20px;"><p id="q2_ans" style="display:none;">Click on "Return/Replace" below and select the reason to initiate return or replacement of your item. Our courier partner will pick it up from your place. Do keep the product tags and packaging intact.You can return/replace an item within 7 days of delivery. ''Click here'' to read our 7 days Easy Return policy.</p>
<button id="q2" onclick=showAnswer(this.id) style="font-size:20px;" >How can I return/replace an item?</button></center>
<br>
<br>
<center style="font-size:20px;"><p id="q3_ans" style="display:none;">Go to My Orders  and tap on order you wish to cancel. Click on CANCEL button.Cancellation is not allowed if the order has been shipped.</p>
<button id="q3" onclick=showAnswer(this.id)  style="font-size:20px;">How can I cancel my order?</button></center>
<br>
<br>
<center style="font-size:20px;"><p id="q4_ans" style="display:none;">Don't worry! You can always login using your registered email ID or mobile number.Follow these steps to login:Enter your registered email ID or mobile number as your username at the login page.Click on the 'Login Without Password' button.Enter the OTP received on your email ID/Mobile number.</p>
<button id="q4" onclick=showAnswer(this.id) style="font-size:20px;" >I don't remember my password. Help!</button></center>
<br>
<br>
<center style="font-size:20px;"><p id="q5_ans" style="display:none;">It's really simple, follow these steps-Step 1- Go to 'My orders'Step 2 - Open the relevant suborder.Step 3- Click on 'Need Help' Or 'Report problem with order'.Step 4 - Select your issue from the dropdown & submit it.And our team will get back to you through Email or SMS or call</p>
<button id="q5" onclick=showAnswer(this.id)  style="font-size:20px;">How to raise query/complaint?</button></center>
<br>
<br>
<center style="font-size:20px;"><p id="q6_ans" style="display:none;">Once we receive the original item, we will do quality check within 2 days and initiate refund.- For prepaid orders, it will be initiated immediately to card/bank account. Your bank will take a maximum of 7 to 10 business days to credit this amount.- For cash on delivery orders, it will be credited to your bank account through a NEFT transfer within 2 hours.We will also keep you updated on email and SMS.</p>
<button id="q6" onclick=showAnswer(this.id) style="font-size:20px;" >When can I expect refund for my returned item?</button></center>
</div>

 

<script>
function showAnswer(id) {
  document.getElementById(id+"_ans").style.display = 'block';
  //document.getElementById(id).style.display = 'none';
}
</script>

 
</body>
</html>