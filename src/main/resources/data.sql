-- Indsæt en opskrift
INSERT INTO RECIPE (TITLE, PORTIONS, IMAGE_URL) VALUES
('Pasta Carbonara', 4, 'https://www.valdemarsro.dk/wp-content/2016/10/carbonara_app-1300.jpg'),
('Grillet Kyllingesalat', 4, 'https://www.valdemarsro.dk/wp-content/2018/01/kyllingesalat.jpg'),
('Vegetarisk Brændende Kærlighed', 4, 'https://www.valdemarsro.dk/wp-content/2023/02/vegetarisk-braendende-kaerlighed.jpg'),
('Majspandekager', 4, 'https://www.valdemarsro.dk/wp-content/2015/01/majspandekager-2.jpg'),
('Hjemmelavet nutella', 4, 'https://www.valdemarsro.dk/wp-content/hjemmelavet-nutella-e1619018331581.jpg'),
('Fiskefrikadeller med remoulade og råkostsalat', 4, 'https://www.valdemarsro.dk/wp-content/2012/09/fiskefrikadeller.jpg'),
('Halloumi Burger', 4, 'https://www.valdemarsro.dk/wp-content/2019/09/halloumiburger.jpg'),
('Mexicansk burger med guacamole', 4, 'https://www.valdemarsro.dk/wp-content/2012/01/mexiburger.jpg'),
('Mango og avocadosalat', 4, 'https://www.valdemarsro.dk/wp-content/2021/03/mango-avocadosalat.jpg'),
('Vegetar ristaffel med grøntsager', 4, 'https://www.valdemarsro.dk/wp-content/2022/02/vegetar-ristaffel.jpg'),
('Salat med bagt laks og stenbiderrogn', 4, 'https://www.valdemarsro.dk/wp-content/2018/04/salat-laks-stenbiderrogn.jpg'),
('Lækre sprøde polenta fritter', 4, 'https://www.valdemarsro.dk/wp-content/2015/11/polentafritter.jpg'),
('Rørt tatar med ovnbagte fritter', 4, 'https://www.valdemarsro.dk/wp-content/2014/10/roert-tatar.jpg'),
('Risalamande cheesecake', 4, 'https://www.valdemarsro.dk/wp-content/2021/02/risalamandecheesecake.jpg'),
('Nøddetærte med saltkaramel', 4, 'https://www.valdemarsro.dk/wp-content/2020/02/noeddetaerte-opskrift_.jpg');

-- Indsæt ingredienser til opskriften, forbind med ID i enden
INSERT INTO INGREDIENT (INGREDIENT_NAME, AMOUNT, MEASUREMENT, TIPS, RECIPE_ID_FK)
VALUES
('bacon', 4, 'skiver', 'Gem bacon fedtet til at stege i', 1),
('æg', 4, 'stk', NULL, 1),
('parmesan', 75, 'g', 'Parmesan kan fryses ned', 1),
('spaghetti', 400, 'g', NULL, 1),

('kyllingebryst', 2, 'stk', 'Stegt kylling kan holde sig 5-6 dage i køleskabet', 2),
('blandet salat', 1, 'pose', NULL, 2),
('cherrytomater', 250, 'g', NULL, 2),
('dressing', 2, 'spsk', 'Frys overskydende dressing ned i isterningeposer', 2),

('kartofler', 500, 'g', NULL, 3),
('syltede rødbeder', 100, 'g', NULL, 3),
('cherrytomater', 250, 'g', NULL, 3),
('ristede løg', 30, 'g', NULL, 3),
('hakket purløg', 1, 'lille bundt', NULL, 3),

('mælk', 4, 'dl', NULL, 4),
('æg', 4, 'stk', NULL, 4),
('salt', 0.5, 'tsk', NULL, 4),
('majsmel', 200, 'g', NULL, 4),
('olivenolie', 1, 'spsk', NULL, 4),
('smør', 1, 'spsk', NULL, 4),

('hasselnødder', 50, 'g', NULL, 5),
('mælkechokolade', 100, 'g', NULL, 5),
('piskefløde', 1, 'dl', NULL, 5),
('smør', 40, 'g', NULL, 5),
('flagesalt', 0.5, 'tsk', NULL, 5),

