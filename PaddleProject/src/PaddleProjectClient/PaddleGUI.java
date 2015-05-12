package PaddleProjectClient;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Logger;

import javax.swing.*;
import javax.websocket.*;

import Players.*;
import pokeClient.MessagePanel;
import wsMessages.Message;
import wsMessages.PokeMessage;

public class PaddleGUI {

	public static void main(String[] args) {
		private static CountDownLatch latch;
		private Logger logger = Logger.getLogger(this.getClass().getName());
		private static Game game;

		@OnOpen
		public void onOpen(Session session) {
			logger.info("Connected ... " + session.getId());
			try {
				session.getBasicRemote().sendText("start");
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		
		@OnMessage
		public void onMessage(Session session, Message message) {
			logger.info("Received ...." + message.toString());

			if (message instanceof Player1) {
				Player1.receivePlayer1((Player1) message);

	}

}
