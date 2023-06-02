# Kraje - JavaFX

Aplikacja edukacyjna do nauki państw na świecie z minimalną ilością CSS (w przyszłości planuję graficznie doszlifować projekt). Napisana w języku Java z zastosowaniem technologii JavaFX aby stworzyć aplikację okienkową. Gracze mogą wybrać kontynenty które chcą zgadywać, podglądnąć jakie państwa zostały wybrane, zobaczyć Top10 wyników oraz oczywiście uruchomić grę. 

# Liczenie punktów

Przy podliczaniu punktów za rozgrywkę liczy się zarówno ilość poprawnie zgadniętych państw oraz czas w jakim się tego dokonało. A dokładna formuła wygląda następująco:

```java
public void calculateScore(int guessed) {
        if(guessed == 0)
            this.score = Double.MAX_VALUE;
        else if(guessed <= 30) {
            this.score = this.time / (double) guessed;
        } else {
            double weight = 0;
            for (int i = 0; i < guessed - 30; i++)
                weight += calculateSingleWeight(i);
            this.score = this.time / weight;
        }
    }

private double calculateSingleWeight(int guessed) {
        if(guessed == 0) return 1;
        return calculateSingleWeight(guessed - 1) + 0.01;
    }
````
Jednak przez wykorzystanie zwykłych zmiennych `double` przy rekurencji traci się dokładność co będzie załatane w przyszłym patchu.

# Przyszłość projektu
W przyszłych patchach planuję zreorganizować pliki dla większej czytelności, zwiększyć ilość CSS aby program był przyjemniejszy dla oka oraz dodać obsługę języka angielskiego.

# Widok po uruchomieniu

<img width="1212" alt="Uruchomienie" src="https://github.com/Tquillaa/Kraje-JavaFX/assets/72698285/06799c0b-4791-4d56-9e8a-c8c308fe4a5c">

# Widok menu głównego

<img width="1212" alt="Menu główne" src="https://github.com/Tquillaa/Kraje-JavaFX/assets/72698285/975fd90a-bf92-42c8-beda-12dc942f8213">

# Wybór kontynentów

<img width="1212" alt="Select" src="https://github.com/Tquillaa/Kraje-JavaFX/assets/72698285/f96a8f08-45a9-4999-aa50-27abd2b133f8">

# Widok wybranych państw
Można w tym widoku zauważyć, że zaimplementowana jest obsługa nie tylko nazw państw, ale także dwuznakowe kody państw. A w przypadku krajów, które posiadają więcej niż jedną nazwę bądź używa się skrótów np. USA lub ZEA skróty te także są poprawne.

<img width="1212" alt="Selected" src="https://github.com/Tquillaa/Kraje-JavaFX/assets/72698285/cfe91def-80c9-4263-beac-3670a6811863">


# Okno podczas rozgrywki
- kraje na czerwono to kraje które są jeszcze do wprowadzenia
- kraje na zielono to kraje już wpisane
- kraje na czarno to kraje nie biorące udział w rozgrywce

<img width="1212" alt="Game" src="https://github.com/Tquillaa/Kraje-JavaFX/assets/72698285/23143278-4e6e-40d1-a2e4-619eb70a0931">

# Widok po zakończeniu rozgrywki gdy twój wynik dostaje się do rankingu

<img width="1212" alt="End" src="https://github.com/Tquillaa/Kraje-JavaFX/assets/72698285/e982e639-735e-41a5-bb9a-b5289902ec81">

# Widok tabeli Top10

<img width="1212" alt="Top10" src="https://github.com/Tquillaa/Kraje-JavaFX/assets/72698285/6bff0dd1-69a9-4308-a7a4-c3ddf0595286">
