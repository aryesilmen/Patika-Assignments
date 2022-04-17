# Structured Query Language Lessons by Patika.dev



## Homework 11



**Perform the scenarios given below on dvdrental database.**



1. Let's sort all the data for the first_name columns in the actor and customer tables.

   ```sql
   (select first_name from actor) union (select first_name from customer);
   ```

   

2. Let's sort intersecting data for the first_name columns in the actor and customer tables.

   ```sql
   (select first_name from actor) intersect (select first_name from customer);
   ```

   

3. For the first_name columns in the actor and customer tables, let's sort the data that contain data from first table but doesn't contain data from second table.

   ```sql
   (select first_name from actor) except (select first_name from customer);
   ```


4. Let's do the first three queries for duplicate data as well.

   ```sql
   (select first_name from actor) union all (select first_name from customer);
   (select first_name from actor) intersect all (select first_name from customer);
   (select first_name from actor) except all (select first_name from customer);
   ```

   

[**Download dvdrental Database** ](https://www.postgresqltutorial.com/wp-content/uploads/2019/05/dvdrental.zip)

