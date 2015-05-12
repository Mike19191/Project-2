package Players;

import javax.json.Json;
import javax.json.JsonObject;
import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

import wsMessages.PickledMessage;



public class Player1Encoder implements Encoder.Text<Player1>{

	public String encode(Player1 msg) throws EncodeException {
		JsonObject jsonPlayer1 = Json.createObjectBuilder()
				.add("type","player1")
                .add("ID", msg.getID())
                .build();

        return jsonPlayer1.toString();
    }	
	
	@Override
	public void destroy() {
		
	}

	@Override
	public void init(EndpointConfig arg0) {
		
	}
}
