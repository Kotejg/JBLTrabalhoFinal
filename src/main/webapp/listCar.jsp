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
				<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
				<link href="style.css" rel="stylesheet">
				<title>Carros</title>

			</head>

			<body>
				<!-- feito pelo jefferson -->
				<header class="bg-success">
					<div class="container-fluid">
						<div class="row mb-5">
							<div class="col-6">
								<h2 class="text-light  mt-2 mb-2"> Jeff - Formulario Veiculo</h2>
							</div>
							<div class="col-3 d-grid gap-2">
								<form method="post" action="ServletIpva">
									<!-- feito pelo jefferson -->
									<!-- feito pelo jefferson -->
									<button type="submit" name="btnopcao" value="listaIpva"
										class="btn  btn-cor  bt-lg mt-3 mb-3">Tabela Ipva</button>
								</form>
							</div>
							<div class="col-3 d-grid gap-2">
								<!-- feito pelo jefferson -->
								<form method="post" action="ServletCarro">
									<button type="submit" name="btnopcao" value="listaCar"
										class="btn btn-cor bt-lg mt-3 mb-3">Tabela Carro</button>
								</form>
							</div>
						</div>
					</div>
				</header>
				<div class="container mt-5 ">
					<div class="row align-items-center">
						<div class="col-5">
							<form action="ServletCarro" method="post">
								<button type="submit" name="btnopcao" value="frmNewCar"
									class="btn btn-success btn-lg w-30">Novo Veiculo</button>
								<!-- feito pelo jefferson -->
								<button type="submit" name="btnopcao" value="lista"
									class="btn btn-success  w-30">atualizar
									tabela</button>
							</form>
						</div>
						<div class="col-7 ">
							<form action="ServletIpva" method="post">
								<c:choose>
									<c:when test="${ipva == null}">
										<h5 class="text-warning">Sem Ipva Cadastrado!</h5>
										<button type="submit" name="btnopcao" value="frmInsertIpva"
											class="btn btn-success w-30">Novo Ipva</button>
										<!-- feito pelo jefferson -->
									</c:when>
									<c:otherwise>
										<h2 class="text-dark ">IPVA: ${ipva.ano} </h2>

									</c:otherwise>
								</c:choose>
							</form>
						</div>

						<div class="row">
							<div class="col-4">
								<!-- feito pelo jefferson -->
								<h4 class=" text-primary mt-3">Total carro cadatrados: ${requestScope.totalVeiculo}</h4>
							</div>
							<div class="col-4">
								<h4 class=" text-primary mt-3">Total carro sem Ipva: ${requestScope.totalCom} </h4>
							</div>
							<div class="col-4">
								<!-- feito pelo jefferson -->
								<h4 class=" text-primary mt-3">Total carro com Ipva: ${requestScope.totalSem} </h4>
							</div>
						</div>
					</div>


					<table class="table mt-5">
						<thead class="thead-dark">
							<tr>
								<th scope="col">ID</th>
								<th scope="col">Modelo</th>
								<th scope="col">Ano</th>
								<!-- feito pelo jefferson -->
								<th scope="col">IPVA</th>
							</tr>
						</thead>
						<tbody>

							<c:forEach var="veiculo" items="${listaVeiculo}">
								<form action="ServletCarro" method="post">
									<input type="hidden" name="id" value="${veiculo.idVeiculo}" />
									<!-- feito pelo jefferson -->
									<tr>
										<td class="text-info">${veiculo.idVeiculo} </td>
										<td>${veiculo.modelo}</td>
										<td>${veiculo.ano}</td>
										<td>
											<!-- feito pelo jefferson -->
											<c:choose>
												<c:when test="${ipva.ano >= veiculo.ano || ipva == null}">
													Com ipva
												</c:when>
												<c:otherwise>
													sem ipva
												</c:otherwise>
											</c:choose>
										</td>
										<td><button type="submit" name="btnopcao" value="delete"
												class="btn-danger btn ">Remover</button></td>
										<!-- feito pelo jefferson -->
										<td><button type="submit" name="btnopcao" value="frmUpdate"
												class="btn-warning btn ">Alterar</button></td>
									</tr>
								</form>
							</c:forEach>
						</tbody>
					</table>
					<!-- feito pelo jefferson -->
				</div>

			</body>

			</html>
			<!-- feito pelo jefferson -->