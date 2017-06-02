var db = null;

var AdminModule = angular.module('starter', ['ionic', 'ngCordova'])

.run(function($ionicPlatform, $cordovaSQLite) {
  $ionicPlatform.ready(function() {

    if(window.cordova && window.cordova.plugins.Keyboard) {
      cordova.plugins.Keyboard.hideKeyboardAccessoryBar(true);
    }
    if(window.StatusBar) {
      StatusBar.styleDefault();
    }

    db = $cordovaSQLite.openDB({ name: "my.db" });
     $cordovaSQLite.execute(db, 'CREATE TABLE IF NOT EXIST VehículoF (Nombre,Placa,Color,TipoVehiculo,)');
     $cordovaSQLite.execute(db, 'CREATE TABLE IF NOT EXIST PostulaciónF (FechaPostulacion,EstadoPostulacion,)');
     $cordovaSQLite.execute(db, 'CREATE TABLE IF NOT EXIST Ruta (Nombre,LongitudInicio,LatitudInicio,LongitudFin,LatitudFin,CupoTotal,FechaEjecucion,Descripcion,Condiciones,)');
     $cordovaSQLite.execute(db, 'CREATE TABLE IF NOT EXIST UsuarioF (Email,Nombre,contrasena,)');
     $cordovaSQLite.execute(db, 'CREATE TABLE IF NOT EXIST VehículoF ()');
    
  });
})