
angular.module("firstAngular", ['ngMessages', 'ui.router'])
       .config(function ($stateProvider, $urlRouterProvider, $httpProvider) {

           $stateProvider           
           .state('masterPage',
            {
                templateUrl: 'scripts/vistas/masterView.html'
            })
         
               .state('masterPage.VehiculoFs',
            {
                templateUrl: 'scripts/vistas/VehiculoFView.html',
                controller: 'VehiculoFCtrl',
                url: '/VehiculoFs'
            })
               .state('masterPage.PostulacionFs',
            {
                templateUrl: 'scripts/vistas/PostulacionFView.html',
                controller: 'PostulacionFCtrl',
                url: '/PostulacionFs'
            })
               .state('masterPage.Rutas',
            {
                templateUrl: 'scripts/vistas/RutaView.html',
                controller: 'RutaCtrl',
                url: '/Rutas'
            })
               .state('masterPage.UsuarioFs',
            {
                templateUrl: 'scripts/vistas/UsuarioFView.html',
                controller: 'UsuarioFCtrl',
                url: '/UsuarioFs'
            })
               .state('masterPage.VehiculoFs',
            {
                templateUrl: 'scripts/vistas/VehiculoFView.html',
                controller: 'VehiculoFCtrl',
                url: '/VehiculoFs'
            })
         
           $urlRouterProvider.otherwise('/UsuarioFs');
          // $httpProvider.interceptors.push('interceptorApp');

       });

angular.module("firstAngular").constant('ngConstantes', {
    apiUrl: 'http://localhost:1114/'
});