package nightvision.nightvision;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class NightVision implements Listener {

    @EventHandler
    public void onJoinEvent(PlayerJoinEvent e){
        Player p = e.getPlayer();
        p.chat("/trackingcompass");
        p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION,100000,1,false,false));
    }

    @EventHandler
    @Deprecated
    public void onSpawnEvent(PlayerRespawnEvent e){
        Bukkit.getScheduler().runTaskLater(main.getInstance(), task ->{
            Player p = e.getPlayer();
            p.chat("/trackingcompass");
            p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION,100000,1,false,false));
        },5L);

    }
}
