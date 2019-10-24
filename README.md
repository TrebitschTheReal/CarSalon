# CarSalon
This is a simple pet project about login, and manipulating database.

Installation: 

- git clone https://github.com/TrebitschTheReal/CarSalon.git
- create an artifact to your server
- mark directory as source -> /CarSalon/src
- add jstl:jstl:1.2 to modules - libraries
- run javaszombathazi.sql to your db server

Default db connector liens in my code:
(please modify it by your own data after cloning)

 Class.forName("com.mysql.cj.jdbc.Driver");
 con = DriverManager.getConnection("jdbc:mysql://localhost/javaszombathazi", "javaszombathazi", "12345");
