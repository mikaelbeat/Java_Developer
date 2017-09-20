package newFeatures;

import java.util.StringJoiner;

public class Classes {

	public static void main(String[] args) {

		String[] names = { "Cat", "Dog", "Snake" };

		StringJoiner sj = new StringJoiner(",","{","}");
		for (String name : names) {
			sj.add(name);
		}
		System.out.println(sj);
	}

}
