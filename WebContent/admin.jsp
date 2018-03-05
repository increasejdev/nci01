<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- HEADER -->
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>I'm only human</title>
  <!-- Bootstrap core CSS-->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!-- Custom fonts for this template-->
  <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Page level plugin CSS-->
  <link href="vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">
  <!-- Custom styles for this template-->
  <link href="css/sb-admin.css" rel="stylesheet">
</head>

<body class="fixed-nav sticky-footer bg-dark" id="page-top">
  <!-- NAVIGATION-->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" id="mainNav">
    <a class="navbar-brand" href="index.html">Super Duper Control Panel 
    </a>
    <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarResponsive">
      <ul class="navbar-nav navbar-sidenav" id="exampleAccordion">		
       <c:forEach var="step" items="${sessionScope.table}">
        <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Dashboard">
        
          <a class="nav-link" href="${pageContext.request.contextPath}/TestParam?name=${step.key}">
            <i class="${step.value}"></i>
            <span class="nav-link-text">${step.key}</span>
          </a>
        </li>  
       </c:forEach>
      </ul>
        
      <ul class="navbar-nav ml-auto">
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle mr-lg-2" id="messagesDropdown" href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <i class="fa fa-fw fa-envelope"></i>
            <span class="d-lg-none">Messages
              <span class="badge badge-pill badge-primary">12 New</span>
            </span>
            <span class="indicator text-primary d-none d-lg-block">
              <i class="fa fa-fw fa-circle"></i>
            </span>
          </a>
          <div class="dropdown-menu" aria-labelledby="messagesDropdown">
            <h6 class="dropdown-header">New Messages:</h6>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" href="#">
              <strong>David Miller</strong>
              <span class="small float-right text-muted">11:21 AM</span>
              <div class="dropdown-message small">Hey there! This new version of SB Admin is pretty awesome! These messages clip off when they reach the end of the box so they don't overflow over to the sides!</div>
            </a>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" href="#">
              <strong>Jane Smith</strong>
              <span class="small float-right text-muted">11:21 AM</span>
              <div class="dropdown-message small">I was wondering if you could meet for an appointment at 3:00 instead of 4:00. Thanks!</div>
            </a>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" href="#">
              <strong>John Doe</strong>
              <span class="small float-right text-muted">11:21 AM</span>
              <div class="dropdown-message small">I've sent the final files over to you for review. When you're able to sign off of them let me know and we can discuss distribution.</div>
            </a>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item small" href="#">View all messages</a>
          </div>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle mr-lg-2" id="alertsDropdown" href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <i class="fa fa-fw fa-bell"></i>
            <span class="d-lg-none">Alerts
              <span class="badge badge-pill badge-warning">6 New</span>
            </span>
            <span class="indicator text-warning d-none d-lg-block">
              <i class="fa fa-fw fa-circle"></i>
            </span>
          </a>
          <div class="dropdown-menu" aria-labelledby="alertsDropdown">
            <h6 class="dropdown-header">New Alerts:</h6>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" href="#">
              <span class="text-success">
                <strong>
                  <i class="fa fa-long-arrow-up fa-fw"></i>Status Update</strong>
              </span>
              <span class="small float-right text-muted">11:21 AM</span>
              <div class="dropdown-message small">This is an automated server response message. All systems are online.</div>
            </a>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" href="#">
              <span class="text-danger">
                <strong>
                  <i class="fa fa-long-arrow-down fa-fw"></i>Status Update</strong>
              </span>
              <span class="small float-right text-muted">11:21 AM</span>
              <div class="dropdown-message small">This is an automated server response message. All systems are online.</div>
            </a>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" href="#">
              <span class="text-success">
                <strong>
                  <i class="fa fa-long-arrow-up fa-fw"></i>Status Update</strong>
              </span>
              <span class="small float-right text-muted">11:21 AM</span>
              <div class="dropdown-message small">This is an automated server response message. All systems are online.</div>
            </a>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item small" href="#">View all alerts</a>
          </div>
        </li>
        <li class="nav-item">
          <form class="form-inline my-2 my-lg-0 mr-lg-2">
            <div class="input-group">
              <input class="form-control" type="text" placeholder="Search for...">
              <span class="input-group-append">
                <button class="btn btn-primary" type="button">
                  <i class="fa fa-search"></i>
                </button>
              </span>
            </div>
          </form>
        </li>
        <li class="nav-item">
          <a class="nav-link" data-toggle="modal" data-target="#exampleModal">
            <i class="fa fa-fw fa-sign-out"></i>Logout</a>
        </li>
      </ul>
    </div>
  </nav>
  
  <!-- Tables -->
  <div class="content-wrapper"> 
    <div class="container-fluid">
      <!-- Example DataTables Card-->
      <div class="card mb-3">
        <div class="card-header">
          <i class="fa fa-table"></i> Data Table </div>
        <div class="card-body">
          <div class="table-responsive">
            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
            
            
            <c:choose>
            <c:when test = "${param.name == 'Issue'}">              	
              <thead>
                <tr>
                <c:forEach var="column" items="${tableParam}">
                  <c:if test='${column.key == "Issue"}'>
                	 <c:forEach var="title" items="${column.value}">
                        <th>${title.key}</th>
                     </c:forEach>
                  </c:if>  
                </c:forEach>                
                  <th>Actions</th>                
                </tr>
              </thead>
              <tfoot>
                <tr>
                  <c:forEach var="column" items="${tableParam}">
                  <c:if test='${column.key == "Issue"}'>
                	 <c:forEach var="title" items="${column.value}">
                        <th>${title.key}</th>
                     </c:forEach>
                  </c:if>  
                </c:forEach>
                <th>Actions</th>                   
                </tr>
              </tfoot>
              <tbody>
                <tr>
                <c:forEach var="column" items="${tableParam}">
                  <c:if test='${column.key == "Issue"}'>
                	 <c:forEach var="title" items="${column.value}">
                        <td>${title.value}</td>
                     </c:forEach> 
                      </c:if>  
                       </c:forEach>                  
					<td>
					<button type="button" class="btn btn-success">Add</button>
					<button type="button" class="btn btn-warning">Edit</button>
					<button type="button" class="btn btn-danger">Delete</button>
					</td>               
                </tr>
               </c:when>								 
               
               
               <c:when test = "${param.name == 'Codifier'}">              	
              <thead>
                <tr>
                <c:forEach var="column" items="${tableParam}">
                  <c:if test='${column.key == "Codifier"}'>
                	 <c:forEach var="title" items="${column.value}">
                        <th>${title.key}</th>
                     </c:forEach>
                  </c:if>  
                </c:forEach>                
                  <th>Actions</th>                
                </tr>
              </thead>
              <tfoot>
                <tr>
                  <c:forEach var="column" items="${tableParam}">
                  <c:if test='${column.key == "Codifier"}'>
                	 <c:forEach var="title" items="${column.value}">
                        <th>${title.key}</th>
                     </c:forEach>
                  </c:if>  
                </c:forEach>
                <th>Actions</th>                   
                </tr>
              </tfoot>
              <tbody>
                <tr>
                <c:forEach var="column" items="${tableParam}">
                  <c:if test='${column.key == "Codifier"}'>
                	 <c:forEach var="title" items="${column.value}">
                        <td>${title.value}</td>
                     </c:forEach> 
                      </c:if>  
                       </c:forEach>                  
					<td>
					<button type="button" class="btn btn-success">Add</button>
					<button type="button" class="btn btn-warning">Edit</button>
					<button type="button" class="btn btn-danger">Delete</button>
					</td>               
                </tr>
               </c:when>									
                
               
               <c:when test = "${param.name == 'Status'}">            	
              <thead>
                <tr>
                <c:forEach var="column" items="${tableParam}">
                  <c:if test='${column.key == "Status"}'>
                	 <c:forEach var="title" items="${column.value}">
                        <th>${title.key}</th>
                     </c:forEach>
                  </c:if>  
                </c:forEach>                
                  <th>Actions</th>                
                </tr>
              </thead>
              <tfoot>
                <tr>
                  <c:forEach var="column" items="${tableParam}">
                  <c:if test='${column.key == "Status"}'>
                	 <c:forEach var="title" items="${column.value}">
                        <th>${title.key}</th>
                     </c:forEach>
                  </c:if>  
                </c:forEach>
                <th>Actions</th>                   
                </tr>
              </tfoot>
              <tbody>
                <tr>
                <c:forEach var="column" items="${tableParam}">
                  <c:if test='${column.key == "Status"}'>
                	 <c:forEach var="title" items="${column.value}">
                        <td>${title.value}</td>
                     </c:forEach> 
                      </c:if>  
                       </c:forEach>                  
					<td>
					<button type="button" class="btn btn-success">Add</button>
					<button type="button" class="btn btn-warning">Edit</button>
					<button type="button" class="btn btn-danger">Delete</button>
					</td>               
                </tr>
               </c:when>						
               
               <c:when test = "${param.name == 'Priority'}">              	
              <thead>
                <tr>
                <c:forEach var="column" items="${tableParam}">
                  <c:if test='${column.key == "Priority"}'>
                	 <c:forEach var="title" items="${column.value}">
                        <th>${title.key}</th>
                     </c:forEach>
                  </c:if>  
                </c:forEach>                
                  <th>Actions</th>                
                </tr>
              </thead>
              <tfoot>
                <tr>
                  <c:forEach var="column" items="${tableParam}">
                  <c:if test='${column.key == "Priority"}'>
                	 <c:forEach var="title" items="${column.value}">
                        <th>${title.key}</th>
                     </c:forEach>
                  </c:if>  
                </c:forEach>
                <th>Actions</th>                   
                </tr>
              </tfoot>
              <tbody>
                <tr>
                <c:forEach var="column" items="${tableParam}">
                  <c:if test='${column.key == "Priority"}'>
                	 <c:forEach var="title" items="${column.value}">
                        <td>${title.value}</td>
                     </c:forEach> 
                      </c:if>  
                       </c:forEach>                  
					<td>
					<button type="button" class="btn btn-success">Add</button>
					<button type="button" class="btn btn-warning">Edit</button>
					<button type="button" class="btn btn-danger">Delete</button>
					</td>               
                </tr>
               </c:when>					
              
              
               <c:when test = "${param.name == 'Solution'}">              	
              <thead>
                <tr>
                <c:forEach var="column" items="${tableParam}">
                  <c:if test='${column.key == "Solution"}'>
                	 <c:forEach var="title" items="${column.value}">
                        <th>${title.key}</th>
                     </c:forEach>
                  </c:if>  
                </c:forEach>                
                  <th>Actions</th>                
                </tr>
              </thead>
              <tfoot>
                <tr>
                  <c:forEach var="column" items="${tableParam}">
                  <c:if test='${column.key == "Solution"}'>
                	 <c:forEach var="title" items="${column.value}">
                        <th>${title.key}</th>
                     </c:forEach>
                  </c:if>  
                </c:forEach>
                <th>Actions</th>                   
                </tr>
              </tfoot>
              <tbody>
                <tr>
                <c:forEach var="column" items="${tableParam}">
                  <c:if test='${column.key == "Solution"}'>
                	 <c:forEach var="title" items="${column.value}">
                        <td>${title.value}</td>
                     </c:forEach> 
                      </c:if>  
                       </c:forEach>                  
					<td>
					<button type="button" class="btn btn-success">Add</button>
					<button type="button" class="btn btn-warning">Edit</button>
					<button type="button" class="btn btn-danger">Delete</button>
					</td>               
                </tr>
               </c:when>
              
               
               <c:when test = "${param.name == 'Rfc'}">              	
              <thead>
                <tr>
                <c:forEach var="column" items="${tableParam}">
                  <c:if test='${column.key == "Rfc"}'>
                	 <c:forEach var="title" items="${column.value}">
                        <th>${title.key}</th>
                     </c:forEach>
                  </c:if>  
                </c:forEach>                
                  <th>Actions</th>                
                </tr>
              </thead>
              <tfoot>
                <tr>
                  <c:forEach var="column" items="${tableParam}">
                  <c:if test='${column.key == "Rfc"}'>
                	 <c:forEach var="title" items="${column.value}">
                        <th>${title.key}</th>
                     </c:forEach>
                  </c:if>  
                </c:forEach>
                <th>Actions</th>                   
                </tr>
              </tfoot>
              <tbody>
                <tr>
                <c:forEach var="column" items="${tableParam}">
                  <c:if test='${column.key == "Rfc"}'>
                	 <c:forEach var="title" items="${column.value}">
                        <td>${title.value}</td>
                     </c:forEach> 
                      </c:if>  
                       </c:forEach>                  
					<td>
					<button type="button" class="btn btn-success">Add</button>
					<button type="button" class="btn btn-warning">Edit</button>
					<button type="button" class="btn btn-danger">Delete</button>
					</td>               
                </tr>
               </c:when>
               							
                              
               <c:when test = "${param.name == 'Users'}">             	
              <thead>
                <tr>
                <c:forEach var="column" items="${tableParam}">
                  <c:if test='${column.key == "Users"}'>
                	 <c:forEach var="title" items="${column.value}">
                        <th>${title.key}</th>
                     </c:forEach>
                  </c:if>  
                </c:forEach>                
                  <th>Actions</th>                
                </tr>
              </thead>
              <tfoot>
                <tr>
                  <c:forEach var="column" items="${tableParam}">
                  <c:if test='${column.key == "Users"}'>
                	 <c:forEach var="title" items="${column.value}">
                        <th>${title.key}</th>
                     </c:forEach>
                  </c:if>  
                </c:forEach>
                <th>Actions</th>                   
                </tr>
              </tfoot>
              <tbody>
                <tr>
                <c:forEach var="column" items="${tableParam}">
                  <c:if test='${column.key == "Users"}'>
                	 <c:forEach var="title" items="${column.value}">
                        <td>${title.value}</td>
                     </c:forEach> 
                      </c:if>  
                       </c:forEach>                  
					<td>
					<button type="button" class="btn btn-success">Add</button>
					<button type="button" class="btn btn-warning">Edit</button>
					<button type="button" class="btn btn-danger">Delete</button>
					</td>               
                </tr>
               </c:when>	               
               
               	<c:otherwise>
               		<b>ID is equals to 2</b>
               	</c:otherwise>
               
               
              </c:choose>
                
                
              </tbody>
            </table>
          </div>
        </div>
        <div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div>
      </div>
    </div>
    <!-- /.container-fluid-->
    <!-- /.content-wrapper-->
  </div>  
  
    <!-- FOOTER -->
    <c:import url="adminparts/footer.jsp"></c:import>
    
    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
      <i class="fa fa-angle-up"></i>
    </a>
    <!-- Logout Modal-->
    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
            <button class="close" type="button" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">×</span>
            </button>
          </div>
          <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
          <div class="modal-footer">
            <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
            <a class="btn btn-primary" href="login.html">Logout</a>
          </div>
        </div>
      </div>
    </div>
    <!-- SCRIPTS-->
    <c:import url="adminparts/scripts.jsp"></c:import>
  </div>
</body>

</html>
