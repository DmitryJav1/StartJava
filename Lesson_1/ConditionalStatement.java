public class ConditionalStatement {
	public static void main(String[] args) {

		// TODO: идентифицировать человека

		/*
		Возраст - 26 лет
		Пол - мужской
		Рост - 1.75 м
		Первая буква имени - 'И'
		*/

		int age = 26;
		if(age > 20) {
			System.out.println("Вы - взрослый граджанин");
		}

		int gender = 1;
		if(gender == 1) {
			System.out.println("Вы - мужчина");
		}

		double height = 1.75;
		if(height < 1.80) {
			System.out.println("Рост является другим");
		}

		char letter = 'И';
		if(letter == 'И') {
			System.out.println("Вы - Максим");
		} else if(letter == 'М') {
			System.out.println("Вы - Илья");
		}

		System.out.println(age + " лет");
		System.out.println("Пол - мужской");
		System.out.println(height + "м");
		System.out.println("Илья");
	}
}

	



