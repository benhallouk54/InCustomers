InCustomers is a simple CRM tool build on top of JAVA using MVC architecture that utilities Spring Boot to manage and analyse customer interactions and data throughout the customer life cycle, with the goal of improving business relationships with customers.

**DATABASE SCHEMA**

TABLE: CorporateGroup PRIMARY KEY  - id  : integer name   : String emailAddress : String  dateCreated : date 
TABLE : Role PRIMARY KEY  - id  : integer description : String  role : String  
TABLE : UserRole PRIMARY KEY  - userId  : integer PRIMARY KEY  - roleId  : integer 
TABLE : User PRIMARY KEY  - id  : integer ﬁrstName : String lastName : String  corporateGroupId : integer email : String password: String account_locked : boolean enabled : boolean createdDate : date expiryDate : date postCode : String

**TECH TO USE**

1. When a corporate group is deleted, all dependent users must also be deleted. 
2. When editing a user, you shouldn't be allowed to change corporateGroup - a user binds to one Group only. 
3. There needs to be a ﬂag on user enabled. Login would be allowed only when this is true. 
4. There is an expiry date on User entity. Login should be disallowed after this date. 
5. Use Hibernate as persistence API and use cascading where possible for relation mapping.  
6. Use spring security conﬁguration to demonstrate url restriction with roles.

**TECH AND TOOLS**

- Build the application using maven and STS and deployed on apache tomcat. 
- Use MySql to create database and Hibernate as persistence API using annotations and a Spring controller use annotation to deﬁne url binding and for wiring DAO objects.
- Create a view using JSP and JSTL tag library.
- Produce a use cases to capture the dynamic aspect of a the customers system.
- Use Hibernate Search to implement User Search. 

