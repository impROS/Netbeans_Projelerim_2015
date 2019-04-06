package binarysearch;

public class BinarySearch {

    public static void main(String[] args) {
int[] arrSirali = {1,2,3,4,5};
        System.out.println(binarySearch(arrSirali, 1, 5, 7));    
    }

    public static int binarySearch(int[] a, int sol, int sag, Comparable aranan) {
        int t = sol, r = sag;
        while (sol <= sag) {
            int ort = (sol + sag) / 2;
            int comp = aranan.compareTo(a[ort]);
            if (comp == 0) {
                return ort; // aranan bulundu , r e turn index.
            } else if (comp < 0) {
                sag = ort - 1;
            } else {
                sol = ort + 1;
            }
        }
        return -1; // aranan bulunamadı
    }

}
