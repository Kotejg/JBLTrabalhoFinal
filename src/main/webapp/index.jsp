<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<!DOCTYPE html>
<html lang="pt-br">
<!-- feito pelo jefferson -->
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
    <link href="style.css" rel="stylesheet">

    <title>Projeto final</title>
</head>
<!-- feito pelo jefferson -->
<body>
   	<header class="bg-success">
					<div class="container-fluid">
					<!-- feito pelo jefferson -->
						<div class="row mb-5">
							<div class="col-6">
								<h2 class="text-light  mt-2 mb-2"> Jeff - Formulario Veiculo</h2>
								<!-- feito pelo jefferson -->
							</div>
							<div class="col-3 d-grid gap-2">
								<form method="post" action="ServletIpva">
								<!-- feito pelo jefferson -->
								<button type="submit" name="btnopcao" value="listaIpva"
									class="btn  btn-cor  bt-lg mt-3 mb-3">Tabela Ipva</button>
							</form>
							</div>
							<!-- feito pelo jefferson -->
							<div class="col-3 d-grid gap-2">
								<form method="post" action="ServletCarro">
								<button type="submit" name="btnopcao" value="listaCar"
									class="btn btn-cor bt-lg mt-3 mb-3">Tabela Carro</button>
							</form>
							</div>							
						</div>
						<!-- feito pelo jefferson -->
					</div>
					
					<!-- feito pelo jefferson -->
				</header>


<!-- feito pelo jefferson -->
</body>
<!-- feito pelo jefferson -->
</html>

<!-- feito pelo jefferson -->