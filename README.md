# java-oop-exam-arithmetic-equation-check
Java OOP exam task (FernUniversität in Hagen, 2025) – checks how many assignments of digits 0–9 satisfy the equation AB + CD = EF + GH. Includes a brute-force and an optimized solution. Result: 666,700 valid combinations.

# OOP2025 – Task 2: Arithmetic (FernUniversität in Hagen)

This repository contains my **Java solution** for the arithmetic task from the *Object-Oriented Programming (OOP)* course (**Course 63016**) at **FernUniversität in Hagen**.

The goal was to determine how many digit assignments (A–H ∈ {0–9}) satisfy the equation  
**AB + CD = EF + GH**,  
where each pair of letters represents a two-digit number.  

The result of my program is **666,700 valid combinations**, which matches the official evaluation.

---

# Task Screenshot
![OOP Arithmetic Task](OOP2025%20-%20task%202%20-%20Arithmetik/OOP2025%20-%20task2%20-%20Arithmetik.png "OOP2025 – Task 2 – Arithmetik (FernUniversität in Hagen)")

> *This screenshot shows the original arithmetic programming task from the FernUniversität in Hagen (Course 63016).*  
> The task belongs to **FernUniversität in Hagen** and is included here only for **educational and illustrative purposes**.  
> The **Java solution** in this repository was written by **Michael Kain** and received *full marks for the programming part*.

---

# Evaluation Screenshot
![OOP Evaluation Screenshot](OOP2025%20-%20task%202%20-%20Arithmetik/OOP2025%20-%20task%201-5%20-%20Evaluation%20%26%20Score.png "OOP2025 – Evaluation (FernUniversität in Hagen)")

> *Official evaluation sheet from FernUniversität in Hagen.*  
> I achieved **full points for the programming section**, confirming that the code and logic were correct.  
> Displayed here only for transparency and educational documentation.

---

#Java Implementation

```java
/**
 * FernUniversität in Hagen – OOP2025 Task 2: Arithmetic
 * Solution written by Michael Kain
 * Received full marks for the programming part
 */

public class GleichungPruefen {

    public static void main(String[] args) {
        int gueltigeBelegungen = 0;

        // Iterate over all combinations of A..H (each from 0 to 9)
        for (int A = 0; A <= 9; A++)
            for (int B = 0; B <= 9; B++)
                for (int C = 0; C <= 9; C++)
                    for (int D = 0; D <= 9; D++)
                        for (int E = 0; E <= 9; E++)
                            for (int F = 0; F <= 9; F++)
                                for (int G = 0; G <= 9; G++)
                                    for (int H = 0; H <= 9; H++) {
                                        int ab = 10 * A + B;
                                        int cd = 10 * C + D;
                                        int ef = 10 * E + F;
                                        int gh = 10 * G + H;

                                        if (ab + cd == ef + gh)
                                            gueltigeBelegungen++;
                                    }

        // Output total valid assignments
        System.out.println("Anzahl gültiger Belegungen: " + gueltigeBelegungen);
    }
}
