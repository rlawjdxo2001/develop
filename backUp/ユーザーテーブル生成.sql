create table cmn_user_table (
userSeq integer not null auto_increment
,userId varchar(64) not null
,password varchar(60) not null
,createUser varchar(64) not null
,createDt datetime not null
,modiUser varchar(64) not null
,modiDt datetime not null
,modiProgram varchar(200) not null
, primary key (userSeq)
, unique (userId)
)