# Kurs tworzenie i testowanie aplikacji

Repozytorium zawiera materiały dydaktyczne, zadania powtórzeniowe
oraz analizy oficjalnych arkuszy CKE z egzaminu zawodowego **INF.04**.
Kurs jest dedykowany dla uczniów klas 5 technikum informatycznego.

## 🎯 Cel kursu

Przygotowanie uczniów do części praktycznej egzaminu zawodowego w kwalifikacji INF.04, ze szczególnym naciskiem na:

* Programowanie obiektowe i aplikacyjne (Java, Kotlin, aplikacje desktopowe i mobilne).
* Projektowanie, tworzenie i administrowanie bazami danych (SQL, JDBC).
* Pisanie testów jednostkowych oraz obsługę narzędzi budowania (Gradle, Maven).
* Praktyczne opanowanie systemu kontroli wersji Git.
* Analizę i rozwiązywanie problemów algorytmicznych z oficjalnych arkuszy CKE.

---

## 📚 Spis treści i archiwum arkuszy CKE

Materiały źródłowe, pliki do zadań oraz arkusze egzaminacyjne zostały podzielone chronologicznie:

### 1. Sesja: Styczeń 2026

* [Arkusze i pliki 2026-styczen](./arkusze/2026-styczen) – najnowsze zadania egzaminacyjne (w tym `zad1.7z`, `zad2.7z`).

### 2. Rok 2025

* [Czerwiec 2025](./arkusze/2025-czerwiec) – zadania z plikami roboczymi (`pliki4.zip`).
* [Styczeń 2025](./arkusze/2025-styczen) – zadania z plikami roboczymi (`pliki3.zip`, `pliki4.zip`).

### 3. Rok 2024

* [Czerwiec 2024](./arkusze/2024-czerwiec) – arkusze SG i SD wraz z paczkami `pliki1.zip` i `pliki2.zip`.
* [Styczeń 2024](./arkusze/2024-styczen) – arkusze oraz materiały pomocnicze (`materialy.7z`).

### 4. Rok 2023

* [Czerwiec 2023](./arkusze/2023-czerwiec) – pełen zestaw arkuszy (SG, SD) i kluczy punktowania (`materialy.zip`).
* [Styczeń 2023](./arkusze/2023-styczen) – zadania m.in. `INF.04-02-23.01-SG` (`zad2.zip`) oraz arkusze punktowane.

### 5. Rok 2022

* [Czerwiec 2022](./arkusze/2022-czerwiec) – arkusze, arkusze ocen (`_zo.xlsx`) oraz `zad1.zip`.
* [Styczeń 2022](./arkusze/2022-styczen) – arkusze egzaminacyjne i kryteria oceniania.

### 6. Rok 2021

* [Czerwiec 2021](./arkusze/2021-czerwiec) – inicjalne arkusze nowej formuły egzaminu.

### 7. Materiały pomocnicze

* [Informator](./arkusze/informator) – oficjalne wytyczne i `obrazy.zip`.

---

## 💻 Wykaz zadań egzaminacyjnych wg typu aplikacji

### Aplikacje desktopowe

* **[INF.04-01-23.01-SG](./arkusze/2023-styczen)** – *Dane pracownika i generowanie hasła*
  Aplikacja do zarządzania danymi pracowników z modułem losowania bezpiecznych haseł na podstawie zaznaczonych kryteriów.
* **[INF.04-01-23.06-SG](./arkusze/2023-czerwiec)** – *Obsługa poczty (nadaj przesyłkę)*
  Formularz wyboru rodzaju przesyłki (list, paczka) z dynamicznym obliczaniem i wyświetlaniem kosztu dostawy.
* **[INF.04-01-24.01-SG](./arkusze/2024-styczen)** – *Wprowadzanie danych do paszportu*
  Formularz pobierający dane osobowe, numer PESEL, kolor oczu oraz zdjęcie do wniosku paszportowego.
* **[INF.04-02-24.06-SG](./arkusze/2024-czerwiec)** – *Interfejs graficzny odtwarzacza muzyki*
  Grajka muzyczna z widokiem okładki, przyciskami sterowania (Play/Pause) oraz licznikiem odtworzeń.
* **[INF.04-01-25.06-SG](./arkusze/2025-czerwiec)** – *Wybór kolorów z palety RGB*
  Interfejs ze suwakami RGB pozwalający na dynamiczną zmianę koloru tła oraz podgląd wartości w kodzie szesnastkowym.
