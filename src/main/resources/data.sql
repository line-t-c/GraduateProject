INSERT INTO RECIPE (TITLE, INSTRUCTION, INGREDIENT_LIST) VALUES('Gulerodssuppe', 'Kog og blend', 'Gulerødder');
--
--INSERT INTO RECIPE (ID, TITLE, INSTRUCTION, INGREDIENT_LIST, PORTIONS)
--VALUES
--(1, 'Pasta med tomatsauce', '1. Cook pasta according to package directions. 2. Heat oil in a saucepan over medium heat. 3. Add garlic and cook until fragrant. 4. Add canned tomatoes, salt, and sugar. 5. Simmer until sauce has thickened. 6. Toss pasta with sauce and serve.', 'pasta, canned tomatoes, garlic, salt, sugar, olive oil', 4);
--
--INSERT INTO INGREDIENT (ID, INGREDIENT_NAME, AMOUNT, MEASUREMENT, RECIPE_ID_FK)
--VALUES
--(1, 'pasta', 8, 'ounces', 1),
--(2, 'canned tomatoes', 28, 'ounces', 1),
--(3, 'garlic', 2, 'cloves', 1),
--(4, 'salt', 1, 'teaspoon', 1),
--(5, 'sugar', 1, 'teaspoon', 1),
--(6, 'olive oil', 2, 'tablespoons', 1);
--
--INSERT INTO INSTRUCTION (ID, STEP, RECIPE_ID_FK)
--VALUES
--(1, 'Cook pasta according to package directions.', 1),
--(2, 'Heat oil in a saucepan over medium heat.', 1),
--(3, 'Add garlic and cook until fragrant.', 1),
--(4, 'Add canned tomatoes, salt, and sugar.', 1),
--(5, 'Simmer until sauce has thickened.', 1),
--(6, 'Toss pasta with sauce and serve.', 1);
--
--
---- Indsæt en opskrift
--INSERT INTO RECIPE (TITLE, INSTRUCTION, INGREDIENT_LIST, PORTIONS) VALUES
--('Pasta Carbonara', '1. Kog pastaen i en stor gryde med rigeligt saltet vand. 2. Imens pastaen koger, pisk æggene sammen med parmesan, salt og peber i en skål. 3. Steg bacon på en stor pande, indtil det bliver sprødt og brunt. 4. Fjern panden fra varmen. 5. Når pastaen er færdigkogt, drænes den, og tages direkte fra gryden til panden med baconet. 6. Bland hurtigt pastaen og baconet, tilsæt æggeblandingen og rør det sammen. Server straks.', '4 skiver bacon, 4 æg, 75 g friskrevet parmesan, 400 g spaghetti, salt og peber', 4);
--
---- JOIN?
--
---- Indsæt ingredienser til opskriften
--INSERT INTO INGREDIENT (INGREDIENT_NAME, AMOUNT, MEASUREMENT, RECIPE_ID_FK)
--VALUES
--('bacon', 4, 'skiver', 1);
--('æg', 4, '', 1);
--('parmesan', 75, 'g', 1);
--('spaghetti', 400, 'g', 1);
--
---- Indsæt trin til opskriften
--INSERT INTO INSTRUCTION (STEP, RECIPE_ID_FK)
--VALUES
--('Kog pastaen i en stor gryde med rigeligt saltet vand.', 1);
--('Imens pastaen koger, pisk æggene sammen med parmesan, salt og peber i en skål.', 1);
--('Steg bacon på en stor pande, indtil det bliver sprødt og brunt.', 1);
--('Fjern panden fra varmen.', 1);
--('Når pastaen er færdigkogt, drænes den, og tages direkte fra gryden til panden med baconet.', 1);
--('Bland hurtigt pastaen og baconet, tilsæt æggeblandingen og rør det sammen. Server straks.', 1);
--
--
--
--
