
package isletimsistemi;


public class İsletimSistemi {

    public static void main(String[] args) {
String operatingSystemName = System.getProperty("os.name")
.toLowerCase();
System.out.println(operatingSystemName);
if (operatingSystemName.contains("win")) {
System.out.println("Isletim Sisteminiz : Windows");
} else if (operatingSystemName.contains("mac")) {
System.out.println("Isletim Sisteminiz: Mac");
} else if (operatingSystemName.contains("sunos")) {
System.out.println("Isletim Siteminiz : Solaris");
} else if (operatingSystemName.contains("nix")
|| operatingSystemName.contains("nux")
|| operatingSystemName.contains("aix")) {
System.out.println("Isletim Siteminiz : Unix yada Linux");
} else {
System.out.println("Farkli bir isletim sistemi kullaniyorsunuz");
}
    }
    
}
