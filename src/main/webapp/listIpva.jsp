<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
		<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
			<!DOCTYPE html>
			<html lang="pt-br">
			<!-- feito pelo jefferson -->

			<head>
				<meta charset="utf-8">
				<meta http-equiv="X-UA-Compatible" content="IE=edge">
				<meta name="viewport" content="width=device-width, initial-scale=1">
				<!-- feito pelo jefferson -->
				<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
				<link href="style.css" rel="stylesheet">
				<title>Carros</title>
				<!-- feito pelo jefferson -->
			</head>
			<!-- feito pelo jefferson -->

			<body>
				<header class="bg-success">
					<div class="container-fluid">
						<div class="row mb-5">
							<div class="col-6">
								<h2 class="text-light  mt-2 mb-2"> Jeff - Formulario Veiculo</h2>
							</div>
							<div class="col-3 d-grid gap-2">
								<form method="post" action="ServletIpva">
									<!-- feito pelo jefferson -->
									<button type="submit" name="btnopcao" value="listaIpva"
										class="btn  btn-cor  bt-lg mt-3 mb-3">Tabela Ipva</button>
									<!-- feito pelo jefferson -->
									<!-- feito pelo jefferson -->
								</form>
							</div>
							<div class="col-3 d-grid gap-2">
								<form method="post" action="ServletCarro">
									<button type="submit" name="btnopcao" value="listaCar"
										class="btn btn-cor bt-lg mt-3 mb-3">Tabela Carro</button>
									<!-- feito pelo jefferson -->
								</form>
							</div>
						</div>
					</div>
				</header>

				<div class="container mt-5 ">
					<div class="row align-items-center">
						<div class="col-5">
							<!-- feito pelo jefferson -->
							<form action="ServletIpva" method="post">
								<button type="submit" name="btnopcao" value="lista"
									class="btn btn-success  w-30">atualizar
									tabela</button>
							</form>
						</div>
					</div>

					<table class="table mt-5">
						<thead class="thead-dark">
							<tr>
								<th scope="col">ID</th>
								<!-- feito pelo jefferson -->
								<th scope="col">Ano</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="ipva" items="${listaIpva}">
								<form action="ServletIpva" method="post">
									<!-- feito pelo jefferson -->
									<input type="hidden" name="id" value="${ipva.idIpva}" />
									<tr>
										<td class="text-info">${ipva.idIpva} </td>
										<td>${ipva.ano}</td>
										<td><button type="submit" name="btnopcao" value="frmUpdateIpva"
												class="btn-warning btn ">Alterar</button></td>
										<!-- feito pelo jefferson -->
										<td><button type="submit" name="btnopcao" value="delete"
												class="btn-warning btn ">remover</button></td>
									</tr>
								</form>
							</c:forEach>
							<!-- feito pelo jefferson -->
						</tbody>
					</table>
				</div>

			</body>
			<!-- feito pelo jefferson -->

			</html>
			<!-- feito pelo jefferson -->