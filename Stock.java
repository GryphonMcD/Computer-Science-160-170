package compSciProject9;

public class Stock {
	
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentClosingPrice;
	
	/*public void setSymbol(String symbol) {
		String validSymbol = symbol.toLowerCase();
		if (validSymbol.equals("orcl")) {
			this.symbol = symbol;
		}
		else {
			this.symbol = "Unknown symbol";
		}
	}
	public void setName(String name) {
		String validName = name.toLowerCase();
		if(validName.equals("oracle corporation")) {
			this.name = name;
		}
		else {
			this.name = "Unkown name";
		}
	}
	public void setPreviousClosingPrice(int previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}
	public void setCurrentClosingPrice(int currentClosingPrice) {
		this.currentClosingPrice = currentClosingPrice;
	}*/
	
	public Stock(String symbol, String name, double previousClosingPrice, double currentClosingPrice) {
		String validSymbol = symbol.toLowerCase();
		String validName = name.toLowerCase();
		this.previousClosingPrice = previousClosingPrice;
		this.currentClosingPrice = currentClosingPrice;
		this.symbol = symbol;
		this.name = name;
		
		/*if(validSymbol.equals("orcl")) {
			this.symbol = symbol;
		}
		else {
			this.symbol = "Unknown symbol";
		}
		if(validName.equals("oracle corporation")) {
			this.name = name;
		}
		else {
			this.name = "Unkown name";
		}*/
		
	}
	
	public double getChangePercent() {
		
		double decimalPercentChanged = this.currentClosingPrice / this.previousClosingPrice;
		double percentChanged = decimalPercentChanged;
		
		if(this.previousClosingPrice > this.currentClosingPrice) {
			percentChanged = (decimalPercentChanged - 1) * 100;
		}
		else {
			percentChanged = (1 - decimalPercentChanged) * 100;
		}
		
		return percentChanged;
	}


}
