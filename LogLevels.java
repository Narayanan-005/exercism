public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.split(":")[1].trim();
    }

    public static String logLevel(String logLine) {
        String s=logLine.split(":")[0].trim();
        return s.substring(1,s.length()-1).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine)+" ("+logLevel(logLine)+")";
    }
}
