angular.module('appEscola').controller('EscolaController', function($scope, $http) {
    const API = 'http://localhost:8080/api/escolas';

    $scope.carregarEscolas = function() {
        $http.get(API).then(res => $scope.escolas = res.data);
    };

    $scope.salvarEscola = function() {
        const metodo = $scope.novaEscola.id ? 'put' : 'post';
        const url = $scope.novaEscola.id ? `${API}/${$scope.novaEscola.id}` : API;
        $http[metodo](url, $scope.novaEscola).then(() => {
            $scope.novaEscola = {};
            $scope.carregarEscolas();
        });
    };

    $scope.editarEscola = function(escola) {
        $scope.novaEscola = angular.copy(escola);
    };

    $scope.deletarEscola = function(id) {
        $http.delete(`${API}/${id}`).then(() => $scope.carregarEscolas());
    };

    $scope.carregarEscolas();
});