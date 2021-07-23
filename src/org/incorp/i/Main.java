package org.incorp.i;

public class Main {

    public static void main(String[] args) {
	Compit[] compit = {
	  new Robot(),
      new Human(),
      new Cat()
    };
    Stop[] stop= {
            new Wall(20),
            new Runroud(10),
    };
    for(Compit i: compit){
        for(Stop q: stop){
            if(!q.goGo(i)){
                break;
            }
        }
    }
    }
}
