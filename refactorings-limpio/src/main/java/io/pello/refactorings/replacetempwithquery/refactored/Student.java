package io.pello.refactorings.replacetempwithquery.refactored;

/**
 * Replace temp with query refactoring playground This class is intended to be
 * used as a refactoring playground
 *
 * @author PELLO_ALTADILL
 */
public class Student {

    private String name;
    private boolean hasGoodAttitude;

    public Student(String name, boolean hasGoodAttitude) {
        this.name = name;
        this.hasGoodAttitude = hasGoodAttitude;
    }

    public float calculateAverage(float homework, float exam) {

        if (hasGoodAttitude) {
            return mark(homework, exam) + 1;
        } else {
            return mark(homework, exam);
        }
    }

    private float mark(float homework, float exam) {
        return (homework + exam) / 2;
    }
}
