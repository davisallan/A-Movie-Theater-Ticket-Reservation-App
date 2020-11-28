INSERT INTO TicketReservationApp.MOVIE(MovieID, Mov_name)
VALUES  (2000, 'Bad Boys for Life'),
		(2001, 'Birds of Prey'),
		(2002, 'Tenet'),
		(2003, 'The Invisible Man'),
		(2004, 'Fantasy Island'),
		(2005, 'Gretel & Hansel'),
		(2006, 'All I Can Say'),
		(2007, 'Lost Girls'),
		(2008, 'Color Out of Space'),
		(2009, 'The Beach House'),
		(2010, 'The Whistlers');
 
 INSERT INTO TicketReservationApp.THEATRE(TheatreID, Theatre_name, Address)
VALUES	(100, 'Cineplex Odeon', '205 E Hills Blvd SE'),
		(101, 'Landmark Cinemas', '3412 49 St NW'),
		(102, 'Globe Cinema', '617 8 Ave SW'),
		(103, 'Scotiabank Theatre Chinook', '6455 Macleod Trail SW'),
		(104, 'Landmark Cinemas 10 Shawnessy', '16061 Macleod Trail SE');


 INSERT INTO TicketReservationApp.AUDITORIUM(AuditoriumID, Auditorium_name)
VALUES  (001, 1),
		(002, 2),
		(003, 3);
        
 INSERT INTO TicketReservationApp.SHOW_TIME(ShowTimeID, MovieID, ShowDate, ShowTime)
VALUES  
		(1, 2000, '2020-11-11', '21:00:00'),
		(2, 2000, '2020-11-11', '00:00:00'),
		(3, 2001, '2020-11-12', '15:00:00'),
		(4, 2001, '2020-11-12', '18:00:00'),
		(5, 2001, '2020-11-12', '21:00:00'),
		(6, 2002, '2020-11-12', '23:00:00'),
		(7, 2002, '2020-11-12', '15:00:00'),
		(8, 2002, '2020-11-12', '15:00:00'),
		(9, 2002, '2020-11-12', '18:00:00'),
		(10, 2003, '2020-11-12', '15:00:00'),
		(11, 2003, '2020-11-12', '18:00:00'),
		(12, 2003, '2020-11-12', '22:00:00');

        
INSERT INTO TicketReservationApp.REGISTERED_USER(UserID, FName, LName, Email, UserPassword, Card_Name, Credit_card, CVC, Expiry)
VALUES  (001, 'Davis', 'Allan', 'davis.allan@ucalgary.ca', 'davis11', 'Davis Allan', 734694398475946, 123, 2220),
		(002, 'Bright', 'Anorchie', 'bright.anorchie@ucalgary.ca', 'bright11', 'Bright Anorchie', 893749304504546, 234, 1521),
        (003, 'Khaled', 'Behairy', 'khaled.behairy@ucalgary.ca', 'behairy1',  'Khaled Behairy', 399238340644334, 153, 3622),
        (004, 'Michael', 'Adelure', 'micheal.adelure@ucalgary.ca', 'micheal1', 'Micheal Adelure', 128994830843044, 182, 4823);
        
INSERT INTO TicketReservationApp.TICKET(TicketID, MovieID, TheatreID)
VALUES  (1, 2001, 100),
		(2, 2002, 100),
        (3, 2002, 100),
        (4, 2006, 100);

INSERT INTO TicketReservationApp.RESERVATION(ReservationID, TicketID)
VALUES  (1, 003),
		(2, 001),
        (3, 004);
        
INSERT INTO TicketReservationApp.PAYMENT(PaymentID, UserID, TicketID, Price)
VALUES  (001, 1, 2, 49.00),
		(002, 2, 2, 22.00),
        (003, 3, 3, 10.00);






		