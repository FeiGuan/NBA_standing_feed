##Step1: Static templates
====
###Angular Templates<br />
---
<h4>View and template</h4>
In <b>app/index.html</b><br />
-1. add <code>ng-app</code> in a tag
```html
<html ng-app="nbaApp">
```
-2. add <code>ng-controller</code>
```html
<body ng-controller="nbaTeamCtrl">
```
-3. add <code>ng-repeat</code>
```html
<li ng-repeat="team in teams">
	{{team.name}}
</li>
```
<h4>Model and Controller</h4>
In <b>app/js/controller.js</b><br />
-1. register angular module
```javascript
var nbaApp = angular.module('nbaApp', []);
```
-2. define controller
```javascript
nbaApp.controller('nbaTeamCtrl', function($scope){
	$scope.teams = [];
});
```

###Filter<br />
---
<h4>Filter</h4>
In <b>app/index.html</b><br />
-1. add search field with <code>ng-model</code>
```html
Search: <input ng-model="query">
```
-2. add <code>filter: query</code>
```html
<li ng-repeat="team in teams | filter: query">
	
</li>
```
<h4>Order</h4>
In <b>app/index.html</b><br />
-1. add select with <code>ng-model</code>
```html
<seclect ng-model="orderProp">
  <option value="name">Alphabetical</option>
  <option value="win">Wins</option>
</seclect>
```

-2. add <code>orderBy: orderProp</code>
```html
<li ng-repeat="team in teams | orderBy: orderProp">
</li>
```

In <b>app/js/controller.js</b><br />
-1. add default value
```javascript
$scope.orderProp = 'win';
```
