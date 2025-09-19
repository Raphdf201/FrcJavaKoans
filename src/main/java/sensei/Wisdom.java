package sensei;

import java.util.List;

import engine.Koan;

/**
 * All the widom of the master, materialized in the series of all available koans.
 */
public final class Wisdom {
    public static final List<List<Koan>> koans = List.of(
        AboutConsoleAndVariablesKoans.koans,
        AboutDecimalNumbersKoans.koans,
        AboutConditionsKoans.koans,
        AboutLoopsKoans.koans,
        AboutMethodsKoans.koans,
        AboutMoreMethodsKoans.koans,
        AboutClassesKoans.koans,
        AboutObjectsKoans.koans,
        AboutNot7GameKoans.koans        
    );
}
