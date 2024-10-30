# kafka-tutorial

Spring Boot JPA + H2 example: Build a CRUD Rest APIs </br>

We will build a Spring Boot Rest Apis using Spring Data JPA with H2 Database for a Tutorial application in that: </br>

Each Tutorial has id, title, description, published status.</br>
Apis help to create, retrieve, update, delete Tutorials.</br>
Apis also support custom finder methods such as find by published status or by title.</br>
</br>

These are APIs that we need to provide:

</br>
Methods	Urls	Actions </br>
POST	  &nbsp;&nbsp; /tutorials	  &nbsp;&nbsp; create new Tutorial </br>
GET	  &nbsp;&nbsp; /tutorials	 &nbsp;&nbsp;   retrieve all Tutorials</br>
GET	 &nbsp;&nbsp;  /tutorials/:id	 &nbsp;&nbsp;retrieve a Tutorial by :id</br>
PUT	&nbsp;&nbsp; /tutorials/:id	&nbsp;&nbsp;update a Tutorial by :id</br>
DELETE &nbsp;&nbsp;	/tutorials/:id	 &nbsp;&nbsp; delete a Tutorial by :id</br>
DELETE	&nbsp;&nbsp; /tutorials	&nbsp;&nbsp; delete all Tutorials</br>
GET	&nbsp;&nbsp; /tutorials/published	 &nbsp;&nbsp;find all published Tutorials</br>
GET	&nbsp;&nbsp; /tutorials?title=[keyword]	&nbsp;&nbsp;find all Tutorials which title contains keyword</br>
</br>
– We make CRUD operations & finder methods with Spring Data JPA’s JpaRepository.</br>
– The database will be H2 Database (in memory or on disk) by configuring project dependency & datasource.</br>

