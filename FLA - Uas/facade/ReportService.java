package facade;

public class ReportService {
	
	public String data;

	public ReportService() {
		// TODO Auto-generated constructor stub
	}

	public ReportService(String data) {
		super();
		this.data = data;
	}
	
	public String generatePDF() {
		return data+".pdf";
	}

}
