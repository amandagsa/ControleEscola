<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Controle de Escola</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Cadastrar
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li><a class="dropdown-item" href="cadastraAluno.jsp">Aluno</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="cadastraProfessor.jsp">Professor</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="cadastraDisciplina.jsp">Disciplina</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="cadastraNota.jsp">Nota</a></li>
          </ul>
		</li>
		<li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Consultar
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li><a class="dropdown-item" href="#">Aluno</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">Professor</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">Disciplina</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">Nota</a></li>
          </ul>
		</li>
      </ul>
    </div>
  </div>
</nav>
<div style="margin-left: 400px; margin-right: 400px;margin-top:150px">
<div class="container-fluid">
	<form class="form-horizontal" id="formulario">
		<h2>Cadastro de Notas</h2>
		<br><br>
			<div class="row g-2">
		<div class="col-md">
			<div class="form-floating">
				<select name="codAluno" id="codAluno" class="form-select" aria-label="Default select example">
					<option>#1</option>
				</select>
				<label for="floatingSelectGrid">Aluno</label>
			</div>
			</div>
		</div>
		<br>
	 	<div class="row g-2">
			<div class="col-md">
				<div class="form-floating">
					<select name="codDisciplina" id="codDisciplina" class="form-select" aria-label="Default select example">
						<option>#2</option>
					</select>
				<label for="floatingSelectGrid">Disciplina</label>
				</div>
			<br>
		<div class="col-md">
			<div class="form-floating">
				<input id="vlrNota" name="vlrNota" class="form-control">
				<label for="floatingSelectGrid">Nota</label>
			</div>
		</div>
	</div>
	</div>
	</form>
	<div class="d-grid gap-2 d-md-block">
	<br>
  		<button class="btn btn-primary" type="button">Cadastrar</button>
  		<button class="btn btn-danger" type="button">Cancelar</button>
	</div>
</div>
</div>
</body>
</html>