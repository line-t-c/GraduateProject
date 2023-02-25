-- Har udeladt NOT NULL

CREATE TABLE RECIPE(
  ID BIGINT AUTO_INCREMENT PRIMARY KEY,
  TITLE VARCHAR(100),
  PORTIONS INTEGER,
  IMAGE_URL VARCHAR(1000)
  );

CREATE TABLE INGREDIENT(
  ID BIGINT AUTO_INCREMENT PRIMARY KEY,
  INGREDIENT_NAME VARCHAR(64),
  AMOUNT DOUBLE,
  MEASUREMENT VARCHAR(15),
  RECIPE_ID_FK BIGINT,
  FOREIGN KEY (RECIPE_ID_FK) REFERENCES RECIPE(ID) ON DELETE CASCADE
);

CREATE TABLE INSTRUCTION(
  ID BIGINT AUTO_INCREMENT PRIMARY KEY,
  RECIPE_STEPS VARCHAR(400),
  RECIPE_ID_FK BIGINT,
  FOREIGN KEY (RECIPE_ID_FK) REFERENCES RECIPE(ID) ON DELETE CASCADE
);

--Note that the ON DELETE CASCADE option is used on the foreign key constraints.
--This ensures that when an Opskrift is deleted, all associated Ingrediens and Fremgangsmaade entries are also deleted automatically.

