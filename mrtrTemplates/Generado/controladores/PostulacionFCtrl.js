
angular.module('firstAngular')
        .controller('PostulacionFCtrl', function ($scope) {
            $scope.objPostulacionF = {};
            $scope.listPostulacionFs = [];            
            //$scope.listPostulacionFs.push({nombre:'luis miguel'});
            
            $scope.guardar = function (form1) {
                if (form1.$invalid)
                    return;
                $scope.listPostulacionFs.push($scope.objPersona);
                $scope.objPostulacionF = {};
                alert("Se guardo Correctamente");
            };
            $scope.deleted = function (item) {
                var indice = $scope.listPostulacionFs.indexOf(item);
                $scope.listPostulacionFs.splice(indice, 1);
            }
            $scope.edit = function (item) {
                $scope.objPostulacionF = item;
            }
        });