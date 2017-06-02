
AdminModule.controller('VehículoF', function($scope, $cordovaSQLite) {

  $scope.listVehículoF = function() {
    var query = "SELECT * FROM VehículoF";
    $cordovaSQLite.execute(db, query);
  }

  $scope.addVehículoF = function(){
    var query = "INSERT INTO VehículoF (Nombre,Placa,Color,TipoVehiculo,) VALUES (?, ?)";
    $cordovaSQLite.execute(db, query, [$scope.Nombre,$scope.Placa,$scope.Color,$scope.TipoVehiculo,]);
     $scope.Nombre='';
     $scope.Placa='';
     $scope.Color='';
     $scope.TipoVehiculo='';
  }

});