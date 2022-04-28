// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/kiots/Documents/software/Frontend/conf/routes
// @DATE:Thu Apr 28 10:18:49 CDT 2022

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReversePapersController PapersController = new controllers.ReversePapersController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReversePapersController PapersController = new controllers.javascript.ReversePapersController(RoutesPrefix.byNamePrefix());
  }

}
