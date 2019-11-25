package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
	    Case theCase = new Case("2200", "Dell", "240", dimensions);

	    Monitor theMonitor = new Monitor("27inch Beast", "Acer",27, new Resolution(2540,1440));
	    Motherboard theMotherBoard= new Motherboard("BJ-200","Asus",4,6,"v2.44");

	    PC thePC = new PC(theCase,theMonitor,theMotherBoard);
	    thePC.powerUp();
    }
}


package com.company;

public class Vehicle {
    private String name;

    public Vehicle(String name){
        this.name = name;

    }
}

package com.company;

public class Car extends Vehicle{
    private  int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity){
        super(name);
        this.doors = doors;
        this.engineCapacity =engineCapacity;

    }

}
  
  
  package com.company;

public class Motherboard {

    private String model;
    private String manufacturer;
    private int ramSlot;
    private int cardSlot;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlot, int cardSlot, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlot = ramSlot;
        this.cardSlot = cardSlot;
        this.bios = bios;
    }
    public void loadProgram(String programName) {
        System.out.println("Program" + programName + " is now loading.");
    }
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlot() {
        return ramSlot;
    }

    public int getCardSlot() {
        return cardSlot;
    }

    public String getBios() {
        return bios;
    }
}


package com.company;

public class Monitor {

    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }
    public void drawPixelat(int x, int y, String color) {
        System.out.println("Drawing system at " + x + ", " + y + " in colour ");

    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}


package com.company;

public class Case {


    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }
    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}


package com.company;

public class PC {
    private Case theCase;
    private Monitor Monitor;
    private Motherboard motherboard;

    public PC(Case theCase, com.company.Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        Monitor = monitor;
        this.motherboard = motherboard;
    }
    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo() {
        // fancy graphics
        Monitor.drawPixelat(1200,50,"yellow");

    }
}


package com.company;

public class Dimensions {
        private int width;
        private int height;
        private int depth;

        public Dimensions(int width, int height, int depth) {
            this.width = width;
            this.height = height;
            this.depth = depth;
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }

        public int getDepth() {
            return depth;
        }
    }


package com.company;

public class Resolution {

    private int width;
    private int height;

    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}



