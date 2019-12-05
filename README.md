# UpravljanjeZadacima
Zavrsni ispit IT OiP

//Napisati aplikaciju za upravljanje zadacima na programskom jeziku java.

//U paketu tim postoji Zaposleni. Zaposleni ima ime, prezime i email.

//• Ispisuje se u formatu: Prezime ime – email

//• Mogu se sortirati po prezimenu, pa nakon toga po imenu (oni koji imaju isto prezime)

//U paketu projekat postoji Zadatak. Zadatak ima naziv, opis i stanje (aktivan/ gotov), vreme kreiranja zadatka i listu zaposlenih.

//• Beleži vreme kreiranja zadatka pri njegovom nastanku.

//• Zaposleni se dodaju pojedinačno u listu.

//• Može se zatvoriti zadatak.

//• Zadaci se mogu sortirati po vremenu kreiranja – opadajuće.

//Ispisuje se u formatu: 

//Zadatak Naziv ({dan}.{mes}.{god.}) 

//– Stanje (AKTIVAN / GOTOV) 

//- Zaposleni 1 - Zaposleni 2 .. 

//- Zaposleni n (Zaposlene sortirati pre ispisa)

//U paketu projekat postoji Grupa. Grupa ima naziv i listu zadataka. Grupi se može dodati zadatak.

//• Zadaci se dodaju pojedinačno u listu.

//• Može se vratiti ukupan broj zaposlenih na aktivnim zadacima u grupi.

//• Može se vratiti ukupan broj aktivnih zadataka.

//• Može se vratiti sortirana lista zaposlenih koji nisu na aktivnom zadatku.

//Ispisuje se u formatu: 

//Grupa – Naziv ({m} zaposlenih na {n} zadataka) 

//- Zadatak 1 

//- Zadatak 2 .. 

//- Zadatak n (Zadatke sortirati pre ispisa)

//U paketu projekat postoji Projekat. Projekat ima naziv, šifru projekta i listu grupa. Projektu se može dodati grupa.

//• Grupe se pojedinačno dodaju u listu.

//Ispisuje se u formatu: 

//Projekat – Naziv 

//- Grupa 1 

//- Grupa 2 .. 

//- Grupa n

//Napisati glavni program koji ispituje funkcionalnosti ovih klasa.

//Pomoć za rad sa datumima:

//LocalDate vremeKreiranja = LocalDate.now();

//dan = vremeKreiranja.getDayOfMonth();

//mesec = vremeKreiranja.getMonthValue();

//godina = vremeKreiranja.getYear();
