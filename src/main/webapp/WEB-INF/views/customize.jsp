<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form:form action="" method="GET">
  <div class="table-responsive">
         <table id="tblCustomer" class="table table-hover display">
          <thead>
            <tr>
              <th>Name</th>
              <th>BirthDay</th>
              <th>Email</th>
              <th>Address</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td></td>
            </tr>
          </tbody>
         </table>
  </div>
</form:form>
<script type="text/javascript">
  //Plugin fetch paging data
  jQuery.fn.dataTableExt.oApi.fnPagingInfo = function ( oSettings )
{
    return {
        "iStart":         oSettings._iDisplayStart,
        "iEnd":           oSettings.fnDisplayEnd(),
        "iLength":        oSettings._iDisplayLength,
        "iTotal":         oSettings.fnRecordsTotal(),
        "iFilteredTotal": oSettings.fnRecordsDisplay(),
        "iPage":          oSettings._iDisplayLength === -1 ?
            0 : Math.ceil( oSettings._iDisplayStart / oSettings._iDisplayLength ),
        "iTotalPages":    oSettings._iDisplayLength === -1 ?
            0 : Math.ceil( oSettings.fnRecordsDisplay() / oSettings._iDisplayLength )
    };
};

$(document).ready(function() {
  var url = "";
  $('#tblCustomer').dataTable({
	  "bProcessing": true,
	    "bServerSide": true,
	    "sort": "position",
	    "bStateSave": false,
	    "iDisplayLength": 10,
	    "iDisplayStart": 0,
	    "fnDrawCallback": function(){
	    	alert('Current page number: '+ this.fnPagingInfo().iPage);
	    },
	    "sAjaxSource": url,
	    "oaColums": [
	      {"mData":"jsonName"},
	      {"mData": "jsonBirthDay"},
	      {"mData": "jsonEmail"},
	      {"mData": "jsonAddress"},
	    ]
  });
});
</script>
