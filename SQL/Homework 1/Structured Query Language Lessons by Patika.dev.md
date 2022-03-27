# Structured Query Language Lessons by Patika.dev



## Homework 1



**Perform the scenarios given below on dvdrental database.**



1. Sort the data in the title and description columns in the film table.

   ```sql
   SELECT title, description FROM film;
   ```

   

2. Sort the data in the all columns in the film table with the film length greater than 60 AND less than 75.

   ```sql
   SELECT * FROM film WHERE length>60 AND length<75;
   ```

   

3. Sort the data in the all columns in the film table with rental_rate 0.99 AND replacement_cost 12.99 OR 28.99.

   ```sql
   SELECT * FROM film WHERE rental_rate = 0.99 AND (replacement_cost = 12.99 OR replacement_cost = 28.99);
   ```

   

4. What is the value in the last_name column of the customer whose value is 'Mary' in the first_name column in the customer table?

   ```sql
   SELECT last_name FROM customer WHERE first_name = 'Mary';
   ```

   

5. Sort the data in the film table whose length is not greater than 50 also whose rental_rate is NOT 2.99 or 4.99.

   ```sql
   SELECT * FROM film WHERE NOT(length>50 AND(rental_rate=2.99 OR rental_rate=4.99));
   ```

   

[**Download dvdrental Database** ](https://www.postgresqltutorial.com/wp-content/uploads/2019/05/dvdrental.zip)

