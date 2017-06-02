
.controller('UsuarioF', function($scope, $cordovaSQLite) {

  $scope.listUsuarioF = function() {
    var query = "SELECT * FROM UsuarioF";
    $cordovaSQLite.execute(db, query);
  }

  $scope.addUsuarioF = function(){
    var query = "INSERT INTO UsuarioF (Email,Nombre,contrasena,) VALUES (?, ?)";
    $cordovaSQLite.execute(db, query, [$scope.Email,$scope.Nombre,$scope.contrasena,]);
     $scope.Email='';
     $scope.Nombre='';
     $scope.contrasena='';
  }

});