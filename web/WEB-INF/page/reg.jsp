<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

  <div class="col-md-3 col-md-offset-3">
    <h2>Welcome!</h2>
    <form name="form" ng-submit="reg()" ng-controller="controller" role="form">
      <div class="form-group">
        <label for="username">Login</label>
        <input type="text" name="username" id="username" class="form-control" ng-model="username" placeholder="Input name please" required/>
      </div>
      <div class="form-group">
        <label for="password">Password</label>
        <input type="password" name="password" id="password" class="form-control" ng-model="password" placeholder="Input password please" required />
      </div>
      <div class="form-actions">
        <button type="submit" class="btn btn-primary">Register</button>
      </div>
    </form>
  </div>

</body>
</html>
