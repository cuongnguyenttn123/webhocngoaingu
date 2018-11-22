
CREATE TABLE grammar(
  id BIGINT(6) AUTO_INCREMENT PRIMARY KEY NOT NULL,
  tennguphap VARCHAR(255) NOT NULL,
  cautruc VARCHAR(255) NOT NULL,
  cachdung VARCHAR(255) NOT NULL,
  vidu VARCHAR(255) NOT NULL,
  chuthich VARCHAR(255) NOT NULL
);
CREATE TABLE lessons_grammar(
  grammar_id    BIGINT(6)    NOT NULL,
  lesson_id   BIGINT(6)    NOT NULL
);
CREATE TABLE lessons_vocabulary(
  vocabulary_id    BIGINT(6)    NOT NULL,
  lesson_id   BIGINT(6)    NOT NULL
);
