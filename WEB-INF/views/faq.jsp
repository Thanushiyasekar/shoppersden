<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Frequently Asked Questions</title>
<%@ include file="header.jsp"%>  
</head>
<style>

 


.header{
    color:blue;
}
</style>
<body background="resources/images/faq.jpg">
<div>

 

<center style="font-size:20px;"><p id="q1_ans" style="display:none;">You can order easily using our online platform.when you find a product you need ,you can add it to cart,login and go through the ordering process.After the order is ready,you will receive order summary will also be stored to your account.</p>
<button id="q1" onclick=showAnswer(this.id) style="font-size:20px;" >How can I order?</button></center>
<br>
<br>
<center style="font-size:20px;"><p id="q2_ans" style="display:none;">Speeding up the process.By ordering online you will get prices faster and you will be able to go through order confirmation and payment process much faster.This could save days of your time.</p>
<button id="q2" onclick=showAnswer(this.id)  style="font-size:20px;">Why should I buy online?</button></center>
<br>
<br>
<center style="font-size:20px;"><p id="q3_ans" style="display:none;">You can use all the major credit cards.If you are a customer with established customer relationship with Hy-test Ltd.you are able to use invoice as a payment method on our online shopping checkout process.</p>
<button id="q3" onclick=showAnswer(this.id) style="font-size:20px;">What information should I input when ordering?</button></center>
<br>
<br>
<center style="font-size:20px;"><p id="q4_ans" style="display:none;">All the products which are shown on our site are available.Order lead time depends on the products and quantities.</p>
<button id="q4" onclick=showAnswer(this.id) style="font-size:20px;" >Do you have the product in stock?</button></center>
<br>
<br>
<center style="font-size:20px;"><p id="q5_ans" style="display:none;">If you have question regarding our online store (ordering,account questions,technical questions),please contact onlinestore@hytest.fi. or call +358-2-512-0900.</p>
<button id="q5" onclick=showAnswer(this.id)  style="font-size:20px;">Can I use pro-forma invoice?</button></center>
<br>
<br>
<center style="font-size:20px;"><p id="q6_ans" style="display:none;">If you have VAT number,then VAT is not charged.you need to remember to add the VAT number to your account information section.Online checkout system will automatically fill in the submitted VAT number when you order products.</p>
<button id="q6" onclick=showAnswer(this.id)  style="font-size:20px;">Is VAT charged?</button></center>
</div>

 

<script>
function showAnswer(id) {
  document.getElementById(id+"_ans").style.display = 'block';
  //document.getElementById(id).style.display = 'none';
}
</script>
</body>
</html>