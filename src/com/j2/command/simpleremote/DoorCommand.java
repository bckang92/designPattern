package com.j2.command.simpleremote;

public class DoorCommand implements Command{
  garageDoor door;
  public DoorCommand(garageDoor door){
    this.door = door;
  }
  public void execute(){
  door.on();
  };
  

}