('rødløg', 1, 'stk', NULL, 6),
('squash', 0.5, 'stk', NULL, 6),
('torskefilet', 300, 'g', NULL, 6),
('laks', 300, 'g', NULL, 6),
('æg', 2, 'stk', NULL, 6),
('frisk dild', 1, 'håndfuld', NULL, 6),
('hvedemel', 40, 'g', NULL, 6),
('piskefløde', 1, 'dl', NULL, 6),
('smør', 1, 'spsk', NULL, 6),
('remoulade', 1, 'dl', NULL, 6),
('gulerødder', 3, 'stk', NULL, 6),
('æble', 2, 'stk', NULL, 6),
('citron', 0.5, 'stk', NULL, 6),
('honning', 1, 'spsk', NULL, 6),
('kartofler', 1, 'kg', NULL, 6),
('paprika', 1, 'knivspids', NULL, 6),
('rosiner', 2, 'spsk', NULL, 6),
('solsikkekerner', 1, 'spsk', NULL, 6),

('burgerboller', 4, 'stk', NULL, 7),
('avocado', 1, 'stk', NULL, 7),
('blandet salat', 125, 'g', NULL, 7),
('halloumi', 200, 'g', NULL, 7),
('frisk mynte', 1, 'håndfuld', NULL, 7),
('rødløg', 2, 'stk', NULL, 7),
('mayonnaise', 2, 'spsk', NULL, 7),

('burgerboller', 4, 'stk', NULL, 8),
('avocado', 2, 'stk', NULL, 8),
('rødløg', 0.5, 'stk', NULL, 8),
('hvidløg', 1, 'fed', NULL, 8),
('spidskommen', 1, 'tsk', NULL, 8),
('citronsaft', 1, 'spsk', NULL, 8),
('flagesalt', 1, 'tsk', NULL, 8),
('hakket oksekød', 400, 'g', NULL, 8),
('cheddar ost', 4, 'skiver', NULL, 8),
('jalapenos', 30, 'g', NULL, 8),
('salatblade', 125, 'g', NULL, 8),
('tomat', 2, 'stk', NULL, 8),
('mayonnaise', 2, 'spsk', NULL, 8),

('quinoa', 150, 'g', NULL, 9),
('edamamebønner', 75, 'g', NULL, 9),
('rucola', 125, 'g', NULL, 9),
('mango', 2, 'stk', NULL, 9),
('avocado', 2, 'stk', NULL, 9),
('cashewnødder', 50, 'g', NULL, 9),
('frisk koriander', 1, 'håndfuld', NULL, 9),
('hvidløg', 1, 'fed', NULL, 9),
('revet ingefær', 1, 'tsk', NULL, 9),
('lime', 1, 'stk', NULL, 9),

('karry', 1, 'spsk', NULL, 10),
('spidskommen', 1, 'tsk', NULL, 10),
('stødt koriander', 1, 'tsk', NULL, 10),
('løg', 1, 'stk', NULL, 10),
('hvidløg', 2, 'fed', NULL, 10),
('blomkål', 250, 'g', NULL, 10),
('gulerødder', 75, 'g', NULL, 10),
('squash', 250, 'g', NULL, 10),
('æble', 1, 'stk', NULL, 10),
('citron', 1, 'stk', NULL, 10),
('olivenolie', 1, 'spsk', NULL, 10),
('ris', 3, 'dl', NULL, 10),
('kokosflager', 30, 'g', NULL, 10),
('peanuts', 50, 'g', NULL, 10),

('salatblade', 150, 'g', NULL, 11),
('laksefilet', 300, 'g', NULL, 11),
('tørret dild', 1, 'tsk', NULL, 11),
('citron', 1, 'stk', NULL, 11),
('stenbiderrogn', 50, 'g', NULL, 11),
('rødløg', 1, 'stk', NULL, 11),
('dild', 1, 'håndfuld', NULL, 11),
('creme fraiche', 1, 'dl', NULL, 11),

('polenta mel', 250, 'g', NULL, 12),
('vand', 1, 'l', NULL, 12),
('salt', 1, 'nip', NULL, 12),
('olivenolie', 4, 'spsk', NULL, 12),
('frisk rosmarin', 3, 'stængler', NULL, 12),
('creme fraiche', 1, 'dl', NULL, 12),
('mayonnaise', 2, 'spsk', NULL, 12),
('parmesan', 1, 'spsk', NULL, 12),
('æblecidereddike', 1, 'dryp', NULL, 12),

('bagekartoffel', 1, 'kg', NULL, 13),
('olivenolie', 3, 'spsk', NULL, 13),
('flagesalt', 2, 'tsk', NULL, 13),
('okseinderlår', 600, 'g', NULL, 13),
('æggeblomme', 2, 'stk', NULL, 13),
('frisk estragon', 1, 'spsk', NULL, 13),
('kapers', 1, 'spsk', NULL, 13),
('cornichoner', 2, 'spsk', NULL, 13),
('worcestershire sauce', 1, 'tsk', NULL, 13),
('tabasco', 3, 'dråber', NULL, 13),
('peberrod', 1, 'tsk', NULL, 13),
('skalotteløg', 2, 'stk', NULL, 13),
('dijon sennep', 2, 'tsk', NULL, 13),
('aioli', 1, 'dl', NULL, 13),

