-- Indsæt en opskrift
INSERT INTO RECIPE (TITLE, PORTIONS, IMAGE_URL) VALUES
('Pasta Carbonara', 4, 'https://www.valdemarsro.dk/wp-content/2016/10/carbonara_app-1300.jpg'),
('Grillet Kyllingesalat', 4, 'https://www.valdemarsro.dk/wp-content/2018/01/kyllingesalat.jpg');

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




