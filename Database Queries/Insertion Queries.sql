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
 
 INSERT INTO TicketReservationApp.THEATER(TheaterID, Theater_name, Address)
VALUES  (111, 'Landmark Cinemas', '3412 49 St NW'),
		(112, 'Globe Cinema', '617 8 Ave SW'),
		(113, 'Scotiabank Theatre Chinook', '6455 Macleod Trail SW'),
		(114, 'Landmark Cinemas 10 Shawnessy', '16061 Macleod Trail SE'),
		(115, 'Cineplex Odeon', '205 E Hills Blvd SE');


 INSERT INTO TicketReservationApp.AUDITORIUM(AuditoriumID, TheaterID)
VALUES  (005, 115),
		(004, 115),
		(002, 115);
        
 INSERT INTO TicketReservationApp.SHOW_TIME(MovieID, ShowDate, ShowTime)
VALUES  
		(2000, '2020-11-11', '21:00:00'),
		(2000, '2020-11-11', '00:00:00'),
		(2001, '2020-11-12', '15:00:00'),
		(2001, '2020-11-12', '18:00:00'),
		(2001, '2020-11-12', '21:00:00'),
		(2002, '2020-11-12', '23:00:00'),
		(2002, '2020-11-12', '15:00:00'),
		(2002, '2020-11-12', '15:00:00'),
		(2002, '2020-11-12', '18:00:00'),
		(2003, '2020-11-12', '15:00:00'),
		(2003, '2020-11-12', '18:00:00'),
		(2003, '2020-11-12', '22:00:00')
;

INSERT INTO TicketReservationApp.APP_USER(UserID, Email, UserPassword, TicketID)
VALUES  (001, 'davis.allan@ucalgary.ca', 'davido11', null),
		(002, 'bright.anorchie@ucalgary.ca', 'bright11', null),
        (003, 'khaled.behairy@ucalgary.ca', 'behairy1', null),
        (004, 'micheal.adelure@ucalgary.ca', 'micheal1', null);
        
INSERT INTO TicketReservationApp.REGISTERED_USER(UserID, Credit_card, Card_Name)
VALUES  (001, 734694398475946, 'Davis Allan'),
		(002, 893749304504546, 'Bright Anorchie'),
        (003, 399238340644334, 'Khaled Behairy'),
        (004, 128994830843044, 'Micheal Adelure');
        
INSERT INTO TicketReservationApp.TICKET(TicketID, MovieID, TheaterID)
VALUES  (011, 2001, 112),
		(022, 2002, 115),
        (043, 2002, 113),
        (084, 2006, 115);

INSERT INTO TicketReservationApp.RESERVATION(ReservationID, TicketID)
VALUES  (1, 003),
		(22, 001),
        (43, 004);
        
INSERT INTO TicketReservationApp.PAYMENT(PaymentID, UserID, TicketID, Price)
VALUES  (001, 1, 2, 49.00),
		(002, 2, 11, 22.00),
        (003, 3, 22, 10.00);






		