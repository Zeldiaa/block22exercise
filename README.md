# block21exercise

Paketet utgår ifrån slutresultatet från förra veckan, med polygoner extraherade till egna klasser, i en arvshierarki. Utöver denna refaktorering har polygonerna också fått följande extra funktionalitet:
* Samtliga polygoner implementerar metoden toString(), som (i nuläget) enbart skriver ut typen på objektet den anropas på.
* I den abstrakta klassen Polygon finns en metod overlaps(Polygon other). Vi tänker oss att denna metod beräknar huruvida två polygoner överlappar. I nuläget rapporterar den dock bara typen (via toString()) på det implicita argumentet (this), och det explicita argumentet (other).

## Uppgifter

1. Metoden OverlapTests.main skapar i nuläget tre olika polygoner. Jämför dessa med varandra genom anrop till metoden Polygon.overlaps. Stämmer utskrifterna med vad ni förväntar dig? Kan ni förklara vad som händer i termer av statisk och dynamisk typ?

2. Gör override på metoden overlaps(Polygon p):void i alla tre subklasser, med en särskiljande utskrift. Använd overlapsHelper för att slippa duplicera kod. Kör testerna igen. Kan ni förutsäga vilka utskrifter ni kommer få?
Tips: Testa gärna kort-kommandot Ctrl+O i IntelliJ, för att enkelt generera skelett-kod för era overrides.

3. Skapa ytterligare en polygon (av någon valfri dynamisk typ), men låt denna hållas av en variabel med statisk typ Polygon. Testa att jämföra även denna, med sig själv och med övriga polygoner med mer specifik statisk typ. Testa den både som implicit argument (det objekt som overlaps anropas på), och som explicit argument. Kan ni förutsäga vilka utskrifter ni kommer få? Testar ni alla relevanta kombinationer av typer?

4. Lägg nu till en overloaded (överlagrad) metod overlaps(Triangle t):void i Triangle, och motsvarande specialiseringar i övriga subklasser. Låt även dessa skriva ut information så ni kan se vilken metod som anropas. Kör era tester igen för att jämföra olika polygoner. Stämmer det fortfarande med vad ni förväntar er?

## För mer utmaning

Java implementerar så kallad single dispatch för metoder – dvs att valet av konkret metod-implementation vid runtime 
baseras enbart på det implicita argumentet. Hur kan vi i Java åstadkomma double eller multiple dispatch, 
alltså att valet av metod baseras på både implicit och explicita argument?
* Som konkret exempel – säg att vi har en specialiserad algoritm som effektivt kan avgöra om en Triangle 
överlappar med en annan Triangle. Hur kan vi se till att denna algoritm används, även om de statiska typerna, 
för både implicit och explicit argument, är Polygon?
* Googla gärna – men försök klura ut en lösning själva först!
