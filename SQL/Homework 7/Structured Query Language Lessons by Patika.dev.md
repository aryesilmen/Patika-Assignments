# Structured Query Language Lessons by Patika.dev



## Homework 7



**Perform the scenarios given below on dvdrental database.**



1. Group the films in the film table by rating column.

   ```sql
   select rating from film group by rating;
   ```

   

2. When the films in the film table are grouped by replacement_cost column, sort the replacement_cost value with more than 50 films and the corresponding number of films.

   ```sql
   select replacement_cost, count(*) from film group by replacement_cost having count(*)>50;
   ```

   

3. What are the customer numbers corresponding to the store_id values in the customer table?

   ```sql
   select store_id, count(*) from customer group by store_id;
   ```

   

5. After grouping the city data in the city table according to the country_id column , share the country_id information with the highest number of cities and the number of cities?  

   ```sql
   select country_id, count(*) from city group by country_id order by count(*) desc limit 1;
   ```




[**Download dvdrental Database** ](https://www.postgresqltutorial.com/wp-content/uploads/2019/05/dvdrental.zip)

