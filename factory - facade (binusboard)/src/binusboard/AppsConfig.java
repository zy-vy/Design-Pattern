package binusboard;


import java.util.HashMap;
import java.util.Map;

import model.User;

public class AppsConfig {
	
//	public final List<String> listThemeConfig;
//	public final List<String> listThemeForGold;
//	public final List<String> listThemeForVip;
	
	private final Map<String, String[]> listThemeConfig;
	private final Map<String, Integer> listContentLength;
	

	public AppsConfig() {
//		this.listThemeForStandar = new ArrayList<>();
//		this.listThemeForGold = new ArrayList<>();
//		this.listThemeForVip = new ArrayList<>();
		
		this.listThemeConfig = new HashMap<String, String[]>();
		initTheme();
		
		this.listContentLength = new HashMap<>();
		initContentConfig();
		// TODO Auto-generated constructor stub
	}

	private void initTheme() {
//		listThemeForStandar.add("Serenity");
//		listThemeForStandar.add("Heroes");
//		listThemeForStandar.add("Party");
//		
//		listThemeForGold.add("Serenity");
//		listThemeForGold.add("Heroes");
//		listThemeForGold.add("Party");
//		listThemeForGold.add("Gold");
//		
//		listThemeForVip.add("Serenity");
//		listThemeForVip.add("Heroes");
//		listThemeForVip.add("Party");
//		listThemeForVip.add("VIP");
		
		listThemeConfig.put("Serenity",new String[] {"Standard","Gold","VIP"});
		listThemeConfig.put("Party",new String[] {"Standard","Gold","VIP"});
		listThemeConfig.put("Heroes",new String[] {"Standard","Gold","VIP"});
		listThemeConfig.put("Gold",new String[] {"Gold"});
		listThemeConfig.put("VIP",new String[] {"VIP"});
				
	}
	
	private void initContentConfig() {
		listContentLength.put("Standard", 500);
		listContentLength.put("Gold", 1000);
		listContentLength.put("VIP", 1000);
		
	}
	
	public Boolean isEligible (User u, String themeName) {
		String[] value = listThemeConfig.get(themeName);
		for (String string : value) {
			if (string.equalsIgnoreCase(u.getType())) {
				return true;
			}
		}
		return false;
	}
	
	public Integer getContentLength(User u) {
		return listContentLength.get(u.getType());
	}
	
//	public Boolean isEligible (Gold u, String themeName) {
//		for (String string : listThemeForGold) {
//			if (string.equalsIgnoreCase(themeName)) {
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	public Boolean isEligible (VIP u, String themeName) {
//		for (String string : listThemeForVip) {
//			if (string.equalsIgnoreCase(themeName)) {
//				return true;
//			}
//		}
//		return false;
//	}
	
}
