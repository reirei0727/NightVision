package nightvision.nightvision;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {
    public static main instance;
    private NightVision listners;
    public main(){
        instance = this;
    }

    public static main getInstance(){
        return instance;
    }
    @Override
    public void onEnable() {
        // Plugin startup logic
        this.listners = new NightVision();
        Bukkit.getPluginManager().registerEvents(this.listners, this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
