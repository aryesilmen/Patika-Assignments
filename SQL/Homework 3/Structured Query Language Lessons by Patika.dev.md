# Structured Query Language Lessons by Patika.dev



## Homework 3



**Perform the scenarios given below on dvdrental database.**



1. Sort the country names in the country column of the country table, starting with the 'A' character and ending with the 'a' character.

   ```sql
   select * from country where country like 'A%a';
   ```

   

2. Sort the country names in the country column of the country table that consisting of at least 6 characters and ending with the 'n' character.

   ```sql
   select * from country where country like '%_____n';
   ```

   

3. Sort the film names in the title column of the film table that contain at least 4 'T' characters, regardless of upper or lower case letters.

   ```sql
   select title from film where title ilike '%t%t%t%t%';
   ```

   

3. Sort the film names in the all columns of the film table that title starting with the 'C' character and length greater than 90 and rental rate equal to 2.99.

   ```sql
   select * from film where title like 'C%' and length>90 and rental_rate = 2.99;
   ```



[**Download dvdrental Database** ](https://www.postgresqltutorial.com/wp-content/uploads/2019/05/dvdrental.zip)

