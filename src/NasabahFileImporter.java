package bank.helper;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import bank.nasabah.Nasabah;


public class NasabahFileImporter{
	private File masukan;
	private BufferedReader penyangga;

	public NasabahFileImporter(String namaBerkas){
		masukan = new File(namaBerkas);
	}

	private void bukaBerkas() throws FileNotFoundException {
		if(!masukan.exists()) {
			throw new FileNotFoundException("N/A");
		}
		penyangga = new BufferedReader(new FileReader(masukan));
	}
	
	private void tutupBerkas() throws IOException {
		if (penyangga != null){
		penyangga.close();
		}	
	}

	public List<Nasabah> prosesi() throws IOException {
		bukaBerkas();

		String isi =penyangga.readLine();
		System.out.println("Atasan: " + isi);

		while(isi != null){
			isi = penyangga.readLine();
			System.out.println("Datanya" + isi);
		}
	
		tutupBerkas();
		return null;

	}
}
