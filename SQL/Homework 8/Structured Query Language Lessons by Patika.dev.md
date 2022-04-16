# Structured Query Language Lessons by Patika.dev



## Homework 8



**Perform the scenarios given below on your test database.**



1.  Create a table on your test database that name employee with column information that id (INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100).

   ```sql
   create table employee (
   	id integer,
   	name varchar(50),
   	birthday date,
   	email varchar(100)
   );
   ```

   

2. Insert 50 data to the employee table with using 'Mockaroo' service.

   ```sql
   insert into employee (id, name, birthday, email) values (1, 'Mycah', '1914/01/24', 'mextance0@addtoany.com');
   insert into employee (id, name, birthday, email) values (2, 'Evin', '1994/11/04', 'egoodrum1@scribd.com');
   insert into employee (id, name, birthday, email) values (3, 'Shanna', '1957/12/02', 'smindenhall2@dmoz.org');
   insert into employee (id, name, birthday, email) values (4, 'Roda', '1938/08/28', 'rdissman3@google.co.jp');
   insert into employee (id, name, birthday, email) values (5, 'Hobie', '1991/09/23', 'hlourenco4@geocities.com');
   insert into employee (id, name, birthday, email) values (6, 'Leesa', '1958/03/20', 'lcrisall5@smh.com.au');
   insert into employee (id, name, birthday, email) values (7, 'Gabie', '1975/06/17', 'gtrenear6@wikipedia.org');
   insert into employee (id, name, birthday, email) values (8, 'Vere', '1908/04/17', 'vcretney7@scribd.com');
   insert into employee (id, name, birthday, email) values (9, 'Charmine', '1958/02/15', 'ccallen8@linkedin.com');
   insert into employee (id, name, birthday, email) values (10, 'Cristi', '1904/12/05', 'cdorre9@spiegel.de');
   insert into employee (id, name, birthday, email) values (11, 'Katharina', '1961/12/18', 'kollcotta@paypal.com');
   insert into employee (id, name, birthday, email) values (12, 'Pauly', '1946/03/22', 'pgerardotb@berkeley.edu');
   insert into employee (id, name, birthday, email) values (13, 'Steffane', '1958/04/06', 'slaperec@springer.com');
   insert into employee (id, name, birthday, email) values (14, 'Consuelo', '1922/11/18', 'crapportd@yelp.com');
   insert into employee (id, name, birthday, email) values (15, 'Bentlee', '1953/05/23', 'bpritchette@ibm.com');
   insert into employee (id, name, birthday, email) values (16, 'Elene', '1900/06/02', 'escourfieldf@earthlink.net');
   insert into employee (id, name, birthday, email) values (17, 'Adrienne', '1994/05/03', 'ameddg@trellian.com');
   insert into employee (id, name, birthday, email) values (18, 'Merv', '1969/01/07', 'mhickissonh@a8.net');
   insert into employee (id, name, birthday, email) values (19, 'Carlota', '1936/05/19', 'cdeackesi@howstuffworks.com');
   insert into employee (id, name, birthday, email) values (20, 'Chere', '1968/05/13', 'cbrusselsj@whitehouse.gov');
   insert into employee (id, name, birthday, email) values (21, 'Rodie', '1930/04/06', 'rcoolbeark@discuz.net');
   insert into employee (id, name, birthday, email) values (22, 'Margarete', '1900/04/30', 'mmissonl@amazon.co.jp');
   insert into employee (id, name, birthday, email) values (23, 'Britta', '1990/04/26', 'bcuredalem@yellowbook.com');
   insert into employee (id, name, birthday, email) values (24, 'Nomi', '1941/10/02', 'nhaggithn@admin.ch');
   insert into employee (id, name, birthday, email) values (25, 'Jewelle', '1934/11/09', 'jthurstano@shinystat.com');
   insert into employee (id, name, birthday, email) values (26, 'Portie', '1901/06/06', 'pemelinep@amazon.co.uk');
   insert into employee (id, name, birthday, email) values (27, 'Toddie', '1954/08/10', 'tdunkerlyq@quantcast.com');
   insert into employee (id, name, birthday, email) values (28, 'Chucho', '1946/03/08', 'croosonr@stumbleupon.com');
   insert into employee (id, name, birthday, email) values (29, 'Tuesday', '1981/01/05', 'tledrams@multiply.com');
   insert into employee (id, name, birthday, email) values (30, 'Ernesto', '1916/03/31', 'eguitelt@state.tx.us');
   insert into employee (id, name, birthday, email) values (31, 'Haley', '1967/09/15', 'hvarrenu@springer.com');
   insert into employee (id, name, birthday, email) values (32, 'Pauletta', '1988/02/05', 'ptaplowv@census.gov');
   insert into employee (id, name, birthday, email) values (33, 'Jerry', '1978/09/01', 'jgazzardw@google.ca');
   insert into employee (id, name, birthday, email) values (34, 'Hewitt', '1937/01/27', 'hjovicx@tripadvisor.com');
   insert into employee (id, name, birthday, email) values (35, 'Mirabella', '1963/06/06', 'mtumay@archive.org');
   insert into employee (id, name, birthday, email) values (36, 'Jessee', '1978/05/03', 'jdedhamz@zdnet.com');
   insert into employee (id, name, birthday, email) values (37, 'Jessy', '1930/02/20', 'jrosita10@nyu.edu');
   insert into employee (id, name, birthday, email) values (38, 'Carmen', '1927/01/04', 'chyams11@harvard.edu');
   insert into employee (id, name, birthday, email) values (39, 'Ailis', '1929/11/02', 'acubitt12@bloglovin.com');
   insert into employee (id, name, birthday, email) values (40, 'Florina', '1913/08/15', 'fhuntingford13@chronoengine.com');
   insert into employee (id, name, birthday, email) values (41, 'Olivero', '1947/12/28', 'overny14@guardian.co.uk');
   insert into employee (id, name, birthday, email) values (42, 'Vitia', '1913/01/20', 'vlavery15@booking.com');
   insert into employee (id, name, birthday, email) values (43, 'Kakalina', '1903/12/13', 'kpitman16@unesco.org');
   insert into employee (id, name, birthday, email) values (44, 'Amby', '1928/11/09', 'aleebetter17@yandex.ru');
   insert into employee (id, name, birthday, email) values (45, 'Dieter', '1961/03/20', 'dfance18@loc.gov');
   insert into employee (id, name, birthday, email) values (46, 'Brander', '1979/07/31', 'bungaretti19@nationalgeographic.com');
   insert into employee (id, name, birthday, email) values (47, 'Darrell', '1950/01/25', 'dcarrick1a@java.com');
   insert into employee (id, name, birthday, email) values (48, 'Nicol', '1931/07/12', 'npettecrew1b@nyu.edu');
   insert into employee (id, name, birthday, email) values (49, 'Sammy', '1974/05/19', 'ssimms1c@icq.com');
   insert into employee (id, name, birthday, email) values (50, 'Juliane', '1948/11/21', 'jcorfield1d@hc360.com');
   ```

   

3. Do 5 UPDATE transaction that will update other columns according to each columns.

   ```sql
   update employee set email='mycah@mycah.com' where name='Mycah';
   update employee set name='Stefan', birthday='1988-05-03',email='stefann@stef.com' where id=13;
   update employee set name='Ali' where name like 'N%';
   update employee set name='Cedric' where id=10 returning *;
   update employee set name='Sinan',birthday='1990-03-11', email='sinan@sinan.com' where id>45; 
   ```

   

5. Do 5 DELETE transaction that will delete related rows for each columns.

   ```sql
   delete from employee where name='Jerry';
   delete from employee where email like '%.org';
   delete from employee where name like 'E%' and email not like '%.net';
   delete from employee where id>40;
   delete from employee where name like '%a';
   ```



[**Go to Mockaroo** ](https://www.mockaroo.com)



