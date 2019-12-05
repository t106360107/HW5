
public class test_p44 {

	public static void main(String[] args) {
		Car car1 = new Car("1號車");
		car1.start();
		for(int i =0; i<5; i++) {
			System.out.println("正在運行main()的處理工作");
		}
	}
}

class Car extends Thread{
	private String name;
	public Car(String nm) {
		name = nm;
	}
	public void run() {
		for(int i=0; i< 5; i++) {
			System.out.println("正在運行"+name+"的處理工作");
		}
	}
}