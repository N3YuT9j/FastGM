package de.n3yut9j.fastgm.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMD_Gm implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender s, Command c, String label, String[] args) {
		Player p = (Player) s;
		if (s instanceof Player) {
			if (s.hasPermission("fastgm")) {
				if (args.length == 2) {
					Player target = Bukkit.getPlayer(args[1]);
					
					if (args[0].equalsIgnoreCase("0")) {
						target.setGameMode(GameMode.SURVIVAL);
						target.sendMessage("§fDein Spielmodus wurde auf §a" + p.getGameMode() + "§f gesetzt!");
					} else if (args[0].equalsIgnoreCase("1")) {
						target.setGameMode(GameMode.CREATIVE);
						target.sendMessage("§fDein Spielmodus wurde auf §a" + p.getGameMode() + "§f gesetzt!");
					}else if(args[0].equalsIgnoreCase("2")){
						target.setGameMode(GameMode.ADVENTURE);
						target.sendMessage("§fDein Spielmodus wurde auf §a" + p.getGameMode() + "§f gesetzt!");
					}else if(args[0].equalsIgnoreCase("3")){
						target.setGameMode(GameMode.SPECTATOR);
						target.sendMessage("§fDein Spielmodus wurde auf §a" + p.getGameMode() + "§f gesetzt!");
					}
					
					

				} else if (args.length == 1) {
					if (args[0].equalsIgnoreCase("0")) {
						p.setGameMode(GameMode.SURVIVAL);
						p.sendMessage("§fDein Spielmodus wurde auf §a" + p.getGameMode() + "§f gesetzt!");
					} else if (args[0].equalsIgnoreCase("1")) {
						p.setGameMode(GameMode.CREATIVE);
						p.sendMessage("§fDein Spielmodus wurde auf §a" + p.getGameMode() + "§f gesetzt!");
					}else if(args[0].equalsIgnoreCase("2")){
						p.setGameMode(GameMode.ADVENTURE);
						p.sendMessage("§fDein Spielmodus wurde auf §a" + p.getGameMode() + "§f gesetzt!");
					}else if(args[0].equalsIgnoreCase("3")){
						p.setGameMode(GameMode.SPECTATOR);
						p.sendMessage("§fDein Spielmodus wurde auf §a" + p.getGameMode() + "§f gesetzt!");
					}

				} else {
					s.sendMessage("Nutze /gm (0) (1) (2) (3) [Spieler]");
				}
			} else {
				s.sendMessage("Das darfst du nicht!");
			}

		} else {
			s.sendMessage("Der Commamd Gm kann nur ein Spieler ausführen!");
		}

		return true;
	}

}
