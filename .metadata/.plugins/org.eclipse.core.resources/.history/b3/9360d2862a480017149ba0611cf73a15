
angular.module('firstAngular')
        .controller('VehiculoFCtrl', function ($scope) {
            $scope.objVehiculoF = {};
            $scope.listVehiculoFs = [];            
            //$scope.listVehiculoFs.push({nombre:'luis miguel'});
            
            $scope.guardar = function (form1) {
                if (form1.$invalid)
                    return;
                $scope.listVehiculoFs.push($scope.objPersona);
                $scope.objVehiculoF = {};
                alert("Se guardo Correctamente");
            };
            $scope.deleted = function (item) {
                var indice = $scope.listVehiculoFs.indexOf(item);
                $scope.listVehiculoFs.splice(indice, 1);
            }
            $scope.edit = function (item) {
                $scope.objVehiculoF = item;
            }
        });