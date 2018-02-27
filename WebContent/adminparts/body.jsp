<body class="fixed-nav sticky-footer" id="page-top">
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<jsp:useBean id="user" class="org.os.login.User" scope="request">
				</jsp:useBean>
				<h4>
					Welcome
					<jsp:getProperty property="userName" name="user" /></h4>


				<table class="table">
					<thead>
						<tr>
							<th scope="col">#</th>
							<th scope="col">First</th>
							<th scope="col">Last</th>
							<th scope="col">Handle</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<th scope="row">1</th>
							<td>Mark</td>
							<td>Otto</td>
							<td>@mdo</td>
						</tr>
						<tr>
							<th scope="row">2</th>
							<td>Jacob</td>
							<td>Thornton</td>
							<td>@fat</td>
						</tr>
						<tr>
							<th scope="row">3</th>
							<td>Larry</td>
							<td>the Bird</td>
							<td>@twitter</td>
						</tr>
					</tbody>
				</table>

			</div>


		</div>
	</div>

</body>
</html>