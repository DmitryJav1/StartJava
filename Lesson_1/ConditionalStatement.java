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
		boolean id = age % 2 == 20 % 2;
		 if(id == false) {
			System.out.println("Вы - взрослый граджанин");
		}

		int gender = 1;
		boolean id1 = gender % 2 == 1 % 2;
		 if(id1 == true) {
			System.out.println("Вы - мужчина");
		}

		double height = 1.75;
		boolean id2 = height % 2 == 1.80 % 2;
		 if(id2 == false) {
			System.out.println("Рост является другим");
		}

		char letter = 'И';
		boolean id3 = letter == 'М';
		 if(id3 == true) {
			System.out.println("Вы - Максим");
		} else if(id3 == false) {
			System.out.println("Вы - Илья");
		}

		System.out.println(age + " лет");
		System.out.println("Пол - мужской");
		System.out.println(height + " м");
		System.out.println("Илья");

	}
}

	



