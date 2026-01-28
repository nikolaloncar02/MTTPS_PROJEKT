# GymBeam Automation Project

Automatski testovi za web stranicu [GymBeam](https://gymbeam.hr) koristeći **Selenium WebDriver**, **TestNG** i **ExtentReports**. Projekt implementira **Page Object Model (POM)** za lakše održavanje testova i čitljiviji kod.

---

##  Sadržaj projekta
```
src/
├── main/
│   └── java/
│       └── org/example/
│           └── Main.java              # Osnovni main, može se ignorirati
└── test/
    └── java/
        ├── base/
        │   └── BaseTest.java          # Osnovna klasa za testove
        ├── pages/
        │   └── HomePage.java          # Page Object za početnu stranicu
        └── tests/
            └── HomeTests.java         # TestNG testovi
pom.xml                                # Maven konfiguracija
testng.xml                             # TestNG suite konfiguracija
.gitignore                             # Ignorirane datoteke i folderi
```

---

##  Korištene tehnologije

- **Java 23** – programski jezik
- **Maven** – upravljanje projektom i ovisnostima
- **Selenium WebDriver** – web automatizacija
- **TestNG** – framework za strukturiranje testova
- **ExtentReports** – generiranje vizualnih test izvještaja
- **WebDriverManager** – automatsko preuzimanje i konfiguracija drivera
- **Page Object Model (POM)** – arhitekturni pattern za organizaciju testova

---

##  Instalacija i pokretanje

### 1. Kloniraj repozitorij
```bash
git clone https://github.com/nikolaloncar02/MTTPS_PROJEKT.git
cd MTTPS_PROJEKT
```

### 2. Provjeri instalaciju Java 23 i Mavena
```bash
java -version
mvn -version
```

### 3. Pokreni testove
```bash
mvn clean test
```

### 4. Pregledaj izvještaj

Nakon pokretanja testova, ExtentReports izvještaj će se generirati na:
```
test-output/ExtentReport.html
```

---

##  Testovi uključeni u projekt

| Test | Opis |
|------|------|
| `testKontaktLink()` | Provjerava da link "Kontakt" vodi na ispravnu stranicu |
| `testDostavaLink()` | Provjerava da link "Dostava i plaćanje" radi ispravno |
| `testPageTitle()` | Provjerava da naslov stranice sadrži "GymBeam" |
| `testPrikaziFiltere()` | Provjerava da se filteri na stranici "Proteini" mogu prikazati |
| `testCategoriesVisible()` | Provjerava vidljivost kategorija: Hrana, Proteini, Odjeća, Top ponude |

---



