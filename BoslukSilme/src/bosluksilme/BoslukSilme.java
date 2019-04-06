
package bosluksilme;


public class BoslukSilme {
static String naamklant="";
    public BoslukSilme() {}

  public void removeLineFromFile(String file, String lineToRemove) {

    try {

      File inFile = new File(file);

      if (!inFile.isFile()) {
        System.out.println("Parameter is not an existing file");
        return;
      }

      //Maak een nieuw bestand dat later het originele bestand wordt
      File tempFile = new File(inFile.getAbsolutePath() + ".tmp");

      BufferedReader br = new BufferedReader(new FileReader(file));
      PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

      String line = null;

      //Lees het originele bestand en schrijf naar het tijdelijke bestand 
      //Als de lijn == de lijn die we zoeken schrijven we dit niet over
      while ((line = br.readLine()) != null) {

        if (!line.trim().equals(lineToRemove)) {

          pw.println(line);
          pw.flush();
        }
      }
      pw.close();
      br.close();

      //Verwijder het originele bestand
      if (!inFile.delete()) {
        System.out.println("Could not delete file");
        return;
      } 

      //Hernoem het tijdelijke bestand naar het originele
      if (!tempFile.renameTo(inFile))
        System.out.println("Could not rename file");

    }
    catch (FileNotFoundException ex) {
      ex.printStackTrace();
    }
    catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  public static void main(String[] args) {
    BoslukSilme util = new BoslukSilme();
    SimpleInOutDialog  input = new SimpleInOutDialog("Reserveringen");
    naamklant = input.readString("Geef de volledige naam in");
    util.removeLineFromFile("L:\\Documents/Informatica/6de jaar/GIP/Reserveringen.txt", naamklant);
  }
}