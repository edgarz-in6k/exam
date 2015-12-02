<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
    <link rel='stylesheet' href='resources/bootstrap-3.3.5-dist/css/bootstrap.css' type='text/css' media='all'>
    <link rel='stylesheet' href='resources/bootstrap-3.3.5-dist/css/bootstrap.css.map' type='text/css' media='all'>
    <link rel='stylesheet' href='resources/bootstrap-3.3.5-dist/css/bootstrap.min.css' type='text/css' media='all'>
    <link rel='stylesheet' href='resources/bootstrap-3.3.5-dist/css/bootstrap-theme.css' type='text/css' media='all'>
    <link rel='stylesheet' href='resources/bootstrap-3.3.5-dist/css/bootstrap-theme.css.map' type='text/css' media='all'>
    <link rel='stylesheet' href='resources/bootstrap-3.3.5-dist/css/bootstrap-theme.min.css' type='text/css' media='all'>

    <meta name="viewport" content="width=device-width, initial-scale=1">

    <script src="resources/js/angular.min.js"></script>
    <script src="resources/js/main.js"></script>
  </head>
  <body ng-app="myApp">

  <div ng-controller="controller">
    <p>{{1+1}}</p>
    <p ng-repeat="i in arr track by $index">{{i}}</p>
  </div>



  <div class="col-md-6 col-md-offset-3">
    <h2>Login</h2>
    <form name="form" ng-submit="logging()" ng-controller="controller">
      <div class="form-group">
        <label for="username">Username</label>
        <input type="text" name="username" id="username" class="form-control" ng-model="username" placeholder="Input name please" required/>
      </div>
      <div class="form-group">
        <label for="password">Password</label>
        <input type="password" name="password" id="password" class="form-control" ng-model="password" placeholder="Input password please" required />
      </div>
      <div class="form-actions">
        <button type="submit" class="btn btn-primary">Login</button>
        <%--<a href="reg" class="btn btn-link">Register</a>--%>
      </div>
      <p ng-repeat="i in arr track by $index">{{i}}</p>
    </form>
  </div>

  </body>
</html>
