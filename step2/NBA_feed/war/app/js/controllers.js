var nbaApp = angular.module('nbaApp', []);

nbaApp.controller('nbaTeamCtrl', function($scope, $http){
	$http.get('/app/teams').success(function(data, status){
		$scope.teams = data;
	});
	$scope.orderProp = 'win';
});