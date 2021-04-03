package com.acis.automation.utilities;

import java.io.IOException;
import java.util.Locale;

public class OSInfo {

    public enum OS {
        WINDOWS,
        UNIX,
        POSIX_UNIX,
        MAC,
        OTHER;

        private String version;

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }
    }

    private static OS os = OS.OTHER;

    static {
        try {
            String osName = System.getProperty("os.name");
            if (osName == null) {
                throw new IOException("os.name not found");
            }
            osName = osName.toLowerCase(Locale.ENGLISH);
            if (osName.contains("windows")) {
                os = OS.WINDOWS;
            } else if (osName.contains("linux")
                    || osName.contains("mpe/ix")
                    || osName.contains("freebsd")
                    || osName.contains("irix")
                    || osName.contains("digital unix")
                    || osName.contains("unix")) {
                os = OS.UNIX;
            } else if (osName.contains("mac os")) {
                os = OS.MAC;
            } else if (osName.contains("sun os")
                    || osName.contains("sunos")
                    || osName.contains("solaris")) {
                os = OS.POSIX_UNIX;
            } else if (osName.contains("hp-ux") 
                    || osName.contains("aix")) {
                os = OS.POSIX_UNIX;
            } else {
                os = OS.OTHER;
            }

        } catch (Exception ex) {
            os = OS.OTHER;
        } finally {
            os.setVersion(System.getProperty("os.version"));
        }
    }

    public static OS getOs() {
        return os;
    }
    
	
    
    /**
	 * This method is used to return get File Separator based on 
	 * 
	 * @throws AcisException

	 */
	public static String getFileSeparator() {
		String File_Seperator=null;

		OSInfo.getOs();
	       
		if(OSInfo.getOs().equals(OS.WINDOWS))
	        {
	        	File_Seperator = "\\";
	        }
		
	       
		if(OSInfo.getOs().equals(OS.UNIX) || OSInfo.getOs().equals(OS.MAC))
		        {
		        	File_Seperator = "/";
		        }
			return File_Seperator;
			
		}

	
	
    
     
}