import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.ArrayList;
import java.applet.Applet;

public class MacAddressApplet extends Applet
{
    public static String sep = ":";
    public static String format = "%02X";


    public static String macToString( NetworkInterface ni ) throws SocketException
    {
        return macToString( ni, MacAddressApplet.sep,  MacAddressApplet.format );
    }


    public static String macToString( NetworkInterface ni, String separator, String format ) throws SocketException
    {
        byte mac [] = ni.getHardwareAddress();

        if( mac != null ) {
            StringBuffer macAddress = new StringBuffer( "" );
            String sep = "";
            for( byte o : mac ) {
                macAddress.append( sep ).append( String.format( format, o ) );
                sep = separator;
            }
            return macAddress.toString();
        }

        return null;
    }


    public static String getMacAddress()
    {
        try {
            Enumeration<NetworkInterface> nis = NetworkInterface.getNetworkInterfaces();


            while( nis.hasMoreElements() ) {
                String mac = macToString( nis.nextElement() );
                if( mac != null )
                    return mac;
            }
        } catch( SocketException ex ) {
            System.err.println( "SocketException:: " + ex.getMessage() );
            ex.printStackTrace();
        } catch( Exception ex ) {
            System.err.println( "Exception:: " + ex.getMessage() );
            ex.printStackTrace();
        }

        return "undefined";
    }


    public static String getMacAddressesJSON()
    {
        try {
            String macs [] = getMacAddresses();

            String sep = "";
            StringBuffer macArray = new StringBuffer( "['" );
            for( String mac: macs ) {
                macArray.append( sep ).append( mac );
                sep = "','";
            }
            macArray.append( "']" );

            return macArray.toString();
        } catch( Exception ex ) {
            System.err.println( "Exception:: " + ex.getMessage() );
            ex.printStackTrace();
        }

        return "[]";
    }


    public static String [] getMacAddresses()
    {
        try {
            Enumeration<NetworkInterface> nis = NetworkInterface.getNetworkInterfaces();

            ArrayList<String> macs = new ArrayList<String>();
            while( nis.hasMoreElements() ) {
                String mac = macToString( nis.nextElement() );
                if( mac != null ) {
                    macs.add( mac );
                }
            }
            return macs.toArray( new String[0] );
        } catch( SocketException ex ) {
            System.err.println( "SocketException:: " + ex.getMessage() );
            ex.printStackTrace();
        } catch( Exception ex ) {
            System.err.println( "Exception:: " + ex.getMessage() );
            ex.printStackTrace();
        }

        return new String[0];
    }

    public static void setSep( String sep )
    {
        try {
            MacAddressApplet.sep = sep;
        } catch( Exception ex ) {
       
        }
    }

    public static void setFormat( String format )
    {
        try {
            MacAddressApplet.format = format;
        } catch( Exception ex ) {
        }
    }

    public static void main( String... args )
    {
        System.err.println( " MacAddress = " + getMacAddress() );

        setSep( "-" );
        String macs [] = getMacAddresses();

        for( String mac : macs )
            System.out.println( " MacAddresses = " + mac );

        setSep( ":" );
        System.err.println( " MacAddresses JSON = " + getMacAddressesJSON() );
    }
}  