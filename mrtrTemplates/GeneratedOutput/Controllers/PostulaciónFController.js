
AdminModule.controller('Postulaci�nF', function($scope, $cordovaSQLite) {

  $scope.listPostulaci�nF = function() {
    var query = "SELECT * FROM Postulaci�nF";
    $cordovaSQLite.execute(db, query);
  }

  $scope.addPostulaci�nF = function(){
    var query = "INSERT INTO Postulaci�nF (FechaPostulacion,EstadoPostulacion,) VALUES (?, ?)";
    $cordovaSQLite.execute(db, query, [$scope.FechaPostulacion,$scope.EstadoPostulacion,]);
     $scope.FechaPostulacion='';
     $scope.EstadoPostulacion='';
  }

});