-- コメントテーブル
create table thread_comment (
    commentid INT(11) NOT NULL AUTO_INCREMENT
    , threadid INT(11) NOT NULL
    , userid VARCHAR(64) NOT NULL
    , content TEXT
    , createuser VARCHAR(64) NOT NULL
    , createdt DATETIME NOT NULL
    , modiuser VARCHAR(64) NOT NULL
    , modidt DATETIME NOT NULL
    , PRIMARY KEY(commentid, threadid)
)