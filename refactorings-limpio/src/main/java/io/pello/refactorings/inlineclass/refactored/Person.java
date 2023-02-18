package io.pello.refactorings.inlineclass.refactored;

import java.util.Date;

/**
 * Inline class
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
 */
public class Person {
	private String name;
	private Date birth;
	private Object sex;
	
	public Person(String name, Date birth, int sexCode) {
		this.name = name;
		this.birth = birth;
		final int sex1 = sexCode;
		this.sex = new Object() {
			public static final int MALE = 0;
			public static final int FEMALE = 1;
			private int sex = sex1;

			public int getSex () {
				return sex;
			}

			@Override
			public String toString() {
				return Integer.toString(sex);
			}
		};
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Object getSex() {
		return sex;
	}

	public void setSex(Object sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + "]";
	}

}
