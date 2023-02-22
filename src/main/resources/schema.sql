CREATE TABLE RECIPE(
  ID BIGINT AUTO_INCREMENT PRIMARY KEY,
  TITLE VARCHAR(100),
  INSTRUCTION VARCHAR(400),
  INGREDIENT_LIST VARCHAR(64),
  PORTIONS INT
  );
--
--
---- skal de så være varchar?
--
CREATE TABLE INGREDIENT(
  ID BIGINT AUTO_INCREMENT PRIMARY KEY,
  INGREDIENT_NAME VARCHAR(64),
  AMOUNT DOUBLE,
  MEASUREMENT VARCHAR(15),
  RECIPE_ID_FK BIGINT,
  FOREIGN KEY (RECIPE_ID_FK) REFERENCES RECIPE(ID)
);
--
--
----
---
----      private Double portions;
----
----      @ManyToOne
----      private Recipe recipe;
--
CREATE TABLE INSTRUCTION(
  ID BIGINT AUTO_INCREMENT PRIMARY KEY,
  STEP VARCHAR(400),
  RECIPE_ID_FK BIGINT,
  FOREIGN KEY (RECIPE_ID_FK) REFERENCES RECIPE(ID)
);
--
----    @Id
----      @GeneratedValue(strategy = GenerationType.IDENTITY)
----      private Long id;
----
----      private String step;
----
----      @ManyToOne
----      private Recipe recipe;