# Structured Query Language Lessons by Patika.dev



## Homework 6



**Perform the scenarios given below on dvdrental database.**



1. What is the average of the values in the rental_rate column in the film table?

   ```sql
   select avg(rental_rate) from film;
   ```

   

2. How many of the film titles in the film table start with the character 'C' ?

   ```sql
   select count(*) from film where title like 'C%';
   ```

   

3. How many minutes the longest film in the film table that rental_rate value is equal to 0.99?

   ```sql
   select max(length) from film where rental_rate = 0.99;
   ```

   

5. How many different replacement_cost values are there for the films  greater than 150 minutes in the film table?

   ```sql
   select count(distinct replacement_cost) from film where length>150;
   ```

   

[**Download dvdrental Database** ](https://www.postgresqltutorial.com/wp-content/uploads/2019/05/dvdrental.zip)

