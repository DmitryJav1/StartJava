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
	 char OSfirstletter = 'W';
	 float RAM = 16;
	 double processorGHz = 3.5;
	 byte OSVersion = 10;
	 short System_type = 64;
	 long i7 = 3770;

	 System.out.println(isWindows);
	 System.out.println(OSfirstletter);
	 System.out.println(RAM);
	 System.out.println(processorGHz);
	 System.out.println(OSVersion);
	 System.out.println(System_type);
	 System.out.println(i7);

     }
}
