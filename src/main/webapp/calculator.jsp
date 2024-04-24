<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator here</title>
</head>
<body>

	<h1 align="center">Simple Calculator here</h1>

	<form action="calr" method="post">

		<table style="background-color: pink; margin: auto;">

			<tr>

				<td>Enter Num1</td>

				<td><input type="text" name="num1" value="${c.num1}" /></td>

			</tr>

			<tr>
				<td>Enter operation</td>
				<td><input type="text" name="operation" value="${c.operation}" /></td>
			</tr>


			<td>Enter num2</td>
			<td><input type="text" name="num2" value="${c.num2}" /></td>

			</tr>

			<tr>


				<td><input type="submit" name="Submit" /></td>

			</tr>

			<tr>


				<td><input type="text" readonly="readonly" name="result"
					value="${c.result}" /></td>

			</tr>

		</table>



	</form>

</body>
</html>