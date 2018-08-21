<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vending machine</title>
</head>
<body>
	<h2> Vending Machine </h2><hr/>
	<form action="getFood">
		<fieldset>
			<legend> Place the cash </legend>
			<label for="price"> Select the amount </label>
			<select name="price">
				<option value="10"> 10 - Water</option>
				<option value="50"> 50 - Apple Juice</option>
				<option value="100"> 100 - Badam MilkShake</option>
				<option value="200"> 200 - Chocolate cake</option>
			</select>
			<input type="submit" value="pay"/>
		</fieldset>
	</form>
</body>
</html>