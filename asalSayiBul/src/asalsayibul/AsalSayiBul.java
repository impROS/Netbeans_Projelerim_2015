package asalsayibul;

public class AsalSayiBul {

    public static void main(String[] args) {
        asalYazdir sifir_YirmiBesMilyar = new asalYazdir(0, 100000);
        asalYazdir YirmiBesMilyar_ElliMilyar = new asalYazdir(0, 100000);
        asalYazdir ElliMilyar_YetmisBesMilyar = new asalYazdir(0, 100000);
        asalYazdir YetmisBesMilyar_YuzMilyar = new asalYazdir(0, 100000);
        
        sifir_YirmiBesMilyar.start();
        YirmiBesMilyar_ElliMilyar.start();
        ElliMilyar_YetmisBesMilyar.start();
        YetmisBesMilyar_YuzMilyar.start();
    }

}
