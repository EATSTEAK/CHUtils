package tk.itstake.chutils;

import com.laytonsmith.PureUtilities.SimpleVersion;
import com.laytonsmith.PureUtilities.Version;
import com.laytonsmith.core.extensions.AbstractExtension;
import com.laytonsmith.core.extensions.MSExtension;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import tk.itstake.chutils.utils.Lag;

@MSExtension("CHActionBar")
public class LifeCycle extends AbstractExtension {
    @Override
    public void onStartup() {
        System.out.println("CHActionBar " + getVersion() + " loaded.");
        Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(Bukkit.getPluginManager().getPlugin("CommandHelper"), new Lag(), 100L, 1L);
    }
    
    @Override
    public void onShutdown() {
        System.out.println("CHActionBar " + getVersion() + " unloaded.");
    }

    public Version getVersion() {
        return new SimpleVersion(1,0,0);
    }
}
