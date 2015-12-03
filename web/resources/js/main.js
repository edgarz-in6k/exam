angular.module('myApp', [])
.controller('controller', function ($scope, $http) {

        $scope.showLogin = true;
        $scope.showList = false;

        $http.get('/angular').then(function (response) {
            $scope.arr = response.data;
        });

        $scope.check = function(userName, userPass) {
            $http.post("/log/" + userName + "/" + userPass).then(function (response) {
                    //updateUsers();
                var data = response.data;
                if (data == "Undefined" || data == "Incorrect password")
                    $scope.array = data;
                else {
                    $scope.array = "";
                    $scope.showLogin = false;
                    $scope.showList = true;
                }
            });
        };

});