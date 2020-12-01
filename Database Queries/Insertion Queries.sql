 INSERT INTO TicketReservationApp.THEATRE(TheatreID, Theatre_name, Address)
VALUES	(100, 'Cineplex Odeon', '205 E Hills Blvd SE');

INSERT INTO TicketReservationApp.MOVIE(MovieID, Mov_name, TheatreID)
VALUES  (2000, 'Iron Man', 100),
		(2001, 'John Wick: Chapter 3', 100),
		(2002, 'Tenet', 100),
		(2003, 'Avengers Endgame', 100),
        (2004, 'Star Wars', 100);
 
 INSERT INTO TicketReservationApp.AUDITORIUM(AuditoriumID, Auditorium_name, MovieID)
VALUES  (001, 1, 2000),
		(002, 2, 2001),
		(003, 3, 2002),
        (004, 4, 2003),
        (005, 5, 2004);
        
 INSERT INTO TicketReservationApp.SHOW_TIME(ShowTimeID, MovieID, ShowDate, ShowTime)
VALUES  
		(1, 2000, '2020-12-04', '12:00:00'),
		(2, 2000, '2020-12-04', '16:00:00'),
        (3, 2000, '2020-12-04', '19:30:00'),
        (4, 2000, '2020-12-05', '10:00:00'),
		(5, 2000, '2020-12-05', '16:45:00'),
        (6, 2000, '2020-12-05', '18:30:00'),
		(7, 2001, '2020-12-04', '12:45:00'),
		(8, 2001, '2020-12-04', '16:40:00'),
        (9, 2001, '2020-12-04', '19:15:00'),
        (10, 2001, '2020-12-05', '12:45:00'),
		(11, 2001, '2020-12-05', '14:40:00'),
        (12, 2001, '2020-12-05', '17:15:00'),
		(13, 2002, '2020-12-04', '13:30:00'),
		(14, 2002, '2020-12-04', '15:45:00'),
        (15, 2002, '2020-12-04', '21:00:00'),
        (16, 2002, '2020-12-05', '14:35:00'),
		(17, 2002, '2020-12-05', '16:55:00'),
        (18, 2002, '2020-12-05', '20:15:00'),
		(19, 2003, '2020-12-04', '15:25:00'),
		(20, 2003, '2020-12-04', '18:00:00'),
        (21, 2003, '2020-12-04', '20:00:00'),
        (22, 2003, '2020-12-05', '12:25:00'),
		(23, 2003, '2020-12-05', '17:25:00'),
        (24, 2003, '2020-12-05', '19:15:00'),
        (25, 2004, '2020-12-04', '16:00:00'),
        (26, 2004, '2020-12-04', '17:25:00'),
		(27, 2004, '2020-12-04', '18:50:00'),
        (28, 2004, '2020-12-05', '15:20:00'),
        (29, 2004, '2020-12-05', '17:25:00'),
		(30, 2004, '2020-12-05', '18:30:00');

        
INSERT INTO TicketReservationApp.REGISTERED_USER(UserID, FName, LName, Email, UserPassword, Card_Name, Credit_card, CVC, Expiry)
VALUES  (001, 'Davis', 'Allan', 'davis.allan@ucalgary.ca', 'davis11', 'Davis Allan', 734694398475946, 123, 2220),
		(002, 'Bright', 'Anorchie', 'bright.anorchie@ucalgary.ca', 'bright11', 'Bright Anorchie', 893749304504546, 234, 1521),
        (003, 'Khaled', 'Behairy', 'khaled.behairy@ucalgary.ca', 'behairy1',  'Khaled Behairy', 399238340644334, 153, 3622),
        (004, 'Michael', 'Adelure', 'micheal.adelure@ucalgary.ca', 'micheal1', 'Micheal Adelure', 128994830843044, 182, 4823);
        
INSERT INTO TicketReservationApp.TICKET(TicketID, MovieID, TheatreID)
VALUES  (1, 2001, 100),
		(2, 2002, 100),
        (3, 2002, 100),
        (4, 2003, 100);

INSERT INTO TicketReservationApp.RESERVATION(ReservationID, TicketID)
VALUES  (1, 003),
		(2, 001),
        (3, 004);
        
INSERT INTO TicketReservationApp.PAYMENT(PaymentID, UserID, TicketID, Price)
VALUES  (001, 1, 2, 49.00),
		(002, 2, 2, 22.00),
        (003, 3, 3, 10.00);

UPDATE TicketReservationApp.APP_USER
SET TicketID = 2
WHERE UserID = 1;

UPDATE TicketReservationApp.APP_USER
SET TicketID = 11
WHERE UserID = 2;

UPDATE TicketReservationApp.APP_USER
SET TicketID = 22
WHERE UserID = 3;




		