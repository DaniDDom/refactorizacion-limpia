package io.pello.refactorings.substitutealgorithm.refactored;

/**
 * Substitue Algorithm This class is intended to be used as a refactoring
 * playground
 *
 * @author PELLO_ALTADILL
 */
public class Order {

    public float applyVAT(int vatType) {
        float result[] = {-1, 1.04f, 1.18f, 1.21f};
        if (vatType > 0 && vatType < result.length) {
            return result[vatType];
        }
        return -1;
    }
}
