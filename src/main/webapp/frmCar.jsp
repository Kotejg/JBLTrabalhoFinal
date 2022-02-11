<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
		<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
			<!DOCTYPE html>
			<html lang="pt-br">
<!-- feito pelo jefferson --><!-- feito pelo jefferson --><!-- feito pelo jefferson --><!-- feito pelo jefferson --><!-- feito pelo jefferson -->
			<head>
				<meta charset="UTF-8">
				<meta http-equiv="X-UA-Compatible" content="IE=edge">
				<meta name="viewport" content="width=device-width, initial-scale=1.0">
				<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
				<link href="style.css" rel="stylesheet">
				<title>Projeto final</title>
			</head>

			<body>
				<header class="bg-success">
					<div class="container-fluid">
						<div class="row mb-5">
							<div class="col-6">
								<h2 class="text-light  mt-2 mb-2"> Jeff - Formulario Veiculo</h2>
							</div>
							<div class="col-3 d-grid gap-2">
								<form method="post" action="ServletIpva">
									<button type="submit" name="btnopcao" value="listaIpva"
										class="btn  btn-cor  bt-lg mt-3 mb-3">Tabela Ipva</button>
								</form>
							</div>
							<div class="col-3 d-grid gap-2">
								<form method="post" action="ServletCarro">
									<button type="submit" name="btnopcao" value="listaCar"
										class="btn btn-cor bt-lg mt-3 mb-3">Tabela Carro</button>
								</form>
							</div>
						</div>
					</div>
				</header>
<!-- feito pelo jefferson -->
<!-- feito pelo jefferson -->
				<div class="container mt-5">
					<div class="row">
						<div class="col-md-5 mx-auto border text-center">
							<c:choose>
								<c:when test="${veiculo == null}">
									<h3>Adicionar Veiculo</h3>
								</c:when>
								<c:otherwise>
									<h3>Atualizar Veiculo</h3>
								</c:otherwise>
							</c:choose>
							<!-- feito pelo jefferson -->
							<!-- feito pelo jefferson -->

							<form method="post" action="ServletCarro">
								<input type="hidden" name="id" value="${veiculo.idVeiculo}" />
								<!-- modelo kjdfiusdfuisdhafuisdhfuisdhfiusdhfiuahuisdhfeitopelojefferson -->
								<div class="form-group" style="text-align-last: left;">
									<label for="modelo" class="form-label ">Modelo:</label>
									<input type="text" class="form-control" id="modelo" name="modelo"
										value="${veiculo.modelo}" required>
								</div>
								<!-- feito pelo jefferson -->
								<!-- ano-->
								<div class="form-group" style="text-align-last: left;">
									<label for="ano">Ano:</label>
									<!-- feito pelo jefferson -->
									<input type="number" class="form-control" id="ano" name="ano" value="${veiculo.ano}"
										required>
								</div>
								<c:choose>
									<c:when test="${veiculo == null}">
										<button type="submit" name="btnopcao" value="insert"
											class="btn btn-primary bt-lg mt-3 mb-3">Cadastar</button>
									</c:when>
									<c:otherwise>
										<button type="submit" name="btnopcao" value="update"
											class="btn btn-info bt-lg mt-3 mb-3">Atualizar</button>
									</c:otherwise>
								</c:choose>
							</form>
						</div>
					</div>
				</div>
<!-- feito pelo jefferson -->
			</body>

			</html>
			<!-- feito pelo jefferson -->