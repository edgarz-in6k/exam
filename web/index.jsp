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
  <body>

    <div ng-app="myApp">
      <div ng-controller="controller">
        <p>{{1+1}}</p>
        <p ng-repeat="i in arr track by $index">{{i}}</p>
      </div>
    </div>



  </body>
</html>
