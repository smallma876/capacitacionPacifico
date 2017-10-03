<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page contentType="text/html" isELIgnored="false" %>


	<portlet:renderURL var="renderizar">
		<portlet:param name="accion" value="nuevo"/>
	</portlet:renderURL>
	<portlet:resourceURL var="resourceUrl1"></portlet:resourceURL>
	
<a href="#" onclick="obtenerListaUsuarios()">Listar</a>
<div id="prueba">
</div>
<table id="example" class="display" cellspacing="0" width="100%">
        <thead>
            <tr>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Contraseñia</th>
                <th>Usuario</th>
                <th>DNI</th>
            </tr>
        </thead>
        <tfoot>
            <tr>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Contraseñia</th>
                <th>Usuario</th>
                <th>DNI</th>
            </tr>
        </tfoot>
    </table>
    
    
    <a href="${renderizar}">Nuevo</a>
    
    <script type="text/javascript">
    	function obtenerListaUsuarios(){
    		AUI().use('aui-io-request', function(A){
    			A.io.request('${resourceUrl1}',{
    				method: 'post',
    				data: {
    					<portlet:namespace/>param2: 'value2',
    				},
    				on: {
    					success: function(){
    						    var data= this.get('responseData');
    						$('#example').DataTable( {
    					        data : JSON.parse(data),
    							columns : [
    					            { data: 'nombre' },
    					            { data: 'apellido' },
    					            { data: 'contrasenia' },
    					            { data: 'usuario' },
    					            { data: 'dni' }  					            
    					        ]
    					    } );
    					}
    				}
    			});
    		});
    	}
    </script>