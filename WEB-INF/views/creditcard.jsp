<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="pf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.virtusa.shoppersden.models.*,org.springframework.beans.factory.annotation.Autowired,javax.servlet.http.HttpServletRequest,java.util.List,com.virtusa.shoppersden.daoimpl.CreditCardDaoImpl,com.virtusa.shoppersden.dao.*,java.security.Principal" %>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/conf.css">
<%@ include file="header.jsp"%>
<style>
optgroup { font-size:14px; }
</style>
</head>
<body>
 <pf:form class="form-horizontal" action="${pageContext.request.contextPath}/savecreditcard/${user_id}" modelAttribute="creditcard"  > 
        
		<fieldset>
			<!-- Form Name -->
			<legend>PAYMENT</legend>
			<security:authentication property="principal.username" var="userStore"/>
	<%-- 		<%
			
			HttpServletRequest req = null;
			Principal prin =req.getUserPrincipal();
			User user = new User();
			CreditCardDaoImpl ccdaO = new CreditCardDaoImpl();
			List<CreditCard> list = ccdaO.getallCreditcardDetailbyId(prin);
			for(int i=0 ; i<list.size();i++){
				System.out.println(list.);
			}%> --%>
          <%--  <c:forEach items="${products}" var="card"></c:forEach>  --%>
         <%--  out.console("${user.id}") --%>
         
			<pf:hidden path="id" />
			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" path="cardholdername" for="product_name">CARDHOLDER
					NAME</label>
				<div class="col-md-4">
					<pf:input id="cardholder_name" path="cardholdername" placeholder="CARDHOLDER NAME"
						class="form-control input-md" required="" type="text" />
						<pf:errors path="cardholdername" style="color:red;"></pf:errors>
				</div>
			</div>

			<!-- Number input-->
			<div class="form-group">
				<label class="col-md-4 control-label" path="cardnumber" for="product_name">CARD
					NUMBER</label>
				<div class="col-md-4">
					<pf:input id="card_number" path="cardnumber" placeholder="CARD NUMBER"
						class="form-control input-md" required="" type="number" />
						<pf:errors path="cardnumber" style="color:red;"></pf:errors>
				
				</div>
			</div>
			  <!-- Expiry month (select) -->
			<div class="form-group">
				<label class="col-md-4 control-label" path="month">EXPIRY MONTH</label>
					<div class="col-md-4">
				<pf:select path="month" class="form-control input-md"> 
                       <option value="01">January</option>
                       <option value="02">Febuary</option>
                       <option value="03">March</option>
                       <option value="04">April</option>
                        <option value="05">May</option>
                       <option value="06">June</option>
                       <option value="07">July</option>
                       <option value="08">August</option>
                        <option value="09">September</option>
                       <option value="10">October</option>
                       <option value="11">November</option>
                       <option value="12">December</option>
				</pf:select>
		            </div>
		            </div>
			<!-- Expiry year (select) -->
			<div class="form-group">
				<label class="col-md-4 control-label" path="year">EXPIRY YEAR</label>
					<div class="col-md-4">
				<pf:select path="year" class="form-control input-md"> 
                       <option value="19">2019</option>                      
                       <option value="20">2020</option>
                       <option value="21">2021</option>
                       <option value="22">2022</option>
                        <option value="23">2023</option>
                       <option value="24">2024</option>
                       <option value="25">2025</option>
                       <option value="26">2026</option>
                        <option value="27">2027</option>
                       <option value="28">2028</option>
                       <option value="29">2029</option>
                       <option value="30">2030</option>
				</pf:select>
					
				</div>
			</div>
		
			
			<!-- Number input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="product_name">CVV</label>
				<div class="col-md-4">
					<input id="cvv_number"  placeholder="CVV"
						class="form-control input-md" required="" type="number" />
						
				
				</div>
			</div>
			<div class="form-group">
			   <div class="col-md-4">
			  <!--  <label class="col-md-4 control-label" for="singlebutton">REGISTER
					</label> -->
			<button class="btn btn-primary" value="Submit">Submit</button>
			   </div>
			</div>
		
			
		</fieldset>
	</pf:form>
	
<div class="modal fade success-popup" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog modal-sm" role="document">
  
    <div class="modal-content">
    
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
        <h4 class="modal-title" id="myModalLabel">Thank You !</h4>
      </div>
      <div class="modal-body text-center">
         <img src="resources/images/sy.jpg" class="img-responsive">
          <p class="lead">Your Product has been registered successfully and Your product will be shipped with in 24 hours!</p>
          <a href="home" class="rd_more btn btn-default">Go to Home</a>
      </div>
      </div>
    </div>
  </div>

</body>
</html>