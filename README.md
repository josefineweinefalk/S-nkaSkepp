# S-nkaSkeppSkapa två dimensionella arrayer som ska innehålla de två spelares kartor.
2. Kartorna är nu skapade och vi ska skapa en nästlad for-loop som vi kallar t.ex. CreateMaps()
3. Nästa steg blir att placera ut skepp, representerade av X på spelarens dator genom förutbestämda koordinater med PlaceShip()
4. Med dessa två metoder anropar vi de från programmets Main-metod
5. Kolla om någon har vunnit genom:
didSomeoneWon = false
while (didAnyoneWon == false
Rensa spelfönstret
Läs in koordinater för ett nytt skott och markera att dessa koordinater är skjuten
6. Uppdatera metoden CreateMaps() och se till att den fyller båda dessa tvådimensionella arrayer med värdet false
7. För att markera att spelaren skjutit på en ruta så ändrar vi värdet av den rutan från false till true
8. Skapa metoden SpelaSkänkaSkepp och anropa den i slutet av programmets Main-metod. Fyll på metoden PlayBattleShip med anrop till metoder vi skapat här.
9. Nu ska vi skriva en metod som undersöker om spelaren har vunnit. Vi vet att spelaren inte har vunnit än så länge om det finns någon ruta som är markerad med X på kartan som spelaren inte skjutit på. Om vi hittar någon sån ruta returnerar metoden false. Om kartan inte hittar någon sån ruta har spelare vunnit och metoden returnerar true.
10. Vi skriver en liknande metod för att undersöka om datorn vunnit, didYouWon()
11. Skriv en metod som läser in heltal.
12. Nu sätter vi ihop programmet i metoden PlayBattleShip
