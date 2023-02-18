package io.pello.refactorings.removecontrolflag.refactored;

/**
 * Remove Control Flag This class is intended to be used as a refactoring
 * playground
 *
 * @author PELLO_ALTADILL
 */
public class Friends {

    private String[] friends;

    public Friends(String[] friends) {
        this.friends = friends;
    }

    public int indexOf(String friend) {
        for (int i = 0; i < friends.length; i++) {
            if (friends[i].equals(friend)) {
                return i;
            }
        }
        return -1;
    }
}
