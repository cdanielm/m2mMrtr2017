
AdminModule.controller('Veh�culoF', function($scope, $cordovaSQLite) {

  $scope.listVeh�culoF = function() {
    var query = "SELECT * FROM Veh�culoF";
    $cordovaSQLite.execute(db, query);
  }

  $scope.addVeh�culoF = function(){
    var query = "INSERT INTO Veh�culoF (Nombre,Placa,Color,TipoVehiculo,) VALUES (?, ?)";
    $cordovaSQLite.execute(db, query, [$scope.Nombre,$scope.Placa,$scope.Color,$scope.TipoVehiculo,]);
     $scope.Nombre='';
     $scope.Placa='';
     $scope.Color='';
     $scope.TipoVehiculo='';
  }

});