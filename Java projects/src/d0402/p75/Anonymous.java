package d0402.p75;

public class Anonymous {
	Person field = new Person() {
		void work() {
			System.out.println("����մϴ�.");
		}

		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
		}
	};
	
		void method1() {
			Person localVar = new Person() {
			void walk() {
				System.out.println("��å�մϴ�.");
			}

			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
			}
		};
		localVar.wake();
	}

	void method2(Person person) {
		person.wake();
	}
}
