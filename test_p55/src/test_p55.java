
public class test_p55 {

	public static void main(String[] args) {
		Company cmp = new Company();
		Driver dr1 = new Driver(cmp);
		dr1.start();
		Driver dr2 = new Driver(cmp);
		dr2.start();
	}

}
