public class Variable {	
	public static void main(String[] args) {
		// TODO: показать параметры компьютера

	 	/*
	 	Intel(R) Core(TM) i7 - 3770K CPU @ 3.50 GHz 3.50 GHz - процессор
	 	16.0 ГБ - ОЗУ
	 	x64 - тип системы
	 	110 ГБ - размер локального диска(C:)
	 	931 ГБ - размер локального диска(F:)
	 	Windows 10 - ОС
	 	W - 1-ая буква названия OC
	 	*/

	 	boolean isWindows = true;
	 	char osLetter = 'W';
	 	float ram = 16;
	 	double processor_ghz = 3.5;
	 	byte osVersion = 10;
	 	short systemType = 64;
	 	long i7 = 3770;

	 	System.out.println(isWindows);
	 	System.out.println(osLetter);
	 	System.out.println(ram);
	 	System.out.println(processor_ghz);
	 	System.out.println(osVersion);
	 	System.out.println(systemType);
	 	System.out.println(i7);
     	}
	}
