angular.module('myApp', [])
.controller('controller', function ($scope, $http) {

    $http.get('/angular').then(function (response) {
        $scope.arr = response.data;
    });

    $http.post('/log').then(function (response) {
        $scope.logging = function(){
            alert($scope.username);
            //$scope.arr = response.data;
        }
    });

});