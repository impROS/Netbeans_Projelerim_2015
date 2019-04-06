package deneveriyolla;
public class VeriYolla2 {
public String mesaj;
public int veriYazdir()
{
int say;
System.out.println("Gelen mesaj:"+this.mesaj);//System.out.println("Gelen mesaj:"+mesaj); ' den farkı ne ?
say = mesaj.length();
return say;   
}
}
