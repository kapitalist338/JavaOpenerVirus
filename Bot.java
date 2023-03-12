public class Bot {
    public static void main(String[] args) {
        Powershell powershell = new Powershell();
        Settings settings = new Settings();
        First first = new First();
        Close close = new Close();
        Sw sw = new Sw();
        delay();
        Comp comp = new Comp();
        delay();
        powershell.start();
        delay();
        settings.start();
        delay();
        close.start();
        delay();
        sw.start();
        delay();
        comp.start();
        delay();
        first.start();
        delay();
    }

    private static void delay(){
        try{
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

//
