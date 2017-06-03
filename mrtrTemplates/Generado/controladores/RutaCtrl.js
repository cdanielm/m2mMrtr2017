
angular.module('firstAngular')
        .controller('RutaCtrl', function ($scope) {
            $scope.objRuta = {};
            $scope.listRutas = [];            
            //$scope.listRutas.push({nombre:'luis miguel'});
            
            $scope.guardar = function (form1) {
                if (form1.$invalid)
                    return;
                $scope.listRutas.push($scope.objPersona);
                $scope.objRuta = {};
                alert("Se guardo Correctamente");
            };
            $scope.deleted = function (item) {
                var indice = $scope.listRutas.indexOf(item);
                $scope.listRutas.splice(indice, 1);
            }
            $scope.edit = function (item) {
                $scope.objRuta = item;
            }
        });