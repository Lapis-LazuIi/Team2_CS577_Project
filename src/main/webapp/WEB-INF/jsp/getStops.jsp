<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.css"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-social/5.1.1/bootstrap-social.css"/>
    <link rel="stylesheet" href="/css/style.css"/>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
  <link rel="stylesheet" href="Calendar.css">
  <script type="text/javascript" src="js/Calendar.js"></script>

<title>Get Stops</title>


  <script type="text/javascript">
 /*  $(document).ready(function() {
		$('#Source').autocomplete({
			
			source: function (request, response) {
                $.getJSON("${pageContext.request.contextPath }/getStopAutoComplete", {
                    term: request.term
                }, response);
			
			}
		});
	}); */
	

	  $(function() {
	    $("#datepickerDepart").datepicker();
	  });

	 $(function() {
		    $("#datepickerReturn").datepicker();
		  });

	function showDates(){
		
		var tripType=document.getElementById("tripType").value;
		if(tripType=="Round-Trip"){
		document.getElementById("ReturnLbl").style.visibility = "visible";
		 document.getElementById("datepickerReturn").style.visibility = "visible";
		}
		
		if(tripType=="One-Way"){
			document.getElementById("ReturnLbl").style.visibility = "hidden";
			 document.getElementById("datepickerReturn").style.visibility = "hidden";
			}
		/* $("#datepickerReturn").show(); */
		
	}
	
function showTrains(){
		
		var source=document.getElementById("Source").value;
		var destination=document.getElementById("Destination").value;
		var depart=document.getElementById("datepickerDepart").value;
		var returndate=document.getElementById("datepickerReturn").value;
		var Adult=document.getElementById("adults").value;
		var SeniorCitizen=document.getElementById("seniorcitizen").value;
		var Child=document.getElementById("child").value;
		var Infant=document.getElementById("infant").value;
		
		
		
	}
	
$("#findTrains").click(function(){
	
    $.ajax({
        url : '/searchResults?source='+$("#Source").val()+'&destination='+$("#Destination").val()+
        		'&DepartDate='+$("#datepickerDepart").val()+'&ReturnDate='+$("#datepickerReturn").val()+
        		'&Adult='+$("#adults").val()+'&SeniorCitizen='+$("#seniorcitizen").val()+
        		'&Child='+$("#child").val()+'&Infant='+$("#infant").val(),
        method : 'GET',
        async : false,
        complete : function(data) {
            console.log(data.responseText);
        }
    });

});
	
  $(document).ready(function() {
	    //attach autocomplete
	    $("#Source").autocomplete({
	    	max:10,
	        minLength: 1,
	        delay: 500,
	        
	        //define callback to format results
	        source: function (request, response) {
	            $.getJSON("/getStopAutoComplete", request, function(result) {
	                response($.map(result.slice(0,10), function(item) {
	                    return {
	                        // following property gets displayed in drop down
	                        label: item.name + "(" + item.id + ")",
	                        // following property gets entered in the textbox
	                        value: item.id,
	                        // following property is added for our own use
	                        //tag_url: "http://" + window.location.host + "/tags/" + item.tagId + "/" + item.name
	                    }
	                }));
	            });
	        },
	        messages: {
	            noResults: 'No results found',
	            results: function(amount) {
	                return ''
	            }
	        }

	       /*  //define select handler
	        select : function(event, ui) {
	            if (ui.item) {
	                event.preventDefault();
	                $("#selected_tags span").append('<a href=" + ui.item.tag_url + " target="_blank">'+ ui.item.label +'</a>');
	                //$("#tagQuery").value = $("#tagQuery").defaultValue
	                var defValue = $("#tagQuery").prop('defaultValue');
	                $("#tagQuery").val(defValue);
	                $("#tagQuery").blur();
	                return false;
	            }
	        } */
	    });
	    
  });
	
	 $(document).ready(function() {
		    //attach autocomplete
		    $("#Destination").autocomplete({
		    	max:10,
		        minLength: 1,
		        delay: 500,
		        
		        //define callback to format results
		        source: function (request, response) {
		            $.getJSON("/getStopAutoComplete", request, function(result) {
		                response($.map(result.slice(0,10), function(item) {
		                    return {
		                        // following property gets displayed in drop down
		                        label: item.name + "(" + item.id + ")",
		                        // following property gets entered in the textbox
		                        value: item.id,
		                        // following property is added for our own use
		                        //tag_url: "http://" + window.location.host + "/tags/" + item.tagId + "/" + item.name
		                    }
		                }));
		            });
		        },
		        messages: {
		            noResults: 'No results found',
		            results: function(amount) {
		                return ''
		            }
		        }

		    
		    });
		});
