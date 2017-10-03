package com.everis.portlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.RequestDispatcher;

import org.apache.catalina.connector.Request;
import org.springframework.web.context.request.RequestScope;

import com.everis.domain.Usuario;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class myPortletResource
 */
public class myPortletResource extends MVCPortlet {
 
	private static Log _log = LogFactoryUtil.getLog(myPortletResource.class.getName());
	public static List<Usuario> listaUsuario=new ArrayList<Usuario>();
	
	@Override
	public void render(RenderRequest request, RenderResponse response) throws PortletException, IOException {
		_log.info("::: INICIO RENDER :::");
		if("nuevo".equalsIgnoreCase((String)request.getParameter("accion"))){
			getPortletContext().getRequestDispatcher("/html/myportletresource/view.jsp").include(request, response);
			request.setAttribute("statusRequest", "pendiente");
		}
		super.render(request, response);
	}
	
	public void RegistrarUsuario(ActionRequest request, ActionResponse response){
		_log.info("::: INICIO DE ACTION REGISTRAR USUARIO :::");
		Usuario oUsuario = new Usuario();
		
		_log.info("Nombre : "+request.getParameter("nombre"));
		_log.info("Apellido : "+request.getParameter("apellido"));
		_log.info("Usuario : "+request.getParameter("user"));
		_log.info("DNI : "+request.getParameter("dni"));
		_log.info("Contraseñia : "+request.getParameter("contrasenia"));
		
		oUsuario.setNombre(request.getParameter("nombre"));
		oUsuario.setApellido(request.getParameter("apellido"));
		oUsuario.setUser(request.getParameter("user"));
		oUsuario.setDni(Integer.parseInt(request.getParameter("dni")));
		oUsuario.setContrasenia(request.getParameter("contrasenia"));
		listaUsuario.add(oUsuario);
		
		request.setAttribute("statusRequest", "success");
		request.setAttribute("usuario", oUsuario);
		
	}
	
	@Override
	public void serveResource(ResourceRequest request, ResourceResponse response)
			throws IOException, PortletException {
		_log.info("::: INICIO RESOURCE :::");
		
		JSONObject jsonObjc1;
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
		for(Usuario oUser: listaUsuario){
		    jsonObjc1 = JSONFactoryUtil.createJSONObject();
			jsonObjc1.put("nombre",oUser.getNombre());
			jsonObjc1.put("apellido",oUser.getApellido());
			jsonObjc1.put("contrasenia",oUser.getContrasenia());
			jsonObjc1.put("usuario",oUser.getUser());
			jsonObjc1.put("dni",oUser.getDni());    
			jsonArray.put(jsonObjc1);
			
		}

		PrintWriter writer = response.getWriter();
		writer.print(jsonArray);
		writer.flush();
		writer.close();
		super.serveResource(request, response);
	}
}
