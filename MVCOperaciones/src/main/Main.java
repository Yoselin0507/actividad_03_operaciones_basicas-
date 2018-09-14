package main;

import views.ViewOperaciones;
import models.ModelOperaciones;
import controllers.ControllerOperaciones;


public class Main {
    private static ViewOperaciones viewOperaciones;
    private static ModelOperaciones modelOperaciones;
    private static ControllerOperaciones controllerOperacion;

    public static void main(String[] args)
    {
        viewOperaciones = new ViewOperaciones();
        modelOperaciones = new ModelOperaciones();
        controllerOperacion = new ControllerOperaciones(viewOperaciones, modelOperaciones);
    }
}
