package com.dasari.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Room implements Externalizable {
	private Integer roomId;
	private String roomName;
	private Long roomPassword;
	
	public Room() {
	
	}
	
	

	public Integer getRoomId() {
		return roomId;
	}



	public Room setRoomId(Integer roomId) {
		this.roomId = roomId;
		return this;
	}



	public String getRoomName() {
		return roomName;
	}



	public Room setRoomName(String roomName) {
		this.roomName = roomName;
		return this;
	}



	public Long getRoomPassword() {
		return roomPassword;
	}



	public Room setRoomPassword(Long roomPassword) {
		this.roomPassword = roomPassword;
		return this;
	}



	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(roomId);
		out.writeObject(roomName);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		roomId=(Integer) in.readObject();
		roomName=(String) in.readObject();
	}

}
