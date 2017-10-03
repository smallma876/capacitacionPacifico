<%
/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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
%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects />
<script src="/<%=renderRequest.getContextPath()%>/js/datatype.js" type="text/javascript"> </script>
<table id="listdt"></table>
<div id="pagerdt"></div>
<script>
jQuery("#listdt").jqGrid({        
	datatype : 	function  (pdata) {
		jquery.ajax({
			url:'server.php?q=2',
			data:pdata,
			dataType:"json",
			complete: function(jsondata,stat){
				if(stat=="success") {
					var thegrid = jQuery("#listdt")[0];
					thegrid.addJSONData(eval("("+jsondata.responseText+")"))
				}
			}
		});
	},
   	colNames:['Inv No','Date', 'Client', 'Amount','Tax','Total','Notes'],
   	colModel:[
   		{name:'id',index:'id', width:55},
   		{name:'invdate',index:'invdate', width:90},
   		{name:'name',index:'name asc, invdate', width:100},
   		{name:'amount',index:'amount', width:80, align:"right", editable:true,editrules:{number:true,minValue:100,maxValue:350}},
   		{name:'tax',index:'tax', width:80, align:"right",editable:true,edittype:"select",editoptions:{value:"IN:InTime;TN:TNT;AR:ARAMEX"}},		
   		{name:'total',index:'total', width:80,align:"right",editable: true,edittype:"checkbox",editoptions: {value:"Yes:No"} },		
   		{name:'note',index:'note', width:150, sortable:false}		
   	],
   	rowNum:10,
   	rowList:[10,20,30],
   	pager: '#pagerdt',
   	sortname: 'id',
    viewrecords: true,
    sortorder: "desc",
    caption:"Data type as function Example",
    cellEdit: true
});
jQuery("#listdt").jqGrid('navGrid','#pagerdt',{edit:false,add:false,del:false});
</script>
