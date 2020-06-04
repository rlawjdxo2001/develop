create table cmn_user_info_table (
userSeq integer not null auto_increment
,userFirstName varchar(5) not null
,userLastName varchar(5) not null
,userEmail varchar(100) not null
,userPhoneNumber varchar(15) not null
,userAddress1 varchar(60) not null
,userAddress2 varchar(60) not null
,createUser varchar(60) not null
,createDt datetime not null
,modiUser varchar(60) not null
,modiDt datetime not null
,modiProgram varchar(200) not null
, primary key (userSeq)
, foreign key (userSeq) references cmn_user_table (userSeq)
)