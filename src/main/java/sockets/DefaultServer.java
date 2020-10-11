package sockets;

import java.awt.datatransfer.StringSelection;
import java.net.InetSocketAddress;
import java.util.Arrays;
import java.util.Collections;

import org.java_websocket.WebSocket;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.extensions.permessage_deflate.PerMessageDeflateExtension;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

import com.google.gson.Gson;

import character.HeroDemo;
import hero.App;
import message.EventBean;

public class DefaultServer extends WebSocketServer {
	private static final Draft perMessageDeflateDraft = new Draft_6455(new PerMessageDeflateExtension());
	private static final int PORT = 8887;
	
	Gson gson = new Gson();
	
	public DefaultServer() {
		super(new InetSocketAddress(PORT), Collections.singletonList(perMessageDeflateDraft));
	}

	@Override
	public void onOpen(WebSocket conn, ClientHandshake handshake) {
		String resourceDescriptor = handshake.getResourceDescriptor();
		System.out.println("get connection:" + resourceDescriptor);
		resourceDescriptor = resourceDescriptor.substring(2);
		String[] queryList = resourceDescriptor.split("&");
		String id = queryList[0].split("=")[1];
		int sid = Integer.parseInt(id);
		System.out.println(id);
		Room room = App.manager.getRoom(sid);
		if (room == null) {
			System.out.println("没有房间了");
		}else {
			if (room.sidHeroMap.get(sid) == null) {
				room.sidHeroMap.put(sid, new HeroDemo(id, "男", 4));
				System.out.println("加入房间" + id);
			} else {
				System.out.println("重新进入房间" + id);
			}

			room.addSidSocket(sid, conn);

			if (room.canPlay()) {
				room.initStack();
				room.sendCanPlay();
				room.sendCard();
			}
		}
	}

	@Override
	public void onClose(WebSocket conn, int code, String reason, boolean remote) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onMessage(WebSocket conn, String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
		EventBean eventBean = gson.fromJson(message, EventBean.class);
		System.out.println(eventBean.getName());
	}

	@Override
	public void onError(WebSocket conn, Exception ex) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart() {
		// TODO Auto-generated method stub

	}
}
