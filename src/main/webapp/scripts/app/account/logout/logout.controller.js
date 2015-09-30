'use strict';

angular.module('clusterApp')
    .controller('LogoutController', function (Auth) {
        Auth.logout();
    });
