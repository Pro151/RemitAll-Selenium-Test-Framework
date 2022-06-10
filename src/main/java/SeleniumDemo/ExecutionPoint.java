package SeleniumDemo;

public class ExecutionPoint {
	
	public static void main(String[] args) {
		ExecutionPoint ex=new ExecutionPoint();
		ex.accessRoleAuto();
	}
	
	public void currencyEnable() {
		ConfigFileLogin cs=new CurrencyEnable();
		((CurrencyEnable) cs).helper();
	}

	public void countryEnable() {
		ConfigFileLogin cs=new CountryEnable();
		((CountryEnable) cs).helper();
	}

	public void traversingFromDashboard(){

		ConfigFileLogin tr = new TraversingFromDashboard();
		((TraversingFromDashboard) tr).helper1();
	}

	public void accessRoleAuto(){

		ConfigFileLogin ar = new AccessRoleAuto();
		try {
			((AccessRoleAuto) ar).accessRole();
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
