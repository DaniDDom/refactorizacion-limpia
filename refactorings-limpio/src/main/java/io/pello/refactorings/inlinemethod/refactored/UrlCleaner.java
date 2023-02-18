package io.pello.refactorings.inlinemethod.refactored;

import java.util.Locale;

/**
 * Inline Method refactoring playground This class is intended to be used as a
 * refactoring playground
 * 
 * @author PELLO_ALTADILL
 */
public class UrlCleaner {

	public String clean(String title) {
		String url = title.trim();

		url = url.replaceAll("[\\.\\:\\,\\?\\!\\_\\;]", "");
		url = url.replaceAll("[\\s]+", " ").replaceAll("[\\s]", "-");
		url = url.toLowerCase(Locale.getDefault());

		return url;
	}

}