('sødmælk', 5, 'dl', NULL, 14),
('grødris', 90, 'g', NULL, 14),
('salt', 1, 'nip', NULL, 14),
('mandler', 75, 'g', NULL, 14),
('digestive kiks', 120, 'g', NULL, 14),
('smør', 125, 'g', NULL, 14),
('vaniljestang', 1, 'stk', NULL, 14),
('flormelis', 75, 'g', NULL, 14),
('kold risengrød', 300, 'g', NULL, 14),
('flødeost', 150, 'g', NULL, 14),
('husblas', 3, 'ark', NULL, 14),
('piskefløde', 3, 'dl', NULL, 14),
('kirsebærsaft', 300, 'g', NULL, 14),
('chokoladekugler', 50, 'g', NULL, 14),
('pink kagestøv', 1, 'knivspids', NULL, 14),

('hvedemel', 240, 'g', NULL, 15),
('flormelis', 50, 'g', NULL, 15),
('salt', 1, 'knivspids', NULL, 15),
('smør', 120, 'g', NULL, 15),
('æg', 1, 'stk', NULL, 15),
('piskefløde', 3, 'dl', NULL, 15),
('sukker', 250, 'g', NULL, 15),
('nougat', 50, 'g', NULL, 15),
('hasselnødder', 100, 'g', NULL, 15),
('mandler', 100, 'g', NULL, 15),
('pekannødder', 75, 'g', NULL, 15);

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

('Rør mælk, æg, salt og pisk fuldkornsmajsmel i dejen. Lad gerne dejen stå og hvile i 30 minutter.', 4),
('Dejen skal være flydende, så den nemt kan fordeles på panden til en pandekage og den skal gerne røres sammen undervejs.', 4),
('Fordel lidt olie og smør på en varm pande. Når smørret er bruset af, så hældes lidt pandekagedej ud og panden vippes lige lidt rundt så det fordeler sig på hele panden – steg pandekagerne en af gangen på begge sider.', 4),

('Rist hasselnødderne i ovnen ved 180 grader varmluft i 10 minutter på en bradepande, til hinderrne revner og bliver sprød.', 5),
('Tag hasselnødderne ud af ovnen og kom dem i et rent klæde, gnid hasselnødderne i klædet så hinderne falder af.', 5),
('Kom 3/4 af hasselnødderne i en foodprocesser og hak dem fint til nøddemel, eller hak dem super fint på skærebræt. Hak den sidste 1/4 groft, så der kommer godt med crunch i nutellaen.', 5),
('Hak chokoladen og kom chokoladen og de finthakkede nødder i en skål.Varm fløden op i en gryde til kogepunktet og hæld fløden over chokoladen i skålen. Rør godt rundt og tilsæt smør under omrøring. Rør det godt igennem til det er helt ensartet. Kør eventuelt hurtigt med en stavblender hvis nødvendigt.', 5),
('Rør de grofthakkede hasselnødder og flagesalt i og hæld chokoladen på et glas.', 5),
('Stil i kølesskabet i 3 timer, så den kan sætte sig.', 5),

('Skær kartoflerne i både og vend dem i olie, salt, og paprika og bag dem i en forvarmet ovn ved 200 grader varmluft i 30-35 minutter til de er gyldne og sprøde. Vend dem et par gange undervejs.', 6),
('Kom løg og squash i en foodprocessor og kør, til det er finthakket. Tilsæt resten af ingredienserne – dog ikke smør og olie. Kør kort, til farsen er samlet og har den ønskede konsistens.', 6),
('Sæt fiskefarsen i køleskabet i en halv times tid, så den kan samle sig og trække smag.', 6),
('Steg fiskefrikadellerne i olie og smør på panden ved middelvarme, til de er gennemstegte og gyldne og sprøde på begge sider.', 6),
('Bland citronsaft og honning, vend derefter de groftrevet æbler heri.', 6),
('Tilsæt resten af ingredienserne og server straks.', 6),

('Lun burgerbollerne i ovnen eller på grillen.', 7),
('Skær halloumi i 4 skiver og grill dem på en varm grillpande penslet med olie eller på grillen til de har flotte grillstriber på begge sider.', 7),
('Smør hver burgerbolle med chilimayodressing og saml burgerne med avocado i skiver, salat, mynte, rødløgskompot, mynte og halloumi.', 7),

