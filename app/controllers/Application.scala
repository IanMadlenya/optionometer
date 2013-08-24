package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index())
  }
  
  def disclaimer = Action {
    Ok(views.html.disclaimer())
  }
  
  def faq = Action {
    Ok(views.html.faq())
  }
  
}