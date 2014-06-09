var nbaApp = angular.module('nbaApp', []);

nbaApp.controller('nbaTeamCtrl', function($scope){
	$scope.teams = [
		{'name': 'Pacers', 'win': 56, 'lose': 26},
		{'name': 'Heat', 'win': 54, 'lose': 28},
		{'name': 'Raptors', 'win': 48, 'lose': 34},
		{'name': 'Bulls', 'win': 48, 'lose': 34},
		{'name': 'Wizzards', 'win': 44, 'lose': 38},
		{'name': 'Nets', 'win': 44, 'lose': 38},
		{'name': 'Bobcats', 'win': 43, 'lose': 39},
		{'name': 'Hawks', 'win': 38, 'lose': 44}
	];
	$scope.orderProp = 'win';
});