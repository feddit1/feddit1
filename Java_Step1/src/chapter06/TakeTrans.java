package chapter06;

public class TakeTrans {

	public static void main(String[] args) {

		// 학생 2명 생성(studentJames, studentTom)

		StdInfo studentJames = new StdInfo("James", 200000);
		StdInfo studentTom = new StdInfo("Tom", 140000);

		// 버스타기(100)
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		// studentJames info
		studentJames.showinfo();
		bus100.showinfo();
		System.out.println("------------------");
		
		Bus bus150 = new Bus(150);
		studentTom.takeBus(bus100);

		studentTom.showinfo();
		bus100.showinfo();
		System.out.println("------------------");
		
		Subway subway8 = new Subway("8호선");
		studentJames.takeSubway(subway8);
		
		studentJames.showinfo();
		subway8.showinfo();
		System.out.println("------------------");
		
		Subway subway5 = new Subway("5호선");
		studentTom.takeSubway(subway5);
		
		studentTom.showinfo();
		subway5.showinfo();
	}

}
