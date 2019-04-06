
package deserializeexample;

import java.io.Serializable;


public class Ogrenci implements Serializable {

	private int ogrNo;
	private String isim;

	public Ogrenci(int ogrNo, String isim) {
		this.ogrNo = ogrNo;
		this.isim = isim;
	}

	public int getOgrNo() {
		return ogrNo;
	}

	public String getIsim() {
		return isim;
	}
}