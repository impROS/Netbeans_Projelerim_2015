
import java.io.Serializable;


public class Ogrenci implements Serializable {

	private int ogrNo;
	private int yas;
	private String isim;

	public Ogrenci(int ogrNo, String isim,int yas) {
		this.ogrNo = ogrNo;
		this.isim = isim;
                this.yas=yas;
	}

	public int getOgrNo() {
		return ogrNo;
	}

	public String getIsim() {
		return isim;
	}
        	public int getYas() {
		return yas;
	}
}