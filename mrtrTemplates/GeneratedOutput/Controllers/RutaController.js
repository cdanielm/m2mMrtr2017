
AdminModule.controller('Ruta', function($scope, $cordovaSQLite) {

  $scope.listRuta = function() {
    var query = "SELECT * FROM Ruta";
    $cordovaSQLite.execute(db, query);
  }

  $scope.addRuta = function(){
    var query = "INSERT INTO Ruta (Nombre,LongitudInicio,LatitudInicio,LongitudFin,LatitudFin,CupoTotal,FechaEjecucion,Descripcion,Condiciones,) VALUES (?, ?)";
    $cordovaSQLite.execute(db, query, [$scope.Nombre,$scope.LongitudInicio,$scope.LatitudInicio,$scope.LongitudFin,$scope.LatitudFin,$scope.CupoTotal,$scope.FechaEjecucion,$scope.Descripcion,$scope.Condiciones,]);
     $scope.Nombre='';
     $scope.LongitudInicio='';
     $scope.LatitudInicio='';
     $scope.LongitudFin='';
     $scope.LatitudFin='';
     $scope.CupoTotal='';
     $scope.FechaEjecucion='';
     $scope.Descripcion='';
     $scope.Condiciones='';
  }

});