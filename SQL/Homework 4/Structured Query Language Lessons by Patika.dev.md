# Structured Query Language Lessons by Patika.dev



## Homework 4



**Perform the scenarios given below on dvdrental database.**



1. Sort the distinct values in the replacement_cost column of the film table. 

   ```sql
   select distinct replacement_cost from film;
   ```

   

2.  How many distinct values are there in the replacement_cost column of the film table?

   ```sql
   select count(distinct replacement_cost) from film;
   ```

   

3. How many film names in the title column of the film table start with the 'T' character and at the same time the rating is equal to 'G'?

   ```sql
   select count(*) from film where title like 'T%' and rating='G';
   ```

   

3. How many of the country names in the country table consist of 5 characters?

   ```sql
   select count(*) from country where country like '_____';
   ```
   
   
   
5. How many of the city names in the city table end with 'R' or 'r' characters?

   ```sql
   select count(*) from city where city ilike '%r';
   ```

   

[**Download dvdrental Database** ](https://www.postgresqltutorial.com/wp-content/uploads/2019/05/dvdrental.zip)

