package euorg.nuvoprojects.cachezero1.worldevents;

import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class MessageSend {
    
    public void sendCustomMessage(Player target, String message, Sound sound, float volume, float pitch) {

        target.sendMessage(message);
        target.playSound(target.getLocation(), sound, volume, pitch);

    }

    public void sendCustomMessage(Player target, String message) {

        target.sendMessage(message);

    }

}
