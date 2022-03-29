# Structured Query Language Lessons by Patika.dev



## Homework 2



**Perform the scenarios given below on dvdrental database.**



1. Sort the data in the all columns with the replacement cost greater than 12.99 or equal and less than 16.99 in the film table. (Use BETWEEN - AND structure.)

   ```sql
   select * from film where replacement_cost between 12.99 and 16.99;
   ```

   

2. Sort the data in the first name and last name columns in the actor table with the first name is 'Penelope' or 'Nick' or 'Ed'. (Use IN operator)

   ```sql
   select first_name, last_name from actor where first_name in ('Penelope', 'Nick', 'Ed') ;
   ```

   

3. Sort the data in the all columns in the film table with rental_rate is 0.99, 2.99, 4.99 AND replacement_cost is 12.99, 15.99, 28.99.

   ```sql
   select * from film where rental_rate in (0.99, 2.99, 4.99) and replacement_cost in (12.99, 15.99, 28.99);
   ```

   


[**Download dvdrental Database** ](https://www.postgresqltutorial.com/wp-content/uploads/2019/05/dvdrental.zip)

