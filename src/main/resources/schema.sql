CREATE TABLE RECIPE(
  ID BIGINT AUTO_INCREMENT PRIMARY KEY,
  TITLE VARCHAR(64) NOT NULL,
  INSTRUCTION VARCHAR(64) NOT NULL,
  INGREDIENT VARCHAR(64) NOT NULL
);