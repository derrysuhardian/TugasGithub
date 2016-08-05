import java.util.Scanner;

class Handphone
{
//deklarasi

private String merk, tipe, warna ;
private double harga  ;

	
public static void main (String[]args)
{

	s
	
//sentter
	public void setMerk(String merk)
	{
		this.merk=merk;
	}
	public setTipe(String tipe)
	{
		this.tipe=tipe;
	}
	public setWarna(String warna)
	{
		this.warna=color;
	}
	public setHarga(double harga)
	{
		this.harga=harga;
	}

	//getter
	
	public String getMerk()
	{
		return merk;
	}
	public String getTipe()
	{
		return tipe;
	}
	public String getWarna()
	{
		return warna;
	}
	public double getharga()
	{
		return harga;
	}

//method tambahan

public double HargaDiskon()
{
	double diskon = 0.1 * getHarga();
	double total = getHarga() - diskon;

	return total;
}
public void keterangan()
{
	System.out.println ("Harga Hp sesudah didiskon (10%) = Rp " +HargaDiskon());
	
	