('Kom løg, hvidløg og avocado i en minihakker og kør til det er en cremet og lækker guacamole. Smag til med spidskommen, salt og citron.', 8),
('Steg bøfferne på en varm pande eller grill.', 8),
('Kom cheddar ost på bøfferne og saml burgeren med salat, tomater, guacamole og mayo.', 8),

('Skyl og kog quinoa efter anvisning på emballagen.', 9),
('Hæld kogende vand over edamamebønnerne og vend dem med quinoa.', 9),
('Anret på et fad med rucola, mango og avocado.', 9),
('Drys med cashewnødder og koriander inden servering.', 9),

('Rist karry, spidskommen og koriander i en tør gryde ved middelvarme til det dufter skønt.', 10),
('Tilsæt løg, hvidløg og olie og sauter til løgene er klare og bløde.', 10),
('Kom karrypaste, gurkemeje, blomkål, gulerod, squash, æble og grøntsagsboullion i gryden og rør det godt igennem. Læg låg på og lad det simre i cirka 5 minutter til blomkålen er mør.', 10),
('Kom det i en blender og blend til en cremet sauce. Kom tilbage i en ren gryde og smag godt til med citronsaft, salt og peber.', 10),
('Server ris, karrysauce i skåle med alle topping på et fad til at forsyne sig ved bordet.', 10),

('Drys laksen med salt, peber og dild, læg to citronskiver over og bag laksen i et ovnfast fad i en forvarmet ovn ved 175 grader varmluft i 15 minutter eller til den er lige akkurat perfekt tilberedt.', 11),
('Anret salaten på tallerkener. Fordel stykker af den bagte laks på salaten sammen med små skefulde stenbiderrogn, rødløg i skiver, frisk dild og små skefulde creme fraiche.', 11),
('Server med et par citronbåde til, så man selv kan dryppe over og smage til.', 11),

('Kog vandet op, skrue ned for varmen og kom polenta i under omrøring. Rør grundigt, så det ikke klumper og lad det simre under låg i 30-45 minutter med jævne omrøringer – kom evt lidt mere vand i hvis det bliver for fast.', 12),
('Smør et fad med en smule olivenolie og kom polenta i. Tryk den godt flad og ensartet – og kom et stykke bagepapir over. Stil på køl i mindst et par timer og gerne til om aftenen næste dag …', 12),
('Tag polentaen ud af formen og skær tynde pommesfrites stave. Det er nemt, for polentaen er fast og nærmest lidt gummiagtig at arbejde med.', 12),
('Vend dem godt med olie, salt og peber og bag polenta fritterne i ovnen ved 225 grader varmluft i 30 minutter, til de er sprøde. Vend dem cirka halvvejs i bagningen.', 12),
('Inden servering drysses de med fintrevet og friskrevet parmasanost og finthakket rosmarin, smages til med salt og så er der sprøde polenta fritter klar til servering med den krydrede dip.', 12),
('Rør creme fraiche og mayo sammen med parmasan og rosmarin til en krydret dip, smag til med salt, peber og æbleeddike.', 12),

('Skrub kartoflerne og skær dem i stave. Vend kartoflerne i olie og salt og bag dem i ovnen ved 175 grader varmluft i 35-40 minutter til de er sprøde. Vend dem et par gange undervejs.', 13),
('Rør æggeblommer, estragon, kapers, cornichoner, worchestershiresauce, tacasco og olivenolie sammen med oksekødet. Smag til med salt, 1 tsk dijonsennep, halvdelen af de finthakkede skalotteløg og friskkværnet sort peber.', 13),
('Rør det godt igennem  og smag til igen med det sidste dijon, skalotteløg og evt mere salt og peber efter smag. Hvor meget der skal i, af hver smagsgiver er en individuel vurdering. Mængden er tilpasset så den er afstemt perfekt til vores smagsløg.', 13),
('Del tataren i fire portioner og form tataren på tallerkenen med en kniv, og top med en rå æggeblomme og et drys estragon.', 13),
('Server med kartoffelfritter, aioli eller mayonnaise og en enkel salat', 13),

