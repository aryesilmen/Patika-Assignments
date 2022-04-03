# Structured Query Language Lessons by Patika.dev



## Homework 5



**Perform the scenarios given below on dvdrental database.**



1. Sort the longest 5 film of the film table that names end with 'n' character. 

   ```sql
   select * from film where title like '%n' order by length desc limit 5;
   ```

   

2.  Sort the shortest second 5 film of the film table that names end with 'n' character.

   ```sql
   select * from film where title like '%n'order by length offset 5 limit 5;
   ```

   

3. Sort the first four data that store_id equals to 1 in the descending  order according to the last_name column in the customer table .

   ```sql
   select * from customer where store_id = 1 order by last_name desc limit 4;
   ```

   

[**Download dvdrental Database** ](https://www.postgresqltutorial.com/wp-content/uploads/2019/05/dvdrental.zip)

