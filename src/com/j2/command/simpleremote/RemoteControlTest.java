package com.j2.command.simpleremote;

public class RemoteControlTest{
  public static void main(String args[]){
  SimpleRemoteControl remote = new SimpleRemoteControl();
  Light light = new Light();
  LightOnCommand lightOn = new LightOnCommand(light);
    remote.setCommand(lightOn);
    remote.buttonWasPressed();
    
    SimpleRemoteControl remote1 = new SimpleRemoteControl();
    garageDoor door = new garageDoor();
    DoorCommand doorOn = new DoorCommand(door);
    remote.setCommand(doorOn);
    remote.buttonWasPressed();
   
   
  }
}