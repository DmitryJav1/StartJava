public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 26;
		if(age > 20) {
			System.out.println("Вы - взрослый граджанин");
		}

		int gender = 1;
		if(gender == 1) {
			System.out.println("Вы - мужчина");
		}

		if(gender == 0){
			System.out.println("Вы - женщина");	
		}

		double height = 1.75;
		if(height < 1.80) {
			System.out.println("Вы - низкий");
		} else if(height > 1.80){
			System.out.println("Вы - высокий");
		}

		char firstNameLetter = 'И';
		if(firstNameLetter == 'И') {
			System.out.println("Вы - Илья");
		} else if(firstNameLetter == 'М') {
			System.out.println("Вы - Максим");
		} else{
			System.out.println("Ваше имя отсутствует в списке");
		}

		System.out.println(age + " лет");
		System.out.println("Пол - мужской");
		System.out.println(height + "м");
		System.out.println("Илья");
	}
}

	



