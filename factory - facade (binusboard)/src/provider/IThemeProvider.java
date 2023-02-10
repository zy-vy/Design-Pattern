package provider;

import java.util.List;

import model.Theme;
import model.User;

public interface IThemeProvider {
	
	Theme getTheme(String name);
	Theme getTheme(String name, User u) ;
	List<Theme> getListTheme ();

}
