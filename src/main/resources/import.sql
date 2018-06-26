insert into user (id, first_Name, last_Name) values (1, 'henry', 'eze');
insert into user (id, first_Name, last_Name) values (2, 'Alex', 'Smith');
insert into user (id, first_Name, last_Name) values (3, 'Rebecca', 'Olana');
insert into user (id, first_Name, last_Name) values (4,  'Mack', 'Bryan');

insert into itenary (id, departure, arrival, departure_time, arrival_time, none_stop) values (1, 'London', 'China', '2008-11-11 13:23:44', '2008-11-11 13:23:44', 0);
insert into itenary (id, departure, arrival, departure_time, arrival_time, none_stop) values (2, 'Berlin', 'South Africa', '2008-08-11 13:23:44', '2008-11-11 13:23:44', 1);
insert into itenary (id, departure, arrival, departure_time, arrival_time, none_stop) values (3, 'Japan', 'Kenya', '2008-07-11 13:23:44', '2008-11-11 13:23:44', 0);


insert into booking (booking_num, creation_time, modified_time, itenary_id, user_id) values (1,'2008-11-11 13:23:44','2008-11-11 13:23:44', 1, 1);
insert into booking (booking_num, creation_time, modified_time, itenary_id, user_id) values (2,'2008-08-11 13:23:44','2008-08-11 13:23:44', 2, 1);
insert into booking (booking_num, creation_time, modified_time, itenary_id, user_id) values (3,'2008-07-11 13:23:44','2008-07-11 13:23:44', 3, 1);
