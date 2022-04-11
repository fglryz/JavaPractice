package Day38;

public class Browser {
    public void openBrowser(){
        System.out.println("Opening chrome browser");
    }
    public void closeBrowser(){
        System.out.println("closing chrome browser");
    }
    public class ChromeBrowser extends Browser{

        @Override
        public void openBrowser() {
            System.out.println("opening chrome browser");
        }

        @Override
        public void closeBrowser(){
            System.out.println("closing chrome browser");
        }


    }
    public class FireFox extends Browser{
        @Override
        public void openBrowser() {
            System.out.println("opening firefox browser");
        }

        @Override
        public void closeBrowser() {
            System.out.println("closing fire fox browser");
        }
    }
    public class Opera extends Browser{
        @Override
        public void openBrowser() {
            System.out.println("opening opera browser");
        }

        @Override
        public void closeBrowser() {
            System.out.println("closing opera browser");

        }
    }
    public class Safari extends Browser{
        @Override
        public void openBrowser() {
            System.out.println("opening safari browser");
        }

        @Override
        public void closeBrowser() {
            System.out.println("closing safari browser" );

        }
    }


}
/*
Browser Task:
1. Create a class named Browser:
Methods:
openBrowser(): prints "opening chrome
browser"
closeBrowser():  prints "closing chrome
browser.
2. Create the following sub classes of Browser and override the
methods if needed:
1. ChromeBrowser
methods:
openBrowser():
prints "opening chrome browser"
closeBrowser():
prints "closing chrome browser"
2. FireFox extends Browser
methods:
openBrowser():
prints "opening firefox browser"
closeBrowser():
prints "closing fire fox browser"
3. Opera extends Browser
methods:
openBrowser():
prints "opening opera browser"
closeBrowser():
prints "closing opera browser"
4. Safari extends Browser
methods:
openBrowser():
prints "opening safari browser"
closeBrowser():
prints "closing safari browser"*/

