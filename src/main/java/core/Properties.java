package core;

public class Properties {
    public static Browsers BROWSER = Browsers.CHROME;

    public static ExecMode EXEC_MODE = ExecMode.LOCAL;

    public enum Browsers {
        CHROME,
        FIREFOX
    }

    public enum ExecMode {
        LOCAL,
        GRID
    }
}
