-- Indsæt en opskrift
INSERT INTO RECIPE (TITLE, PORTIONS, IMAGE_URL) VALUES
('Pasta Carbonara', 4, 'https://www.valdemarsro.dk/wp-content/2016/10/carbonara_app-1300.jpg'),
('Grillet Kyllingesalat', 4, 'https://www.valdemarsro.dk/wp-content/2018/01/kyllingesalat.jpg'),
('Vegetarisk Brændende Kæerlighed', 4, 'https://www.valdemarsro.dk/wp-content/2023/02/vegetarisk-braendende-kaerlighed.jpg'),
('Vegetar og vegansk', 4, 'https://www.valdemarsro.dk/wp-content/2023/02/vegetarisk-braendende-kaerlighed.jpg'),
('Vegetar og laktosefri', 4, 'https://www.valdemarsro.dk/wp-content/2023/02/vegetarisk-braendende-kaerlighed.jpg'),
('Laktosefri og glutenfri', 4, 'https://www.valdemarsro.dk/wp-content/2023/02/vegetarisk-braendende-kaerlighed.jpg');

-- Indsæt ingredienser til opskriften, forbind med ID i enden
INSERT INTO INGREDIENT (INGREDIENT_NAME, AMOUNT, MEASUREMENT, RECIPE_ID_FK)
VALUES
('bacon', 4, 'skiver', 1),
('æg', 4, 'stk', 1),
('parmesan', 75, 'g', 1),
('spaghetti', 400, 'g', 1),
('kartofler', 400, 'g', 1),
('kyllingebryst', 2, 'stk', 2),
('blandet salat', 1, 'pose', 2),
('cherrytomater', 250, 'g', 2),
('dressing', 2, 'spsk', 2),
('kartofler', 500, 'g', 3),
('syltede rødbeder', 100, 'g', 3),
('cherrytomater', 250, 'g', 3),
('ristede løg', 30, 'g', 3),
('hakket purløg', 1, 'lille bundt', 3),
('kartofler', 500, 'g', 4),
('syltede rødbeder', 100, 'g', 4),
('ristede løg', 30, 'g', 4),
('hakket purløg', 1, 'lille bundt', 4),
('kartofler', 500, 'g', 5),
('syltede rødbeder', 100, 'g', 5),
('ristede løg', 30, 'g', 5),
('hakket purløg', 1, 'lille bundt', 5),
('kartofler', 500, 'g', 6),
('syltede rødbeder', 100, 'g', 6),
('ristede løg', 30, 'g', 6),
('hakket purløg', 1, 'lille bundt', 6);


-- Indsæt trin til opskriften
INSERT INTO INSTRUCTION (RECIPE_STEPS, RECIPE_ID_FK)
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
('Tilføj dressing og server', 2),
('Kog kartofler og lav kartoffelmos', 3),
('Skær syltede rødbeder i tern', 3),
('Drys med hakket purløg og ristede løg', 3),
('Kog kartofler og lav kartoffelmos', 4),
('Skær syltede rødbeder i tern', 4),
('Drys med hakket purløg og ristede løg', 4),
('Kog kartofler og lav kartoffelmos', 5),
('Skær syltede rødbeder i tern', 5),
('Drys med hakket purløg og ristede løg', 5),
('Kog kartofler og lav kartoffelmos', 6),
('Skær syltede rødbeder i tern', 6),
('Drys med hakket purløg og ristede løg', 6);

-- Indsæt trin til diet / kostretning. Boolean in sql: 0 = false, 1 = true
INSERT INTO DIET (IS_VEGETARIAN, IS_VEGAN, IS_LACTOSE_FREE, IS_GLUTEN_FREE, RECIPE_ID_FK)
VALUES
(0, 0, 0, 0, 1),
(0, 0, 0, 1, 2),
(1, 1, 1, 1, 3),
(1, 1, 0, 0, 4),
(1, 0, 1, 0, 5),
(0, 0, 1, 1, 6);

-- Indsæt trin til season. Boolean in sql: 0 = false, 1 = true
INSERT INTO SEASON (IS_SPRING, IS_SUMMER, IS_FALL, IS_WINTER, RECIPE_ID_FK)
VALUES
(0, 0, 1, 1, 1),
(1, 1, 0, 0, 2),
(0, 0, 1, 1, 3),
(0, 0, 0, 0, 4),
(0, 0, 1, 0, 5),
(0, 0, 1, 1, 6);

-- Indsæt tips
INSERT INTO TIPS (TIPS, INGREDIENT_ID_FK)
VALUES
('Gem skrællen fra kartofler til at koge grøntsagsboullion', 5);








