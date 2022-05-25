import org.t2abs.BankInfo;
import org.t2inter.JillaBank;

public class AllInfo extends BankInfo implements JillaBank {

	@Override
	public void current() {
		this.savings();
System.out.println("Current % is:10"); 		
	}

	@Override
	public void savings() {
		this.deposits();
System.out.println("savings % is:11");		
	}

	@Override
	public void deposits() {
		this.fixed();
System.out.println("deposits % is:12");		
	}

	@Override
	public void fixed() {
		this.recuring();
System.out.println("fixed %is:13");		
	}

	@Override
	public void recuring() {
System.out.println("recuring % is: 14");		
	}
	public static void main(String[] args) {
		AllInfo a=new AllInfo();
		a.current();
	}

	
}
