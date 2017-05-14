package de.n3yut9j.fastgm.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import de.n3yut9j.fastgm.commands.CMD_Gm;

public class FastGm extends JavaPlugin{

	@Override
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage("§fDas Plugin §aFast-Gm §fwurde Ausgeschlatet");
		super.onDisable();
	}

	@Override
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage("§fDas Plugin §aFast-Gm §fwurde Eingeschlatet");
		registercmd();
		super.onEnable();
	}
	public void registercmd(){
		getCommand("gm").setExecutor(new CMD_Gm());
		
	}
	

}
