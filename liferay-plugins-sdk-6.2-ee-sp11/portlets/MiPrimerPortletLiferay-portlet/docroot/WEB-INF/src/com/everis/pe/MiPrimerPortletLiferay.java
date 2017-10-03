package com.everis.pe;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class MiPrimerPortletLiferay
 */
public class MiPrimerPortletLiferay extends MVCPortlet {
 
	@Override
	public void render(RenderRequest request, RenderResponse response) throws PortletException, IOException {
		if("success".equalsIgnoreCase((String) request.getAttribute("actionStatus"))){
			getPortletContext().getRequestDispatcher("/html/miprimerportletliferay/resultado.jsp").include(request, response);
		}
		super.render(request, response);
	}
	
	@ProcessAction(name="registrarUsuario")
	public void registrarUsuario(ActionRequest request, ActionResponse response)
		throws PortletException, IOException, PortalException{
		String nombre=request.getParameter("nombre");
		String apellido=request.getParameter("apellido");
		String dni=request.getParameter("dni");
		String apodo=request.getParameter("apodo");
		String contrasenia=request.getParameter("contrasenia");
		Usuario usuario=new Usuario();
		usuario.setNombre(nombre);
		usuario.setApellido(apellido);
		usuario.setDni(dni);
		usuario.setApodo(apodo);
		usuario.setContrasenia(contrasenia);
		request.setAttribute("usuario", usuario);
		request.setAttribute("actionStatus", "success");
	}
}