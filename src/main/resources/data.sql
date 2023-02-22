-- Indsæt en opskrift
INSERT INTO RECIPE (TITLE, PORTIONS) VALUES
('Pasta Carbonara', 4),
('Grillet Kyllingesalat', 4);

--Caused by: org.h2.jdbc.JdbcSQLSyntaxErrorException:
--Syntax error in SQL statement "([*]'Grillet Kyllingesalat', 4)"; expected "(, SELECT, TABLE, VALUES"; SQL statement:


-- Indsæt ingredienser til opskriften, forbind med ID i enden
INSERT INTO INGREDIENT (INGREDIENT_NAME, AMOUNT, MEASUREMENT, RECIPE_ID_FK)
VALUES
('bacon', 4, 'skiver', 1),
('æg', 4, 'stk', 1),
('parmesan', 75, 'g', 1),
('spaghetti', 400, 'g', 1),
('kyllingebryst', 2, 'stk', 2),
('blandet salat', 1, 'pose', 2),
('cherrytomater', 250, 'g', 2),
('dressing', 2, 'spsk', 2);

-- Indsæt trin til opskriften
INSERT INTO INSTRUCTION (STEP, RECIPE_ID_FK)
VALUES
('Kog pastaen i en stor gryde med rigeligt saltet vand.', 1),
('Imens pastaen koger, pisk æggene sammen med parmesan, salt og peber i en skål.', 1),
('Steg bacon på en stor pande, indtil det bliver sprødt og brunt.', 1),
('Fjern panden fra varmen.', 1),
('Når pastaen er færdigkogt, drænes den, og tages direkte fra gryden til panden med baconet.', 1),
('Bland hurtigt pastaen og baconet, tilsæt æggeblandingen og rør det sammen. Server straks.', 1),
('Grill kyllingebrystet til det er gennemstegt', 2),
('Skær den blandet salat og cherrytomater', 2),
('Tilføj grill kyllingebrystet til den blandet salat og cherrytomater', 2),
('Tilføj dressing og server', 2);