</script>

</head>
<body>

<div class="container">
        <div class="row">
            <div class="col-md-30">
                <h2>Find Trains</h2>
                
                <div><p>
                
                <table>
                <tr>
                 <th colspan="10"> <label id="tripTypeLbl" >Trip Type</label></th>
              
           <th colspan="10"> <label id="sourceLabel" >Enter Source</label></th>
              
                <th colspan="10"><label id="destinationLabel">Enter Destination</label></th>

 <th colspan="10"><label id="DepartLbl">Depart</label></th>
 <th colspan="10"><label id="ReturnLbl" style="visibility: hidden;">Return</label></th>
 <tr>
 <td> <select id="tripType" onchange="showDates()">
 <option value="One-Way">One-Way</option>
 <option value="Round-Trip">Round-Trip</option>
 </select></td> 
 <td></td>
                <td></td>
                 <td></td>
                  <td></td>
                  <td></td>
                <td></td>
                 <td></td>
                  <td></td>
                  <td></td>
                <td></td>
               <td> <input id="Source" type="text" /></td> 
               <td></td>
                <td></td>
                 <td></td>
                  <td></td>
                  <td></td>
                <td></td>
                 <td></td>
                  <td></td>
                  <td></td>
                <td></td>
               
                <td> <input id="Destination" type="text" /></td>
                 <td></td>
                 <td></td>
                  <td></td>
                  <td></td>
                <td></td>
                 <td></td>
                 <td></td>
                  <td></td>
                  <td></td>
                <td></td>
                <td>
                <input type="text" id="datepickerDepart">
                </td>
                <td></td>
                 <td></td>
                  <td></td>
                  <td></td>
                <td></td>
                 <td></td>
                 <td></td>
                  <td></td>
                  <td></td>
                <td></td>
                <td>
                 <input type="text" id="datepickerReturn"  style="visibility: hidden;">
                  <td></td>
                 <td></td>
                  <td></td>
                  <td></td>
                <td></td>
                 <td></td>
                 <td></td>
                  <td></td>
                  <td></td>
                <td></td>
                </tr> </table><br><table>
                 <tr>
                  <th rowspan="1">Select Travelers</th></tr>
               
                  <tr>
                  <td>
            <p> <label style="width: 160px"> Adult:(16-64)</label> <input type="number" id="adults" name="tentacles" min="1" max="5"></p>
            <p><label style="width: 160px"> Senior Citizen:(65+)</label> <input type="number" id="seniorcitizen" name="tentacles" min="0" max="5"></p>
            <p><label style="width: 160px"> Children:(2-15)</label> <input type="number" id="child" name="tentacles" min="0" max="5"></p>
              <p><label style="width: 160px"> Infant:(0-2)</label> <input type="number" id="infant" name="tentacles" min="0" max="5"></p></td>
             
              
            
                 </tr>
                 
                 
<%--  <c:forEach var="stop" items="${stops}">
  <option value="${stop.name}">${stop.name}</option>
</c:forEach> --%>
</table>
                </p>
               </div>
                <p><a  class="btn btn-secondary" id="findTrains" role="button" >Find Trains</a></p>
            
            
           
</p>
            </div>
        </div>
    </div>


 
<%--  <c:forTokens items = "${stops}" delims = "," var = "stop">
         <c:out value = "${stop}"/><p>
      </c:forTokens> --%>
</body>
</html>