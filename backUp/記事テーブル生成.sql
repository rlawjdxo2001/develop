-- 記事テーブル生成
CREATE TABLE thread (
     threadid INT(10) NOT NULL AUTO_INCREMENT
     , userid VARCHAR(64) NOT NULL
     , title VARCHAR(50) NOT NULL
     , content TEXT
     , createuser VARCHAR(64) NOT NULL
     , createdt DATETIME NOT NULL
     , modiuser VARCHAR(64)
     , modidt DATETIME
     , PRIMARY KEY(threadid)
)
