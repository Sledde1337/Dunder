
public class PaymentSlip {
	private String name;
	private int hourlyRate;
	private int hours;
	private double flatTaxRate = 0.7;
	
	public PaymentSlip() {
		
	}
	public PaymentSlip(String name, int hourlyRate, int hours) {
		
	}
	public int calculateSalary(int hourlyRate, int hours) {
		return hourlyRate*hours;
	}
	public double calculateNetSalary(double hourlyRate, double hours) {
		return hourlyRate*hours*flatTaxRate;
	}
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHourlyRate() {
		return  hourlyRate;
	}
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public int getHours() {
		return hours;	
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public double getFlatTaxRate() {
		return flatTaxRate;
	}
	public void setFlatTaxRate(double flatTaxRate) {
		this.flatTaxRate = flatTaxRate;
	}

}
