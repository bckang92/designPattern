package com.j2.command.homework;

public class RemoteLoader {
  public static void main(String[] agrs) {
    RemoteControlWithUndo remoteControl
      = new RemoteControlWithUndo();
    
     System.out.println("----Living Room Light-----");
     Light livingRoomLight = new Light("Living Room");
 
     LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
     LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
 
     remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
     
     System.out.println("on/off/undo/off/on/undo");
     remoteControl.onButtonWasPushed(0);
     remoteControl.offButtonWasPushed(0);
     
     remoteControl.undoButtonWasPushed();
     remoteControl.offButtonWasPushed(0);
     remoteControl.onButtonWasPushed(0);
     
     remoteControl.undoButtonWasPushed();
     System.out.println(" ");
   
    System.out.println("----DVD----");
    DVD digitalVedioDisc  = new DVD("DVD");
    
    DVDOnCommand dvdOn
      = new DVDOnCommand(digitalVedioDisc);
    DVDOffCommand dvdOff
      =new DVDOffCommand(digitalVedioDisc);
    
    remoteControl.setCommand(0, dvdOn, dvdOff);
    
    System.out.println("on/off/undo/off/on/undo");
    remoteControl.onButtonWasPushed(0);
    remoteControl.offButtonWasPushed(0);
    
    remoteControl.undoButtonWasPushed();
    remoteControl.offButtonWasPushed(0);
    remoteControl.onButtonWasPushed(0);

    remoteControl.undoButtonWasPushed();
  }
}