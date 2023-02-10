package provider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import binusboard.AppsConfig;
import model.Theme;
import model.User;

public class ThemeProvider implements IThemeProvider{

	private Map<String, Theme> themes;
	private Theme serenity;
	private Theme heroes;
	private Theme party;
	private Theme goldTheme;
	private Theme vipTheme;
	
	private AppsConfig config;
	
	public ThemeProvider() {
		this.serenity = new Theme(
				"Serenity",
				"warna putih perak (#EFEFEF)",
				"solid, warna putih salju dengan bayangan hitam",
				"gambar rubah putih",
				"musik yang tenang"
				);
		this.heroes = new Theme(
				"Heroes",
				"warna biru metalik (#376282)",
				"solid, warna abu-abu gelap metalik\r\n",
				"gambar superhero",
				"musik orkestra yang tegang dan bersemangat"
				);
		this.party = new Theme(
				"Party",
				"warna pink menyala (#F9A7B0)",
				"putus-putus, warna merah maroon",
				"gambar orang berdansa",
				"musik yang semangat dan menarik"
				);
		this.goldTheme = new Theme(
				"Gold",
				"warna emas (#FFD700)",
				"solid, emas gelap",
				"gambar koin emas",
				"musik klasik"
				);
		this.vipTheme = new Theme(
				"VIP",
				"warna platinum (#E5E4E2)",
				"solid, warna putih bersih\r\n",
				"gambar mahkota",
				"musik klasik"
				);
		this.themes = new HashMap<String, Theme>();
		
		themes.put("Serenity", serenity);
		themes.put("Heroes", heroes);
		themes.put("Party", party);
		themes.put("Gold", goldTheme);
		themes.put("VIP", vipTheme);
		
		this.config = new AppsConfig();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Theme getTheme(String name) {
		// TODO Auto-generated method stub
		return themes.get(name);
	}

	@Override
	public Theme getTheme(String name, User u) {
		// TODO Auto-generated method stub
		if (config.isEligible(u, name)) {
			return themes.get(name);
		}		
		return null;
	}

	@Override
	public List<Theme> getListTheme() {
		// TODO Auto-generated method stub
		List<Theme> list = new ArrayList<Theme>();
		themes.forEach((k,v)-> {
			list.add(v);
		});
		return list;
	}

//	@Override
//	public Theme getHeroesTheme(User u) {
//		// TODO Auto-generated method stub
//		if (config.isEligible(u, heroes.getName())) {
//			return this.heroes;
//		}	
//		return null;
//	}
//
//	@Override
//	public Theme getPartyTheme(User u) {
//		// TODO Auto-generated method stub
//		if (config.isEligible(u, party.getName())) {
//			return this.party;
//		}	
//		return null;
//	}
//
//	@Override
//	public Theme getGoldTheme(User u) {
//		// TODO Auto-generated method stub
//		if (config.isEligible(u, goldTheme.getName())) {
//			return this.goldTheme;
//		}	
//		return null;
//	}
//
//	@Override
//	public Theme getVipTheme(User u) {
//		// TODO Auto-generated method stub
//		if (config.isEligible(u, vipTheme.getName())) {
//			return this.vipTheme;
//		}	
//		return null;
//	}

}
