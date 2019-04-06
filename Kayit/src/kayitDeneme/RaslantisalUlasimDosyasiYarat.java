package kayitDeneme;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import kayitDeneme.Kayit;
public class RaslantisalUlasimDosyasiYarat
{
private Kayit hesapDosyasi;
private RandomAccessFile girdi;
public RaslantisalUlasimDosyasiYarat()
{
hesapDosyasi = new Kayit();
try{
girdi = new RandomAccessFile("musteri1.dat","rw");
for(int i=0;i<100;i++)
{ hesapDosyasi.yaz(girdi); }
} catch(IOException e)
{
System.err.println("Dosya acma hatasi\n"+e.toString());
System.exit(1);
}
}
public static void main(String args[])
{
RaslantisalUlasimDosyasiYarat H=
new RaslantisalUlasimDosyasiYarat();
}
}