# Structured Query Language Lessons by Patika.dev



## Homework 12



**Perform the scenarios given below on dvdrental database.**



1. The film length is shown in the length column in the film table. How many films are longer than the average film length?

   ```sql
   select count(*) from film where length>(select avg(length) from film);
   ```

   

2. How many films have the highest rental_rate in the film table?

   ```sql
   select count(*) from film where rental_rate=(select max(rental_rate) from film);
   ```

   

3. List the films with the lowest rental_rate and the lowest replacement_cost values in the film table.

   ```sql
   select * from film where rental_rate=(select min(rental_rate) from film) and replacement_cost=(select min(replacement_cost) from film);
   ```


4. List the customers who make the most purchases in the payment table.

   ```sql
   SELECT payment.customer_id, first_name, last_name, COUNT(payment.customer_id) AS number_of_payment FROM payment
   LEFT JOIN customer ON payment.customer_id = customer.customer_id
   GROUP BY payment.customer_id, first_name, last_name
   ORDER BY number_of_payment DESC;
   ```
   
   

[**Download dvdrental Database** ](https://www.postgresqltutorial.com/wp-content/uploads/2019/05/dvdrental.zip)

