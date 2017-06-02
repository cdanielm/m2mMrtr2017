
AdminModule.controller('PostulaciónF', function($scope, $cordovaSQLite) {

  $scope.listPostulaciónF = function() {
    var query = "SELECT * FROM PostulaciónF";
    $cordovaSQLite.execute(db, query);
  }

  $scope.addPostulaciónF = function(){
    var query = "INSERT INTO PostulaciónF (FechaPostulacion,EstadoPostulacion,) VALUES (?, ?)";
    $cordovaSQLite.execute(db, query, [$scope.FechaPostulacion,$scope.EstadoPostulacion,]);
     $scope.FechaPostulacion='';
     $scope.EstadoPostulacion='';
  }

});