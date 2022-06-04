package Day45.BrowserTask;

public interface WebDriver {

     void get(String url);
    void close();
    void quit();
    void getTitle();


}
/*
2. Create a child interface of SearchContext named WebDriver
				Abstract methods (return-type is void):
					get(String url);
					close();
					quit();
					getTitle();
 */