
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/sensh/Downloads/play-2.4-app-fixed-full/conf/routes
// @DATE:Mon Jul 07 23:08:39 JST 2025

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseFormController FormController = new controllers.ReverseFormController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseFormController FormController = new controllers.javascript.ReverseFormController(RoutesPrefix.byNamePrefix());
  }

}
