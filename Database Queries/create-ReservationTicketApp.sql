-- DROP TABLE IF EXISTS TicketReservationApp;
CREATE DATABASE TicketReservationApp;
USE TicketReservationApp;

DROP TABLE IF EXISTS APP_USER;
CREATE TABLE APP_USER (
	UserID    integer not null,
    Email varchar(20),
    UserPassword varchar(8), 
    TicketID  varchar(20) ,
    VoucherID  integer,
    primary key(UserID),
    foreign key (TicketID) references TICKET(TicketID),
    foreign key (VoucherID) references Voucher(VoucherID)
    );

DROP TABLE IF EXISTS REGISTERED_USER;
CREATE TABLE REGISTERED_USER (
	UserID    integer not null,
    Credit_card integer not null,
    Card_Name varchar(20),
    primary key(Credit_card),
    foreign key (UserID) references APP_USER(UserID)
    );

DROP TABLE IF EXISTS THEATER;
CREATE TABLE THEATER (
	TheaterID    integer not null,
    Theater_name  varchar(20) not null,
    Address  varchar(20),
    primary key(TheaterID)
    );
    
    
DROP TABLE IF EXISTS AUDITORIUM;
CREATE TABLE AUDITORIUM (
	AuditorimID    integer not null,
    Auditorium_name  varchar(20) not null,
    seats  varchar(20),
    primary key(AuditorimID)
    );
    
DROP TABLE IF EXISTS MOVIE;
CREATE TABLE MOVIE (
	MovieID    integer not null,
    Mov_Name  varchar(20) not null,
    showTime  varchar(20),
    primary key(MovieID)
    );
    
    DROP TABLE IF EXISTS TICKET;
CREATE TABLE TICKET (
	TicketID    integer not null,
    MovieID  integer not null,
    TheaterID  integer not null,
    primary key(TicketID),
    foreign key (MovieID) references MOVIE(MovieID),
    foreign key (TheaterID) references THEATER(TheaterID)
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
    foreign key (UserID) references APP_USER(UserID),
    foreign key (TicketID) references TICKET(TicketID)
    );   
    
