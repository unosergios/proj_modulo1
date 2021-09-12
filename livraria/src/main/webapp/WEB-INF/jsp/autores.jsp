<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>         
   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <title>AUTORES</title>

  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">

</head>
<body class="container">

  <form action="<c:url value="/autores"/>" method="POST">
    <h1 class="text-center font-weigth-ligth  "> CADASTRO DE AUTOR</h1>

    <div class="form-group">
       <label for="nome"> Nome </label>
       <input id="nome" class="form-control"  name="nome"> 
    </div>

    <div class="form-group">
       <label for="email"> E_Mail </label>
       <input id="email" class="form-control" name="email"> 
    </div>
    
    <div class="form-group">
       <label for="dtnasc"> Data de Nascimento </label>
       <input id="dtnasc" class="form-control" name="dtnasc"> 
    </div>
    
    <div class="form-group">
       <label for="mcurr"> Mini Curriculum </label>
       <input id="mcurr" class="form-control" name="mcurr"> 
    </div>
    
    <input type="submit" value="Cadastrar" class="mt-2 btn-primary" >
    
  </form>

  <h1 class="text-center font-weigth-ligth ">  LISTA DE AUTORES</h1>
  <table class="table table-hover table-striped table-bordered border-primary">
        <thead>
          <tr>
            <th> Nome </th>
            <th> Email</th>
            <th> Data de Nascimento </th>
          </tr>  
        </thead>
    
        <tbody>
          <c:forEach items="${listatopagina}" var="t">
            <tr>
              <td> ${t.nome} </td>
              <td> ${t.email }</td>
              <td> ${t.dataNascimento }</td>      
            </tr>
          </c:forEach>
        </tbody>
  </table>
</body>
</html>