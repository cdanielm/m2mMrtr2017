
angular.module('firstAngular')
        .controller('UsuarioFCtrl', function ($scope) {
            $scope.objUsuarioF = {};
            $scope.listUsuarioFs = [];            
            //$scope.listUsuarioFs.push({nombre:'luis miguel'});
            
            $scope.guardar = function (form1) {
                if (form1.$invalid)
                    return;
                $scope.listUsuarioFs.push($scope.objPersona);
                $scope.objUsuarioF = {};
                alert("Se guardo Correctamente");
            };
            $scope.deleted = function (item) {
                var indice = $scope.listUsuarioFs.indexOf(item);
                $scope.listUsuarioFs.splice(indice, 1);
            }
            $scope.edit = function (item) {
                $scope.objUsuarioF = item;
            }
        });