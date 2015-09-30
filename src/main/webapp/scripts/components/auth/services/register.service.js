'use strict';

angular.module('clusterApp')
    .factory('Register', function ($resource) {
        return $resource('api/register', {}, {
        });
    });


