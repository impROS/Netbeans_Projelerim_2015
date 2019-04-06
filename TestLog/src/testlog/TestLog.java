/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testlog;

import java.util.logging.*;
import java.io.*;
public class TestLog {
public static Logger logger;
static {
try {
boolean append = true;
FileHandler fh = new FileHandler("TestLog.log", append);
//fh.setFormatter(new XMLFormatter());
fh.setFormatter(new SimpleFormatter());
logger = Logger.getLogger("TestLog");
logger.addHandler(fh);
}
catch (IOException e) {
e.printStackTrace();
}
}
public static void main(String args[]) {
logger.severe("my severe message");
logger.warning("my warning message");
logger.info("my info message");
}
}