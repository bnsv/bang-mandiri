package bank.nasabah;

public class Nasabah {
	public static Integer jumlahNasabah = 0;
	private String nama;
	private String nomor;
	private String email;

	public Nasabah(String nama){
		this.nama = nama;
		this.jumlahNasabah += 1;
	}

	public static void  tampilkanJumlahNasabah(){
		System.out.println("Jumlah nasabah: " + jumlahNasabah);
	}

	public String getNama(){
		return this.nama;
	}
	public String getNomor(){
		return this.nomor;
	}
	public String getEmail(){
		return this.email;
	}
	public void setNama(String nama){ 
		this.nama = nama;
	}
	public void setNomor(String nomor){
		this.nomor = nomor;
	}
	public void setEmail(String email){
		this.email = email;
	}













}
