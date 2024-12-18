package com.geeksforgeeks.patterns.creational.abstructfactory;

public class Main {
    private Button button;
    private Checkbox checkbox;

    public Main(GUIFactory guiFactory){
        this.button = guiFactory.createButton();
        this.checkbox = guiFactory.createCheckbox();
    }
    public void paint(){
        button.paint();
        checkbox.paint();
    }
    public static void main(String[] args) {
        GUIFactory guiFactory;
        String os = "windows1";
        if(os.equals("windows")){
            guiFactory = new WindowsFactory();
        }else{
            guiFactory = new MacFactory();
        }

        Main main = new Main(guiFactory);
        main.paint();
    }
}
