
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html" isELIgnored="false" %>
<portlet:defineObjects />
<portlet:actionURL name="registrarUsuario" var="addNameUrl"></portlet:actionURL>
<fmt:setBundle basename="content.Language-ext"/>
<form action="${addNameUrl}" method="POST">
<table width="200px">
  <tr>
  	<td>Nombre :</td>
  	<td><input type="text" name="<portlet:namespace />nombre" value= "${requestScope.usuario.nombre}"></input></td>
  </tr>
  <tr>
  	<td>Apellido :</td>
  	<td><input type="text" name="<portlet:namespace />apellido" value= "${requestScope.usuario.apellido}"></input></td>
  </tr>
  <tr>
  	<td>Apodo :</td>
  	<td><input type="text" name="<portlet:namespace />apodo" value= "${requestScope.usuario.apodo}"></input></td>
  </tr>
  <tr>
  	<td>Contraseñia :</td>
  	<td><input type="text" name="<portlet:namespace />contrasenia" value= "${requestScope.usuario.contrasenia}"></input></td>
  </tr>
  <tr>
  	<td>DNI :</td>
  	<td><input type="text" name="<portlet:namespace />dni" value= "${requestScope.usuario.dni}"></input></td>
  </tr>
  <tr align="center">
    <td colspan="2">
    	<input type="submit"/>
    	&nbsp;
    </td>
  </tr>
</table>
</form>