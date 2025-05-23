package org.oryxel.gfp.protocol.event;

import lombok.Data;
import org.geysermc.mcprotocollib.network.packet.Packet;
import org.oryxel.gfp.session.CachedSession;

import java.util.ArrayList;
import java.util.List;

@Data
public class MCPLPacketEvent {
    private final CachedSession session;
    private Packet packet;
    private boolean cancelled;

    private final List<Runnable> postTasks = new ArrayList<>();

    public MCPLPacketEvent(CachedSession session, Packet packet) {
        this.session = session;
        this.packet = packet;
    }
}