('Kom mælk, grødris og et nip salt i en gryde og kog op under omrøring. Sæt gryden i en forvarmet ovn ved 125 grader i 40 minutter eller til grødrisene er perfekt møre. Lad det køle af til stuetemperatur.', 14),
('Hvis du bruger en rest risengrød, så tag den ud af køleskabet, så den ikke er køleskabskold.', 14),
('Kom mandler (både til bunden og til risalamandecremen) i en skål og hæld kogende vand over. Lad det trække i 10 minutter, hæld vandet fra og hæld igen kogende vand over. Hæld vandet fra og smut mandlerne, del dem i to portioner til bund og risalamande creme.', 14),
('Kom kiks og mandler til bunden i en foodprocessor og kør til det er en ensartet grynet masse. Kom smør i og kør et par sekunder mere. Læg bagepapir i bunden af en springform på 18 cm, og sæt lagkageplast fast langs indersiden af kanten. Fordel kiksemassen i bunden i et jævnt lag og tryk den godt sammen. Sæt på køl i 30 minutter.', 14),
('Flæk vaniljestangen og fordel vaniljekornene i flormelis.', 14),
('Rør risengrød med vanilje, flormelis og flødeost.', 14),
('Læg husblassen i blød i 10 minutter i koldt vand og smelt husblas i en skål over et vandbad ved middelvarme. Tag af varmen, lad husblas køle af et par minutter ved stuetemperatur og rør amaretto mandellikør i husblassen. Rør først et par skefulde af risengrødsblandingen i skålen med husblas og likør og rør derefter det hele sammen i skålen med risengrøden. Rør grofthakkede mandler i.', 14),
('Pisk fløden til en let flødeskum og vend den i risengrødsblandingen. Fordel cremen i springformen med kiksebunden og stil i køleskab i minimum 4 timer eller til næste dag.', 14),
('Læg husblas i blød i en skål med koldt vand.', 14),
('Varm kirsebærsaft op i en kasserolle ved middelvarme til lige under kogepunktet. Tag af varmen og vrid husblas for vand og kom dem i den varme kirsebærsaft. Rør det godt igennem og lad det køle af til stuetemperatur. Sæt eventuelt gryden i køleskabet i 20 minutter.', 14),
('Hæld saften i springformen over en spiseske inden det rammer cheesecaken, så fordeles det pænt. Sæt din risalamande cheesecake i køleskab i 2 timer.', 14),
('Tag springformen af kagen og brug en slank kniv til at skære langs kanten af kageplast, så du får en flot skarp kant.', 14),
('Tril chokoladekugler i pink kagestøv og pynt kagen inden servering.', 14),

('Kør hvedemel, flormelis, salt og smør i en foodprocessor, til det er ensartet. Saml dejen i en skål med sammenpisket æg og evt. lidt koldt vand.', 15),
('Rul dejen ud mellem to stykker bagepapir og sæt den på køl i 30 minutter.', 15),
('Kom dejen i en smurt tærteform på 24 cm i diameter og tryk den til i kanten og skær kanten til. Prik huller i tærtebunden og læg et stykke bagepapir over. Fyld bunden med tørrede bønner og blindbag tærtedejen i en forvarmet ovn ved 175 grader varmluft i ca. 15 minutter.', 15),
('Tag bunden ud, fjern bagepapir og bønner og bag videre i 5 minutter.', 15),
('Fordel nougat i skiver på tærtebunden og lad kagen køle af.', 15),
('Varm fløden op til kogepunktet i en lille kasserolle, og sluk for blusset. Kom sukker i en gryde og tænd for mellemhøj varme. Skru ned til middelvarme, så snart halvdelen af sukkeret er smeltet.', 15),
('Tilsæt smør, pisk det godt sammen og hæld derefter den varme fløde i lidt efter lidt. Kog karamellen op og sluk for varmen.', 15),
('Rør godt igennem og sæt gryden med karamel i køleskabet.', 15),
('Rør ½ tsk flagesalt i den afkølede karamel og fordel halvdelen af karamellen i den afkølede tærtebund.', 15),
('Fordel derefter alle nødderne oven på karamellen og hæld resten af karamellen over. Sæt kagen i køleskabet i min. 2 timer inden servering.', 15);

-- Indsæt trin til diet / kostretning. Boolean in sql: 0 = false, 1 = true
INSERT INTO DIET (IS_VEGETARIAN, IS_VEGAN, IS_LACTOSE_FREE, IS_GLUTEN_FREE, RECIPE_ID_FK)
VALUES
(0, 0, 0, 0, 1),
(0, 0, 0, 1, 2),
(1, 1, 1, 1, 3),
(1, 0, 0, 1, 4),
(1, 0, 0, 1, 5),
(0, 0, 0, 0, 6),
(1, 0, 0, 0, 7),
(0, 0, 0, 0, 8),
(1, 1, 1, 1, 9),
(1, 1, 1, 1, 10),
(0, 0, 0, 1, 11),
(1, 0, 0, 1, 12),
(0, 0, 1, 1, 13),
(0, 0, 0, 0, 14),
(1, 0, 0, 0, 15);











