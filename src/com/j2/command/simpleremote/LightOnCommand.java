package com.j2.command.simpleremote;

public class LightOnCommand implements Command{
  Light light;
  int level;
  public LightOnCommand(Light light){
    this.light = light;
  }
  public void execute(){
  light.on();
  };
  public void undo() {
  light.dim(level);
 }

}