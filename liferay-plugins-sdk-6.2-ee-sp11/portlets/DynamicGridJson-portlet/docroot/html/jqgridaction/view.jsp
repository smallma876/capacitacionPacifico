<%--
/**
* Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
*
* This library is free software; you can redistribute it and/or modify it under
* the terms of the GNU Lesser General Public License as published by the Free
* Software Foundation; either version 2.1 of the License, or (at your option)
* any later version.
*
* This library is distributed in the hope that it will be useful, but WITHOUT
* ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
* FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
* details.
*/
--%>
<%@include file="init.jsp"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:resourceURL var="jqGridResourceURL"></portlet:resourceURL>
<link rel="stylesheet" type="text/css" media="screen" href="<%=renderRequest.getContextPath()%>/themes/redmond/jquery-ui-custom.css" />
<link rel="stylesheet" type="text/css" media="screen" href="<%=renderRequest.getContextPath()%>/themes/ui.jqgrid.css" />
<link rel="stylesheet" type="text/css" media="screen" href="<%=renderRequest.getContextPath()%>/themes/ui.multiselect.css" />
<script src="<%=renderRequest.getContextPath()%>/js/datatype.js" type="text/javascript"> </script>
<script src="<%=renderRequest.getContextPath()%>/js/jquery.js" type="text/javascript"></script>
<script src="<%=renderRequest.getContextPath()%>/js/jquery-ui-custom.min.js" type="text/javascript"></script>
<script src="<%=renderRequest.getContextPath()%>/js/jquery.layout.js" type="text/javascript"></script>
<script src="<%=renderRequest.getContextPath()%>/js/i18n/grid.locale-en.js" type="text/javascript"></script>
<script type="text/javascript">
jQuery.jgrid.no_legacy_api = true;
jQuery.jgrid.useJSON = true;
</script>
<script src="<%=renderRequest.getContextPath()%>/js/ui.multiselect.js" type="text/javascript"></script>
<script src="<%=renderRequest.getContextPath()%>/js/jquery.jqGrid.js" type="text/javascript"></script>
<script src="<%=renderRequest.getContextPath()%>/js/jquery.tablednd.js" type="text/javascript"></script>
<script src="<%=renderRequest.getContextPath()%>/js/jquery.contextmenu.js" type="text/javascript"></script>

<table id="list3"></table>
<div id="pager3"></div>
<script>
jQuery("#list3").jqGrid({
   	url:'<%=jqGridResourceURL.toString()%>',
	datatype: "json",
   	colNames:['Inv No', 'Client', 'Amount','Tax','Total','Notes'],
   	colModel:[
   		{name:'id',index:'id', width:60, sorttype:"int"},
   		{name:'name',index:'name', width:100},
   		{name:'amount',index:'amount', width:80, align:"right",sorttype:"float"},
   		{name:'tax',index:'tax', width:80, align:"right",sorttype:"float"},		
   		{name:'total',index:'total', width:80,align:"right",sorttype:"float"},		
   		{name:'note',index:'note', width:150, sortable:false}		
   	],
   	rowNum:20,
   	rowList:[10,20,30],
   	pager: '#pager3',
   	sortname: 'id',
    viewrecords: true,
    sortorder: "desc",
    loadonce: true,
    caption: "Load Once Example"
});
</script>
