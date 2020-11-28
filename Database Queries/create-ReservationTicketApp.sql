DROP DATABASE IF EXISTS TicketReservationApp;
CREATE DATABASE TicketReservationApp;
USE TicketReservationApp;

DROP TABLE IF EXISTS THEATRE;
CREATE TABLE THEATRE (
	TheatreID    integer not null,
    Theatre_name  varchar(20) not null,
    Address  varchar(20),
    primary key(TheatreID)
    );
    
DROP TABLE IF EXISTS AUDITORIUM;
CREATE TABLE AUDITORIUM (
	AuditoriumID    integer not null,
    Auditorium_name  varchar(20) not null,
    TheatreID		integer, 
    seats  varchar(20),
    primary key(AuditoriumID),
    foreign key (TheatreID) references THEATRE(TheatreID)
    );
    
DROP TABLE IF EXISTS MOVIE;
CREATE TABLE MOVIE (
    MovieID 		INTEGER NOT NULL,
    Mov_Name 		VARCHAR(20) NOT NULL,
    showTime 		VARCHAR(20),
    PRIMARY KEY (MovieID)
);

DROP TABLE IF EXISTS REGISTERED_USER;
CREATE TABLE REGISTERED_USER (
	UserID    		integer not null,
    FName			varchar(30),
    LName			varchar(30),
    Email 			varchar(30),
    UserPassword 	varchar(8),
    Card_Name 		varchar(30),
    Credit_card 	varchar(30) not null,
    CVC				integer, 
    Expiry			varchar(5),
    primary key(UserId)
    );


    DROP TABLE IF EXISTS TICKET;
CREATE TABLE TICKET (
	TicketID    integer not null,
    MovieID  integer not null,
    TheatreID  integer not null,
    primary key(TicketID),
    foreign key (MovieID) references MOVIE(MovieID),
    foreign key (TheatreID) references THEATRE(TheatreID)
    );
    
        DROP TABLE IF EXISTS RESERVATION;
CREATE TABLE RESERVATION (
	ReservationID integer not null,
	TicketID    integer not null,
    primary key(ReservationID),
    foreign key (TicketID) references TICKET(TicketID)
    );
    
         DROP TABLE IF EXISTS PAYMENT;
CREATE TABLE PAYMENT (
	PaymentID integer not null,
    UserID int not null,
	TicketID    integer not null,
    Price integer not null,
    primary key(PaymentID),
    foreign key (UserID) references REGISTERED_USER(UserID),
    foreign key (TicketID) references TICKET(TicketID)
    );   
    
DROP TABLE IF EXISTS SHOW_TIME;
CREATE TABLE SHOW_TIME (
	ShowTimeID		integer not null, 
    MovieID			integer,
    ShowDate		date,
    ShowTime		time,
    primary key (ShowTimeID),
    foreign key (MovieID) references MOVIE(MovieID)
    );
