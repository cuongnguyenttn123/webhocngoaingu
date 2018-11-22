CREATE TABLE lessons (
  id          BIGINT(6)     AUTO_INCREMENT PRIMARY KEY NOT NULL,
  title       VARCHAR(254)       NOT NULL,
  description VARCHAR(254)
);

CREATE TABLE lessons_videos (
  video_id    BIGINT(6)    NOT NULL,
  lesson_id   BIGINT(6)    NOT NULL
);