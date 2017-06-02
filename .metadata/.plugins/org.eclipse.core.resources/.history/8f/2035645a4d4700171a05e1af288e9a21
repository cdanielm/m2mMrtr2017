
.controller('VehículoF', function($scope, $cordovaSQLite) {

  $scope.listVehículoF = function() {
    var query = "SELECT * FROM VehículoF";
    $cordovaSQLite.execute(db, query);
  }

  $scope.addVehículoF = function(){
    var query = "INSERT INTO VehículoF () VALUES (?, ?)";
    $cordovaSQLite.execute(db, query, []);
  }

});