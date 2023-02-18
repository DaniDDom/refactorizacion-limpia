package io.pello.refactorings.extractmethod.refactored;

import java.util.Locale;

/**
 * Extract Method refactoring This class is intended to be used as a refactoring
 * playground
 *
 * @author PELLO_ALTADILL
 */
public class UrlNormalizer {

    public String normalize(String title) {
        String url = "";
        url = modifyUrl(title);
        return url;
    }

    private static String modifyUrl(String title) {
        String url;
        url = title.trim();
        url = removeSpecialChars(url);
        url = replacedSpaces(url);
        url = url.toLowerCase(Locale.getDefault());
        return url;
    }

    private static String replacedSpaces(String url) {
        String spacesReplaced = "";
        for (int i = 0; i < url.length(); i++) {
            if (url.charAt(i) == ' ') {
                spacesReplaced += "-";
            } else {
                spacesReplaced += url.charAt(i);
            }
        }
        return spacesReplaced;
    }

    private static String removeSpecialChars(String url) {
        String specialRemoved = "";
        for (int i = 0; i < url.length(); i++) {
            if (url.charAt(i) != ',' && url.charAt(i) != ':'
                    && url.charAt(i) != '.' && url.charAt(i) != '?') {
                specialRemoved += url.charAt(i);
            }
        }
        return specialRemoved;
    }
}

