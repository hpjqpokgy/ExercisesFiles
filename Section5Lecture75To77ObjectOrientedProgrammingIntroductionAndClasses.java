package com.s4ve;

public class Main {

    public static void main(String[] args) {
	    car porsche = new car();
	    car holden; new car();
	    porsche.setModel("911");
        System.out.println("Model is " + porsche.setModel());
    }
}




// Another Window

//package com.s4ve;
//
//public class car {
//
//    private int doors;
//    private int wheels;
//    private String model;
//    private String engine;
//    private String colour;
//
//    public void setModel(String model) {
//        String validModel = model.toLowerCase();
//        if (validModel.equals("porsche") || validModel.equals("holden")) {
//            this.model = model;
//        } else {
//            this.model = "Unknown";
//        }
//    }
//    public String setModel() {
//        return this.model;
//    }
//}
