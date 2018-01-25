package bank.importer;
import java.io.IOException;
import bank.helper.NasabahFileImporter;

public class DemoBacaFile{
	public static void main(String[] x) throws IOException {
		NasabahFileImporter satu = new NasabahFileImporter("tesa.csv");
		satu.prosesi();
	}
}
