##Step0
====
####Initial directory layout<br />

* app/   (app-specific codes)<br />
	* css/  (static css)
	* img/  (static img)
	* js/  (angular files)
	* partials/   (html segments)
	* teams/	(static team info in json)
	* index.html  (the main page)
* test/   (unit test files)
* bower.json
* package.json
* .bowerrc  (specifies the bower-components location)<br />

After creating files, run:
```shell
npm install
```
to install all dependent modules and bower components