# Structured Query Language Lessons by Patika.dev



## Homework 9



**Perform the scenarios given below on dvdrental database.**



1. Write the INNER JOIN query where we can see the city and country names in the city table and country table together.

   ```sql
   select city, country from city inner join country on city.country_id=country.country_id;
   ```

   

2. Write the INNER JOIN query where we can see the payment_id, first_name and last_name names in the customer table and payment table together.

   ```sql
   select payment_id, first_name, last_name from customer inner join payment on customer.customer_id=payment.customer_id;
   ```

   

3. Write the INNER JOIN query where we can see the rental_id, first_name and last_name names in the customer table and rental table together.

   ```sql
   select rental_id, first_name, last_name from customer inner join rental on customer.customer_id=rental.customer_id;
   ```

   

[**Download dvdrental Database** ](https://www.postgresqltutorial.com/wp-content/uploads/2019/05/dvdrental.zip)

