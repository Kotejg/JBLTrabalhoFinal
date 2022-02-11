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
				<!-- feito pelo jefferson -->
				<link href="style.css" rel="stylesheet">

				<title>Projeto final</title>
			</head>

			<body>
				<header class="bg-success">
					<div class="container-fluid">
					<!-- feito pelo jefferson -->
						<div class="row mb-5">
							<div class="col-6">
							<!-- feito pelo jefferson -->
								<h2 class="text-light  mt-2 mb-2"> Jeff - Formulario Veiculo</h2>
							</div>
							<div class="col-3 d-grid gap-2">
								<form method="post" action="ServletIpva">
									<button type="submit" name="btnopcao" value="listaIpva"
										class="btn  btn-cor  bt-lg mt-3 mb-3">Tabela Ipva</button>
								</form>
							</div>
							<!-- feito pelo jefferson -->
							<!-- feito pelo jefferson -->
							<!-- feito pelo jefferson -->
							<!-- feito pelo jefferson -->
							<!-- feito pelo jefferson -->
							
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
				<div class="container mt-5">
					<div class="row">
						<div class="col-md-5 mx-auto border text-center">
							<c:choose>
								<c:when test="${ipva == null}">
									<h3>Adicionar Ipva</h3>
								</c:when>
								<c:otherwise>
									<h3>Atualizar Ipva</h3>
								</c:otherwise>
							</c:choose>
							<form method="post" action="ServletIpva">
								<input type="hidden" name="id" value="${ipva.idIpva}" />
								<div class="form-group" style="text-align-last: left;">
									<label for="ano">Ano:</label>
									<input type="number" class="form-control" id="ano" name="anoi" value="${ipva.ano}"
										required>
								</div>
								<c:choose>
									<c:when test="${ipva == null}">
									<!-- feito pelo jefferson -->
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
						<!-- feito pelo jefferson -->
					</div>
				</div>
<!-- feito pelo jefferson -->
			</body>

			</html>