* **[INF.04-02-25.06-SG](./arkusze/2025-czerwiec)** – *Szyfr Cezara i zapis do pliku*
  Narzędzie tekstowe do szyfrowania i deszyfrowania wiadomości z opcją zapisu wyniku do pliku.

### Aplikacje webowe (front-end)

* **[INF.04-02-22.06-SG](./arkusze/2022-czerwiec)** – *Zapisy na kursy*
  Formularz rejestracyjny na szkolenia z listą rozwijaną i walidacją pól wejściowych.
* **[INF.04-03-23.06-SG](./arkusze/2023-czerwiec) / [INF.04-01-23.06-SD](./arkusze/2023-czerwiec)** – *Obsługa formularza*
  Komponenty interaktywne reagujące na zdarzenia formularza i walidujące wprowadzane dane.
* **[INF.04-01-25.01-SG](./arkusze/2025-styczen)** – *Kategoryzacja zdjęć w galerii*
  Galeria zdjęć z możliwością filtrowania po kategoriach i dynamicznym podglądem wybranego obrazu.

### Aplikacje mobilne

* **[INF.04-informator](./arkusze/informator)** – *Galeria zdjęć*
  Prosta przeglądarka zdjęć z możliwością przełączania slajdów i polubień.
* **[INF.04-01-21.06-SG](./arkusze/2021-czerwiec) / [INF.04-01-22.01-SG](./arkusze/2022-styczen)** – *Rejestracja konta*
  Formularz zakładdania konta z weryfikacją powtórzonego hasła i komunikatem sukcesu.
* **[INF.04-01-22.06-SG](./arkusze/2022-czerwiec)** – *Domek w górach*
  Ekran rezerwacji domku wypoczynkowego z polubieniami i licznikiem zgłoszeń.
* **[INF.04-02-23.01-SG](./arkusze/2023-styczen) / [INF.04-01-23.01-SD](./arkusze/2023-styczen)** – *Proste notatki tekstowe*
  Lista notatek z możliwością dodawania nowych wpisów i czyszczenia pól formularza.
* **[INF.04-02-23.06-SG](./arkusze/2023-czerwiec)** – *Właściwości czcionki*
  Aplikacja pozwalająca na dynamiczną zmianę rozmiaru, stylu i zawartości wyświetlanego tekstu.
* **[INF.04-02-24.01-SG](./arkusze/2024-styczen) / [INF.04-01-24.01-SD](./arkusze/2024-styczen) / [INF.04-01-24.06-SD](./arkusze/2024-czerwiec)** – *Wizyta u weterynarza*
  Formularz umawiania wizyt ze zwierzęciem (wybór gatunku, celu wizyty i suwak wieku).
* **[INF.04-01-24.06-SG](./arkusze/2024-czerwiec) / [INF.04-01-25.01-SD](./arkusze/2025-styczen)** – *Gra w kości*
  Symulator rzutu 5 kośćmi z podliczaniem zdobytych punktów zgodnie z regułami gry.
* **[INF.04-02-25.01-SG](./arkusze/2025-styczen) / [INF.04-01-25.06-SD](./arkusze/2025-czerwiec)** – *Urządzenia domowe*
  Panel do zarządzania stanem urządzeń Smart Home (włączanie/wyłączanie, zmiana parametrów).
* **[INF.04-01-26.01-SG](./arkusze/2026-styczen)** – *Gra w kości*
  Wariant symulatora gry w kości z resetowaniem wyniku i modyfikacją zasad punktacji.
* **[INF.04-02-26.01-SG](./arkusze/2026-styczen)** – *Quiz dotyczący gór*
  Aplikacja quizowa z pytaniami jednokrotnego wyboru i podsumowaniem wyników.

---

## 🛠️ Struktura techniczna projektu

Główne repozytorium bazowe zawiera szkielet projektu Gradle (`app/`, `gradle/`) skonfigurowany pod kątem nowoczesnych środowisk programistycznych (Java/Kotlin).

> **Uwaga:** Oficjalne rozwiązania poszczególnych zadań i projektów aplikacyjnych są publikowane w dedykowanych, osobnych repozytoriach lub podkatalogach roboczych, aby zachować przejrzystość kodu źródłowego dla poszczególnych roczników.

## 🚀 Wymagania wstępne

* Środowisko pracy zgodne z konfiguracją na egzamin  (Windows / Linux ).
* Narzędzia: Java (JDK w wersji 17/21+), Gradle, Git, IntelliJ IDEA / Android Studio .
